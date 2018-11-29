package mongodb.ai.dao;

import mongodb.ai.common.Constant;
import mongodb.ai.dto.Articles;
import mongodb.ai.dto.Long_events;
import mongodb.ai.dto.Stories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.LookupOperation;
import org.springframework.data.mongodb.core.aggregation.UnwindOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LongEventDaoImpl implements LongEventDAO {

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public List<Long_events> findDataByDate(String date, String domain) {

        Query query = new Query();

        query.addCriteria(Criteria.where("date").exists(true).andOperator(Criteria.where("date").is(date),Criteria.where("domain").is(domain)));
        
        List<Long_events> list_event = mongoTemplate.find(query, Long_events.class);
        for(Long_events long_events : list_event) {
        	long_events.setEvent_count(long_events.getEvent_name() + " - " + long_events.getStories().size() );        	
        }
        return list_event;
    }

    @Override
    public  List<Long_events> findData(String date, String domain) {
        UnwindOperation unwindOperation = Aggregation.unwind("stories");
        LookupOperation lookupOperation = LookupOperation.newLookup()
                .from("articles")
                .localField("stories.contentId")
                .foreignField("contentId")
                .as("stories");

        Aggregation aggregation = Aggregation.newAggregation(
                Aggregation.match(Criteria.where("date").exists(true).andOperator(Criteria.where("date").is(date),Criteria.where("domain").is(domain))),
                unwindOperation,lookupOperation,
                unwindOperation,Aggregation.group("_id")
                        .first("domain").as("domain")
                        .first("child_events").as("child_events")
                        .first("num_story").as("num_story")
                        .first("event_name").as("event_name")
                        .first("event_id").as("event_id")
                        .first("date").as("date")
                        .push("stories").as("stories"));

        AggregationResults<Long_events> result = mongoTemplate.aggregate(aggregation,"long_events", Long_events.class);
        List<Long_events> final_result = result.getMappedResults();

        return final_result;
    }
}

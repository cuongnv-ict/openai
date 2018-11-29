package mongodb.ai.dao;

import mongodb.ai.dto.Articles;
import mongodb.ai.dto.Long_events;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;

import java.util.List;

public interface LongEventDAO {

    List<Long_events> findDataByDate(String date, String domain);

    List<Long_events> findData(String date, String domain);
}

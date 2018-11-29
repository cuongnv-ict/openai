package mongodb.ai.dao;

import mongodb.ai.dto.Long_events;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EventDAO extends MongoRepository<Long_events, Long> {

    List<Long_events> findAll();

}

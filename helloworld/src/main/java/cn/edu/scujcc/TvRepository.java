package cn.edu.scujcc;

import java.util.*;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TvRepository extends MongoRepository<Channel,String> {
		public List<Channel> findByName(String n);
		public List<Channel> findByDescLike(String d);
}

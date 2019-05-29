package com.stackroute.MuzixApplication.repository;

import com.stackroute.MuzixApplication.document.Track;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MuzixRepository extends MongoRepository<Track, String> {

}

package com.scoutbr.api.repositories;

import com.scoutbr.api.models.Time;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TimeRepository extends MongoRepository<Time, String> {

}
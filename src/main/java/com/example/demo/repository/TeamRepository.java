package com.example.demo.repository;

import com.example.demo.model.Teams;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TeamRepository extends MongoRepository<Teams, String>{
   public Teams findById(int id);
}

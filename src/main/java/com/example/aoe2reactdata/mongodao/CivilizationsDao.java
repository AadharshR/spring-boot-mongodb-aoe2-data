package com.example.aoe2reactdata.mongodao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.aoe2reactdata.model.Civilizations;

@Repository
public interface CivilizationsDao extends MongoRepository<Civilizations, Integer> {

}

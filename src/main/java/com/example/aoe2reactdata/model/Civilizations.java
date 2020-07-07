package com.example.aoe2reactdata.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "civ_strategies")

public class Civilizations {

	public ObjectId getDatabaseId() {
		return databaseId;
	}
	public void setDatabaseId(ObjectId databaseId) {
		this.databaseId = databaseId;
	}
	public String getCiv() {
		return civ;
	}
	public void setCiv(String civ) {
		this.civ = civ;
	}
	
	public String getIdeal_opening() {
		return ideal_opening;
	}
	public void setIdeal_opening(String ideal_opening) {
		this.ideal_opening = ideal_opening;
	}
	public String getTransition() {
		return transition;
	}
	public void setTransition(String transition) {
		this.transition = transition;
	}
	public String getCastle_age() {
		return castle_age;
	}
	public void setCastle_age(String castle_age) {
		this.castle_age = castle_age;
	}
	public String getImperial_age() {
		return imperial_age;
	}
	public void setImperial_age(String imperial_age) {
		this.imperial_age = imperial_age;
	}
	@Id
	ObjectId databaseId;
	private String civ;
	private String ideal_opening;
	private String transition;
	private String castle_age;
	private String imperial_age;
	
}

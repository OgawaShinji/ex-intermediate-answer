package com.example.domain;

public class Arisa {

	private Integer age;
	private String arisa;
	private Integer weight;
	private Integer height;
	private String lastName;
	private String arisa2;

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getWeight() {
		return this.weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getHeight() {
		return this.height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Arisa age(Integer age) {
		this.age = age;
		return this;
	}

	public Arisa arisa(String arisa) {
		this.arisa = arisa;
		return this;
	}

	public Arisa weight(Integer weight) {
		this.weight = weight;
		return this;
	}

	public Arisa height(Integer height) {
		this.height = height;
		return this;
	}

	public Arisa lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	@Override
	public String toString() {
		return "{" +
			" age='" + getAge() + "'" +
			", arisa='" + getArisa() + "'" +
			", weight='" + getWeight() + "'" +
			", height='" + getHeight() + "'" +
			", lastName='" + getLastName() + "'" +
			"}";
	}

	public String getArisa() {
		return arisa;
	}

	public void setArisa(String arisa) {
		this.arisa = arisa;
	}
	
}

package com.example.domain;

public class Arisa {

	private Integer age;
	private String arisa;
	private Integer weight;
	private Integer height;
	private String lastName;

	private String Arisa0522;

	private String arisa2;

	public Arisa() {
	}

	public Arisa(Integer age, String arisa, Integer weight, Integer height, String lastName, String Arisa0522, String arisa2) {
		this.age = age;
		this.arisa = arisa;
		this.weight = weight;
		this.height = height;
		this.lastName = lastName;
		this.Arisa0522 = Arisa0522;
		this.arisa2 = arisa2;
	}

	public String getArisa0522() {
		return this.Arisa0522;
	}

	public void setArisa0522(String Arisa0522) {
		this.Arisa0522 = Arisa0522;
	}

	public String getArisa2() {
		return this.arisa2;
	}

	public void setArisa2(String arisa2) {
		this.arisa2 = arisa2;
	}

	public Arisa Arisa0522(String Arisa0522) {
		this.Arisa0522 = Arisa0522;
		return this;
	}

	public Arisa arisa2(String arisa2) {
		this.arisa2 = arisa2;
		return this;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(final Integer age) {
		this.age = age;
	}

	public Integer getWeight() {
		return this.weight;
	}

	public void setWeight(final Integer weight) {
		this.weight = weight;
	}

	public Integer getHeight() {
		return this.height;
	}

	public void setHeight(final Integer height) {
		this.height = height;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public Arisa age(final Integer age) {
		this.age = age;
		return this;
	}

	public Arisa arisa(final String arisa) {
		this.arisa = arisa;
		return this;
	}

	public Arisa weight(final Integer weight) {
		this.weight = weight;
		return this;
	}

	public Arisa height(final Integer height) {
		this.height = height;
		return this;
	}

	public Arisa lastName(final String lastName) {
		this.lastName = lastName;
		return this;
	}

	@Override
	public String toString() {
		return "{" + " age='" + getAge() + "'" + ", arisa='" + getArisa() + "'" + ", weight='" + getWeight() + "'"
				+ ", height='" + getHeight() + "'" + ", lastName='" + getLastName() + "'" + "}";
	}

	public String getArisa() {
		return arisa;
	}

	public void setArisa(final String arisa) {
		this.arisa = arisa;
	}

}

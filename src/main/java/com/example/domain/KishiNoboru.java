package com.example.domain;

public class KishiNoboru {
    private String name;
    private Integer age;
    private Integer heigt;
    private Integer weight;
    private String momName;
    private String papaName;
    private String hairStyle;


    public KishiNoboru() {
    }

    public KishiNoboru(String name, Integer age, Integer heigt, Integer weight, String momName, String papaName, String hairStyle) {
        this.name = name;
        this.age = age;
        this.heigt = heigt;
        this.weight = weight;
        this.momName = momName;
        this.papaName = papaName;
        this.hairStyle = hairStyle;
    }


    /**
     * @return String
     */
    public String getName() {
        return this.name;
    }


    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * @return Integer
     */
    public Integer getAge() {
        return this.age;
    }


    /**
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }


    /**
     * @return Integer
     */
    public Integer getHeigt() {
        return this.heigt;
    }


    /**
     * @param heigt
     */
    public void setHeigt(Integer heigt) {
        this.heigt = heigt;
    }


    /**
     * @return Integer
     */
    public Integer getWeight() {
        return this.weight;
    }


    /**
     * @param weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }


    /**
     * @return String
     */
    public String getMomName() {
        return this.momName;
    }


    /**
     * @param momName
     */
    public void setMomName(String momName) {
        this.momName = momName;
    }


    /**
     * @return String
     */
    public String getPapaName() {
        return this.papaName;
    }


    /**
     * @param papaName
     */
    public void setPapaName(String papaName) {
        this.papaName = papaName;
    }


    /**
     * @return String
     */
    public String getHairStyle() {
        return this.hairStyle;
    }


    /**
     * @param hairStyle
     */
    public void setHairStyle(String hairStyle) {
        this.hairStyle = hairStyle;
    }


    /**
     * @param name
     * @return KishiNoboru
     */
    public KishiNoboru name(String name) {
        this.name = name;
        return this;
    }


    /**
     * @param age
     * @return KishiNoboru
     */
    public KishiNoboru age(Integer age) {
        this.age = age;
        return this;
    }


    /**
     * @param heigt
     * @return KishiNoboru
     */
    public KishiNoboru heigt(Integer heigt) {
        this.heigt = heigt;
        return this;
    }


    /**
     * @param weight
     * @return KishiNoboru
     */
    public KishiNoboru weight(Integer weight) {
        this.weight = weight;
        return this;
    }


    /**
     * @param momName
     * @return KishiNoboru
     */
    public KishiNoboru momName(String momName) {
        this.momName = momName;
        return this;
    }


    /**
     * @param papaName
     * @return KishiNoboru
     */
    public KishiNoboru papaName(String papaName) {
        this.papaName = papaName;
        return this;
    }


    /**
     * @param hairStyle
     * @return KishiNoboru
     */
    public KishiNoboru hairStyle(String hairStyle) {
        this.hairStyle = hairStyle;
        return this;
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", age='" + getAge() + "'" +
            ", heigt='" + getHeigt() + "'" +
            ", weight='" + getWeight() + "'" +
            ", momName='" + getMomName() + "'" +
            ", papaName='" + getPapaName() + "'" +
            ", hairStyle='" + getHairStyle() + "'" +
            "}";
    }

}
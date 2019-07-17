package com.cafucaa.alumniassociation.model;

public class Class2 {
    private Integer caClass1Id;

    private Integer caClass2Id;

    private String class2Name;

    private String class2Quantity;

    private String attribute76;

    private String attribute77;

    private String attribute78;

    public Integer getCaClass1Id() {
        return caClass1Id;
    }

    public void setCaClass1Id(Integer caClass1Id) {
        this.caClass1Id = caClass1Id;
    }

    public Integer getCaClass2Id() {
        return caClass2Id;
    }

    public void setCaClass2Id(Integer caClass2Id) {
        this.caClass2Id = caClass2Id;
    }

    public String getClass2Name() {
        return class2Name;
    }

    public void setClass2Name(String class2Name) {
        this.class2Name = class2Name == null ? null : class2Name.trim();
    }

    public String getClass2Quantity() {
        return class2Quantity;
    }

    public void setClass2Quantity(String class2Quantity) {
        this.class2Quantity = class2Quantity == null ? null : class2Quantity.trim();
    }

    public String getAttribute76() {
        return attribute76;
    }

    public void setAttribute76(String attribute76) {
        this.attribute76 = attribute76 == null ? null : attribute76.trim();
    }

    public String getAttribute77() {
        return attribute77;
    }

    public void setAttribute77(String attribute77) {
        this.attribute77 = attribute77 == null ? null : attribute77.trim();
    }

    public String getAttribute78() {
        return attribute78;
    }

    public void setAttribute78(String attribute78) {
        this.attribute78 = attribute78 == null ? null : attribute78.trim();
    }
}
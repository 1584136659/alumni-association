package com.cafucaa.alumniassociation.model;

public class CaClass {
    private Integer caClassId;

    private String className;

    private String classCreater;

    private Integer classQuantity;

    public Integer getCaClassId() {
        return caClassId;
    }

    public void setCaClassId(Integer caClassId) {
        this.caClassId = caClassId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public String getClassCreater() {
        return classCreater;
    }

    public void setClassCreater(String classCreater) {
        this.classCreater = classCreater == null ? null : classCreater.trim();
    }

    public Integer getClassQuantity() {
        return classQuantity;
    }

    public void setClassQuantity(Integer classQuantity) {
        this.classQuantity = classQuantity;
    }
}
package com.cafucaa.alumniassociation.model;

public class Privalege {
    private Integer caPrivalegeId;

    private String privalegeName;

    private String privalegeIllutration;

    private String attribute88;

    private String attribute89;

    private String attribute90;

    public Integer getCaPrivalegeId() {
        return caPrivalegeId;
    }

    public void setCaPrivalegeId(Integer caPrivalegeId) {
        this.caPrivalegeId = caPrivalegeId;
    }

    public String getPrivalegeName() {
        return privalegeName;
    }

    public void setPrivalegeName(String privalegeName) {
        this.privalegeName = privalegeName == null ? null : privalegeName.trim();
    }

    public String getPrivalegeIllutration() {
        return privalegeIllutration;
    }

    public void setPrivalegeIllutration(String privalegeIllutration) {
        this.privalegeIllutration = privalegeIllutration == null ? null : privalegeIllutration.trim();
    }

    public String getAttribute88() {
        return attribute88;
    }

    public void setAttribute88(String attribute88) {
        this.attribute88 = attribute88 == null ? null : attribute88.trim();
    }

    public String getAttribute89() {
        return attribute89;
    }

    public void setAttribute89(String attribute89) {
        this.attribute89 = attribute89 == null ? null : attribute89.trim();
    }

    public String getAttribute90() {
        return attribute90;
    }

    public void setAttribute90(String attribute90) {
        this.attribute90 = attribute90 == null ? null : attribute90.trim();
    }
}
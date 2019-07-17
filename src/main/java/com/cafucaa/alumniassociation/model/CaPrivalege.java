package com.cafucaa.alumniassociation.model;

public class CaPrivalege {
    private Integer caPrivalegeId;

    private String privalegeName;

    private String privalegeIllustration;

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

    public String getPrivalegeIllustration() {
        return privalegeIllustration;
    }

    public void setPrivalegeIllustration(String privalegeIllustration) {
        this.privalegeIllustration = privalegeIllustration == null ? null : privalegeIllustration.trim();
    }
}
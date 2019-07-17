package com.cafucaa.alumniassociation.model;

public class Souvenir {
    private Integer caSouvenirId;

    private String souvenirName;

    private String souvenirUrl;

    private String attribute91;

    private String attribute92;

    private String attribute93;

    private String souvenirIllustration;

    public Integer getCaSouvenirId() {
        return caSouvenirId;
    }

    public void setCaSouvenirId(Integer caSouvenirId) {
        this.caSouvenirId = caSouvenirId;
    }

    public String getSouvenirName() {
        return souvenirName;
    }

    public void setSouvenirName(String souvenirName) {
        this.souvenirName = souvenirName == null ? null : souvenirName.trim();
    }

    public String getSouvenirUrl() {
        return souvenirUrl;
    }

    public void setSouvenirUrl(String souvenirUrl) {
        this.souvenirUrl = souvenirUrl == null ? null : souvenirUrl.trim();
    }

    public String getAttribute91() {
        return attribute91;
    }

    public void setAttribute91(String attribute91) {
        this.attribute91 = attribute91 == null ? null : attribute91.trim();
    }

    public String getAttribute92() {
        return attribute92;
    }

    public void setAttribute92(String attribute92) {
        this.attribute92 = attribute92 == null ? null : attribute92.trim();
    }

    public String getAttribute93() {
        return attribute93;
    }

    public void setAttribute93(String attribute93) {
        this.attribute93 = attribute93 == null ? null : attribute93.trim();
    }

    public String getSouvenirIllustration() {
        return souvenirIllustration;
    }

    public void setSouvenirIllustration(String souvenirIllustration) {
        this.souvenirIllustration = souvenirIllustration == null ? null : souvenirIllustration.trim();
    }
}
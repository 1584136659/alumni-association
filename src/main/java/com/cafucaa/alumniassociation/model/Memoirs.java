package com.cafucaa.alumniassociation.model;

import java.util.Date;

public class Memoirs {
    private Integer caMemoirsId;

    private String memorisTitle;

    private Date memorisDate;

    private String memorisUrl;

    private String attribute97;

    private String attribute98;

    private String attribute99;

    private String memorisContent;

    public Integer getCaMemoirsId() {
        return caMemoirsId;
    }

    public void setCaMemoirsId(Integer caMemoirsId) {
        this.caMemoirsId = caMemoirsId;
    }

    public String getMemorisTitle() {
        return memorisTitle;
    }

    public void setMemorisTitle(String memorisTitle) {
        this.memorisTitle = memorisTitle == null ? null : memorisTitle.trim();
    }

    public Date getMemorisDate() {
        return memorisDate;
    }

    public void setMemorisDate(Date memorisDate) {
        this.memorisDate = memorisDate;
    }

    public String getMemorisUrl() {
        return memorisUrl;
    }

    public void setMemorisUrl(String memorisUrl) {
        this.memorisUrl = memorisUrl == null ? null : memorisUrl.trim();
    }

    public String getAttribute97() {
        return attribute97;
    }

    public void setAttribute97(String attribute97) {
        this.attribute97 = attribute97 == null ? null : attribute97.trim();
    }

    public String getAttribute98() {
        return attribute98;
    }

    public void setAttribute98(String attribute98) {
        this.attribute98 = attribute98 == null ? null : attribute98.trim();
    }

    public String getAttribute99() {
        return attribute99;
    }

    public void setAttribute99(String attribute99) {
        this.attribute99 = attribute99 == null ? null : attribute99.trim();
    }

    public String getMemorisContent() {
        return memorisContent;
    }

    public void setMemorisContent(String memorisContent) {
        this.memorisContent = memorisContent == null ? null : memorisContent.trim();
    }
}
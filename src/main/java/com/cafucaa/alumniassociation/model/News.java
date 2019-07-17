package com.cafucaa.alumniassociation.model;

import java.util.Date;

public class News {
    private Integer caNewsId;

    private String newsTitle;

    private String newsContent;

    private Date newsDate;

    private String newsUrl;

    private String attribute73;

    private String attribute74;

    private String attribute75;

    public Integer getCaNewsId() {
        return caNewsId;
    }

    public void setCaNewsId(Integer caNewsId) {
        this.caNewsId = caNewsId;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle == null ? null : newsTitle.trim();
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent == null ? null : newsContent.trim();
    }

    public Date getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(Date newsDate) {
        this.newsDate = newsDate;
    }

    public String getNewsUrl() {
        return newsUrl;
    }

    public void setNewsUrl(String newsUrl) {
        this.newsUrl = newsUrl == null ? null : newsUrl.trim();
    }

    public String getAttribute73() {
        return attribute73;
    }

    public void setAttribute73(String attribute73) {
        this.attribute73 = attribute73 == null ? null : attribute73.trim();
    }

    public String getAttribute74() {
        return attribute74;
    }

    public void setAttribute74(String attribute74) {
        this.attribute74 = attribute74 == null ? null : attribute74.trim();
    }

    public String getAttribute75() {
        return attribute75;
    }

    public void setAttribute75(String attribute75) {
        this.attribute75 = attribute75 == null ? null : attribute75.trim();
    }
}
package com.cafucaa.alumniassociation.model;

import java.util.Date;

public class CaNews {
    private Integer caNewsId;

    private String newsTitle;

    private Date newsDate;

    private String newsContent;

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

    public Date getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(Date newsDate) {
        this.newsDate = newsDate;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent == null ? null : newsContent.trim();
    }
}
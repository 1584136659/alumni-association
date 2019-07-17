package com.cafucaa.alumniassociation.model;

import java.util.Date;

public class Notice {
    private Integer caNoticeId;

    private String noticeTitle;

    private String noticeContent;

    private Date noticeDate;

    private String attribute79;

    private String attribute80;

    private String attribute81;

    private String noticeIllustration;

    public Integer getCaNoticeId() {
        return caNoticeId;
    }

    public void setCaNoticeId(Integer caNoticeId) {
        this.caNoticeId = caNoticeId;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle == null ? null : noticeTitle.trim();
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent == null ? null : noticeContent.trim();
    }

    public Date getNoticeDate() {
        return noticeDate;
    }

    public void setNoticeDate(Date noticeDate) {
        this.noticeDate = noticeDate;
    }

    public String getAttribute79() {
        return attribute79;
    }

    public void setAttribute79(String attribute79) {
        this.attribute79 = attribute79 == null ? null : attribute79.trim();
    }

    public String getAttribute80() {
        return attribute80;
    }

    public void setAttribute80(String attribute80) {
        this.attribute80 = attribute80 == null ? null : attribute80.trim();
    }

    public String getAttribute81() {
        return attribute81;
    }

    public void setAttribute81(String attribute81) {
        this.attribute81 = attribute81 == null ? null : attribute81.trim();
    }

    public String getNoticeIllustration() {
        return noticeIllustration;
    }

    public void setNoticeIllustration(String noticeIllustration) {
        this.noticeIllustration = noticeIllustration == null ? null : noticeIllustration.trim();
    }
}
package com.cafucaa.alumniassociation.model;

import java.util.Date;

public class Activity {
    private Integer caActivityId;

    private Integer caAlumniId;

    private String activityClass;

    private Boolean activityBackOrNot;

    private String activityContent;

    private String activityCreater;

    private Date activityDate;

    private String activitySite;

    private String activityStatus;

    private String activityResult;

    private String attribute100;

    private String attribute101;

    private String attribute102;

    private String activityIllustration;

    public Integer getCaActivityId() {
        return caActivityId;
    }

    public void setCaActivityId(Integer caActivityId) {
        this.caActivityId = caActivityId;
    }

    public Integer getCaAlumniId() {
        return caAlumniId;
    }

    public void setCaAlumniId(Integer caAlumniId) {
        this.caAlumniId = caAlumniId;
    }

    public String getActivityClass() {
        return activityClass;
    }

    public void setActivityClass(String activityClass) {
        this.activityClass = activityClass == null ? null : activityClass.trim();
    }

    public Boolean getActivityBackOrNot() {
        return activityBackOrNot;
    }

    public void setActivityBackOrNot(Boolean activityBackOrNot) {
        this.activityBackOrNot = activityBackOrNot;
    }

    public String getActivityContent() {
        return activityContent;
    }

    public void setActivityContent(String activityContent) {
        this.activityContent = activityContent == null ? null : activityContent.trim();
    }

    public String getActivityCreater() {
        return activityCreater;
    }

    public void setActivityCreater(String activityCreater) {
        this.activityCreater = activityCreater == null ? null : activityCreater.trim();
    }

    public Date getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public String getActivitySite() {
        return activitySite;
    }

    public void setActivitySite(String activitySite) {
        this.activitySite = activitySite == null ? null : activitySite.trim();
    }

    public String getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(String activityStatus) {
        this.activityStatus = activityStatus == null ? null : activityStatus.trim();
    }

    public String getActivityResult() {
        return activityResult;
    }

    public void setActivityResult(String activityResult) {
        this.activityResult = activityResult == null ? null : activityResult.trim();
    }

    public String getAttribute100() {
        return attribute100;
    }

    public void setAttribute100(String attribute100) {
        this.attribute100 = attribute100 == null ? null : attribute100.trim();
    }

    public String getAttribute101() {
        return attribute101;
    }

    public void setAttribute101(String attribute101) {
        this.attribute101 = attribute101 == null ? null : attribute101.trim();
    }

    public String getAttribute102() {
        return attribute102;
    }

    public void setAttribute102(String attribute102) {
        this.attribute102 = attribute102 == null ? null : attribute102.trim();
    }

    public String getActivityIllustration() {
        return activityIllustration;
    }

    public void setActivityIllustration(String activityIllustration) {
        this.activityIllustration = activityIllustration == null ? null : activityIllustration.trim();
    }
}
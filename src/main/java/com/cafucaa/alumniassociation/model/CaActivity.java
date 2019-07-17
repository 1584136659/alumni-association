package com.cafucaa.alumniassociation.model;

import java.util.Date;

public class CaActivity {
    private Integer caActivityId;

    private String activityClass;

    private Boolean activityBackOrNot;

    private String activityCreater;

    private Date activityDate;

    private String activitySite;

    private Integer activityStatus;

    private Boolean activityResult;

    public Integer getCaActivityId() {
        return caActivityId;
    }

    public void setCaActivityId(Integer caActivityId) {
        this.caActivityId = caActivityId;
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

    public Integer getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(Integer activityStatus) {
        this.activityStatus = activityStatus;
    }

    public Boolean getActivityResult() {
        return activityResult;
    }

    public void setActivityResult(Boolean activityResult) {
        this.activityResult = activityResult;
    }
}
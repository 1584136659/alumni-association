package com.cafucaa.alumniassociation.model;

public class CaActivityWithBLOBs extends CaActivity {
    private String activityContent;

    private String activityIllustration;

    public String getActivityContent() {
        return activityContent;
    }

    public void setActivityContent(String activityContent) {
        this.activityContent = activityContent == null ? null : activityContent.trim();
    }

    public String getActivityIllustration() {
        return activityIllustration;
    }

    public void setActivityIllustration(String activityIllustration) {
        this.activityIllustration = activityIllustration == null ? null : activityIllustration.trim();
    }
}
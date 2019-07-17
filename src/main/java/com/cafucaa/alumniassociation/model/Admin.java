package com.cafucaa.alumniassociation.model;

public class Admin {
    private Integer caRoleId;

    private Integer adminId;

    private String adminPassword;

    private String adminEmail;

    public Integer getCaRoleId() {
        return caRoleId;
    }

    public void setCaRoleId(Integer caRoleId) {
        this.caRoleId = caRoleId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail == null ? null : adminEmail.trim();
    }
}
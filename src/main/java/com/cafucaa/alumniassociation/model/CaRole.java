package com.cafucaa.alumniassociation.model;

public class CaRole {
    private Integer caRoleId;

    private String roleName;

    private String roleIllustration;

    public Integer getCaRoleId() {
        return caRoleId;
    }

    public void setCaRoleId(Integer caRoleId) {
        this.caRoleId = caRoleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleIllustration() {
        return roleIllustration;
    }

    public void setRoleIllustration(String roleIllustration) {
        this.roleIllustration = roleIllustration == null ? null : roleIllustration.trim();
    }
}
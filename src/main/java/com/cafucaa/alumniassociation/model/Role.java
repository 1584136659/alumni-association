package com.cafucaa.alumniassociation.model;

public class Role {
    private Integer caRoleId;

    private String roleName;

    private String roleIllustration;

    private String attribute85;

    private String attribute86;

    private String attribute87;

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

    public String getAttribute85() {
        return attribute85;
    }

    public void setAttribute85(String attribute85) {
        this.attribute85 = attribute85 == null ? null : attribute85.trim();
    }

    public String getAttribute86() {
        return attribute86;
    }

    public void setAttribute86(String attribute86) {
        this.attribute86 = attribute86 == null ? null : attribute86.trim();
    }

    public String getAttribute87() {
        return attribute87;
    }

    public void setAttribute87(String attribute87) {
        this.attribute87 = attribute87 == null ? null : attribute87.trim();
    }
}
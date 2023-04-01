package com.heds.creatorplatform.entity;

public class User {
    private Integer roleId;
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(Integer roleId, String name, String password){
        this.roleId = roleId;
        this.name = name;
        this.password = password;
    }



    @Override
    public String toString() {
        return "User{" +
                "roleId=" + roleId +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}

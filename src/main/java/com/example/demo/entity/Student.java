package com.example.demo.entity;

public class Student {
    private String sysid;

    private String studentid;

    private String password;

    private String studentname;

    private Integer result;

    private String sclass;

    public Student() {
    }

    public Student(String studentid, String password, String studentname, Integer result, String sclass) {
        this.studentid = studentid;
        this.password = password;
        this.studentname = studentname;
        this.result = result;
        this.sclass = sclass;
    }

    public String getSysid() {
        return sysid;
    }

    public void setSysid(String sysid) {
        this.sysid = sysid == null ? null : sysid.trim();
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid == null ? null : studentid.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass == null ? null : sclass.trim();
    }
}
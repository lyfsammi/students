package com.example.students.pojo;

public class Student {

    private String stuId;
    /** 姓名 */
    private String name;

    /** 年龄 */
    private String department;

    private String major;

    public Student(){
    }

    public Student(String stuId, String name, String department, String major) {
        super();
        this.stuId = stuId;
        this.name = name;
        this.department = department;
        this.major = major;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String Id) {
        this.stuId = Id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String d){
        this.department = d;
    }

    public String getMajor(){
        return major;
    }

    public void setMajor(String m) {
        this.major = m;
    }
}

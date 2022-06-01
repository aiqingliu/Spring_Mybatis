package com.laq.model;

public class Student {

    private Long id;

    private String code;

    private String name;

    private Integer age;

    private String addr;

    public Student() {

    }

    public Student(String code, String name, Integer age, String addr) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    public Student(Long id, String code, String name, Integer age, String addr) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                '}';
    }
}

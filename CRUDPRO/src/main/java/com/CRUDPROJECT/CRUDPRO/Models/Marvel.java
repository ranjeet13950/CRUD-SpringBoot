package com.CRUDPROJECT.CRUDPRO.Models;

import jakarta.persistence.*;

@Entity
public class Marvel {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "Code")
    private int code;

    @Column(name = "Name")
    private String name;

    @Column(name = "RealName")
    private String realname;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }
}

package com.example.demo.entity;

import java.io.Serializable;

public class TestEntity implements Serializable {

    private Integer id;
    private String name;
    private String urlName;

    public Integer getId(){
        return this.id;
    }

    public String getUrlName(){
        return this.urlName;
    }

    public String getName(){
        return this.name;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setUrlName(String urlName){
        this.urlName = urlName;
    }
}

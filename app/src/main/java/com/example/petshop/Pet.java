package com.example.petshop;

import java.util.Date;

public abstract class Pet {
    private String name; //private disallows direct usage
    private Date birthDate; //parameters must be same as constructor (name same as name)

    public Pet(String name){
        this.name = name;
        this.birthDate = new Date();
    }

    public Pet(String name, Date birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String speak();
}

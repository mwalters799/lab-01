package com.example.petshop;

import java.util.Date;

public class Cat extends Pet implements Pettable{

    public Cat(String name){
        super(name);
    }

    public Cat(String name, Date birthDate){
        super(name, birthDate);
    }

    //@override is a function decorator (not actually necessary, just recommended)
    @Override
    public String speak() {
        return "meow";
    }

    @Override
    public void pet() {

    }
}

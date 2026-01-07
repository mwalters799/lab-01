package com.example.petshop;

import java.util.Date;

public class Silly extends Mood{

    public Silly(Date date) {
        super(date);
    }

    public String getMoodAsString(){
        return "silly";
    }
}

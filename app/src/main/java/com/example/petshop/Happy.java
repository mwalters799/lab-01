package com.example.petshop;

import java.util.Date;

public class Happy extends Mood{

    public Happy(Date date) {
        super(date);
    }

    public String getMoodAsString(){
        return "happy";
    }
}

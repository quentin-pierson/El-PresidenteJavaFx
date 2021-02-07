package com.esgi.models.Calamities;

public class CalamitySpring extends Calamity{
    CalamitySpring(String name, String description) {
        super(name, description);
    }
    @Override
    public Calamity isSeason(SeasonType seasonType){
        return seasonType == SeasonType.spring ? this : null;
    }
}

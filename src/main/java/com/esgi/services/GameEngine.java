package com.esgi.services;

import com.esgi.models.Island;

public class GameEngine {
    Island island;

    public void initGame(){
        island = new Island("islandos","dictator","islander",0,0,15,200,15,200,50);
    }
    public void loadGame(){

    }
}

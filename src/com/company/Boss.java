package com.company;

import java.util.Random;

public class Boss {
    int healthBoss;
    int damageBoss;
    int protectType;


    public void changeProtectType(){
        Random r = new Random();
        int randomNumber = r.nextInt(100) + 1;
       //protectType = protectType * randomNumber;
       protectType = randomNumber;
    }

    public int getHealthBoss() {
        return healthBoss;
    }

    public void setHealthBoss(int healthBoss) {
        this.healthBoss = healthBoss;
    }

    public int getDamageBoss() {
        return damageBoss;
    }

    public void setDamageBoss(int damageBoss) {
        this.damageBoss = damageBoss;
    }

    public int getProtectType() {
        return protectType;
    }

    public void setProtectType(int protectType) {
        this.protectType = protectType;
    }
}

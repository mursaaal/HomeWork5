package com.company;

public class MagicDoor {

    public Hero[] toReturn(){
        Hero hero1 = new Hero(250, 20, 50);
        Hero hero2 = new Hero(250, 20, 50);
        Hero hero3 = new Hero(250, 20, 50);
        Hero hero4 = new Hero (250, 20, 50);
        Hero[] arrayOfHeroes = {hero1, hero2, hero3, hero4};
        return arrayOfHeroes;
    }


}

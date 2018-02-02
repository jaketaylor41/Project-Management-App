package sample.Model;

import java.util.Random;

public class Task {

    public double points;

    public Task() {
        Random diceRoll = new Random();
        this.points = diceRoll.nextDouble() + 1;
    }




}








package sample.Model;

import java.util.Random;

public class Worker {

    public double ability;

    String developer;
    String designer;

    public Worker() {
        Random diceRoll = new Random();
        this.ability = diceRoll.nextDouble() + 1;

    }




}

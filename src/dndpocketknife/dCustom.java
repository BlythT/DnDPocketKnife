/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dndpocketknife;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author nox
 */
public class dCustom implements Die {
    private String name;
    private int value;
    private int min;
    private int max;
    private int multiplier;
    private static final Random RANDOM = new Random();
    public dCustom(int min, int max){
        this.min = min;
        this.max = max;
        this.multiplier = 1;
        this.name = "d" + max*multiplier;
        roll();
    }
    public dCustom(int min, int max, int multiplier){
        this.min = min;
        this.max = max;
        this.multiplier = multiplier;
        this.name = "d" + max*multiplier;
        roll();
    }
    public dCustom(String name, int min, int max, int multiplier){
        this.min = min;
        this.max = max;
        this.multiplier = multiplier;
        this.name = name;
        roll();
    }
    public int getValue(){
        return value;
    }
    public void setValue(int value){
        this.value = value;
    }
    public void roll(){
        this.value = ThreadLocalRandom.current().nextInt(min, max + 1)*multiplier;
    }
}

package com.example;

import java.util.List;

public class Lion {
    private final Feline feline;
    private final String sex;

    public Lion(String sex, Feline feline) throws Exception {
        this.feline = feline;
        if (!"Самец".equals(sex) && !"Самка".equals(sex)) {
            throw new Exception("Используйте допустимые значения пола животного - Самец или Самка");
        }
        this.sex = sex;
    }

    public boolean hasMane() {
        return "Самец".equals(sex);
    }

    public List<String> getFood() throws Exception {
        return feline.eatMeat();
    }

    public int getKittens() {
        return feline.getKittens();
    }
}
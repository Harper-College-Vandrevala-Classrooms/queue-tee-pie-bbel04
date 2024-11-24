package com.csc;

public class Panda implements Cutie {
    @Override
    public String description() {
        return "A big fluffy panda";
    }

    @Override
    public Integer cutenessRating() {
        return 9;
    }

    @Override
    public String toString() {
        return "Panda: " + description() + " (Cuteness: " + cutenessRating() + ")";
    }
}

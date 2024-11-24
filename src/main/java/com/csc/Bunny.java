package com.csc;

public class Bunny implements Cutie {
    @Override
    public String description() {
        return "A white bunny with big, fluffy ears";
    }

    @Override
    public Integer cutenessRating() {
        return 10;
    }

    @Override
    public String toString() {
        return "Bunny: " + description() + " (Cuteness: " + cutenessRating() + ")";
    }
}

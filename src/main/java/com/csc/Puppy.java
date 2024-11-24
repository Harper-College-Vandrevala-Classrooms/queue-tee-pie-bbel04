package com.csc;

public class Puppy implements Cutie {
    @Override
    public String description() {
        return "A little puppy with big, sad eyes";
    }

    @Override
    public Integer cutenessRating() {
        return 11;
    }

    @Override  //override annotation to return relevant data of the object as a string
    public String toString() {
        return "Puppy: " + description() + " (Cuteness: " + cutenessRating() + ")";
    }
}
package com.github.curriculeon;

public class Simulation {
    public boolean simulate(
            final boolean input1,
            final boolean input2,
            final boolean input3,
            final boolean input4){
        return input1 && (input4 || input2 && input3);
    }
}
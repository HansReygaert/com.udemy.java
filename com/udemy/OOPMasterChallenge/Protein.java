package com.udemy.OOPMasterChallenge;

import javax.swing.*;

public class Protein implements Ingredient
{
    public enum ProteinOptions
    {
        Beef,
        Chicken,
        Fish,
        Veggie
    }

    private ProteinOptions protein;
    private double cost;

    private final double BEEF_COST = 1.5;
    private final double CHICKEN_COST = 1.2;
    private final double FISH_COST = 1.6;
    private final double VEGGIE_COST = 1.9;

    Protein(ProteinOptions userChoice)
    {
        switch (protein) {
            case Beef:
                cost = BEEF_COST;
                protein = ProteinOptions.Beef;
                break;
            case Chicken:
                cost = CHICKEN_COST;
                protein = ProteinOptions.Chicken;
                break;
            case Fish:
                cost = FISH_COST;
                protein = ProteinOptions.Fish;
                break;
            case Veggie:
                cost = VEGGIE_COST;
                protein = ProteinOptions.Veggie;
                break;
        }
    }

        public String getName()
        {
            return protein.toString();
        }

        public double getCost()
        {
            return cost;
        }
}
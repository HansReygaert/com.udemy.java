package com.udemy.OOPMasterChallenge;

import java.util.List;

public class Condiments implements Ingredient
{

    public enum Types
    {
        Lettuce,
        Tomato,
        Egg,
        Porcini,
        Onion,
        Pickles,
        Bacon,
        Cheese,
        Pickled_Onion;
    }
    private String name;
    private double cost;

        public Condiments(Condiments.Types condiments)
        {
            switch(condiments)
            {
                case Lettuce:
                    cost = 0.15;
                    name = "Lettuce";
                    break;
                case Tomato:
                    cost = 0.35;
                    name = "Tomato";
                    break;
                case Egg:
                    cost = 0.65;
                    name = "Egg";
                    break;
                case Porcini:
                    cost = 0.60;
                    name = "Porcini";
                    break;
                case Onion:
                    cost = 0.35;
                    name = "Onion";
                    break;
                case Pickles:
                    cost = 0.15;
                    name = "Dill Pickles";
                    break;
                case Bacon:
                    cost = 0.85;
                    name = "Bacon";
                    break;
                case Cheese:
                    cost = 0.3;
                    name = "Cheese";
                    break;
                case Pickled_Onion:
                    cost = 0.3;
                    name = "Pickled Onions";
                    break;
            }
        }
        @Override
        public double getCost() {
            return cost;
        }

        @Override
        public String getName() {
            return name;
        }

}

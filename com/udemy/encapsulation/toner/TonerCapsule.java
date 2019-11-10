package com.udemy.encapsulation.toner;

public class TonerCapsule
{
    double level;
    TonerColor color;

    public TonerCapsule(double level, TonerColor color) {
        if (level < 0) level = 0;
        else if(level > 100) level = 100;

        this.level = level;
        this.color = color;
    }
}

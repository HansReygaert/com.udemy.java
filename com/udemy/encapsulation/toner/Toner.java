package com.udemy.encapsulation.toner;

public class Toner
{
    private TonerCapsule cyan;
    private TonerCapsule yellow;
    private TonerCapsule magenta;
    private TonerCapsule black;

    public Toner()
    {
        cyan = new TonerCapsule(100, TonerColor.Cyan);
        yellow = new TonerCapsule(100, TonerColor.Yellow);
        magenta = new TonerCapsule(100, TonerColor.Magenta);
        black = new TonerCapsule(100, TonerColor.Black);
    }

    public void fillToner()
    {
        cyan = new TonerCapsule(100, TonerColor.Cyan);
        yellow = new TonerCapsule(100, TonerColor.Yellow);
        magenta = new TonerCapsule(100, TonerColor.Magenta);
        black = new TonerCapsule(100, TonerColor.Black);
    }
    public void refillToner(TonerCapsule capsule)
    {
        switch (capsule.color)
        {
            case Cyan:
                cyan.level = 100;
                break;
            case Yellow:
                yellow.level = 100;
                break;
            case Magenta:
                magenta.level = 100;
                break;
            case Black:
                black.level = 100;
                break;
        }
    }

    public void injectColor(TonerColor color, double level)
    {
        if (level < 0) level = 0;
        else if (level > 100) level = 100;
        switch (color)
        {
            case Cyan:
                cyan.level -= level;
                break;
            case Yellow:
                yellow.level -= level;
                break;
            case Magenta:
                magenta.level -= level;
                break;
            case Black:
                black.level -= level;
                break;
        }
    }
}

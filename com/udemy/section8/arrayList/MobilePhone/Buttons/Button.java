package com.udemy.section8.arrayList.MobilePhone.Buttons;

import java.awt.event.ActionListener;

public class Button
{
    private String name;
    public void addActionListener(ActionListener a)
    {
        System.out.println(name + "was pressed");
    }

    public void isPressed()
    {

    }
}

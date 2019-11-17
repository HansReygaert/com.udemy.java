package com.udemy.section8.arrayList.MobilePhone.Menu;

import java.util.Stack;

public class History
{
    private Stack<Menu> history;

    public void addToHistory(Menu m)
    {
        history.push(m);
    }
    public void goBack()
    {
        history.pop();
    }
    public void returnToRoot()
    {
        Menu m = history.firstElement();
        history.empty();
        history.push(m);
    }
    public Menu getCurrentMenu()
    {
        return history.peek();
    }

}

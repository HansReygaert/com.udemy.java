package com.udemy.section8.arrayList.MobilePhone.Menu;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String name;
    private ArrayList<Menu> subMenus;
    private String content;

    public Menu(String name, String content) {
        this.name = name;
        this.content = content;
    }
    public Menu(String name)
    { this(name,""); }

    public String getName() {
        return name;
    }
    public String getContent() {
        return content;
    }
    public String[] getSubMenuNames()
    {
        String[] subMenuNames = new String[subMenus.size()];
        for (int i = 0; i < subMenuNames.length; i++) {
            subMenuNames[i] = subMenus.get(i).getName();
        }
        return subMenuNames;
    }
    public void addToSubMenu(Menu m)
    {
        subMenus.add(m);
    }
    public boolean isMenuInSubMenu(Menu m)
    {
        for(Menu submenu : subMenus)
        {
            if(submenu.equals(m)) { return true; }
        }
        return false;
    }
}

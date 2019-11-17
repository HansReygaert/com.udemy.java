package com.udemy.section8.arrayList.Network;

import com.udemy.inheritance.Position;

public class Network
{
    private double strength;
    private String[] availableProviders;
    private String authenticationToken;

    public boolean checkAvailableProviders(String provider)
    {
        for(String s : availableProviders)
        {
            if(provider == s) { return true; }
        }
        return false;
    }
    public double getStrength()
    {
        return strength;
    }
    public void initiateConnection(String authenticationToken)
    {
        if(this.authenticationToken == authenticationToken)
        {

        }
    }
}

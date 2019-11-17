package com.udemy.section8.arrayList.Network;

public class SIM
{
    private String ICCID; //Series of 19 digits containing info about provider etc
    private String IMSI;
    private int PIN;
    private int PUC;



    /*
    A SIM card contains its unique serial number (ICCID),
    international mobile subscriber identity (IMSI) number,
    security authentication and ciphering information,
    temporary information related to the local network,
    a list of the services the user has access to,
    and two passwords: a personal identification number (PIN) for ordinary use,
    and a personal unblocking code (PUC) for PIN unlocking.
     */

    public SIM(String ssn) {
        ICCID = ssn;
    }
}

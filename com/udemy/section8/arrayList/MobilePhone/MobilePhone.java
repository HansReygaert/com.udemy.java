package com.udemy.section8.arrayList.MobilePhone;

import com.udemy.section8.arrayList.MobilePhone.Menu.Menu;
import com.udemy.section8.arrayList.Network.SIM;

public class MobilePhone {

    private SIM simCard;
    private Contacts contacts;
    private IMEI imei;

    private Menu menuMain = new Menu("root");
    private Menu menuCall = new Menu("call");
    private Menu menuContact = new Menu("contacts");


}

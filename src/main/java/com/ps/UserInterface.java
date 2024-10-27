package com.ps;

public class UserInterface {

    private static Dealership dealership;

    public static void init (){

        dealership = DealershipFileManager.getDealership();
    }
    public static void diplay (){
        init();

        System.out.println("Load the menu");
    }
}


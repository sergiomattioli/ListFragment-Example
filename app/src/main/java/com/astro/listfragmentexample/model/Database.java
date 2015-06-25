package com.astro.listfragmentexample.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergio Mattioli on 24/06/2015.
 */
public class Database {

    /**
     * An array of sample (dummy) items.
     */
    public static List<String> ITEMS = new ArrayList<String>();

    static {
        addItem("Android");
        addItem("iPhone");
        addItem("Blackberry");
        addItem("Ubuntu");
        addItem("Windows XP");
        addItem("Windows 7");
        addItem("Windows 8.1");
        addItem("Windows 10");
        addItem("Mac OS X");

    }

    private static void addItem(String item) {
        ITEMS.add(item);
    }

    public static void removeItem(String item) {
        ITEMS.remove(item);
    }


}

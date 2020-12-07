package org.me.learn.spi;

import java.util.Iterator;
import java.util.ServiceLoader;


public class App {
    public static void main(String[] args) {

        ServiceLoader<DatabaseDriver> serviceLoader = ServiceLoader.load(DatabaseDriver.class);
        Iterator var2 = serviceLoader.iterator();

        while (var2.hasNext()) {
            DatabaseDriver databaseDriver = (DatabaseDriver) var2.next();
            System.out.println(databaseDriver.buildConnection("192.168.3.121"));
        }

    }
}

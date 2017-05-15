package main.controller;

import org.apache.log4j.PropertyConfigurator;
/**
 * Created by User on 15.05.2017.
 */
public class AppStartLissener {
    static {
        PropertyConfigurator.configure(AppStartLissener.class.getClassLoader()
                .getResource("log.properties"));
    }
}

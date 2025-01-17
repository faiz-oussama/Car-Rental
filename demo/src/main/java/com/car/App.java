package com.car;

import com.car.util.PropretiesReader;
import java.util.Properties;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Properties properties = PropretiesReader.getProperties("dbconnection.properties");
        System.out.println(properties.getProperty("jdbc.url"));
    }
}

package com.shivam.config;

import com.sun.deploy.util.Property;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {

    public static Configuration loadUserConfigration(String filePath){

        try{
            InputStream propertyReaderStream=new FileInputStream(new File(filePath));
            Properties property=new Properties();
            property.load(propertyReaderStream);

            System.out.println(property.get(Constants.NUM_RECORDS));
            /*
            To Do : Shikha

                    Similarly print value of other three propeties

                    Expected output
                .csv,.excel,.gson
                name,rollno,dob
                string,int,date
             */

        }catch (Exception e){
            System.out.println("Error loading property file "+e);
        }

        return new Configuration();
    }
}

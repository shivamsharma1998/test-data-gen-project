package com.shivam.app;

import com.shivam.config.Configuration;

public class Application {

    public static void main(String[] args){

        if (args.length<1){
            System.out.println("Application need config file to begin data generation");
            System.exit(0);
        }
        String configFilePath=args[0];
        Configuration configuration=Configuration.loadUserConfigration(configFilePath);

    }
}

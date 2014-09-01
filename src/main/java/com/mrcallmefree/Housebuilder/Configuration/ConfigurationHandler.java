package com.mrcallmefree.Housebuilder.Configuration;


import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {
    public static void init(File configFile) {
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;
        try {
            configuration.load();
            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "this should work").getBoolean(true);

        } catch (Exception e) {

        } finally {
            configuration.save();
        }


        System.out.println(configValue);
    }
}
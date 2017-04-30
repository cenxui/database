package com.cenxui.util;

/**
 * Created by cenxui on 4/29/17.
 */
public class ConfigFileNotFoundException extends RuntimeException {
    public ConfigFileNotFoundException() {
        super("file cannot find in this path");
    }
}

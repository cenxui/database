package com.cenxui.app;

import com.cenxui.util.Utils;
import org.json.JSONObject;

import java.util.logging.Logger;

/**
 * Created by cenxui on 4/29/17.
 */
public class Application {
    private final int port;
    private final String userName;
    private final String password;

    public Application(int port) {
        this.port = port;
        String config =  Utils.readFile("/config.json");

        JSONObject object = new JSONObject(config);
        userName = object.optString("user");
        password = object.optString("password");

    }

    public static void main(String[] args) {
        Application application = new Application(100);
        application.start();
        application.stop();
    }

    public void start() {
        Logger.getLogger(Application.class.getName()).info("start");
        Logger.getLogger(System.class.getName()).info("user : " + userName);
        Logger.getLogger(System.class.getName()).info("password : " + password);
    }

    public void stop() {
        Logger.getLogger(Application.class.getName()).info("stop");
    }

    public void restart() {
        Logger.getLogger(Application.class.getName()).info("restart");
    }
}

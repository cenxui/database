package com.cenxui.server;

import com.cenxui.util.Utils;
import netscape.javascript.JSObject;
import org.json.JSONObject;

import java.util.logging.Logger;

/**
 * Created by cenxui on 4/29/17.
 */
public class Server {
    private final int port;
    private final String userName;
    private final String password;

    public Server(int port) {
        this.port = port;
        String config =  Utils.readFile("/config.json");

        JSONObject object = new JSONObject(config);
        userName = object.optString("user");
        password = object.optString("password");

    }

    public static void main(String[] args) {
        Server server = new Server(100);
        server.start();
        server.stop();
    }

    public void start() {
        Logger.getLogger(Server.class.getName()).info("start");
        Logger.getLogger(System.class.getName()).info("user : " + userName);
        Logger.getLogger(System.class.getName()).info("password : " + password);
    }

    public void stop() {
        Logger.getLogger(Server.class.getName()).info("stop");
    }

    public void restart() {
        Logger.getLogger(Server.class.getName()).info("restart");
    }
}

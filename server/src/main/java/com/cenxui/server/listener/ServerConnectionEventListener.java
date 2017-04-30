package com.cenxui.server.listener;

/**
 * Created by cenxui on 4/29/17.
 */
public interface ServerConnectionEventListener {
    void setup();
    void success();
    void fail();
    void connect();
    void disconnect();
}

package com.cenxui.app.listener;

/**
 * Created by cenxui on 4/29/17.
 */
public interface ApplicationConnectionEventListener {
    void setup();
    void success();
    void fail();
    void connect();
    void disconnect();
}

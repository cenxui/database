package com.cenxui.server.listener;

/**
 * Created by cenxui on 4/29/17.
 */
public interface ServerEventListener {
    void onStart();
    void onRestart();
    void onStop();
}

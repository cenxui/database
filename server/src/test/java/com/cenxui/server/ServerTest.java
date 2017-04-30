package com.cenxui.server;

import org.junit.Test;

/**
 * Created by cenxui on 4/29/17.
 */
public class ServerTest {
    private Server server = new Server(100);

    @Test
    public void start() throws Exception {
        server.start();
    }

    @Test
    public void stop() throws Exception {
        server.stop();
    }

    @Test
    public void restart() throws Exception {
        server.restart();
    }

}
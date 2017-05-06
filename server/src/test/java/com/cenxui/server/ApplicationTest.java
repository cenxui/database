package com.cenxui.server;

import com.cenxui.app.Application;
import org.junit.Test;

/**
 * Created by cenxui on 4/29/17.
 */
public class ApplicationTest {
    private Application application = new Application(100);

    @Test
    public void start() throws Exception {
        application.start();
    }

    @Test
    public void stop() throws Exception {
        application.stop();
    }

    @Test
    public void restart() throws Exception {
        application.restart();
    }

}
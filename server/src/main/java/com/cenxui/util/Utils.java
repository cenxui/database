package com.cenxui.util;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

/**
 * Created by cenxui on 4/29/17.
 */
public class Utils {

    /**
     * @param file
     * @return
     */

    public static String readFile(String file) {
        validate(file);

        StringBuilder txt = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        Utils.class.getResourceAsStream(file), StandardCharsets.UTF_8))) {
            reader.lines().forEach(
                    (s)-> {
                        txt.append(s);
                    }
            );

        } catch (FileNotFoundException e) {
            throw new ConfigFileNotFoundException();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return txt.toString();
    }

    private static void validate(String file) {
        if (file == null || file.isEmpty()) throw new RuntimeException("file path can not be empty");
    }
}

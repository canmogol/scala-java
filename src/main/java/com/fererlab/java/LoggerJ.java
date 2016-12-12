package com.fererlab.java;

import java.util.logging.Level;

public class LoggerJ {

    private static final LoggerJ INSTANCE = new LoggerJ();

    private LoggerJ() {
    }

    public static LoggerJ getInstance() {
        return INSTANCE;
    }

    public void log(Level level, String log) {
        System.out.printf("%s %s%n", level, log);
    }

}

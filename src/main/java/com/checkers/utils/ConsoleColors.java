package com.checkers.utils;

public enum ConsoleColors{
    RESET("\u001B[0m"),
    BLACK("\u001B[30m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    PURPLE("\u001B[35m"),
    CYAN("\u001B[36m"),
    WHITE("\u001B[37m");
    private final String code;

    ConsoleColors(String code) {
        this.code = code;
    }

    public String toString() {
        return code;
    }

    public String set(String string) {

        return code+string+RESET;
    }
}

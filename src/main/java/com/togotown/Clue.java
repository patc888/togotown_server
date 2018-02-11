package com.togotown;

public class Clue {
    int id;
    String text;

    public Clue setId(int id) {
        this.id = id;
        return this;
    }

    public Clue setText(String text) {
        this.text = text;
        return this;
    }
}

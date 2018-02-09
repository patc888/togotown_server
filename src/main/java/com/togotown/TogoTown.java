package com.togotown;

import java.util.List;

import com.typesafe.config.Config;

public class TogoTown {
    Config conf;

    public TogoTown(Config conf) {
        this.conf = conf;
    }

    public Clue getClue(int clueId) {
        return new Clue();
    }

    public List<Clue> getClues() {
        return null;
    }

    public void addClue(Clue clue) {

    }
}

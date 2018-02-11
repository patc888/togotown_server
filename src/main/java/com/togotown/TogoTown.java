package com.togotown;

import java.util.List;

import com.togotown.services.Storage;
import com.togotown.services.StorageImpl;
import com.typesafe.config.Config;

public class TogoTown {
    Config conf;
    Storage storage;

    public TogoTown(Config conf) {
        storage = new StorageImpl(conf);
        this.conf = conf;
    }

    public Clue getClue(int clueId) {
        return new Clue();
    }

    public List<Clue> getClues() {
        return storage.getClues(0);
    }

    public void addClue(Clue clue) {

    }
}

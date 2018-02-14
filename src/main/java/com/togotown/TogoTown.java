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
        return storage.getClue(clueId);
    }

    public List<Clue> getClues(int sceneId) {
        return storage.getClues(sceneId);
    }

    public void addClue(Clue clue) {

    }
}

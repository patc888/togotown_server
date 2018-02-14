package com.togotown;

import java.sql.Timestamp;

public class Clue {
    private int id;
    private int sceneId;
    private int langId;
    private int phraseId;
    private int parentId;
    private String spotIds;
    private String active;
    private String reviewed;
    private Timestamp lastMod;

    public int getId() {
        return id;
    }

    public Clue setId(int id) {
        this.id = id;
        return this;
    }

    public int getSceneId() {
        return sceneId;
    }

    public Clue setSceneId(int sceneId) {
        this.sceneId = sceneId;
        return this;
    }

    public int getLangId() {
        return langId;
    }

    public Clue setLangId(int langId) {
        this.langId = langId;
        return this;
    }

    public int getPhraseId() {
        return phraseId;
    }

    public Clue setPhraseId(int phraseId) {
        this.phraseId = phraseId;
        return this;
    }

    public int getParentId() {
        return parentId;
    }

    public Clue setParentId(int parentId) {
        this.parentId = parentId;
        return this;
    }

    public String getSpotIds() {
        return spotIds;
    }

    public Clue setSpotIds(String spotIds) {
        this.spotIds = spotIds;
        return this;
    }

    public String getActive() {
        return active;
    }

    public Clue setActive(String active) {
        this.active = active;
        return this;
    }

    public String getReviewed() {
        return reviewed;
    }

    public Clue setReviewed(String reviewed) {
        this.reviewed = reviewed;
        return this;
    }

    public Timestamp getLastMod() {
        return lastMod;
    }

    public Clue setLastMod(Timestamp lastMod) {
        this.lastMod = lastMod;
        return this;
    }
}

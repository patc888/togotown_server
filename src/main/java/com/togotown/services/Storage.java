package com.togotown.services;

import com.togotown.Clue;

import java.util.List;

public interface Storage {
    List<Clue> getClues(int sceneId);
    Clue getClue(int clueId);
}

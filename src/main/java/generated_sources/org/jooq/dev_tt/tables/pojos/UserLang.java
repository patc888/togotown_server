/*
 * This file is generated by jOOQ.
*/
package org.jooq.dev_tt.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserLang implements Serializable {

    private static final long serialVersionUID = -2066117301;

    private Integer   userId;
    private Integer   langId;
    private Integer   sceneId;
    private Integer   score;
    private Integer   maxScore;
    private Integer   coins;
    private Integer   tkeys;
    private Integer   setsProgress;
    private Integer   setsCount;
    private Byte      seekMatches;
    private Timestamp lastMod;

    public UserLang() {}

    public UserLang(UserLang value) {
        this.userId = value.userId;
        this.langId = value.langId;
        this.sceneId = value.sceneId;
        this.score = value.score;
        this.maxScore = value.maxScore;
        this.coins = value.coins;
        this.tkeys = value.tkeys;
        this.setsProgress = value.setsProgress;
        this.setsCount = value.setsCount;
        this.seekMatches = value.seekMatches;
        this.lastMod = value.lastMod;
    }

    public UserLang(
        Integer   userId,
        Integer   langId,
        Integer   sceneId,
        Integer   score,
        Integer   maxScore,
        Integer   coins,
        Integer   tkeys,
        Integer   setsProgress,
        Integer   setsCount,
        Byte      seekMatches,
        Timestamp lastMod
    ) {
        this.userId = userId;
        this.langId = langId;
        this.sceneId = sceneId;
        this.score = score;
        this.maxScore = maxScore;
        this.coins = coins;
        this.tkeys = tkeys;
        this.setsProgress = setsProgress;
        this.setsCount = setsCount;
        this.seekMatches = seekMatches;
        this.lastMod = lastMod;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getLangId() {
        return this.langId;
    }

    public void setLangId(Integer langId) {
        this.langId = langId;
    }

    public Integer getSceneId() {
        return this.sceneId;
    }

    public void setSceneId(Integer sceneId) {
        this.sceneId = sceneId;
    }

    public Integer getScore() {
        return this.score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getMaxScore() {
        return this.maxScore;
    }

    public void setMaxScore(Integer maxScore) {
        this.maxScore = maxScore;
    }

    public Integer getCoins() {
        return this.coins;
    }

    public void setCoins(Integer coins) {
        this.coins = coins;
    }

    public Integer getTkeys() {
        return this.tkeys;
    }

    public void setTkeys(Integer tkeys) {
        this.tkeys = tkeys;
    }

    public Integer getSetsProgress() {
        return this.setsProgress;
    }

    public void setSetsProgress(Integer setsProgress) {
        this.setsProgress = setsProgress;
    }

    public Integer getSetsCount() {
        return this.setsCount;
    }

    public void setSetsCount(Integer setsCount) {
        this.setsCount = setsCount;
    }

    public Byte getSeekMatches() {
        return this.seekMatches;
    }

    public void setSeekMatches(Byte seekMatches) {
        this.seekMatches = seekMatches;
    }

    public Timestamp getLastMod() {
        return this.lastMod;
    }

    public void setLastMod(Timestamp lastMod) {
        this.lastMod = lastMod;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserLang (");

        sb.append(userId);
        sb.append(", ").append(langId);
        sb.append(", ").append(sceneId);
        sb.append(", ").append(score);
        sb.append(", ").append(maxScore);
        sb.append(", ").append(coins);
        sb.append(", ").append(tkeys);
        sb.append(", ").append(setsProgress);
        sb.append(", ").append(setsCount);
        sb.append(", ").append(seekMatches);
        sb.append(", ").append(lastMod);

        sb.append(")");
        return sb.toString();
    }
}
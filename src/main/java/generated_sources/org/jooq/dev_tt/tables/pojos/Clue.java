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
public class Clue implements Serializable {

    private static final long serialVersionUID = -251489101;

    private Integer   id;
    private Integer   langId;
    private Integer   sceneId;
    private Integer   phraseId;
    private Integer   parentId;
    private String    spotIds;
    private String    active;
    private String    reviewed;
    private Timestamp lastMod;

    public Clue() {}

    public Clue(Clue value) {
        this.id = value.id;
        this.langId = value.langId;
        this.sceneId = value.sceneId;
        this.phraseId = value.phraseId;
        this.parentId = value.parentId;
        this.spotIds = value.spotIds;
        this.active = value.active;
        this.reviewed = value.reviewed;
        this.lastMod = value.lastMod;
    }

    public Clue(
        Integer   id,
        Integer   langId,
        Integer   sceneId,
        Integer   phraseId,
        Integer   parentId,
        String    spotIds,
        String    active,
        String    reviewed,
        Timestamp lastMod
    ) {
        this.id = id;
        this.langId = langId;
        this.sceneId = sceneId;
        this.phraseId = phraseId;
        this.parentId = parentId;
        this.spotIds = spotIds;
        this.active = active;
        this.reviewed = reviewed;
        this.lastMod = lastMod;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getPhraseId() {
        return this.phraseId;
    }

    public void setPhraseId(Integer phraseId) {
        this.phraseId = phraseId;
    }

    public Integer getParentId() {
        return this.parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getSpotIds() {
        return this.spotIds;
    }

    public void setSpotIds(String spotIds) {
        this.spotIds = spotIds;
    }

    public String getActive() {
        return this.active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getReviewed() {
        return this.reviewed;
    }

    public void setReviewed(String reviewed) {
        this.reviewed = reviewed;
    }

    public Timestamp getLastMod() {
        return this.lastMod;
    }

    public void setLastMod(Timestamp lastMod) {
        this.lastMod = lastMod;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Clue (");

        sb.append(id);
        sb.append(", ").append(langId);
        sb.append(", ").append(sceneId);
        sb.append(", ").append(phraseId);
        sb.append(", ").append(parentId);
        sb.append(", ").append(spotIds);
        sb.append(", ").append(active);
        sb.append(", ").append(reviewed);
        sb.append(", ").append(lastMod);

        sb.append(")");
        return sb.toString();
    }
}

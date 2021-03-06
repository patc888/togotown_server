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
public class PhraseInfo implements Serializable {

    private static final long serialVersionUID = -2053808617;

    private Integer   phraseId;
    private Integer   sceneId;
    private String    type;
    private Integer   generation;
    private Timestamp lastMod;

    public PhraseInfo() {}

    public PhraseInfo(PhraseInfo value) {
        this.phraseId = value.phraseId;
        this.sceneId = value.sceneId;
        this.type = value.type;
        this.generation = value.generation;
        this.lastMod = value.lastMod;
    }

    public PhraseInfo(
        Integer   phraseId,
        Integer   sceneId,
        String    type,
        Integer   generation,
        Timestamp lastMod
    ) {
        this.phraseId = phraseId;
        this.sceneId = sceneId;
        this.type = type;
        this.generation = generation;
        this.lastMod = lastMod;
    }

    public Integer getPhraseId() {
        return this.phraseId;
    }

    public void setPhraseId(Integer phraseId) {
        this.phraseId = phraseId;
    }

    public Integer getSceneId() {
        return this.sceneId;
    }

    public void setSceneId(Integer sceneId) {
        this.sceneId = sceneId;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getGeneration() {
        return this.generation;
    }

    public void setGeneration(Integer generation) {
        this.generation = generation;
    }

    public Timestamp getLastMod() {
        return this.lastMod;
    }

    public void setLastMod(Timestamp lastMod) {
        this.lastMod = lastMod;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PhraseInfo (");

        sb.append(phraseId);
        sb.append(", ").append(sceneId);
        sb.append(", ").append(type);
        sb.append(", ").append(generation);
        sb.append(", ").append(lastMod);

        sb.append(")");
        return sb.toString();
    }
}

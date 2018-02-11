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
public class UserToken implements Serializable {

    private static final long serialVersionUID = -870174143;

    private Integer   userId;
    private Integer   langId;
    private Integer   tokenId;
    private Byte      scorea;
    private Byte      scoreb;
    private Byte      scorec;
    private Timestamp lastMod;

    public UserToken() {}

    public UserToken(UserToken value) {
        this.userId = value.userId;
        this.langId = value.langId;
        this.tokenId = value.tokenId;
        this.scorea = value.scorea;
        this.scoreb = value.scoreb;
        this.scorec = value.scorec;
        this.lastMod = value.lastMod;
    }

    public UserToken(
        Integer   userId,
        Integer   langId,
        Integer   tokenId,
        Byte      scorea,
        Byte      scoreb,
        Byte      scorec,
        Timestamp lastMod
    ) {
        this.userId = userId;
        this.langId = langId;
        this.tokenId = tokenId;
        this.scorea = scorea;
        this.scoreb = scoreb;
        this.scorec = scorec;
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

    public Integer getTokenId() {
        return this.tokenId;
    }

    public void setTokenId(Integer tokenId) {
        this.tokenId = tokenId;
    }

    public Byte getScorea() {
        return this.scorea;
    }

    public void setScorea(Byte scorea) {
        this.scorea = scorea;
    }

    public Byte getScoreb() {
        return this.scoreb;
    }

    public void setScoreb(Byte scoreb) {
        this.scoreb = scoreb;
    }

    public Byte getScorec() {
        return this.scorec;
    }

    public void setScorec(Byte scorec) {
        this.scorec = scorec;
    }

    public Timestamp getLastMod() {
        return this.lastMod;
    }

    public void setLastMod(Timestamp lastMod) {
        this.lastMod = lastMod;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserToken (");

        sb.append(userId);
        sb.append(", ").append(langId);
        sb.append(", ").append(tokenId);
        sb.append(", ").append(scorea);
        sb.append(", ").append(scoreb);
        sb.append(", ").append(scorec);
        sb.append(", ").append(lastMod);

        sb.append(")");
        return sb.toString();
    }
}

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
public class Token implements Serializable {

    private static final long serialVersionUID = 801882802;

    private Integer   id;
    private Integer   langId;
    private String    display;
    private Timestamp lastMod;

    public Token() {}

    public Token(Token value) {
        this.id = value.id;
        this.langId = value.langId;
        this.display = value.display;
        this.lastMod = value.lastMod;
    }

    public Token(
        Integer   id,
        Integer   langId,
        String    display,
        Timestamp lastMod
    ) {
        this.id = id;
        this.langId = langId;
        this.display = display;
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

    public String getDisplay() {
        return this.display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public Timestamp getLastMod() {
        return this.lastMod;
    }

    public void setLastMod(Timestamp lastMod) {
        this.lastMod = lastMod;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Token (");

        sb.append(id);
        sb.append(", ").append(langId);
        sb.append(", ").append(display);
        sb.append(", ").append(lastMod);

        sb.append(")");
        return sb.toString();
    }
}

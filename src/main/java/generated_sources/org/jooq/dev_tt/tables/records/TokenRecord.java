/*
 * This file is generated by jOOQ.
*/
package org.jooq.dev_tt.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.dev_tt.tables.Token;
import org.jooq.impl.UpdatableRecordImpl;


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
public class TokenRecord extends UpdatableRecordImpl<TokenRecord> implements Record4<Integer, Integer, String, Timestamp> {

    private static final long serialVersionUID = -1789580517;

    /**
     * Setter for <code>dev_tt.token.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>dev_tt.token.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>dev_tt.token.lang_id</code>.
     */
    public void setLangId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>dev_tt.token.lang_id</code>.
     */
    public Integer getLangId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>dev_tt.token.display</code>.
     */
    public void setDisplay(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>dev_tt.token.display</code>.
     */
    public String getDisplay() {
        return (String) get(2);
    }

    /**
     * Setter for <code>dev_tt.token.last_mod</code>.
     */
    public void setLastMod(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>dev_tt.token.last_mod</code>.
     */
    public Timestamp getLastMod() {
        return (Timestamp) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, String, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, String, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Token.TOKEN.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Token.TOKEN.LANG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Token.TOKEN.DISPLAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Token.TOKEN.LAST_MOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getLangId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDisplay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getLastMod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getLangId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDisplay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getLastMod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TokenRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TokenRecord value2(Integer value) {
        setLangId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TokenRecord value3(String value) {
        setDisplay(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TokenRecord value4(Timestamp value) {
        setLastMod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TokenRecord values(Integer value1, Integer value2, String value3, Timestamp value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TokenRecord
     */
    public TokenRecord() {
        super(Token.TOKEN);
    }

    /**
     * Create a detached, initialised TokenRecord
     */
    public TokenRecord(Integer id, Integer langId, String display, Timestamp lastMod) {
        super(Token.TOKEN);

        set(0, id);
        set(1, langId);
        set(2, display);
        set(3, lastMod);
    }
}

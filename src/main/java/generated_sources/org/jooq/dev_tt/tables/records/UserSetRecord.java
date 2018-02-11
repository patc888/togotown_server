/*
 * This file is generated by jOOQ.
*/
package org.jooq.dev_tt.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.dev_tt.tables.UserSet;
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
public class UserSetRecord extends UpdatableRecordImpl<UserSetRecord> implements Record5<Integer, Integer, Integer, Integer, Timestamp> {

    private static final long serialVersionUID = 818822460;

    /**
     * Setter for <code>dev_tt.user_set.set_id</code>.
     */
    public void setSetId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>dev_tt.user_set.set_id</code>.
     */
    public Integer getSetId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>dev_tt.user_set.lang_id</code>.
     */
    public void setLangId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>dev_tt.user_set.lang_id</code>.
     */
    public Integer getLangId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>dev_tt.user_set.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>dev_tt.user_set.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>dev_tt.user_set.count</code>.
     */
    public void setCount(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>dev_tt.user_set.count</code>.
     */
    public Integer getCount() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>dev_tt.user_set.last_mod</code>.
     */
    public void setLastMod(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>dev_tt.user_set.last_mod</code>.
     */
    public Timestamp getLastMod() {
        return (Timestamp) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record3<Integer, Integer, Integer> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, Integer, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, Integer, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UserSet.USER_SET.SET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return UserSet.USER_SET.LANG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return UserSet.USER_SET.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return UserSet.USER_SET.COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return UserSet.USER_SET.LAST_MOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getSetId();
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
    public Integer component3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getLastMod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getSetId();
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
    public Integer value3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getLastMod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSetRecord value1(Integer value) {
        setSetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSetRecord value2(Integer value) {
        setLangId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSetRecord value3(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSetRecord value4(Integer value) {
        setCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSetRecord value5(Timestamp value) {
        setLastMod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSetRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserSetRecord
     */
    public UserSetRecord() {
        super(UserSet.USER_SET);
    }

    /**
     * Create a detached, initialised UserSetRecord
     */
    public UserSetRecord(Integer setId, Integer langId, Integer userId, Integer count, Timestamp lastMod) {
        super(UserSet.USER_SET);

        set(0, setId);
        set(1, langId);
        set(2, userId);
        set(3, count);
        set(4, lastMod);
    }
}
/*
 * This file is generated by jOOQ.
*/
package org.jooq.dev_tt.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.dev_tt.tables.UserClue;
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
public class UserClueRecord extends UpdatableRecordImpl<UserClueRecord> implements Record6<Integer, Integer, Integer, Integer, Integer, Timestamp> {

    private static final long serialVersionUID = 1612761246;

    /**
     * Setter for <code>dev_tt.user_clue.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>dev_tt.user_clue.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>dev_tt.user_clue.lang_id</code>.
     */
    public void setLangId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>dev_tt.user_clue.lang_id</code>.
     */
    public Integer getLangId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>dev_tt.user_clue.clue_id</code>.
     */
    public void setClueId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>dev_tt.user_clue.clue_id</code>.
     */
    public Integer getClueId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>dev_tt.user_clue.correct_count</code>.
     */
    public void setCorrectCount(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>dev_tt.user_clue.correct_count</code>.
     */
    public Integer getCorrectCount() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>dev_tt.user_clue.wrong_count</code>.
     */
    public void setWrongCount(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>dev_tt.user_clue.wrong_count</code>.
     */
    public Integer getWrongCount() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>dev_tt.user_clue.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>dev_tt.user_clue.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Integer, Integer, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Integer, Integer, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UserClue.USER_CLUE.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return UserClue.USER_CLUE.LANG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return UserClue.USER_CLUE.CLUE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return UserClue.USER_CLUE.CORRECT_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return UserClue.USER_CLUE.WRONG_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return UserClue.USER_CLUE.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getUserId();
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
        return getClueId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getCorrectCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getWrongCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getUserId();
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
        return getClueId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getCorrectCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getWrongCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserClueRecord value1(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserClueRecord value2(Integer value) {
        setLangId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserClueRecord value3(Integer value) {
        setClueId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserClueRecord value4(Integer value) {
        setCorrectCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserClueRecord value5(Integer value) {
        setWrongCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserClueRecord value6(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserClueRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserClueRecord
     */
    public UserClueRecord() {
        super(UserClue.USER_CLUE);
    }

    /**
     * Create a detached, initialised UserClueRecord
     */
    public UserClueRecord(Integer userId, Integer langId, Integer clueId, Integer correctCount, Integer wrongCount, Timestamp created) {
        super(UserClue.USER_CLUE);

        set(0, userId);
        set(1, langId);
        set(2, clueId);
        set(3, correctCount);
        set(4, wrongCount);
        set(5, created);
    }
}

/*
 * This file is generated by jOOQ.
*/
package org.jooq.dev_tt.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Record2;
import org.jooq.Row11;
import org.jooq.dev_tt.tables.UserLang;
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
public class UserLangRecord extends UpdatableRecordImpl<UserLangRecord> implements Record11<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Byte, Timestamp> {

    private static final long serialVersionUID = -118672644;

    /**
     * Setter for <code>dev_tt.user_lang.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>dev_tt.user_lang.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>dev_tt.user_lang.lang_id</code>.
     */
    public void setLangId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>dev_tt.user_lang.lang_id</code>.
     */
    public Integer getLangId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>dev_tt.user_lang.scene_id</code>.
     */
    public void setSceneId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>dev_tt.user_lang.scene_id</code>.
     */
    public Integer getSceneId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>dev_tt.user_lang.score</code>.
     */
    public void setScore(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>dev_tt.user_lang.score</code>.
     */
    public Integer getScore() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>dev_tt.user_lang.max_score</code>.
     */
    public void setMaxScore(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>dev_tt.user_lang.max_score</code>.
     */
    public Integer getMaxScore() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>dev_tt.user_lang.coins</code>.
     */
    public void setCoins(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>dev_tt.user_lang.coins</code>.
     */
    public Integer getCoins() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>dev_tt.user_lang.tkeys</code>.
     */
    public void setTkeys(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>dev_tt.user_lang.tkeys</code>.
     */
    public Integer getTkeys() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>dev_tt.user_lang.sets_progress</code>.
     */
    public void setSetsProgress(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>dev_tt.user_lang.sets_progress</code>.
     */
    public Integer getSetsProgress() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>dev_tt.user_lang.sets_count</code>.
     */
    public void setSetsCount(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>dev_tt.user_lang.sets_count</code>.
     */
    public Integer getSetsCount() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>dev_tt.user_lang.seek_matches</code>.
     */
    public void setSeekMatches(Byte value) {
        set(9, value);
    }

    /**
     * Getter for <code>dev_tt.user_lang.seek_matches</code>.
     */
    public Byte getSeekMatches() {
        return (Byte) get(9);
    }

    /**
     * Setter for <code>dev_tt.user_lang.last_mod</code>.
     */
    public void setLastMod(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>dev_tt.user_lang.last_mod</code>.
     */
    public Timestamp getLastMod() {
        return (Timestamp) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Byte, Timestamp> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Byte, Timestamp> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UserLang.USER_LANG.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return UserLang.USER_LANG.LANG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return UserLang.USER_LANG.SCENE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return UserLang.USER_LANG.SCORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return UserLang.USER_LANG.MAX_SCORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return UserLang.USER_LANG.COINS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return UserLang.USER_LANG.TKEYS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return UserLang.USER_LANG.SETS_PROGRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return UserLang.USER_LANG.SETS_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field10() {
        return UserLang.USER_LANG.SEEK_MATCHES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return UserLang.USER_LANG.LAST_MOD;
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
        return getSceneId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getMaxScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getCoins();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getTkeys();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getSetsProgress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getSetsCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component10() {
        return getSeekMatches();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getLastMod();
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
        return getSceneId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getMaxScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getCoins();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getTkeys();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getSetsProgress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getSetsCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value10() {
        return getSeekMatches();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getLastMod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserLangRecord value1(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserLangRecord value2(Integer value) {
        setLangId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserLangRecord value3(Integer value) {
        setSceneId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserLangRecord value4(Integer value) {
        setScore(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserLangRecord value5(Integer value) {
        setMaxScore(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserLangRecord value6(Integer value) {
        setCoins(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserLangRecord value7(Integer value) {
        setTkeys(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserLangRecord value8(Integer value) {
        setSetsProgress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserLangRecord value9(Integer value) {
        setSetsCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserLangRecord value10(Byte value) {
        setSeekMatches(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserLangRecord value11(Timestamp value) {
        setLastMod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserLangRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, Integer value6, Integer value7, Integer value8, Integer value9, Byte value10, Timestamp value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserLangRecord
     */
    public UserLangRecord() {
        super(UserLang.USER_LANG);
    }

    /**
     * Create a detached, initialised UserLangRecord
     */
    public UserLangRecord(Integer userId, Integer langId, Integer sceneId, Integer score, Integer maxScore, Integer coins, Integer tkeys, Integer setsProgress, Integer setsCount, Byte seekMatches, Timestamp lastMod) {
        super(UserLang.USER_LANG);

        set(0, userId);
        set(1, langId);
        set(2, sceneId);
        set(3, score);
        set(4, maxScore);
        set(5, coins);
        set(6, tkeys);
        set(7, setsProgress);
        set(8, setsCount);
        set(9, seekMatches);
        set(10, lastMod);
    }
}

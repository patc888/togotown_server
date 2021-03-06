/*
 * This file is generated by jOOQ.
*/
package org.jooq.dev_tt.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.dev_tt.tables.Job;
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
public class JobRecord extends UpdatableRecordImpl<JobRecord> implements Record14<Integer, Integer, Short, Integer, Integer, String, String, String, String, Integer, Integer, Integer, String, Timestamp> {

    private static final long serialVersionUID = 496536529;

    /**
     * Setter for <code>dev_tt.job.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>dev_tt.job.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>dev_tt.job.scene_id</code>.
     */
    public void setSceneId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>dev_tt.job.scene_id</code>.
     */
    public Integer getSceneId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>dev_tt.job.type</code>.
     */
    public void setType(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>dev_tt.job.type</code>.
     */
    public Short getType() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>dev_tt.job.phrase_id</code>.
     */
    public void setPhraseId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>dev_tt.job.phrase_id</code>.
     */
    public Integer getPhraseId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>dev_tt.job.ord</code>.
     */
    public void setOrd(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>dev_tt.job.ord</code>.
     */
    public Integer getOrd() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>dev_tt.job.in_item_names</code>.
     */
    public void setInItemNames(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>dev_tt.job.in_item_names</code>.
     */
    public String getInItemNames() {
        return (String) get(5);
    }

    /**
     * Setter for <code>dev_tt.job.in_item_ids</code>.
     */
    public void setInItemIds(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>dev_tt.job.in_item_ids</code>.
     */
    public String getInItemIds() {
        return (String) get(6);
    }

    /**
     * Setter for <code>dev_tt.job.out_item_names</code>.
     */
    public void setOutItemNames(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>dev_tt.job.out_item_names</code>.
     */
    public String getOutItemNames() {
        return (String) get(7);
    }

    /**
     * Setter for <code>dev_tt.job.out_item_ids</code>.
     */
    public void setOutItemIds(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>dev_tt.job.out_item_ids</code>.
     */
    public String getOutItemIds() {
        return (String) get(8);
    }

    /**
     * Setter for <code>dev_tt.job.rarity</code>.
     */
    public void setRarity(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>dev_tt.job.rarity</code>.
     */
    public Integer getRarity() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>dev_tt.job.cost</code>.
     */
    public void setCost(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>dev_tt.job.cost</code>.
     */
    public Integer getCost() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>dev_tt.job.pay</code>.
     */
    public void setPay(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>dev_tt.job.pay</code>.
     */
    public Integer getPay() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>dev_tt.job.active</code>.
     */
    public void setActive(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>dev_tt.job.active</code>.
     */
    public String getActive() {
        return (String) get(12);
    }

    /**
     * Setter for <code>dev_tt.job.last_mod</code>.
     */
    public void setLastMod(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>dev_tt.job.last_mod</code>.
     */
    public Timestamp getLastMod() {
        return (Timestamp) get(13);
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
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, Integer, Short, Integer, Integer, String, String, String, String, Integer, Integer, Integer, String, Timestamp> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, Integer, Short, Integer, Integer, String, String, String, String, Integer, Integer, Integer, String, Timestamp> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Job.JOB.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Job.JOB.SCENE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return Job.JOB.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Job.JOB.PHRASE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Job.JOB.ORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Job.JOB.IN_ITEM_NAMES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Job.JOB.IN_ITEM_IDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Job.JOB.OUT_ITEM_NAMES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Job.JOB.OUT_ITEM_IDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return Job.JOB.RARITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return Job.JOB.COST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return Job.JOB.PAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Job.JOB.ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return Job.JOB.LAST_MOD;
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
        return getSceneId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getPhraseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getOrd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getInItemNames();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getInItemIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getOutItemNames();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getOutItemIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getRarity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getCost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component12() {
        return getPay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component14() {
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
        return getSceneId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getPhraseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getOrd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getInItemNames();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getInItemIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getOutItemNames();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getOutItemIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getRarity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getCost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getPay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getLastMod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRecord value2(Integer value) {
        setSceneId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRecord value3(Short value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRecord value4(Integer value) {
        setPhraseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRecord value5(Integer value) {
        setOrd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRecord value6(String value) {
        setInItemNames(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRecord value7(String value) {
        setInItemIds(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRecord value8(String value) {
        setOutItemNames(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRecord value9(String value) {
        setOutItemIds(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRecord value10(Integer value) {
        setRarity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRecord value11(Integer value) {
        setCost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRecord value12(Integer value) {
        setPay(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRecord value13(String value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRecord value14(Timestamp value) {
        setLastMod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRecord values(Integer value1, Integer value2, Short value3, Integer value4, Integer value5, String value6, String value7, String value8, String value9, Integer value10, Integer value11, Integer value12, String value13, Timestamp value14) {
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
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JobRecord
     */
    public JobRecord() {
        super(Job.JOB);
    }

    /**
     * Create a detached, initialised JobRecord
     */
    public JobRecord(Integer id, Integer sceneId, Short type, Integer phraseId, Integer ord, String inItemNames, String inItemIds, String outItemNames, String outItemIds, Integer rarity, Integer cost, Integer pay, String active, Timestamp lastMod) {
        super(Job.JOB);

        set(0, id);
        set(1, sceneId);
        set(2, type);
        set(3, phraseId);
        set(4, ord);
        set(5, inItemNames);
        set(6, inItemIds);
        set(7, outItemNames);
        set(8, outItemIds);
        set(9, rarity);
        set(10, cost);
        set(11, pay);
        set(12, active);
        set(13, lastMod);
    }
}

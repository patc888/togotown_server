/*
 * This file is generated by jOOQ.
*/
package org.jooq.dev_tt.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.dev_tt.DevTt;
import org.jooq.dev_tt.Indexes;
import org.jooq.dev_tt.Keys;
import org.jooq.dev_tt.tables.records.JobRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Job extends TableImpl<JobRecord> {

    private static final long serialVersionUID = -1555106392;

    /**
     * The reference instance of <code>dev_tt.job</code>
     */
    public static final Job JOB = new Job();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JobRecord> getRecordType() {
        return JobRecord.class;
    }

    /**
     * The column <code>dev_tt.job.id</code>.
     */
    public final TableField<JobRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>dev_tt.job.scene_id</code>.
     */
    public final TableField<JobRecord, Integer> SCENE_ID = createField("scene_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("-1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dev_tt.job.type</code>.
     */
    public final TableField<JobRecord, Short> TYPE = createField("type", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>dev_tt.job.phrase_id</code>.
     */
    public final TableField<JobRecord, Integer> PHRASE_ID = createField("phrase_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("-1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dev_tt.job.ord</code>.
     */
    public final TableField<JobRecord, Integer> ORD = createField("ord", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("100", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dev_tt.job.in_item_names</code>.
     */
    public final TableField<JobRecord, String> IN_ITEM_NAMES = createField("in_item_names", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>dev_tt.job.in_item_ids</code>.
     */
    public final TableField<JobRecord, String> IN_ITEM_IDS = createField("in_item_ids", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>dev_tt.job.out_item_names</code>.
     */
    public final TableField<JobRecord, String> OUT_ITEM_NAMES = createField("out_item_names", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>dev_tt.job.out_item_ids</code>.
     */
    public final TableField<JobRecord, String> OUT_ITEM_IDS = createField("out_item_ids", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>dev_tt.job.rarity</code>.
     */
    public final TableField<JobRecord, Integer> RARITY = createField("rarity", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dev_tt.job.cost</code>.
     */
    public final TableField<JobRecord, Integer> COST = createField("cost", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dev_tt.job.pay</code>.
     */
    public final TableField<JobRecord, Integer> PAY = createField("pay", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dev_tt.job.active</code>.
     */
    public final TableField<JobRecord, String> ACTIVE = createField("active", org.jooq.impl.SQLDataType.CHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.inline("F", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>dev_tt.job.last_mod</code>.
     */
    public final TableField<JobRecord, Timestamp> LAST_MOD = createField("last_mod", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>dev_tt.job</code> table reference
     */
    public Job() {
        this(DSL.name("job"), null);
    }

    /**
     * Create an aliased <code>dev_tt.job</code> table reference
     */
    public Job(String alias) {
        this(DSL.name(alias), JOB);
    }

    /**
     * Create an aliased <code>dev_tt.job</code> table reference
     */
    public Job(Name alias) {
        this(alias, JOB);
    }

    private Job(Name alias, Table<JobRecord> aliased) {
        this(alias, aliased, null);
    }

    private Job(Name alias, Table<JobRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DevTt.DEV_TT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.JOB_ACTIVE_IDX, Indexes.JOB_PHRASE_IDX, Indexes.JOB_PRIMARY, Indexes.JOB_SCENE_IDX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<JobRecord, Integer> getIdentity() {
        return Keys.IDENTITY_JOB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JobRecord> getPrimaryKey() {
        return Keys.KEY_JOB_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JobRecord>> getKeys() {
        return Arrays.<UniqueKey<JobRecord>>asList(Keys.KEY_JOB_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Job as(String alias) {
        return new Job(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Job as(Name alias) {
        return new Job(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Job rename(String name) {
        return new Job(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Job rename(Name name) {
        return new Job(name, null);
    }
}

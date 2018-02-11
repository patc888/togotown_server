/*
 * This file is generated by jOOQ.
*/
package org.jooq.dev_tt.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.dev_tt.DevTt;
import org.jooq.dev_tt.Indexes;
import org.jooq.dev_tt.Keys;
import org.jooq.dev_tt.tables.records.UserClueRecord;
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
public class UserClue extends TableImpl<UserClueRecord> {

    private static final long serialVersionUID = 1123023483;

    /**
     * The reference instance of <code>dev_tt.user_clue</code>
     */
    public static final UserClue USER_CLUE = new UserClue();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserClueRecord> getRecordType() {
        return UserClueRecord.class;
    }

    /**
     * The column <code>dev_tt.user_clue.user_id</code>.
     */
    public final TableField<UserClueRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("-1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dev_tt.user_clue.lang_id</code>.
     */
    public final TableField<UserClueRecord, Integer> LANG_ID = createField("lang_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("-1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dev_tt.user_clue.clue_id</code>.
     */
    public final TableField<UserClueRecord, Integer> CLUE_ID = createField("clue_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("-1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dev_tt.user_clue.correct_count</code>.
     */
    public final TableField<UserClueRecord, Integer> CORRECT_COUNT = createField("correct_count", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dev_tt.user_clue.wrong_count</code>.
     */
    public final TableField<UserClueRecord, Integer> WRONG_COUNT = createField("wrong_count", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dev_tt.user_clue.created</code>.
     */
    public final TableField<UserClueRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>dev_tt.user_clue</code> table reference
     */
    public UserClue() {
        this(DSL.name("user_clue"), null);
    }

    /**
     * Create an aliased <code>dev_tt.user_clue</code> table reference
     */
    public UserClue(String alias) {
        this(DSL.name(alias), USER_CLUE);
    }

    /**
     * Create an aliased <code>dev_tt.user_clue</code> table reference
     */
    public UserClue(Name alias) {
        this(alias, USER_CLUE);
    }

    private UserClue(Name alias, Table<UserClueRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserClue(Name alias, Table<UserClueRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.USER_CLUE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserClueRecord> getPrimaryKey() {
        return Keys.KEY_USER_CLUE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserClueRecord>> getKeys() {
        return Arrays.<UniqueKey<UserClueRecord>>asList(Keys.KEY_USER_CLUE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserClue as(String alias) {
        return new UserClue(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserClue as(Name alias) {
        return new UserClue(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserClue rename(String name) {
        return new UserClue(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserClue rename(Name name) {
        return new UserClue(name, null);
    }
}

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
import org.jooq.dev_tt.tables.records.UserSceneRecord;
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
public class UserScene extends TableImpl<UserSceneRecord> {

    private static final long serialVersionUID = 535488968;

    /**
     * The reference instance of <code>dev_tt.user_scene</code>
     */
    public static final UserScene USER_SCENE = new UserScene();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserSceneRecord> getRecordType() {
        return UserSceneRecord.class;
    }

    /**
     * The column <code>dev_tt.user_scene.user_id</code>.
     */
    public final TableField<UserSceneRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dev_tt.user_scene.lang_id</code>.
     */
    public final TableField<UserSceneRecord, Integer> LANG_ID = createField("lang_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dev_tt.user_scene.scene_id</code>.
     */
    public final TableField<UserSceneRecord, Integer> SCENE_ID = createField("scene_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dev_tt.user_scene.level</code>.
     */
    public final TableField<UserSceneRecord, Integer> LEVEL = createField("level", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("10", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dev_tt.user_scene.rank</code>.
     */
    public final TableField<UserSceneRecord, Integer> RANK = createField("rank", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("-1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dev_tt.user_scene.score</code>.
     */
    public final TableField<UserSceneRecord, Integer> SCORE = createField("score", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dev_tt.user_scene.active</code>.
     */
    public final TableField<UserSceneRecord, String> ACTIVE = createField("active", org.jooq.impl.SQLDataType.CHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.inline("F", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>dev_tt.user_scene.last_mod</code>.
     */
    public final TableField<UserSceneRecord, Timestamp> LAST_MOD = createField("last_mod", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>dev_tt.user_scene</code> table reference
     */
    public UserScene() {
        this(DSL.name("user_scene"), null);
    }

    /**
     * Create an aliased <code>dev_tt.user_scene</code> table reference
     */
    public UserScene(String alias) {
        this(DSL.name(alias), USER_SCENE);
    }

    /**
     * Create an aliased <code>dev_tt.user_scene</code> table reference
     */
    public UserScene(Name alias) {
        this(alias, USER_SCENE);
    }

    private UserScene(Name alias, Table<UserSceneRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserScene(Name alias, Table<UserSceneRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.USER_SCENE_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserSceneRecord>> getKeys() {
        return Arrays.<UniqueKey<UserSceneRecord>>asList(Keys.KEY_USER_SCENE_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserScene as(String alias) {
        return new UserScene(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserScene as(Name alias) {
        return new UserScene(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserScene rename(String name) {
        return new UserScene(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserScene rename(Name name) {
        return new UserScene(name, null);
    }
}

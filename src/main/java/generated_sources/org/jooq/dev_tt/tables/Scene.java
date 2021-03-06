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
import org.jooq.dev_tt.tables.records.SceneRecord;
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
public class Scene extends TableImpl<SceneRecord> {

    private static final long serialVersionUID = 1080369035;

    /**
     * The reference instance of <code>dev_tt.scene</code>
     */
    public static final Scene SCENE = new Scene();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SceneRecord> getRecordType() {
        return SceneRecord.class;
    }

    /**
     * The column <code>dev_tt.scene.id</code>.
     */
    public final TableField<SceneRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>dev_tt.scene.town_id</code>.
     */
    public final TableField<SceneRecord, Integer> TOWN_ID = createField("town_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>dev_tt.scene.phrase_id</code>.
     */
    public final TableField<SceneRecord, Integer> PHRASE_ID = createField("phrase_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("-1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dev_tt.scene.desc</code>.
     */
    public final TableField<SceneRecord, String> DESC = createField("desc", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false).defaultValue(org.jooq.impl.DSL.inline("N/A", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>dev_tt.scene.filename</code>.
     */
    public final TableField<SceneRecord, String> FILENAME = createField("filename", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>dev_tt.scene.next_scene_id</code>.
     */
    public final TableField<SceneRecord, Integer> NEXT_SCENE_ID = createField("next_scene_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dev_tt.scene.active</code>.
     */
    public final TableField<SceneRecord, String> ACTIVE = createField("active", org.jooq.impl.SQLDataType.CHAR(1).defaultValue(org.jooq.impl.DSL.inline("F", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>dev_tt.scene.last_mod</code>.
     */
    public final TableField<SceneRecord, Timestamp> LAST_MOD = createField("last_mod", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>dev_tt.scene</code> table reference
     */
    public Scene() {
        this(DSL.name("scene"), null);
    }

    /**
     * Create an aliased <code>dev_tt.scene</code> table reference
     */
    public Scene(String alias) {
        this(DSL.name(alias), SCENE);
    }

    /**
     * Create an aliased <code>dev_tt.scene</code> table reference
     */
    public Scene(Name alias) {
        this(alias, SCENE);
    }

    private Scene(Name alias, Table<SceneRecord> aliased) {
        this(alias, aliased, null);
    }

    private Scene(Name alias, Table<SceneRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.SCENE_ACTIVE_IDX, Indexes.SCENE_PRIMARY, Indexes.SCENE_TOWN_IDX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SceneRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SCENE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SceneRecord> getPrimaryKey() {
        return Keys.KEY_SCENE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SceneRecord>> getKeys() {
        return Arrays.<UniqueKey<SceneRecord>>asList(Keys.KEY_SCENE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Scene as(String alias) {
        return new Scene(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Scene as(Name alias) {
        return new Scene(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Scene rename(String name) {
        return new Scene(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Scene rename(Name name) {
        return new Scene(name, null);
    }
}

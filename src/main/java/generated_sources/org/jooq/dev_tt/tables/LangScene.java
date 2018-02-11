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
import org.jooq.dev_tt.tables.records.LangSceneRecord;
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
public class LangScene extends TableImpl<LangSceneRecord> {

    private static final long serialVersionUID = -268659836;

    /**
     * The reference instance of <code>dev_tt.lang_scene</code>
     */
    public static final LangScene LANG_SCENE = new LangScene();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LangSceneRecord> getRecordType() {
        return LangSceneRecord.class;
    }

    /**
     * The column <code>dev_tt.lang_scene.lang_id</code>.
     */
    public final TableField<LangSceneRecord, Integer> LANG_ID = createField("lang_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dev_tt.lang_scene.scene_id</code>.
     */
    public final TableField<LangSceneRecord, Integer> SCENE_ID = createField("scene_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dev_tt.lang_scene.max_tokens</code>.
     */
    public final TableField<LangSceneRecord, Integer> MAX_TOKENS = createField("max_tokens", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dev_tt.lang_scene.ranked_clues</code>.
     */
    public final TableField<LangSceneRecord, Integer> RANKED_CLUES = createField("ranked_clues", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>dev_tt.lang_scene.last_mod</code>.
     */
    public final TableField<LangSceneRecord, Timestamp> LAST_MOD = createField("last_mod", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>dev_tt.lang_scene</code> table reference
     */
    public LangScene() {
        this(DSL.name("lang_scene"), null);
    }

    /**
     * Create an aliased <code>dev_tt.lang_scene</code> table reference
     */
    public LangScene(String alias) {
        this(DSL.name(alias), LANG_SCENE);
    }

    /**
     * Create an aliased <code>dev_tt.lang_scene</code> table reference
     */
    public LangScene(Name alias) {
        this(alias, LANG_SCENE);
    }

    private LangScene(Name alias, Table<LangSceneRecord> aliased) {
        this(alias, aliased, null);
    }

    private LangScene(Name alias, Table<LangSceneRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.LANG_SCENE_LANG_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LangSceneRecord>> getKeys() {
        return Arrays.<UniqueKey<LangSceneRecord>>asList(Keys.KEY_LANG_SCENE_LANG_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LangScene as(String alias) {
        return new LangScene(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LangScene as(Name alias) {
        return new LangScene(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LangScene rename(String name) {
        return new LangScene(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LangScene rename(Name name) {
        return new LangScene(name, null);
    }
}

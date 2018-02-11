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
import org.jooq.dev_tt.tables.records.SpotRecord;
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
public class Spot extends TableImpl<SpotRecord> {

    private static final long serialVersionUID = 1701539705;

    /**
     * The reference instance of <code>dev_tt.spot</code>
     */
    public static final Spot SPOT = new Spot();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SpotRecord> getRecordType() {
        return SpotRecord.class;
    }

    /**
     * The column <code>dev_tt.spot.id</code>.
     */
    public final TableField<SpotRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>dev_tt.spot.scene_id</code>.
     */
    public final TableField<SpotRecord, Integer> SCENE_ID = createField("scene_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dev_tt.spot.layer</code>.
     */
    public final TableField<SpotRecord, Integer> LAYER = createField("layer", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dev_tt.spot.polygon</code>.
     */
    public final TableField<SpotRecord, String> POLYGON = createField("polygon", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>dev_tt.spot.polygon_opt</code>.
     */
    public final TableField<SpotRecord, String> POLYGON_OPT = createField("polygon_opt", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>dev_tt.spot.last_mod</code>.
     */
    public final TableField<SpotRecord, Timestamp> LAST_MOD = createField("last_mod", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>dev_tt.spot.mod_by</code>.
     */
    public final TableField<SpotRecord, Integer> MOD_BY = createField("mod_by", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>dev_tt.spot</code> table reference
     */
    public Spot() {
        this(DSL.name("spot"), null);
    }

    /**
     * Create an aliased <code>dev_tt.spot</code> table reference
     */
    public Spot(String alias) {
        this(DSL.name(alias), SPOT);
    }

    /**
     * Create an aliased <code>dev_tt.spot</code> table reference
     */
    public Spot(Name alias) {
        this(alias, SPOT);
    }

    private Spot(Name alias, Table<SpotRecord> aliased) {
        this(alias, aliased, null);
    }

    private Spot(Name alias, Table<SpotRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.SPOT_SCENE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SpotRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SPOT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SpotRecord>> getKeys() {
        return Arrays.<UniqueKey<SpotRecord>>asList(Keys.KEY_SPOT_SCENE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Spot as(String alias) {
        return new Spot(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Spot as(Name alias) {
        return new Spot(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Spot rename(String name) {
        return new Spot(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Spot rename(Name name) {
        return new Spot(name, null);
    }
}
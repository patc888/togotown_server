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
import org.jooq.dev_tt.tables.records.TokenRecord;
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
public class Token extends TableImpl<TokenRecord> {

    private static final long serialVersionUID = -954708064;

    /**
     * The reference instance of <code>dev_tt.token</code>
     */
    public static final Token TOKEN = new Token();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TokenRecord> getRecordType() {
        return TokenRecord.class;
    }

    /**
     * The column <code>dev_tt.token.id</code>.
     */
    public final TableField<TokenRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>dev_tt.token.lang_id</code>.
     */
    public final TableField<TokenRecord, Integer> LANG_ID = createField("lang_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dev_tt.token.display</code>.
     */
    public final TableField<TokenRecord, String> DISPLAY = createField("display", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>dev_tt.token.last_mod</code>.
     */
    public final TableField<TokenRecord, Timestamp> LAST_MOD = createField("last_mod", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>dev_tt.token</code> table reference
     */
    public Token() {
        this(DSL.name("token"), null);
    }

    /**
     * Create an aliased <code>dev_tt.token</code> table reference
     */
    public Token(String alias) {
        this(DSL.name(alias), TOKEN);
    }

    /**
     * Create an aliased <code>dev_tt.token</code> table reference
     */
    public Token(Name alias) {
        this(alias, TOKEN);
    }

    private Token(Name alias, Table<TokenRecord> aliased) {
        this(alias, aliased, null);
    }

    private Token(Name alias, Table<TokenRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.TOKEN_LANG_ID, Indexes.TOKEN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TokenRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TokenRecord> getPrimaryKey() {
        return Keys.KEY_TOKEN_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TokenRecord>> getKeys() {
        return Arrays.<UniqueKey<TokenRecord>>asList(Keys.KEY_TOKEN_PRIMARY, Keys.KEY_TOKEN_LANG_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Token as(String alias) {
        return new Token(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Token as(Name alias) {
        return new Token(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Token rename(String name) {
        return new Token(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Token rename(Name name) {
        return new Token(name, null);
    }
}

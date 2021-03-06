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
import org.jooq.dev_tt.tables.records.UserTokenRecord;
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
public class UserToken extends TableImpl<UserTokenRecord> {

    private static final long serialVersionUID = 2075269593;

    /**
     * The reference instance of <code>dev_tt.user_token</code>
     */
    public static final UserToken USER_TOKEN = new UserToken();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserTokenRecord> getRecordType() {
        return UserTokenRecord.class;
    }

    /**
     * The column <code>dev_tt.user_token.user_id</code>.
     */
    public final TableField<UserTokenRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dev_tt.user_token.lang_id</code>.
     */
    public final TableField<UserTokenRecord, Integer> LANG_ID = createField("lang_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dev_tt.user_token.token_id</code>.
     */
    public final TableField<UserTokenRecord, Integer> TOKEN_ID = createField("token_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dev_tt.user_token.scorea</code>.
     */
    public final TableField<UserTokenRecord, Byte> SCOREA = createField("scorea", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>dev_tt.user_token.scoreb</code>.
     */
    public final TableField<UserTokenRecord, Byte> SCOREB = createField("scoreb", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>dev_tt.user_token.scorec</code>.
     */
    public final TableField<UserTokenRecord, Byte> SCOREC = createField("scorec", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>dev_tt.user_token.last_mod</code>.
     */
    public final TableField<UserTokenRecord, Timestamp> LAST_MOD = createField("last_mod", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>dev_tt.user_token</code> table reference
     */
    public UserToken() {
        this(DSL.name("user_token"), null);
    }

    /**
     * Create an aliased <code>dev_tt.user_token</code> table reference
     */
    public UserToken(String alias) {
        this(DSL.name(alias), USER_TOKEN);
    }

    /**
     * Create an aliased <code>dev_tt.user_token</code> table reference
     */
    public UserToken(Name alias) {
        this(alias, USER_TOKEN);
    }

    private UserToken(Name alias, Table<UserTokenRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserToken(Name alias, Table<UserTokenRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.USER_TOKEN_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserTokenRecord>> getKeys() {
        return Arrays.<UniqueKey<UserTokenRecord>>asList(Keys.KEY_USER_TOKEN_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserToken as(String alias) {
        return new UserToken(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserToken as(Name alias) {
        return new UserToken(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserToken rename(String name) {
        return new UserToken(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserToken rename(Name name) {
        return new UserToken(name, null);
    }
}

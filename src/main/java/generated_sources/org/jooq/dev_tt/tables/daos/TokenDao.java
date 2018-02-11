/*
 * This file is generated by jOOQ.
*/
package org.jooq.dev_tt.tables.daos;


import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.dev_tt.tables.Token;
import org.jooq.dev_tt.tables.records.TokenRecord;
import org.jooq.impl.DAOImpl;


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
public class TokenDao extends DAOImpl<TokenRecord, org.jooq.dev_tt.tables.pojos.Token, Integer> {

    /**
     * Create a new TokenDao without any configuration
     */
    public TokenDao() {
        super(Token.TOKEN, org.jooq.dev_tt.tables.pojos.Token.class);
    }

    /**
     * Create a new TokenDao with an attached configuration
     */
    public TokenDao(Configuration configuration) {
        super(Token.TOKEN, org.jooq.dev_tt.tables.pojos.Token.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(org.jooq.dev_tt.tables.pojos.Token object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.Token> fetchById(Integer... values) {
        return fetch(Token.TOKEN.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public org.jooq.dev_tt.tables.pojos.Token fetchOneById(Integer value) {
        return fetchOne(Token.TOKEN.ID, value);
    }

    /**
     * Fetch records that have <code>lang_id IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.Token> fetchByLangId(Integer... values) {
        return fetch(Token.TOKEN.LANG_ID, values);
    }

    /**
     * Fetch records that have <code>display IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.Token> fetchByDisplay(String... values) {
        return fetch(Token.TOKEN.DISPLAY, values);
    }

    /**
     * Fetch records that have <code>last_mod IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.Token> fetchByLastMod(Timestamp... values) {
        return fetch(Token.TOKEN.LAST_MOD, values);
    }
}

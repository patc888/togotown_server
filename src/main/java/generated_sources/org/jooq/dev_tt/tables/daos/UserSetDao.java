/*
 * This file is generated by jOOQ.
*/
package org.jooq.dev_tt.tables.daos;


import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record3;
import org.jooq.dev_tt.tables.UserSet;
import org.jooq.dev_tt.tables.records.UserSetRecord;
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
public class UserSetDao extends DAOImpl<UserSetRecord, org.jooq.dev_tt.tables.pojos.UserSet, Record3<Integer, Integer, Integer>> {

    /**
     * Create a new UserSetDao without any configuration
     */
    public UserSetDao() {
        super(UserSet.USER_SET, org.jooq.dev_tt.tables.pojos.UserSet.class);
    }

    /**
     * Create a new UserSetDao with an attached configuration
     */
    public UserSetDao(Configuration configuration) {
        super(UserSet.USER_SET, org.jooq.dev_tt.tables.pojos.UserSet.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record3<Integer, Integer, Integer> getId(org.jooq.dev_tt.tables.pojos.UserSet object) {
        return compositeKeyRecord(object.getSetId(), object.getLangId(), object.getUserId());
    }

    /**
     * Fetch records that have <code>set_id IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.UserSet> fetchBySetId(Integer... values) {
        return fetch(UserSet.USER_SET.SET_ID, values);
    }

    /**
     * Fetch records that have <code>lang_id IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.UserSet> fetchByLangId(Integer... values) {
        return fetch(UserSet.USER_SET.LANG_ID, values);
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.UserSet> fetchByUserId(Integer... values) {
        return fetch(UserSet.USER_SET.USER_ID, values);
    }

    /**
     * Fetch records that have <code>count IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.UserSet> fetchByCount(Integer... values) {
        return fetch(UserSet.USER_SET.COUNT, values);
    }

    /**
     * Fetch records that have <code>last_mod IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.UserSet> fetchByLastMod(Timestamp... values) {
        return fetch(UserSet.USER_SET.LAST_MOD, values);
    }
}

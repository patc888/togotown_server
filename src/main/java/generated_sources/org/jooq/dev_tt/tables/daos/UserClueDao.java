/*
 * This file is generated by jOOQ.
*/
package org.jooq.dev_tt.tables.daos;


import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record3;
import org.jooq.dev_tt.tables.UserClue;
import org.jooq.dev_tt.tables.records.UserClueRecord;
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
public class UserClueDao extends DAOImpl<UserClueRecord, org.jooq.dev_tt.tables.pojos.UserClue, Record3<Integer, Integer, Integer>> {

    /**
     * Create a new UserClueDao without any configuration
     */
    public UserClueDao() {
        super(UserClue.USER_CLUE, org.jooq.dev_tt.tables.pojos.UserClue.class);
    }

    /**
     * Create a new UserClueDao with an attached configuration
     */
    public UserClueDao(Configuration configuration) {
        super(UserClue.USER_CLUE, org.jooq.dev_tt.tables.pojos.UserClue.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record3<Integer, Integer, Integer> getId(org.jooq.dev_tt.tables.pojos.UserClue object) {
        return compositeKeyRecord(object.getUserId(), object.getClueId(), object.getLangId());
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.UserClue> fetchByUserId(Integer... values) {
        return fetch(UserClue.USER_CLUE.USER_ID, values);
    }

    /**
     * Fetch records that have <code>lang_id IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.UserClue> fetchByLangId(Integer... values) {
        return fetch(UserClue.USER_CLUE.LANG_ID, values);
    }

    /**
     * Fetch records that have <code>clue_id IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.UserClue> fetchByClueId(Integer... values) {
        return fetch(UserClue.USER_CLUE.CLUE_ID, values);
    }

    /**
     * Fetch records that have <code>correct_count IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.UserClue> fetchByCorrectCount(Integer... values) {
        return fetch(UserClue.USER_CLUE.CORRECT_COUNT, values);
    }

    /**
     * Fetch records that have <code>wrong_count IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.UserClue> fetchByWrongCount(Integer... values) {
        return fetch(UserClue.USER_CLUE.WRONG_COUNT, values);
    }

    /**
     * Fetch records that have <code>created IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.UserClue> fetchByCreated(Timestamp... values) {
        return fetch(UserClue.USER_CLUE.CREATED, values);
    }
}

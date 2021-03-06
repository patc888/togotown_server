/*
 * This file is generated by jOOQ.
*/
package org.jooq.dev_tt.tables.daos;


import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.dev_tt.tables.UserLang;
import org.jooq.dev_tt.tables.records.UserLangRecord;
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
public class UserLangDao extends DAOImpl<UserLangRecord, org.jooq.dev_tt.tables.pojos.UserLang, Record2<Integer, Integer>> {

    /**
     * Create a new UserLangDao without any configuration
     */
    public UserLangDao() {
        super(UserLang.USER_LANG, org.jooq.dev_tt.tables.pojos.UserLang.class);
    }

    /**
     * Create a new UserLangDao with an attached configuration
     */
    public UserLangDao(Configuration configuration) {
        super(UserLang.USER_LANG, org.jooq.dev_tt.tables.pojos.UserLang.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<Integer, Integer> getId(org.jooq.dev_tt.tables.pojos.UserLang object) {
        return compositeKeyRecord(object.getUserId(), object.getLangId());
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.UserLang> fetchByUserId(Integer... values) {
        return fetch(UserLang.USER_LANG.USER_ID, values);
    }

    /**
     * Fetch records that have <code>lang_id IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.UserLang> fetchByLangId(Integer... values) {
        return fetch(UserLang.USER_LANG.LANG_ID, values);
    }

    /**
     * Fetch records that have <code>scene_id IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.UserLang> fetchBySceneId(Integer... values) {
        return fetch(UserLang.USER_LANG.SCENE_ID, values);
    }

    /**
     * Fetch records that have <code>score IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.UserLang> fetchByScore(Integer... values) {
        return fetch(UserLang.USER_LANG.SCORE, values);
    }

    /**
     * Fetch records that have <code>max_score IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.UserLang> fetchByMaxScore(Integer... values) {
        return fetch(UserLang.USER_LANG.MAX_SCORE, values);
    }

    /**
     * Fetch records that have <code>coins IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.UserLang> fetchByCoins(Integer... values) {
        return fetch(UserLang.USER_LANG.COINS, values);
    }

    /**
     * Fetch records that have <code>tkeys IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.UserLang> fetchByTkeys(Integer... values) {
        return fetch(UserLang.USER_LANG.TKEYS, values);
    }

    /**
     * Fetch records that have <code>sets_progress IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.UserLang> fetchBySetsProgress(Integer... values) {
        return fetch(UserLang.USER_LANG.SETS_PROGRESS, values);
    }

    /**
     * Fetch records that have <code>sets_count IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.UserLang> fetchBySetsCount(Integer... values) {
        return fetch(UserLang.USER_LANG.SETS_COUNT, values);
    }

    /**
     * Fetch records that have <code>seek_matches IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.UserLang> fetchBySeekMatches(Byte... values) {
        return fetch(UserLang.USER_LANG.SEEK_MATCHES, values);
    }

    /**
     * Fetch records that have <code>last_mod IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.UserLang> fetchByLastMod(Timestamp... values) {
        return fetch(UserLang.USER_LANG.LAST_MOD, values);
    }
}

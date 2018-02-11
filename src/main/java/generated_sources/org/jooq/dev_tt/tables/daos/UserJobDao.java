/*
 * This file is generated by jOOQ.
*/
package org.jooq.dev_tt.tables.daos;


import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record3;
import org.jooq.dev_tt.tables.UserJob;
import org.jooq.dev_tt.tables.records.UserJobRecord;
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
public class UserJobDao extends DAOImpl<UserJobRecord, org.jooq.dev_tt.tables.pojos.UserJob, Record3<Integer, Integer, Integer>> {

    /**
     * Create a new UserJobDao without any configuration
     */
    public UserJobDao() {
        super(UserJob.USER_JOB, org.jooq.dev_tt.tables.pojos.UserJob.class);
    }

    /**
     * Create a new UserJobDao with an attached configuration
     */
    public UserJobDao(Configuration configuration) {
        super(UserJob.USER_JOB, org.jooq.dev_tt.tables.pojos.UserJob.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record3<Integer, Integer, Integer> getId(org.jooq.dev_tt.tables.pojos.UserJob object) {
        return compositeKeyRecord(object.getUserId(), object.getLangId(), object.getJobId());
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.UserJob> fetchByUserId(Integer... values) {
        return fetch(UserJob.USER_JOB.USER_ID, values);
    }

    /**
     * Fetch records that have <code>lang_id IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.UserJob> fetchByLangId(Integer... values) {
        return fetch(UserJob.USER_JOB.LANG_ID, values);
    }

    /**
     * Fetch records that have <code>job_id IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.UserJob> fetchByJobId(Integer... values) {
        return fetch(UserJob.USER_JOB.JOB_ID, values);
    }

    /**
     * Fetch records that have <code>cur_count IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.UserJob> fetchByCurCount(Integer... values) {
        return fetch(UserJob.USER_JOB.CUR_COUNT, values);
    }

    /**
     * Fetch records that have <code>total_count IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.UserJob> fetchByTotalCount(Integer... values) {
        return fetch(UserJob.USER_JOB.TOTAL_COUNT, values);
    }

    /**
     * Fetch records that have <code>last_mod IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.UserJob> fetchByLastMod(Timestamp... values) {
        return fetch(UserJob.USER_JOB.LAST_MOD, values);
    }
}

/*
 * This file is generated by jOOQ.
*/
package org.jooq.dev_tt.tables.daos;


import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.dev_tt.tables.Job;
import org.jooq.dev_tt.tables.records.JobRecord;
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
public class JobDao extends DAOImpl<JobRecord, org.jooq.dev_tt.tables.pojos.Job, Integer> {

    /**
     * Create a new JobDao without any configuration
     */
    public JobDao() {
        super(Job.JOB, org.jooq.dev_tt.tables.pojos.Job.class);
    }

    /**
     * Create a new JobDao with an attached configuration
     */
    public JobDao(Configuration configuration) {
        super(Job.JOB, org.jooq.dev_tt.tables.pojos.Job.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(org.jooq.dev_tt.tables.pojos.Job object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.Job> fetchById(Integer... values) {
        return fetch(Job.JOB.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public org.jooq.dev_tt.tables.pojos.Job fetchOneById(Integer value) {
        return fetchOne(Job.JOB.ID, value);
    }

    /**
     * Fetch records that have <code>scene_id IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.Job> fetchBySceneId(Integer... values) {
        return fetch(Job.JOB.SCENE_ID, values);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.Job> fetchByType(Short... values) {
        return fetch(Job.JOB.TYPE, values);
    }

    /**
     * Fetch records that have <code>phrase_id IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.Job> fetchByPhraseId(Integer... values) {
        return fetch(Job.JOB.PHRASE_ID, values);
    }

    /**
     * Fetch records that have <code>ord IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.Job> fetchByOrd(Integer... values) {
        return fetch(Job.JOB.ORD, values);
    }

    /**
     * Fetch records that have <code>in_item_names IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.Job> fetchByInItemNames(String... values) {
        return fetch(Job.JOB.IN_ITEM_NAMES, values);
    }

    /**
     * Fetch records that have <code>in_item_ids IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.Job> fetchByInItemIds(String... values) {
        return fetch(Job.JOB.IN_ITEM_IDS, values);
    }

    /**
     * Fetch records that have <code>out_item_names IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.Job> fetchByOutItemNames(String... values) {
        return fetch(Job.JOB.OUT_ITEM_NAMES, values);
    }

    /**
     * Fetch records that have <code>out_item_ids IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.Job> fetchByOutItemIds(String... values) {
        return fetch(Job.JOB.OUT_ITEM_IDS, values);
    }

    /**
     * Fetch records that have <code>rarity IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.Job> fetchByRarity(Integer... values) {
        return fetch(Job.JOB.RARITY, values);
    }

    /**
     * Fetch records that have <code>cost IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.Job> fetchByCost(Integer... values) {
        return fetch(Job.JOB.COST, values);
    }

    /**
     * Fetch records that have <code>pay IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.Job> fetchByPay(Integer... values) {
        return fetch(Job.JOB.PAY, values);
    }

    /**
     * Fetch records that have <code>active IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.Job> fetchByActive(String... values) {
        return fetch(Job.JOB.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>last_mod IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.Job> fetchByLastMod(Timestamp... values) {
        return fetch(Job.JOB.LAST_MOD, values);
    }
}

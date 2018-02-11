/*
 * This file is generated by jOOQ.
*/
package org.jooq.dev_tt.tables.daos;


import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.dev_tt.tables.Scene;
import org.jooq.dev_tt.tables.records.SceneRecord;
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
public class SceneDao extends DAOImpl<SceneRecord, org.jooq.dev_tt.tables.pojos.Scene, Integer> {

    /**
     * Create a new SceneDao without any configuration
     */
    public SceneDao() {
        super(Scene.SCENE, org.jooq.dev_tt.tables.pojos.Scene.class);
    }

    /**
     * Create a new SceneDao with an attached configuration
     */
    public SceneDao(Configuration configuration) {
        super(Scene.SCENE, org.jooq.dev_tt.tables.pojos.Scene.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(org.jooq.dev_tt.tables.pojos.Scene object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.Scene> fetchById(Integer... values) {
        return fetch(Scene.SCENE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public org.jooq.dev_tt.tables.pojos.Scene fetchOneById(Integer value) {
        return fetchOne(Scene.SCENE.ID, value);
    }

    /**
     * Fetch records that have <code>town_id IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.Scene> fetchByTownId(Integer... values) {
        return fetch(Scene.SCENE.TOWN_ID, values);
    }

    /**
     * Fetch records that have <code>phrase_id IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.Scene> fetchByPhraseId(Integer... values) {
        return fetch(Scene.SCENE.PHRASE_ID, values);
    }

    /**
     * Fetch records that have <code>desc IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.Scene> fetchByDesc(String... values) {
        return fetch(Scene.SCENE.DESC, values);
    }

    /**
     * Fetch records that have <code>filename IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.Scene> fetchByFilename(String... values) {
        return fetch(Scene.SCENE.FILENAME, values);
    }

    /**
     * Fetch records that have <code>next_scene_id IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.Scene> fetchByNextSceneId(Integer... values) {
        return fetch(Scene.SCENE.NEXT_SCENE_ID, values);
    }

    /**
     * Fetch records that have <code>active IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.Scene> fetchByActive(String... values) {
        return fetch(Scene.SCENE.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>last_mod IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.Scene> fetchByLastMod(Timestamp... values) {
        return fetch(Scene.SCENE.LAST_MOD, values);
    }
}

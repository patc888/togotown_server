/*
 * This file is generated by jOOQ.
*/
package org.jooq.dev_tt.tables.daos;


import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.dev_tt.tables.MatchAlt;
import org.jooq.dev_tt.tables.records.MatchAltRecord;
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
public class MatchAltDao extends DAOImpl<MatchAltRecord, org.jooq.dev_tt.tables.pojos.MatchAlt, Record2<String, String>> {

    /**
     * Create a new MatchAltDao without any configuration
     */
    public MatchAltDao() {
        super(MatchAlt.MATCH_ALT, org.jooq.dev_tt.tables.pojos.MatchAlt.class);
    }

    /**
     * Create a new MatchAltDao with an attached configuration
     */
    public MatchAltDao(Configuration configuration) {
        super(MatchAlt.MATCH_ALT, org.jooq.dev_tt.tables.pojos.MatchAlt.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<String, String> getId(org.jooq.dev_tt.tables.pojos.MatchAlt object) {
        return compositeKeyRecord(object.getAltId(), object.getUnitId());
    }

    /**
     * Fetch records that have <code>unit_id IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.MatchAlt> fetchByUnitId(String... values) {
        return fetch(MatchAlt.MATCH_ALT.UNIT_ID, values);
    }

    /**
     * Fetch records that have <code>alt_id IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.MatchAlt> fetchByAltId(String... values) {
        return fetch(MatchAlt.MATCH_ALT.ALT_ID, values);
    }

    /**
     * Fetch records that have <code>chosen_count IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.MatchAlt> fetchByChosenCount(Integer... values) {
        return fetch(MatchAlt.MATCH_ALT.CHOSEN_COUNT, values);
    }

    /**
     * Fetch records that have <code>last_mod IN (values)</code>
     */
    public List<org.jooq.dev_tt.tables.pojos.MatchAlt> fetchByLastMod(Timestamp... values) {
        return fetch(MatchAlt.MATCH_ALT.LAST_MOD, values);
    }
}

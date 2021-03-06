/*
 * This file is generated by jOOQ.
*/
package org.jooq.dev_tt.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class UserJob implements Serializable {

    private static final long serialVersionUID = 2096021601;

    private Integer   userId;
    private Integer   langId;
    private Integer   jobId;
    private Integer   curCount;
    private Integer   totalCount;
    private Timestamp lastMod;

    public UserJob() {}

    public UserJob(UserJob value) {
        this.userId = value.userId;
        this.langId = value.langId;
        this.jobId = value.jobId;
        this.curCount = value.curCount;
        this.totalCount = value.totalCount;
        this.lastMod = value.lastMod;
    }

    public UserJob(
        Integer   userId,
        Integer   langId,
        Integer   jobId,
        Integer   curCount,
        Integer   totalCount,
        Timestamp lastMod
    ) {
        this.userId = userId;
        this.langId = langId;
        this.jobId = jobId;
        this.curCount = curCount;
        this.totalCount = totalCount;
        this.lastMod = lastMod;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getLangId() {
        return this.langId;
    }

    public void setLangId(Integer langId) {
        this.langId = langId;
    }

    public Integer getJobId() {
        return this.jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Integer getCurCount() {
        return this.curCount;
    }

    public void setCurCount(Integer curCount) {
        this.curCount = curCount;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Timestamp getLastMod() {
        return this.lastMod;
    }

    public void setLastMod(Timestamp lastMod) {
        this.lastMod = lastMod;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserJob (");

        sb.append(userId);
        sb.append(", ").append(langId);
        sb.append(", ").append(jobId);
        sb.append(", ").append(curCount);
        sb.append(", ").append(totalCount);
        sb.append(", ").append(lastMod);

        sb.append(")");
        return sb.toString();
    }
}

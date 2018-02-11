/*
 * This file is generated by jOOQ.
*/
package org.jooq.dev_tt.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.dev_tt.tables.User;
import org.jooq.impl.UpdatableRecordImpl;


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
public class UserRecord extends UpdatableRecordImpl<UserRecord> implements Record9<Integer, String, String, Integer, Integer, String, String, String, Timestamp> {

    private static final long serialVersionUID = -1274763515;

    /**
     * Setter for <code>dev_tt.user.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>dev_tt.user.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>dev_tt.user.nickname</code>.
     */
    public void setNickname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>dev_tt.user.nickname</code>.
     */
    public String getNickname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>dev_tt.user.session_id</code>.
     */
    public void setSessionId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>dev_tt.user.session_id</code>.
     */
    public String getSessionId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>dev_tt.user.cur_scene_id</code>. this should be moved to user_lang
     */
    public void setCurSceneId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>dev_tt.user.cur_scene_id</code>. this should be moved to user_lang
     */
    public Integer getCurSceneId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>dev_tt.user.cur_lang_id</code>.
     */
    public void setCurLangId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>dev_tt.user.cur_lang_id</code>.
     */
    public Integer getCurLangId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>dev_tt.user.robot</code>.
     */
    public void setRobot(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>dev_tt.user.robot</code>.
     */
    public String getRobot() {
        return (String) get(5);
    }

    /**
     * Setter for <code>dev_tt.user.mac_addr</code>.
     */
    public void setMacAddr(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>dev_tt.user.mac_addr</code>.
     */
    public String getMacAddr() {
        return (String) get(6);
    }

    /**
     * Setter for <code>dev_tt.user.device_token</code>.
     */
    public void setDeviceToken(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>dev_tt.user.device_token</code>.
     */
    public String getDeviceToken() {
        return (String) get(7);
    }

    /**
     * Setter for <code>dev_tt.user.last_login</code>.
     */
    public void setLastLogin(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>dev_tt.user.last_login</code>.
     */
    public Timestamp getLastLogin() {
        return (Timestamp) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, String, Integer, Integer, String, String, String, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, String, Integer, Integer, String, String, String, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return User.USER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return User.USER.NICKNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return User.USER.SESSION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return User.USER.CUR_SCENE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return User.USER.CUR_LANG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return User.USER.ROBOT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return User.USER.MAC_ADDR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return User.USER.DEVICE_TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return User.USER.LAST_LOGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getNickname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSessionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getCurSceneId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getCurLangId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getRobot();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getMacAddr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getDeviceToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getLastLogin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getNickname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSessionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getCurSceneId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getCurLangId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getRobot();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getMacAddr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDeviceToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getLastLogin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value2(String value) {
        setNickname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value3(String value) {
        setSessionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value4(Integer value) {
        setCurSceneId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value5(Integer value) {
        setCurLangId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value6(String value) {
        setRobot(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value7(String value) {
        setMacAddr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value8(String value) {
        setDeviceToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value9(Timestamp value) {
        setLastLogin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord values(Integer value1, String value2, String value3, Integer value4, Integer value5, String value6, String value7, String value8, Timestamp value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserRecord
     */
    public UserRecord() {
        super(User.USER);
    }

    /**
     * Create a detached, initialised UserRecord
     */
    public UserRecord(Integer id, String nickname, String sessionId, Integer curSceneId, Integer curLangId, String robot, String macAddr, String deviceToken, Timestamp lastLogin) {
        super(User.USER);

        set(0, id);
        set(1, nickname);
        set(2, sessionId);
        set(3, curSceneId);
        set(4, curLangId);
        set(5, robot);
        set(6, macAddr);
        set(7, deviceToken);
        set(8, lastLogin);
    }
}

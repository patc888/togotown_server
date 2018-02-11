/*
 * This file is generated by jOOQ.
*/
package org.jooq.dev_tt;


import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.dev_tt.tables.Clue;
import org.jooq.dev_tt.tables.ClueRank;
import org.jooq.dev_tt.tables.Item;
import org.jooq.dev_tt.tables.Job;
import org.jooq.dev_tt.tables.Lang;
import org.jooq.dev_tt.tables.LangScene;
import org.jooq.dev_tt.tables.Match;
import org.jooq.dev_tt.tables.MatchAlt;
import org.jooq.dev_tt.tables.MatchQuestion;
import org.jooq.dev_tt.tables.MatchUser;
import org.jooq.dev_tt.tables.Message;
import org.jooq.dev_tt.tables.Phrase;
import org.jooq.dev_tt.tables.PhraseInfo;
import org.jooq.dev_tt.tables.Scene;
import org.jooq.dev_tt.tables.Set;
import org.jooq.dev_tt.tables.SetPhrase;
import org.jooq.dev_tt.tables.Spot;
import org.jooq.dev_tt.tables.Token;
import org.jooq.dev_tt.tables.User;
import org.jooq.dev_tt.tables.UserClue;
import org.jooq.dev_tt.tables.UserHistory;
import org.jooq.dev_tt.tables.UserItem;
import org.jooq.dev_tt.tables.UserJob;
import org.jooq.dev_tt.tables.UserLang;
import org.jooq.dev_tt.tables.UserScene;
import org.jooq.dev_tt.tables.UserSet;
import org.jooq.dev_tt.tables.UserToken;
import org.jooq.dev_tt.tables.UserTown;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling indexes of tables of the <code>dev_tt</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index CLUE_PARENT_ID = Indexes0.CLUE_PARENT_ID;
    public static final Index CLUE_PHRASE_ID = Indexes0.CLUE_PHRASE_ID;
    public static final Index CLUE_PRIMARY = Indexes0.CLUE_PRIMARY;
    public static final Index CLUE_SCENE_ID = Indexes0.CLUE_SCENE_ID;
    public static final Index CLUE_RANK_CLUE_ID = Indexes0.CLUE_RANK_CLUE_ID;
    public static final Index ITEM_ACTIVE_IDX = Indexes0.ITEM_ACTIVE_IDX;
    public static final Index ITEM_PHRASE_IDX = Indexes0.ITEM_PHRASE_IDX;
    public static final Index ITEM_PRIMARY = Indexes0.ITEM_PRIMARY;
    public static final Index ITEM_SCENE_IDX = Indexes0.ITEM_SCENE_IDX;
    public static final Index ITEM_TYPE_IDX = Indexes0.ITEM_TYPE_IDX;
    public static final Index JOB_ACTIVE_IDX = Indexes0.JOB_ACTIVE_IDX;
    public static final Index JOB_PHRASE_IDX = Indexes0.JOB_PHRASE_IDX;
    public static final Index JOB_PRIMARY = Indexes0.JOB_PRIMARY;
    public static final Index JOB_SCENE_IDX = Indexes0.JOB_SCENE_IDX;
    public static final Index LANG_PRIMARY = Indexes0.LANG_PRIMARY;
    public static final Index LANG_SCENE_LANG_ID = Indexes0.LANG_SCENE_LANG_ID;
    public static final Index MATCH_LANG_IDX = Indexes0.MATCH_LANG_IDX;
    public static final Index MATCH_PRIMARY = Indexes0.MATCH_PRIMARY;
    public static final Index MATCH_STATE_IDX = Indexes0.MATCH_STATE_IDX;
    public static final Index MATCH_ALT_PRIMARY = Indexes0.MATCH_ALT_PRIMARY;
    public static final Index MATCH_QUESTION_MATCH_CLUE_IDX = Indexes0.MATCH_QUESTION_MATCH_CLUE_IDX;
    public static final Index MATCH_QUESTION_MATCH_IDX = Indexes0.MATCH_QUESTION_MATCH_IDX;
    public static final Index MATCH_USER_CREATED_IDX = Indexes0.MATCH_USER_CREATED_IDX;
    public static final Index MATCH_USER_MATCH_IDX = Indexes0.MATCH_USER_MATCH_IDX;
    public static final Index MATCH_USER_OPP_IDX = Indexes0.MATCH_USER_OPP_IDX;
    public static final Index MATCH_USER_PRIMARY = Indexes0.MATCH_USER_PRIMARY;
    public static final Index MATCH_USER_STATE = Indexes0.MATCH_USER_STATE;
    public static final Index MATCH_USER_USER_IDX = Indexes0.MATCH_USER_USER_IDX;
    public static final Index MESSAGE_PRIMARY = Indexes0.MESSAGE_PRIMARY;
    public static final Index MESSAGE_USER_IDX = Indexes0.MESSAGE_USER_IDX;
    public static final Index PHRASE_ACTIVE_IDX = Indexes0.PHRASE_ACTIVE_IDX;
    public static final Index PHRASE_EN_IDX = Indexes0.PHRASE_EN_IDX;
    public static final Index PHRASE_LANG_IDX = Indexes0.PHRASE_LANG_IDX;
    public static final Index PHRASE_PRIMARY = Indexes0.PHRASE_PRIMARY;
    public static final Index PHRASE_INFO_PHRASE_IDX = Indexes0.PHRASE_INFO_PHRASE_IDX;
    public static final Index SCENE_ACTIVE_IDX = Indexes0.SCENE_ACTIVE_IDX;
    public static final Index SCENE_PRIMARY = Indexes0.SCENE_PRIMARY;
    public static final Index SCENE_TOWN_IDX = Indexes0.SCENE_TOWN_IDX;
    public static final Index SET_ACTIVE_IDX = Indexes0.SET_ACTIVE_IDX;
    public static final Index SET_PHRASE_IDX = Indexes0.SET_PHRASE_IDX;
    public static final Index SET_PRIMARY = Indexes0.SET_PRIMARY;
    public static final Index SET_TOWN_IDX = Indexes0.SET_TOWN_IDX;
    public static final Index SET_PHRASE_PHRASE_IDX = Indexes0.SET_PHRASE_PHRASE_IDX;
    public static final Index SET_PHRASE_PRIMARY = Indexes0.SET_PHRASE_PRIMARY;
    public static final Index SET_PHRASE_SET_IDX = Indexes0.SET_PHRASE_SET_IDX;
    public static final Index SPOT_SCENE_ID = Indexes0.SPOT_SCENE_ID;
    public static final Index TOKEN_LANG_ID = Indexes0.TOKEN_LANG_ID;
    public static final Index TOKEN_PRIMARY = Indexes0.TOKEN_PRIMARY;
    public static final Index USER_PRIMARY = Indexes0.USER_PRIMARY;
    public static final Index USER_ROBOT_IDX = Indexes0.USER_ROBOT_IDX;
    public static final Index USER_SESSION_IDX = Indexes0.USER_SESSION_IDX;
    public static final Index USER_CLUE_PRIMARY = Indexes0.USER_CLUE_PRIMARY;
    public static final Index USER_HISTORY_USER_LANG_IDX = Indexes0.USER_HISTORY_USER_LANG_IDX;
    public static final Index USER_ITEM_CUR_COUNT_IDX = Indexes0.USER_ITEM_CUR_COUNT_IDX;
    public static final Index USER_ITEM_PRIMARY = Indexes0.USER_ITEM_PRIMARY;
    public static final Index USER_ITEM_USER_LANG_IDX = Indexes0.USER_ITEM_USER_LANG_IDX;
    public static final Index USER_JOB_PRIMARY = Indexes0.USER_JOB_PRIMARY;
    public static final Index USER_JOB_USER_LANG_IDX = Indexes0.USER_JOB_USER_LANG_IDX;
    public static final Index USER_LANG_DUEL = Indexes0.USER_LANG_DUEL;
    public static final Index USER_LANG_PRIMARY = Indexes0.USER_LANG_PRIMARY;
    public static final Index USER_SCENE_USER_ID = Indexes0.USER_SCENE_USER_ID;
    public static final Index USER_SET_PRIMARY = Indexes0.USER_SET_PRIMARY;
    public static final Index USER_TOKEN_USER_ID = Indexes0.USER_TOKEN_USER_ID;
    public static final Index USER_TOWN_PRIMARY = Indexes0.USER_TOWN_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 extends AbstractKeys {
        public static Index CLUE_PARENT_ID = createIndex("parent_id", Clue.CLUE, new OrderField[] { Clue.CLUE.PARENT_ID }, false);
        public static Index CLUE_PHRASE_ID = createIndex("phrase_id", Clue.CLUE, new OrderField[] { Clue.CLUE.PHRASE_ID }, false);
        public static Index CLUE_PRIMARY = createIndex("PRIMARY", Clue.CLUE, new OrderField[] { Clue.CLUE.ID }, true);
        public static Index CLUE_SCENE_ID = createIndex("scene_id", Clue.CLUE, new OrderField[] { Clue.CLUE.SCENE_ID }, false);
        public static Index CLUE_RANK_CLUE_ID = createIndex("clue_id", ClueRank.CLUE_RANK, new OrderField[] { ClueRank.CLUE_RANK.CLUE_ID, ClueRank.CLUE_RANK.LANG_ID, ClueRank.CLUE_RANK.SCENE_ID }, true);
        public static Index ITEM_ACTIVE_IDX = createIndex("active_idx", Item.ITEM, new OrderField[] { Item.ITEM.ACTIVE }, false);
        public static Index ITEM_PHRASE_IDX = createIndex("phrase_idx", Item.ITEM, new OrderField[] { Item.ITEM.PHRASE_ID }, false);
        public static Index ITEM_PRIMARY = createIndex("PRIMARY", Item.ITEM, new OrderField[] { Item.ITEM.ID }, true);
        public static Index ITEM_SCENE_IDX = createIndex("scene_idx", Item.ITEM, new OrderField[] { Item.ITEM.SCENE_ID }, false);
        public static Index ITEM_TYPE_IDX = createIndex("type_idx", Item.ITEM, new OrderField[] { Item.ITEM.TYPE }, false);
        public static Index JOB_ACTIVE_IDX = createIndex("active_idx", Job.JOB, new OrderField[] { Job.JOB.ACTIVE }, false);
        public static Index JOB_PHRASE_IDX = createIndex("phrase_idx", Job.JOB, new OrderField[] { Job.JOB.PHRASE_ID }, false);
        public static Index JOB_PRIMARY = createIndex("PRIMARY", Job.JOB, new OrderField[] { Job.JOB.ID }, true);
        public static Index JOB_SCENE_IDX = createIndex("scene_idx", Job.JOB, new OrderField[] { Job.JOB.SCENE_ID }, false);
        public static Index LANG_PRIMARY = createIndex("PRIMARY", Lang.LANG, new OrderField[] { Lang.LANG.ID }, true);
        public static Index LANG_SCENE_LANG_ID = createIndex("lang_id", LangScene.LANG_SCENE, new OrderField[] { LangScene.LANG_SCENE.LANG_ID, LangScene.LANG_SCENE.SCENE_ID }, true);
        public static Index MATCH_LANG_IDX = createIndex("lang_idx", Match.MATCH, new OrderField[] { Match.MATCH.LANG_ID }, false);
        public static Index MATCH_PRIMARY = createIndex("PRIMARY", Match.MATCH, new OrderField[] { Match.MATCH.ID }, true);
        public static Index MATCH_STATE_IDX = createIndex("state_idx", Match.MATCH, new OrderField[] { Match.MATCH.STATE }, false);
        public static Index MATCH_ALT_PRIMARY = createIndex("PRIMARY", MatchAlt.MATCH_ALT, new OrderField[] { MatchAlt.MATCH_ALT.ALT_ID, MatchAlt.MATCH_ALT.UNIT_ID }, true);
        public static Index MATCH_QUESTION_MATCH_CLUE_IDX = createIndex("match_clue_idx", MatchQuestion.MATCH_QUESTION, new OrderField[] { MatchQuestion.MATCH_QUESTION.UNIT_ID, MatchQuestion.MATCH_QUESTION.MATCH_ID }, true);
        public static Index MATCH_QUESTION_MATCH_IDX = createIndex("match_idx", MatchQuestion.MATCH_QUESTION, new OrderField[] { MatchQuestion.MATCH_QUESTION.MATCH_ID }, false);
        public static Index MATCH_USER_CREATED_IDX = createIndex("created_idx", MatchUser.MATCH_USER, new OrderField[] { MatchUser.MATCH_USER.CREATED }, false);
        public static Index MATCH_USER_MATCH_IDX = createIndex("match_idx", MatchUser.MATCH_USER, new OrderField[] { MatchUser.MATCH_USER.MATCH_ID }, false);
        public static Index MATCH_USER_OPP_IDX = createIndex("opp_idx", MatchUser.MATCH_USER, new OrderField[] { MatchUser.MATCH_USER.OPP_ID }, false);
        public static Index MATCH_USER_PRIMARY = createIndex("PRIMARY", MatchUser.MATCH_USER, new OrderField[] { MatchUser.MATCH_USER.MATCH_ID, MatchUser.MATCH_USER.USER_ID }, true);
        public static Index MATCH_USER_STATE = createIndex("state", MatchUser.MATCH_USER, new OrderField[] { MatchUser.MATCH_USER.STATE }, false);
        public static Index MATCH_USER_USER_IDX = createIndex("user_idx", MatchUser.MATCH_USER, new OrderField[] { MatchUser.MATCH_USER.USER_ID }, false);
        public static Index MESSAGE_PRIMARY = createIndex("PRIMARY", Message.MESSAGE, new OrderField[] { Message.MESSAGE.ID }, true);
        public static Index MESSAGE_USER_IDX = createIndex("user_idx", Message.MESSAGE, new OrderField[] { Message.MESSAGE.USER_ID }, false);
        public static Index PHRASE_ACTIVE_IDX = createIndex("active_idx", Phrase.PHRASE, new OrderField[] { Phrase.PHRASE.ACTIVE }, false);
        public static Index PHRASE_EN_IDX = createIndex("en_idx", Phrase.PHRASE, new OrderField[] { Phrase.PHRASE.EN_ID }, false);
        public static Index PHRASE_LANG_IDX = createIndex("lang_idx", Phrase.PHRASE, new OrderField[] { Phrase.PHRASE.LANG_ID }, false);
        public static Index PHRASE_PRIMARY = createIndex("PRIMARY", Phrase.PHRASE, new OrderField[] { Phrase.PHRASE.ID }, true);
        public static Index PHRASE_INFO_PHRASE_IDX = createIndex("phrase_idx", PhraseInfo.PHRASE_INFO, new OrderField[] { PhraseInfo.PHRASE_INFO.PHRASE_ID }, false);
        public static Index SCENE_ACTIVE_IDX = createIndex("active_idx", Scene.SCENE, new OrderField[] { Scene.SCENE.ACTIVE }, false);
        public static Index SCENE_PRIMARY = createIndex("PRIMARY", Scene.SCENE, new OrderField[] { Scene.SCENE.ID }, true);
        public static Index SCENE_TOWN_IDX = createIndex("town_idx", Scene.SCENE, new OrderField[] { Scene.SCENE.TOWN_ID }, false);
        public static Index SET_ACTIVE_IDX = createIndex("active_idx", Set.SET, new OrderField[] { Set.SET.ACTIVE }, false);
        public static Index SET_PHRASE_IDX = createIndex("phrase_idx", Set.SET, new OrderField[] { Set.SET.PHRASE_ID }, false);
        public static Index SET_PRIMARY = createIndex("PRIMARY", Set.SET, new OrderField[] { Set.SET.ID }, true);
        public static Index SET_TOWN_IDX = createIndex("town_idx", Set.SET, new OrderField[] { Set.SET.TOWN_ID }, false);
        public static Index SET_PHRASE_PHRASE_IDX = createIndex("phrase_idx", SetPhrase.SET_PHRASE, new OrderField[] { SetPhrase.SET_PHRASE.PHRASE_ID }, false);
        public static Index SET_PHRASE_PRIMARY = createIndex("PRIMARY", SetPhrase.SET_PHRASE, new OrderField[] { SetPhrase.SET_PHRASE.SET_ID, SetPhrase.SET_PHRASE.PHRASE_ID }, true);
        public static Index SET_PHRASE_SET_IDX = createIndex("set_idx", SetPhrase.SET_PHRASE, new OrderField[] { SetPhrase.SET_PHRASE.SET_ID }, false);
        public static Index SPOT_SCENE_ID = createIndex("scene_id", Spot.SPOT, new OrderField[] { Spot.SPOT.ID, Spot.SPOT.SCENE_ID }, true);
        public static Index TOKEN_LANG_ID = createIndex("lang_id", Token.TOKEN, new OrderField[] { Token.TOKEN.LANG_ID, Token.TOKEN.DISPLAY }, true);
        public static Index TOKEN_PRIMARY = createIndex("PRIMARY", Token.TOKEN, new OrderField[] { Token.TOKEN.ID }, true);
        public static Index USER_PRIMARY = createIndex("PRIMARY", User.USER, new OrderField[] { User.USER.ID }, true);
        public static Index USER_ROBOT_IDX = createIndex("robot_idx", User.USER, new OrderField[] { User.USER.ROBOT }, false);
        public static Index USER_SESSION_IDX = createIndex("session_idx", User.USER, new OrderField[] { User.USER.SESSION_ID }, false);
        public static Index USER_CLUE_PRIMARY = createIndex("PRIMARY", UserClue.USER_CLUE, new OrderField[] { UserClue.USER_CLUE.USER_ID, UserClue.USER_CLUE.CLUE_ID, UserClue.USER_CLUE.LANG_ID }, true);
        public static Index USER_HISTORY_USER_LANG_IDX = createIndex("user_lang_idx", UserHistory.USER_HISTORY, new OrderField[] { UserHistory.USER_HISTORY.LANG_ID, UserHistory.USER_HISTORY.USER_ID }, false);
        public static Index USER_ITEM_CUR_COUNT_IDX = createIndex("cur_count_idx", UserItem.USER_ITEM, new OrderField[] { UserItem.USER_ITEM.CUR_COUNT }, false);
        public static Index USER_ITEM_PRIMARY = createIndex("PRIMARY", UserItem.USER_ITEM, new OrderField[] { UserItem.USER_ITEM.USER_ID, UserItem.USER_ITEM.LANG_ID, UserItem.USER_ITEM.PHRASE_ID }, true);
        public static Index USER_ITEM_USER_LANG_IDX = createIndex("user_lang_idx", UserItem.USER_ITEM, new OrderField[] { UserItem.USER_ITEM.USER_ID, UserItem.USER_ITEM.LANG_ID }, false);
        public static Index USER_JOB_PRIMARY = createIndex("PRIMARY", UserJob.USER_JOB, new OrderField[] { UserJob.USER_JOB.USER_ID, UserJob.USER_JOB.LANG_ID, UserJob.USER_JOB.JOB_ID }, true);
        public static Index USER_JOB_USER_LANG_IDX = createIndex("user_lang_idx", UserJob.USER_JOB, new OrderField[] { UserJob.USER_JOB.USER_ID, UserJob.USER_JOB.LANG_ID }, false);
        public static Index USER_LANG_DUEL = createIndex("duel", UserLang.USER_LANG, new OrderField[] { UserLang.USER_LANG.SEEK_MATCHES }, false);
        public static Index USER_LANG_PRIMARY = createIndex("PRIMARY", UserLang.USER_LANG, new OrderField[] { UserLang.USER_LANG.USER_ID, UserLang.USER_LANG.LANG_ID }, true);
        public static Index USER_SCENE_USER_ID = createIndex("user_id", UserScene.USER_SCENE, new OrderField[] { UserScene.USER_SCENE.USER_ID, UserScene.USER_SCENE.LANG_ID, UserScene.USER_SCENE.SCENE_ID }, true);
        public static Index USER_SET_PRIMARY = createIndex("PRIMARY", UserSet.USER_SET, new OrderField[] { UserSet.USER_SET.SET_ID, UserSet.USER_SET.LANG_ID, UserSet.USER_SET.USER_ID }, true);
        public static Index USER_TOKEN_USER_ID = createIndex("user_id", UserToken.USER_TOKEN, new OrderField[] { UserToken.USER_TOKEN.USER_ID, UserToken.USER_TOKEN.LANG_ID, UserToken.USER_TOKEN.TOKEN_ID }, true);
        public static Index USER_TOWN_PRIMARY = createIndex("PRIMARY", UserTown.USER_TOWN, new OrderField[] { UserTown.USER_TOWN.USER_ID, UserTown.USER_TOWN.TOWN_ID }, true);
    }
}

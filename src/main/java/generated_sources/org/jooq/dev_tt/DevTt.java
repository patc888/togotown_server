/*
 * This file is generated by jOOQ.
*/
package org.jooq.dev_tt;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.DefaultCatalog;
import org.jooq.Table;
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
import org.jooq.impl.SchemaImpl;


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
public class DevTt extends SchemaImpl {

    private static final long serialVersionUID = 1306711689;

    /**
     * The reference instance of <code>dev_tt</code>
     */
    public static final DevTt DEV_TT = new DevTt();

    /**
     * The table <code>dev_tt.clue</code>.
     */
    public final Clue CLUE = org.jooq.dev_tt.tables.Clue.CLUE;

    /**
     * The table <code>dev_tt.clue_rank</code>.
     */
    public final ClueRank CLUE_RANK = org.jooq.dev_tt.tables.ClueRank.CLUE_RANK;

    /**
     * The table <code>dev_tt.item</code>.
     */
    public final Item ITEM = org.jooq.dev_tt.tables.Item.ITEM;

    /**
     * The table <code>dev_tt.job</code>.
     */
    public final Job JOB = org.jooq.dev_tt.tables.Job.JOB;

    /**
     * The table <code>dev_tt.lang</code>.
     */
    public final Lang LANG = org.jooq.dev_tt.tables.Lang.LANG;

    /**
     * The table <code>dev_tt.lang_scene</code>.
     */
    public final LangScene LANG_SCENE = org.jooq.dev_tt.tables.LangScene.LANG_SCENE;

    /**
     * The table <code>dev_tt.match</code>.
     */
    public final Match MATCH = org.jooq.dev_tt.tables.Match.MATCH;

    /**
     * The table <code>dev_tt.match_alt</code>.
     */
    public final MatchAlt MATCH_ALT = org.jooq.dev_tt.tables.MatchAlt.MATCH_ALT;

    /**
     * The table <code>dev_tt.match_question</code>.
     */
    public final MatchQuestion MATCH_QUESTION = org.jooq.dev_tt.tables.MatchQuestion.MATCH_QUESTION;

    /**
     * The table <code>dev_tt.match_user</code>.
     */
    public final MatchUser MATCH_USER = org.jooq.dev_tt.tables.MatchUser.MATCH_USER;

    /**
     * The table <code>dev_tt.message</code>.
     */
    public final Message MESSAGE = org.jooq.dev_tt.tables.Message.MESSAGE;

    /**
     * The table <code>dev_tt.phrase</code>.
     */
    public final Phrase PHRASE = org.jooq.dev_tt.tables.Phrase.PHRASE;

    /**
     * The table <code>dev_tt.phrase_info</code>.
     */
    public final PhraseInfo PHRASE_INFO = org.jooq.dev_tt.tables.PhraseInfo.PHRASE_INFO;

    /**
     * The table <code>dev_tt.scene</code>.
     */
    public final Scene SCENE = org.jooq.dev_tt.tables.Scene.SCENE;

    /**
     * The table <code>dev_tt.set</code>.
     */
    public final Set SET = org.jooq.dev_tt.tables.Set.SET;

    /**
     * The table <code>dev_tt.set_phrase</code>.
     */
    public final SetPhrase SET_PHRASE = org.jooq.dev_tt.tables.SetPhrase.SET_PHRASE;

    /**
     * The table <code>dev_tt.spot</code>.
     */
    public final Spot SPOT = org.jooq.dev_tt.tables.Spot.SPOT;

    /**
     * The table <code>dev_tt.token</code>.
     */
    public final Token TOKEN = org.jooq.dev_tt.tables.Token.TOKEN;

    /**
     * The table <code>dev_tt.user</code>.
     */
    public final User USER = org.jooq.dev_tt.tables.User.USER;

    /**
     * The table <code>dev_tt.user_clue</code>.
     */
    public final UserClue USER_CLUE = org.jooq.dev_tt.tables.UserClue.USER_CLUE;

    /**
     * The table <code>dev_tt.user_history</code>.
     */
    public final UserHistory USER_HISTORY = org.jooq.dev_tt.tables.UserHistory.USER_HISTORY;

    /**
     * The table <code>dev_tt.user_item</code>.
     */
    public final UserItem USER_ITEM = org.jooq.dev_tt.tables.UserItem.USER_ITEM;

    /**
     * The table <code>dev_tt.user_job</code>.
     */
    public final UserJob USER_JOB = org.jooq.dev_tt.tables.UserJob.USER_JOB;

    /**
     * The table <code>dev_tt.user_lang</code>.
     */
    public final UserLang USER_LANG = org.jooq.dev_tt.tables.UserLang.USER_LANG;

    /**
     * The table <code>dev_tt.user_scene</code>.
     */
    public final UserScene USER_SCENE = org.jooq.dev_tt.tables.UserScene.USER_SCENE;

    /**
     * The table <code>dev_tt.user_set</code>.
     */
    public final UserSet USER_SET = org.jooq.dev_tt.tables.UserSet.USER_SET;

    /**
     * The table <code>dev_tt.user_token</code>.
     */
    public final UserToken USER_TOKEN = org.jooq.dev_tt.tables.UserToken.USER_TOKEN;

    /**
     * The table <code>dev_tt.user_town</code>.
     */
    public final UserTown USER_TOWN = org.jooq.dev_tt.tables.UserTown.USER_TOWN;

    /**
     * No further instances allowed
     */
    private DevTt() {
        super("dev_tt", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Clue.CLUE,
            ClueRank.CLUE_RANK,
            Item.ITEM,
            Job.JOB,
            Lang.LANG,
            LangScene.LANG_SCENE,
            Match.MATCH,
            MatchAlt.MATCH_ALT,
            MatchQuestion.MATCH_QUESTION,
            MatchUser.MATCH_USER,
            Message.MESSAGE,
            Phrase.PHRASE,
            PhraseInfo.PHRASE_INFO,
            Scene.SCENE,
            Set.SET,
            SetPhrase.SET_PHRASE,
            Spot.SPOT,
            Token.TOKEN,
            User.USER,
            UserClue.USER_CLUE,
            UserHistory.USER_HISTORY,
            UserItem.USER_ITEM,
            UserJob.USER_JOB,
            UserLang.USER_LANG,
            UserScene.USER_SCENE,
            UserSet.USER_SET,
            UserToken.USER_TOKEN,
            UserTown.USER_TOWN);
    }
}

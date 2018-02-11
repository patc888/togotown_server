package com.togotown.services;

import com.togotown.Clue;
import com.togotown.TogoTownException;
import com.typesafe.config.Config;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import org.jooq.dev_tt.tables.daos.ClueDao;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.DefaultConfiguration;

import static org.jooq.dev_tt.Tables.CLUE;
import static org.jooq.SQLDialect.MYSQL;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StorageImpl implements Storage {

    private HikariDataSource dataSource;

    public StorageImpl(Config conf) {
        HikariConfig hikariConf = new HikariConfig();
        hikariConf.setPoolName(conf.getString("connection_pools.poolName"));
        hikariConf.setMaximumPoolSize(conf.getInt("connection_pools.maximumPoolSize"));
        hikariConf.setMinimumIdle(conf.getInt("connection_pools.minimumIdle"));
        hikariConf.setJdbcUrl(conf.getString("connection_pools.jdbcUrl"));
        hikariConf.setUsername(conf.getString("connection_pools.username"));
        hikariConf.setPassword(conf.getString("connection_pools.password"));
        hikariConf.addDataSourceProperty("cachePrepStmts", conf.getBoolean("connection_pools.cachePrepStmts"));
        hikariConf.addDataSourceProperty("prepStmtCacheSize", conf.getInt("connection_pools.prepStmtCacheSize"));
        hikariConf.addDataSourceProperty("prepStmtCacheSqlLimit", conf.getInt("connection_pools.prepStmtCacheSqlLimit"));
        hikariConf.addDataSourceProperty("useServerPrepStmts", conf.getBoolean("connection_pools.useServerPrepStmts"));
        dataSource = new HikariDataSource(hikariConf);
    }

    @Override
    public List<Clue> getClues(int sceneId) {
        try (Connection conn = dataSource.getConnection()) {
            DSLContext db = DSL.using(conn, SQLDialect.MYSQL);
            List<Clue> clues = db.select().from(CLUE).where(CLUE.SCENE_ID.eq(sceneId)).fetchInto(Clue.class);
            return clues;
        } catch (SQLException e) {
            throw TogoTownException.unavailable(e);
        }
    }

    @Override
    public Clue getClue(int clueId) {
        return null;
    }
}

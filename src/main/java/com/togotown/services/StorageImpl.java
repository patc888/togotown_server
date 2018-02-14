package com.togotown.services;

import com.togotown.Clue;
import com.togotown.TogoTownException;
import com.typesafe.config.Config;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.cxf.jaxrs.ext.Nullable;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import javax.validation.constraints.NotNull;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import static org.jooq.dev_tt.Tables.CLUE;

public class StorageImpl implements Storage {

    private HikariDataSource dataSource;

    public StorageImpl(@NotNull Config conf) {
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
    @NotNull
    public List<Clue> getClues(int sceneId) {
        try (Connection conn = dataSource.getConnection()) {
            DSLContext db = DSL.using(conn, SQLDialect.MYSQL);
            return db.select().from(CLUE).where(CLUE.SCENE_ID.eq(sceneId)).fetch().into(Clue.class);
        } catch (SQLException e) {
            throw TogoTownException.unavailable(e);
        }
    }

    @Override
    @Nullable
    public Clue getClue(int clueId) {
        try (Connection conn = dataSource.getConnection()) {
            DSLContext db = DSL.using(conn, SQLDialect.MYSQL);
            return db.select().from(CLUE).where(CLUE.ID.eq(clueId)).fetchAny().into(Clue.class);
        } catch (SQLException e) {
            throw TogoTownException.unavailable(e);
        }
    }
}

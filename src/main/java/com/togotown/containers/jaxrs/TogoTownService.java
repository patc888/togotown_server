package com.togotown.containers.jaxrs;

import com.togotown.TogoTown;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import org.apache.cxf.jaxrs.ext.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.io.InputStream;
import java.util.IdentityHashMap;
import java.util.Map;

public class TogoTownService {
    private static Logger logger = LoggerFactory.getLogger(TogoTownService.class);
    private static Map<Object, TogoTown> togotowns = new IdentityHashMap<>();

    /**
     * Retrieves and returns a TogoTown instance using the key. If an instance does not exist, one is created using the
     * a config file as specified by an environment variable. The new instance will be associated with
     * the key. If the key is null, a new instance is always returned.
     *
     * The config files exist as resources named "conf/togotown_X.conf".
     * The specific config file that will be used is determined by the confName.
     * E.g. if the value of "togotown_config_name" is "dev",
     * the config file "conf/togotown_dev.conf" will be used.
     *
     * If confName is null, the environment variable called "togotown_config_name" will
     * used for the value of confName. If the environment variable does not exist, the
     * confName "dev" will be used.
     *
     * @param key      A key used to retrieve a TogoTown instance.
     * @param confName The name of the conf file.
     * @return A TogoTown instance.
     * @throws IOException
     */
    @NotNull
    public static TogoTown get(@Nullable Object key, @Nullable String confName) throws IOException {
        if (confName == null) {
            confName = System.getenv("togotown_config_name");
            if (confName == null) {
                logger.warn("togotown_config_name is undefined; using default");
                confName = "dev";
            }
        }
        String confRsrcName = String.format("conf/togotown_%s", confName);
        logger.info("using config file: " + confRsrcName);

        synchronized (TogoTown.class) {
            TogoTown tt = togotowns.get(key);

            if (tt == null) {
                tt = new TogoTown(ConfigFactory.load(confRsrcName));
                if (key != null) {
                    togotowns.put(key, tt);
                }
            }
            return tt;
        }
    }
}

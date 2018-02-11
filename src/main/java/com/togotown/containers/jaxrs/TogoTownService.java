package com.togotown.containers.jaxrs;

import com.togotown.TogoTown;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.io.InputStream;
import java.util.IdentityHashMap;
import java.util.Map;

public class TogoTownService {
    private static Map<Object, TogoTown> togotowns = new IdentityHashMap<>();

    /**
     * Returns a TogoTown instance based on the key. If an instance does not exist, create it using the confName.
     * The configuration
     *
     * @param key
     * @param confName name of the TogoTown configuration file.
     * @return
     * @throws IOException
     */
    public static TogoTown get(@NotNull Object key, @NotNull String confName) throws IOException {
        synchronized (TogoTown.class) {
            TogoTown tt = togotowns.get(key);

            if (tt == null) {
                tt = new TogoTown(ConfigFactory.load(confName));
                togotowns.put(key, tt);
            }
            return tt;
        }
    }
}

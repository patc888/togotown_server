package com.togotown;

import com.togotown.containers.jaxrs.TogoTownService;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class MainTest {
    @Test
    public void testInstanceCreation() throws Exception {
        Integer key = 123;
        // Check the same instance is returned for the same key
        TogoTown tt = TogoTownService.get(key, "tst");
        TogoTown tt2 = TogoTownService.get(key, "tst");
        assertTrue(tt == tt2);

        // Check the instances are different even if the key value is the same.
        tt.close();
        tt = TogoTownService.get(new String("key"), "tst");
        tt2.close();
        tt2 = TogoTownService.get(new String("key"), "tst");
        assertTrue(tt != tt2);

        // Check if the key value is different, the instance is different
        tt2.close();
        tt2 = TogoTownService.get("key2", "tst");
        assertTrue(tt != tt2);

        // Check that a null key produces a different instances
        tt2.close();
        tt2 = TogoTownService.get(null, "tst");
        assertTrue(tt != tt2);

        // Check that null keys produce different instances
        tt.close();
        tt = TogoTownService.get(null, "tst");
        assertTrue(tt != tt2);
        tt2.close();
    }
}

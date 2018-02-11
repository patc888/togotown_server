package com.togotown.services;

import org.jooq.util.DefaultGeneratorStrategy;
import org.jooq.util.Definition;

public class JooqGeneratorStrategy extends DefaultGeneratorStrategy {
    @Override
    public String getJavaClassName(Definition definition, Mode mode) {
        switch (mode) {
            case DEFAULT:
        }
        return super.getJavaClassName(definition, mode);
    }
}

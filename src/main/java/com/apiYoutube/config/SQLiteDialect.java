package com.example.apiYoutube.config;

import org.hibernate.dialect.Dialect;
import org.hibernate.engine.jdbc.env.spi.NameQualifierSupport;

public class SQLiteDialect extends Dialect {

    @Override
    public NameQualifierSupport getNameQualifierSupport() {
        return NameQualifierSupport.NONE;
    }

    @Override
    public boolean supportsIfExistsBeforeTableName() {
        return true;
    }

    @Override
    public boolean supportsCascadeDelete() {
        return false;
    }
}
package com.codewithjordy.patterns.creational.factorymethod.example1;

public class DatabaseFactory {
    private DatabaseType databaseType;

    // The DB type can be pass to the constructor or to the method itself.
    // The factory can also be made as a static class.
    public DatabaseFactory(DatabaseType databaseType) {
        this.databaseType = databaseType;
    }

    public DatabaseConnection createConnection() throws UnsupportedOperationException {
        if (databaseType == DatabaseType.MYSQL) {
            return new MySqlDatabase();
        } else if (databaseType == DatabaseType.MICROSOFT_SQL) {
            return new MicrosoftSqlDatabase();
        } else if (databaseType == DatabaseType.POSTGRES) {
            return new PostgresDatabase();
        }
        throw new UnsupportedOperationException("Unsupported database type for: " + databaseType);
    }
}

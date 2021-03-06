package org.rm3l.datanucleus.gradle.tasks.schematool;

import static org.datanucleus.store.schema.SchemaTool.OPTION_DELETE_CREATE_TABLES_FOR_CLASSES;

public class DeleteThenCreateDatabaseTablesTask extends AbstractSchemaToolTask {
    @Override
    protected String[] withSchemaToolArguments() {
        return new String[]{
                "-" + OPTION_DELETE_CREATE_TABLES_FOR_CLASSES
        };
    }

    @Override
    public String getDescription() {
        return "Deletes all database tables required for the classes defined by the input data, then create the tables.";
    }
}

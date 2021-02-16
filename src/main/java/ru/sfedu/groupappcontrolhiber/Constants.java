package ru.sfedu.groupappcontrolhiber;

public class Constants {
    public static final String CONFIG_PATH = "config.path";
    public static final String RESOURCE_PATH ="src/main/resources/hibernate.cfg.xml";
    public static final String SQL_ALL_SCHEMAS= "Select schema_name FROM information_schema.Schemata";
    public static final String SQL_HELP = "Select topic from information_schema.Help";
    public static final String SQL_ALL_TABLES="Select table_name from information_schema.Tables";
    public static final String SQL_ALL_USERS = "Select name from information_schema.Users";
    public static final String CONT_COLUMN_HINT_OUT = "Schemas result: { %d }";
}

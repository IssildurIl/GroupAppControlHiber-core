package ru.sfedu.groupappcontrolhiber;

public class Constants {
    public static final String RESOURCE_PATH ="hibernate.cfg.xml";
    public static final String SQL_ALL_SCHEMAS= "Select schema_name FROM information_schema.Schemata";
    public static final String SQL_HELP = "Select topic from information_schema.Help";
    public static final String SQL_ALL_TABLES="Select table_name from information_schema.Tables";
    public static final String SQL_ALL_USERS = "Select name from information_schema.Users";
    public static final String CONT_COLUMN_HINT_OUT = "Schemas result: { %d }";
    public static final String BaseComment = "BaseComment";
    public static final String JoinTable = "Join Table schema";
    public static final String MappedTable = "Mapped Superclass schema";
    public static final String SingleTable = "Single Table schema";
    public static final String TablePerClass = "TablePerClass Table schema";

    public static final String TASK_1 ="TASK1";
    public static final String TASK_2 ="TASK2";
    public static final String TASK_3 ="TASK3";
    public static final String TASK_4 ="TASK4";
    public static final String TASK_5 ="TASK5";
}

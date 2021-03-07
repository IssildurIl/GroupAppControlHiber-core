package ru.sfedu.groupappcontrolhiber;

import lombok.extern.log4j.Log4j2;
import ru.sfedu.groupappcontrolhiber.enums.Outcomes;
import ru.sfedu.groupappcontrolhiber.lab1.HibernateMetadataProvider;

@Log4j2
public class Main {
    public static void main(String[] args) {
        if (args.length >= 2) {
            System.out.println(task(args));
            System.exit(0);
        } else {
            log.error("Not enough parameters");
        }
    }

    public static String task(String[] s) {
        try {
            switch (s[0].toUpperCase()) {
                case Constants.TASK_1:
                    return task1(s);
//                case Constants.TASK_2:
//                    return task2(s);
//                case Constants.TASK_3:
//                    return task3(s);
//                case Constants.TASK_4:
//                    return task4(s);
//                case Constants.TASK_5:
//                    return task5(s);
            }
        } catch (Exception exception) {
            log.error(exception);
        }
        return null;
    }

    public static String task1(String[] s){
        try {
        HibernateMetadataProvider instance = new HibernateMetadataProvider();
        switch (s[1]) {
            case "1":
                return instance.getAllSchemas().toString();
            case "2":
                return instance.getAllTables().toString();
            case "3":
                return instance.getAllUsers().toString();
            case "4":
                return instance.getSQLHELP().toString();
            }
        }catch(Exception e){
            log.error(e);
            return Outcomes.Fail.toString();
        }
        return null;
    }
}

package ru.sfedu.groupappcontrolhiber;

import lombok.extern.log4j.Log4j2;
import ru.sfedu.groupappcontrolhiber.enums.Outcomes;
import ru.sfedu.groupappcontrolhiber.lab1.HibernateMetadataProvider;
import ru.sfedu.groupappcontrolhiber.lab2.Address;
import ru.sfedu.groupappcontrolhiber.lab2.TestEntity;
import ru.sfedu.groupappcontrolhiber.lab2.TestEntityMetadataProvider;
import ru.sfedu.groupappcontrolhiber.lab3.JoinedTable.Employee;
import ru.sfedu.groupappcontrolhiber.lab3.MappedSuperclass.Developer;
import ru.sfedu.groupappcontrolhiber.lab3.SingleTable.Task;
import ru.sfedu.groupappcontrolhiber.lab3.api.*;
import ru.sfedu.groupappcontrolhiber.lab4.api.Lab4DataProvider;
import ru.sfedu.groupappcontrolhiber.lab4.models.Item;
import ru.sfedu.groupappcontrolhiber.lab5.api.Lab5Criteria;
import ru.sfedu.groupappcontrolhiber.lab5.api.Lab5DataProvider;
import ru.sfedu.groupappcontrolhiber.lab5.api.Lab5HQL;
import ru.sfedu.groupappcontrolhiber.lab5.api.Lab5NativeSQL;
import ru.sfedu.groupappcontrolhiber.lab5.models.Project;
import ru.sfedu.groupappcontrolhiber.utils.Generator.*;

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
                case Constants.TASK_2:
                    return task2(s);
                case Constants.TASK_3:
                    return task3(s);
                case Constants.TASK_4:
                    return task4(s);
                case Constants.TASK_5:
                    return task5(s);
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

    public static String task2(String[] s){
        try {
        TestEntityMetadataProvider instance= new TestEntityMetadataProvider();
        TestEntityGenerator tg = new TestEntityGenerator();
        tg.testEntityGen();
        switch (s[1]) {
            case "get":
                return instance.getById(TestEntity.class,Long.parseLong(s[2])).getData().toString();
            case "del":
                instance.delete(instance.getById(TestEntity.class,Long.parseLong(s[2])));
                return instance.getById(TestEntity.class,Long.parseLong(s[2])).getData().toString();
            case "save":
                TestEntity testEntity = new TestEntity();
                testEntity.setName(s[2]);
                testEntity.setDescription("description");
                instance.save(testEntity);
                return instance.getById(TestEntity.class,testEntity.getId()).getData().toString();
            case "upd":
                TestEntity testEntity1 = instance.getById(TestEntity.class,Long.parseLong(s[2])).getData();
                testEntity1.setName(s[3]);
                instance.update(testEntity1);
                return instance.getById(TestEntity.class,Long.parseLong(s[2])).getData().toString();
            }
        }catch(Exception e){
            log.error(e);
            return Outcomes.Fail.toString();
        }
        return null;
    }

    public static String task3(String[] s){
        MetaDataProvider provider = strategy(s[1]);
        if (provider == null) return null;
        switch (s[2].toLowerCase()) {
            case "jt":
                return provider.getById(Employee.class,Long.parseLong(s[3])).getData().toString();
            case "ms":
                return provider.getById(Developer.class,Long.parseLong(s[3])).getData().toString();
            case "st":
                return provider.getById(Task.class,Long.parseLong(s[3])).getData().toString();
            case "tpc":
                return provider.getById(ru.sfedu.groupappcontrolhiber.lab3.TablePerClass.Task.class,Long.parseLong(s[3])).getData().toString();
        }
        return null;
    }

    public static String task4 (String[] s){
        try {
        Lab4DataProvider instance = new Lab4DataProvider();
        Lab4Generator gen = new Lab4Generator();
        gen.lab4Gen();
        switch (s[1]) {
            case "get":
                return instance.getById(Item.class,Long.parseLong(s[2])).getData().toString();
            case "del":
                instance.delete(instance.getById(Item.class,Long.parseLong(s[2])));
                return instance.getById(Item.class,Long.parseLong(s[2])).getData().toString();
            case "upd":
                Item testEntity1 = instance.getById(Item.class,Long.parseLong(s[2])).getData();
                ru.sfedu.groupappcontrolhiber.lab4.models.Address address= new ru.sfedu.groupappcontrolhiber.lab4.models.Address();
                address.setStreet(s[3]);
                address.setCity(s[4]);
                testEntity1.setAddress(address);
                instance.update(testEntity1);
                return instance.getById(Item.class,Long.parseLong(s[2])).getData().toString();
        }
    }catch(Exception e){
        log.error(e);
        return Outcomes.Fail.toString();
    }
        return null;
}

    public static String task5 (String[] s){
        try {
            Lab5HQL instance = new Lab5HQL();
            Lab5DataProvider provider = lang(s[1]);
            Lab5Generator lg = new Lab5Generator();
            lg.lab5Gen();
            assert provider != null;
            long start = System.currentTimeMillis();
            System.out.println(provider.getProjectById(Long.parseLong(s[2])).getData().toString());
            Thread.sleep(1000);
            long finish = System.currentTimeMillis();
            long elapsed = finish - start;
            return " "+elapsed;
        }catch (Exception e){
            log.error(e);
            return Outcomes.Fail.toString();
        }
    }

    public static Lab5DataProvider lang(String s) {
        switch (s.toUpperCase()) {
            case "SQL":
                return new Lab5NativeSQL();
            case "HQL":
                return new Lab5HQL();
            case "CRITERIA":
                return new Lab5Criteria();
            default: return null;
        }
    }


    public static MetaDataProvider strategy(String s) {
        switch (s.toUpperCase()) {
            case "S1":
                JoinTableGenerator join = new JoinTableGenerator();
                join.joinTableGen();
                return new JoinedTableDataProvider();
            case "S2":
                MappedSuperclassGenerator map = new MappedSuperclassGenerator();
                map.mappedSuperclassGen();
                return new MappedSuperclassDataProvider();
            case "S3":
                SingleTableGenerator sin = new SingleTableGenerator();
                sin.singleTableGen();
                return new SingleTableDataProvider();
            case "S4":
                TablePerClassGenerator tab= new TablePerClassGenerator();
                tab.TablePerClassGen();
                return new TablePerClassDataProvider();
            default: return null;
        }
    }

}

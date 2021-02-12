package ru.sfedu.groupappcontrolhiber.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HibernateMetadataProviderTest {

    @Test
    void getAllSchemas() {
        HibernateMetadataProvider instance = new HibernateMetadataProvider();
        List result = instance.getAllSchemas();
        Assertions.assertNotNull(result);
    }

    @Test
    void getSQLHELP(){
        HibernateMetadataProvider instance = new HibernateMetadataProvider();
        List result = instance.getSQLHELP();
        Assertions.assertNotNull(result);
    }

    @Test
    void getAllTables(){
        HibernateMetadataProvider instance = new HibernateMetadataProvider();
        List result = instance.getAllTables();
        Assertions.assertNotNull(result);
    }

    @Test
    void getAllUsers(){
        HibernateMetadataProvider instance = new HibernateMetadataProvider();
        List result = instance.getAllUsers();
        Assertions.assertNotNull(result);
    }

}
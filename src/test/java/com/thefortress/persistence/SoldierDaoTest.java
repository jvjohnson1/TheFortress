package com.thefortress.persistence;

import com.thefortress.entity.Soldier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import persistence.SoldierDao;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Test class for Book Dao
 */

class SoldierDaoTest {

    Soldier myTest;
    SoldierDao dao;
    private final Logger logger = LogManager.getLogger(this.getClass());


    /**
     * Set up consistent database before each test
     */
    @BeforeEach
    void setUp() {
        dao = new SoldierDao();
        com.thefortress.persistence.Database database = com.thefortress.persistence.Database.getInstance();
        database.runSQL("cleandb.sql");
    }


    /**
     * Tests method getById
     */
    @Test
    void getById() {
        Soldier testSoldier = dao.getById(64822);
        assertEquals("Allen", testSoldier.getFirstName());
        assertEquals("Turner", testSoldier.getLastName());
        assertEquals("aturner", testSoldier.getUserName());
        assertEquals("Private", testSoldier.getSoldierRank());
        assertEquals(2, testSoldier.getPlatoonNumber());
    }


    /**
     * Tests method saveOrUpdate
     */
    @Test
    void saveOrUpdate() {
        Soldier myTest = dao.getById(93450);
        myTest.setLastName("Jackson");
        dao.saveOrUpdate(myTest);
        //Same person, last name changed, as in marriage
        Soldier checker = dao.getById(93450);
        assertEquals("Jackson", checker.getLastName());
    }

    /**
     * Tests method insert
     */
    @Test
    void insert() {

        myTest = new Soldier("Stephan", "Watson", "swatson", "Private",55328, 2);
        int id = dao.insert(myTest);
        assertNotEquals(0,id);
        Soldier inserted = dao.getById(id);
        assertTrue(myTest.equals(inserted));

    }

    /**
     * Tests method delete
     */
    @Test
    void delete() {
        dao.delete(dao.getById(93450));
        assertNull(dao.getById(93450));
    }

    /**
     * Tests method getAll
     */
    @Test
    void getAll() {
        List<Soldier> users = dao.getAll();
        assertEquals(15, users.size());
    }
}
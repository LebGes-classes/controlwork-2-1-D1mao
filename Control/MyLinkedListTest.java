package Control;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyLinkedListTest {
    private MyLinkedList<Integer> testlist;

    @BeforeEach
    void setUp(){
        testlist = new MyLinkedList();
        testlist.add(5);
        testlist.add(7);
    }

    @Test
    void addAndGetTest(){
        assertEquals(5, (int) testlist.get(0));
        assertEquals(7, (int) testlist.get(1));
    }

    @Test
    void clearAndIsEmptyTest(){
        testlist.clear();
        assertTrue(testlist.isEmpty());
    }

    @Test
    void removeTest(){
        testlist.remove(0);
        assertEquals(7, (int)testlist.get(0));
    }

    @Test
    void containsTest(){
        assertTrue(testlist.contains(5));
    }
}

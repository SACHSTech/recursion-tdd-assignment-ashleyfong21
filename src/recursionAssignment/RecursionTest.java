package recursionAssignment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.Before;
import org.junit.After;

import recursionAssignment.Recursion;

public class RecursionTest{
    
    //Problem Set 1
    @Before
    public void beforeTest(){
      // some steps to perform before tests are run
    }
    
    /**
     * count7 tests
     */
    
    @Test
    public void Test1(){
        // make assertion statement(s)
        assertEquals(2, Recursion.count7(717)); 
        // assertTrue(TESTBOOLEAN);
    }

    @Test 
    public void Test2(){
      assertEquals(1, Recursion.count7(7)); 
    }
    
    @Test 
    public void Test3(){ 
      assertEquals(0, Recursion.count7(123)); 
    }
    
    @Test 
    public void Test4(){
      assertEquals(3, Recursion.count7(71727));
    }
    
    @After
    public void afterTest(){
      // some steps to perform after tests are run
    }

    
    //Problem Set 2    
    /**
     * changePi tests
     */
    
    @Test
    public void Test5(){
      // make assertion statement(s)
      assertEquals("hel*lo", Recursion.pairStar("hello")); 
      // assertTrue(TESTBOOLEAN);
    }

    @Test 
    public void Test6(){
      assertEquals("x*xy*y", Recursion.pairStar("xxyy")); 
    }
}

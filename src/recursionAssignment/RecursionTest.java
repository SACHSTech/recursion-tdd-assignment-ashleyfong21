package recursionAssignment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.Before;
import org.junit.After;

import recursionAssignment.Recursion;

public class RecursionTest{

    @Before
    public void beforeTest(){
      // some steps to perform before tests are run
    }
    
    /** Problem Set 1
     *
     * count7 tests
     *
     */
    
    @Test
    public void Test1(){
      // make assertion statement(s)
      assertEquals(2, Recursion.count7(717)); 
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

    
    /** Problem Set 2    
     *
     * changePi tests
     *
     */
    
    @Test
    public void Test5(){
      // make assertion statement(s)
      assertEquals("x3.14x", Recursion.changePi("xpix")); 
    }

    @Test 
    public void Test6(){
      assertEquals("3.143.14", Recursion.changePi("pipi")); 
    }
    
    @Test 
    public void Test7(){
      assertEquals("3.14p", Recursion.changePi("pip")); 
    }

    /** Problem Set 3 
     * 
     * stringClean tests 
     *
     */
    
    @Test
    public void Test8(){
      // make assertion statement(s)
      assertEquals("yza", Recursion.stringClean("yyzzza")); 
    }

    @Test 
    public void Test9(){
      assertEquals("abcd", Recursion.stringClean("abbbcdd")); 
    }
    
    @Test 
    public void Test10(){
      assertEquals("Helo", Recursion.stringClean("Hello")); 
    }
}

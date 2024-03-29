package regressionSuite;

import baseTest.BaseTestSuite;
import org.testng.annotations.*;

public class TestNG_TestClass1 extends BaseTestSuite {
    @BeforeClass
    public void setUp() {
        System.out.println("\nTestNG_TestClass1 -> before class");
    }

    @AfterClass
    public void cleanUp() {
        System.out.println("\nTestNG_TestClass1 -> after class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("\nTestNG_TestClass1 -> before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("\nTestNG_TestClass1 -> after method");
    }

    @Test
    public void testMethod1() {
        System.out.println("\nTestNG_TestClass1 -> testMethod1");
    }

    @Test
    public void testMethod2() {
        System.out.println("\nTestNG_TestClass1 -> testMethod2");
    }

}

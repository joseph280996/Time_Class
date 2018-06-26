
/**
 * David M Rosenberg
 * Comp 1050
 * Lab 3: Time
 * Summer, 2018
 * 
 * Usage restrictions:
 * 
 * You may use this code for exploration, experimentation, and furthering your
 * learning for this course. You may not use this code for any other
 * assignments, in my course or elsewhere, without explicit permission, in
 * advance, from myself (and the instructor of any other course). Further, you
 * may not post or otherwise share this code with anyone other than current
 * students in my sections of this course. Violation of these usage restrictions
 * will be considered a violation of the Wentworth Institute of Technology
 * Academic Honesty Policy.
 */
package edu.wit.dcsn.comp1050.lab03;

import static org.junit.jupiter.api.Assertions.* ;

import org.junit.jupiter.api.AfterAll ;
import org.junit.jupiter.api.AfterEach ;
import org.junit.jupiter.api.BeforeAll ;
import org.junit.jupiter.api.BeforeEach ;
import org.junit.jupiter.api.DisplayName ;
import org.junit.jupiter.api.Test ;
import org.junit.jupiter.api.TestInfo ;


/**
 * JUnit tests for the Time class.  All public and package visible methods are tested.
 * 
 * @author David M Rosenberg
 * @version 1.0.0	2018-06-19	initial set of tests
 * @version	1.1.0	2018-06-24	complete set of tests
 */
class TimeTest
	{
	// utility constants - for testing

    private static final boolean AM =            true ;
    private static final boolean PM =            !AM ;
    
    
	/*
	 * counters and labels
	 */
	// overall
	static final String TEST_CLASS_NAME =		"Time" ;
	
	static int totalTestsAttempted =			0 ;
	static int totalTestsSucceeded =			0 ;
	
	// current test group/method
	int currentTestsAttempted ;
	int currentTestsSucceeded ;
	

    /**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception
		{
		// display start of testing (class)
		System.out.printf( "Starting tests of class %s%n%n",
		                   TEST_CLASS_NAME
		                   ) ;
		
		}	// end setUpBeforeClass()


	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception
		{
		// display summary results
		System.out.printf( "Successfully completed %,d of %,d tests (%d%%) attempted for class %s%n",
							totalTestsSucceeded,
							totalTestsAttempted,
							( totalTestsSucceeded * 100 ) / totalTestsAttempted,
							TEST_CLASS_NAME
							) ;
		
		}	// end tearDownAfterClass()


	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp( TestInfo testInfo ) throws Exception
		{
		// reset current test counters
		currentTestsAttempted =		0 ;
		currentTestsSucceeded =	0 ;
		
		// display start of testing (method or category/group of operations)
		System.out.printf( "Starting %s tests%n%n",
							testInfo.getDisplayName()
							) ;
		
		}	// end setUp()


	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown( TestInfo testInfo ) throws Exception
		{
		// display stats for this test group
		System.out.printf( "%nSuccessfully completed %,d of %,d tests (%d%%) for %s%n%n----------%n%n",
							currentTestsSucceeded,
							currentTestsAttempted,
							( currentTestsSucceeded * 100 ) / currentTestsAttempted,
							testInfo.getDisplayName() ) ;
		
		// accumulate this test group's results
		totalTestsAttempted +=		currentTestsAttempted ;
		totalTestsSucceeded +=		currentTestsSucceeded ;
		}	// end tearDown()


	/**
	 * Test method for no-arg constructor.
	 */
	@Test
	@DisplayName( "No-arg Constructor" )
	void testNoArgConstructor()
		{
		Time testTime ;
		
		/* ----- */
		
		System.out.println( "Testing: new Time()" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time() ;
		
		
		System.out.println( "...toString()" ) ;
		assertEquals( "(00, 00)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		}	// end testNoArgConstructor()

	
	/**
	 * Test method for 2-arg (24-hour) constructor.
	 */
	@Test
	@DisplayName( "2-arg (24-hour) Constructor" )
	void test2ArgConstructor()
		{
		Time testTime ;
		
		/* ----- */
		
		System.out.println( "Testing: new Time( 0, 0 )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 0, 0 ) ;
		
		
		System.out.println( "...toString()" ) ;
		assertEquals( "(00, 00)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: new Time( 12, 0 )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 12, 0 ) ;
		
		
		System.out.println( "...toString()" ) ;
		assertEquals( "(12, 00)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: new Time( -1, 0 )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( -1, 0 ) ;
		
		
		System.out.println( "...toString()" ) ;
		assertEquals( "(00, 00)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: new Time( 23, 0 )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 23, 0 ) ;
		
		
		System.out.println( "...toString()" ) ;
		assertEquals( "(23, 00)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: new Time( 24, 0 )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 24, 0 ) ;
		
		
		System.out.println( "...toString()" ) ;
		assertEquals( "(00, 00)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: new Time( 0, -1 )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 0, -1 ) ;
		
		
		System.out.println( "...toString()" ) ;
		assertEquals( "(00, 00)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: new Time( 0, 59 )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 0, 59 ) ;
		
		
		System.out.println( "...toString()" ) ;
		assertEquals( "(00, 59)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: new Time( 0, 60 )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 0, 60 ) ;
		
		
		System.out.println( "...toString()" ) ;
		assertEquals( "(00, 00)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: new Time( 12, 30 )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 12, 30 ) ;
		
		
		System.out.println( "...toString()" ) ;
		assertEquals( "(12, 30)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		}	// end 2-arg (24-hour) Constructor

	
	/**
	 * Test method for 3-arg (12-hour) constructor.
	 */
	@Test
	@DisplayName( "3-arg (12-hour) Constructor" )
	void test3ArgConstructor()
		{
		Time testTime ;
		
		/* ----- */
		
		System.out.println( "Testing: new Time( 12, 0, AM )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 12, 0, AM ) ;
		
		
		System.out.println( "...toString()" ) ;
		assertEquals( "(00, 00)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: new Time( 12, 0, PM )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 12, 0, PM ) ;
		
		
		System.out.println( "...toString()" ) ;
		assertEquals( "(12, 00)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: new Time( -1, 0, AM )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( -1, 0, AM ) ;
		
		
		System.out.println( "...toString()" ) ;
		assertEquals( "(00, 00)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: new Time( -1, 0, PM )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( -1, 0, PM ) ;
		
		
		System.out.println( "...toString()" ) ;
		assertEquals( "(00, 00)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: new Time( 11, 0, AM )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 11, 0, AM ) ;
		
		
		System.out.println( "...toString()" ) ;
		assertEquals( "(11, 00)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: new Time( 0, 1, AM )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 0, 1, AM ) ;
		
		
		System.out.println( "...toString()" ) ;
		assertEquals( "(00, 00)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: new Time( 13, 0, AM )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 13, 0, AM ) ;
		
		
		System.out.println( "...toString()" ) ;
		assertEquals( "(00, 00)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: new Time( 13, 0, PM )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 13, 0, PM ) ;
		
		
		System.out.println( "...toString()" ) ;
		assertEquals( "(00, 00)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: new Time( 13, 1, PM )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 13, 1, PM ) ;
		
		
		System.out.println( "...toString()" ) ;
		assertEquals( "(00, 00)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: new Time( 5, -1, AM )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 5, -1, AM ) ;
		
		
		System.out.println( "...toString()" ) ;
		assertEquals( "(00, 00)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: new Time( 3, 17, PM )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 3, 17, PM ) ;
		
		
		System.out.println( "...toString()" ) ;
		assertEquals( "(15, 17)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: new Time( 3, 60, PM )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 3, 60, PM ) ;
		
		
		System.out.println( "...toString()" ) ;
		assertEquals( "(00, 00)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: new Time( 2, 45, PM )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 2, 45, PM ) ;
		
		
		System.out.println( "...toString()" ) ;
		assertEquals( "(14, 45)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		}	// end 3-arg (12-hour) Constructor

	
	/**
	 * Test method for isValid().
	 */
	@Test
	@DisplayName( "isValid()" )
	void testIsValid()
		{
		Time testTime ;				// only necessary until isValid() is changed to static
		
		/* ----- */
		
		System.out.println( "Testing: ( 0, 0 )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time() ;
		
		
		assertTrue( testTime.isValid( 0, 0 ) ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: ( 23, 59 )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time() ;
		
		
		assertTrue( testTime.isValid( 23, 59 ) ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: ( 24, 0 )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time() ;
		
		
		assertFalse( testTime.isValid( 24, 0 ) ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: ( -1, 0 )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time() ;
		
		
		assertFalse( testTime.isValid( -1, 0 ) ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: ( 0, 60 )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time() ;
		
		
		assertFalse( testTime.isValid( 0, 60 ) ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: ( 0, -1 )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time() ;
		
		
		assertFalse( testTime.isValid( 0, -1 ) ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: ( -1, -1 )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time() ;
		
		
		assertFalse( testTime.isValid( -1, -1 ) ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		}	// end testIsValid()


	/**
	 * Test method for setTime() functionality with 2 args (24-hour) specifications.
	 */
	@Test
	@DisplayName( "setTime() with 2 args (24-hour) specifications" )
	void test2ArgSetTime()
		{
		Time testTime ;
		
		/* ----- */
		
		System.out.println( "Testing: setTime( 0000 -> 1115 )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 0, 0 ) ;
		
		testTime.setTime( 11,  15 );
		assertEquals( "(11, 15)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: setTime( 1115 -> 0000 )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 11, 15 ) ;
		
		testTime.setTime( 0, 0 );
		assertEquals( "(00, 00)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: setTime( 1115 -> (-1, 30) )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 11, 15 ) ;
		
		testTime.setTime( -1, 30 );
		assertEquals( "(11, 15)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: setTime( 1115 -> (23, 45) )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 11, 15 ) ;
		
		testTime.setTime( 23, 45 );
		assertEquals( "(23, 45)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: setTime( 1115 -> (24, 45) )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 11, 15 ) ;
		
		testTime.setTime( 24, 45 );
		assertEquals( "(11, 15)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: setTime( 1115 -> (17, 65) )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 11, 15 ) ;
		
		testTime.setTime( 17, 65 );
		assertEquals( "(11, 15)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: setTime( 1115 -> (3, -30) )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 11, 15 ) ;
		
		testTime.setTime( 3, -30 );
		assertEquals( "(11, 15)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		}	// end setTime() with 2 args (24-hour) specifications


	/**
	 * Test method for setTime() functionality with 3 args (12-hour) specifications.
	 */
	@Test
	@DisplayName( "setTime() with 3 args (12-hour) specifications" )
	void test3ArgSetTime()
		{
		Time testTime ;
		
		/* ----- */
		
		System.out.println( "Testing: setTime( 0000 -> 12:00 am )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 0, 0 ) ;
		
		testTime.setTime( 12, 0, AM );
		assertEquals( "(00, 00)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: setTime( 0000 -> 12:00 pm )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 0, 0 ) ;
		
		testTime.setTime( 12, 0, PM );
		assertEquals( "(12, 00)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: setTime( 0000 -> 11:15 am )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 0, 0 ) ;
		
		testTime.setTime( 11,  15, AM );
		assertEquals( "(11, 15)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: setTime( 0000 -> 11:15 pm )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 0, 0 ) ;
		
		testTime.setTime( 11,  15, PM );
		assertEquals( "(23, 15)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: setTime( 1115 -> 12:00 am )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 11, 15 ) ;
		
		testTime.setTime( 12, 0, AM );
		assertEquals( "(00, 00)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: setTime( 1115 -> 12:00 pm )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 11, 15 ) ;
		
		testTime.setTime( 12, 0, PM );
		assertEquals( "(12, 00)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: setTime( 1115 -> (-1, 30, AM) )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 11, 15 ) ;
		
		testTime.setTime( -1, 30, AM );
		assertEquals( "(11, 15)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: setTime( 1115 -> (3, -30, PM) )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 11, 15 ) ;
		
		testTime.setTime( 3, -30, PM );
		assertEquals( "(11, 15)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		}	// end setTime() with 3 args (12-hour) specifications

	
	/**
	 * Test method for equals() and compareTo().
	 */
	@Test
	@DisplayName( "equals() and compareTo()" )
	void testEqualsAndCompareTo()
		{
		Time testTime ;
		Time anotherTime ;
		
		/* ----- */
		
		System.out.println( "Testing: ( 0, 0 ) to itself" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 0, 0 ) ;
		
		anotherTime =				null ;	// reset the pointer
		anotherTime =				new Time( 0, 0 ) ;
		
		
		System.out.println( "...equals()" ) ;
		assertTrue( testTime.equals( testTime ) ) ;
		
		System.out.println( "...compareTo()" ) ;
		assertEquals( 0, testTime.compareTo( testTime ) ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: ( 12, 0 ) to itself" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 12, 0 ) ;
		
		anotherTime =				null ;	// reset the pointer
		anotherTime =				new Time( 0, 0 ) ;
		
		
		System.out.println( "...equals()" ) ;
		assertTrue( testTime.equals( testTime ) ) ;
		
		System.out.println( "...compareTo()" ) ;
		assertEquals( 0, testTime.compareTo( testTime ) ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: ( 12, 5 ) to itself" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 12, 5 ) ;
		
		anotherTime =				null ;	// reset the pointer
		anotherTime =				new Time( 0, 0 ) ;
		
		
		System.out.println( "...equals()" ) ;
		assertTrue( testTime.equals( testTime ) ) ;
		
		System.out.println( "...compareTo()" ) ;
		assertEquals( 0, testTime.compareTo( testTime ) ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: ( 0, 0 ) to ( 0, 0 )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 0, 0 ) ;
		
		anotherTime =				null ;	// reset the pointer
		anotherTime =				new Time( 0, 0 ) ;
		
		
		System.out.println( "...equals()" ) ;
		assertTrue( testTime.equals( anotherTime ) ) ;
		
		System.out.println( "...compareTo()" ) ;
		assertEquals( 0, testTime.compareTo( anotherTime ) ) ;
		assertEquals( 0, anotherTime.compareTo( testTime ) ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: ( 0, 0 ) to ( 0, 1 )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 0, 0 ) ;
		
		anotherTime =				null ;	// reset the pointer
		anotherTime =				new Time( 0, 1 ) ;
		
		
		System.out.println( "...equals()" ) ;
		assertFalse( testTime.equals( anotherTime ) ) ;
		
		System.out.println( "...compareTo()" ) ;
		assertTrue( ( testTime.compareTo( anotherTime ) < 0 ) ) ;
		assertTrue( ( anotherTime.compareTo( testTime ) > 0 ) ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: ( 0, 0 ) to ( 12, 0 )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 0, 0 ) ;
		
		anotherTime =				null ;	// reset the pointer
		anotherTime =				new Time( 12, 0 ) ;
		
		
		System.out.println( "...equals()" ) ;
		assertFalse( testTime.equals( anotherTime ) ) ;
		
		System.out.println( "...compareTo()" ) ;
		assertTrue( ( testTime.compareTo( anotherTime ) < 0 ) ) ;
		assertTrue( ( anotherTime.compareTo( testTime ) > 0 ) ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: ( 0, 45 ) to ( 12, 15 )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 0, 45 ) ;
		
		anotherTime =				null ;	// reset the pointer
		anotherTime =				new Time( 12, 15 ) ;
		
		
		System.out.println( "...equals()" ) ;
		assertFalse( testTime.equals( anotherTime ) ) ;
		
		System.out.println( "...compareTo()" ) ;
		assertTrue( ( testTime.compareTo( anotherTime ) < 0 ) ) ;
		assertTrue( ( anotherTime.compareTo( testTime ) > 0 ) ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: ( 5, 45 ) to ( 5, 15 )" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 5, 45 ) ;
		
		anotherTime =				null ;	// reset the pointer
		anotherTime =				new Time( 5, 15 ) ;
		
		
		System.out.println( "...equals()" ) ;
		assertFalse( testTime.equals( anotherTime ) ) ;
		
		System.out.println( "...compareTo()" ) ;
		assertTrue( ( testTime.compareTo( anotherTime ) > 0 ) ) ;
		assertTrue( ( anotherTime.compareTo( testTime ) < 0 ) ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		}	// end testEqualsAndCompareTo()

	
	/**
	 * Test method for toString().
	 */
	@Test
	@DisplayName( "toString()" )
	void testToString()
		{
		Time testTime ;
		
		/* ----- */
		
		System.out.println( "Testing: (00, 00)" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 0, 0 ) ;
		
		
		assertEquals( "(00, 00)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: (09, 00)" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 9, 0 ) ;
		
		
		assertEquals( "(09, 00)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: (10, 00)" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 10, 0 ) ;
		
		
		assertEquals( "(10, 00)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: (12, 00)" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 12, 0 ) ;
		
		
		assertEquals( "(12, 00)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: (23, 00)" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 23, 0 ) ;
		
		
		assertEquals( "(23, 00)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: (07, 09)" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 7, 9 ) ;
		
		
		assertEquals( "(07, 09)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: (07, 10)" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 7, 10 ) ;
		
		
		assertEquals( "(07, 10)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: (07, 59)" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 7, 59 ) ;
		
		
		assertEquals( "(07, 59)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: (23, 59)" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 23, 59 ) ;
		
		
		assertEquals( "(23, 59)", testTime.toString() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		}	// end testToString()

	
	/**
	 * Test method for getTime12().
	 */
	@Test
	@DisplayName( "getTime12()" )
	void testGetTime12()
		{
		Time testTime ;
		
		/* ----- */
		
		System.out.println( "Testing: (00, 00)" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 0, 0 ) ;
		
		
		assertEquals( "12:00 am", testTime.getTime12() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: (09, 00)" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 9, 0 ) ;
		

		assertEquals( "9:00 am", testTime.getTime12() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: (10, 00)" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 10, 0 ) ;
		

		assertEquals( "10:00 am", testTime.getTime12() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: (12, 00)" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 12, 0 ) ;
		

		assertEquals( "12:00 pm", testTime.getTime12() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: (23, 00)" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 23, 0 ) ;
		

		assertEquals( "11:00 pm", testTime.getTime12() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: (07, 09)" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 7, 9 ) ;
		

		assertEquals( "7:09 am", testTime.getTime12() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: (07, 10)" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 7, 10 ) ;
		

		assertEquals( "7:10 am", testTime.getTime12() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: (07, 59)" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 7, 59 ) ;
		

		assertEquals( "7:59 am", testTime.getTime12() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: (23, 59)" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 23, 59 ) ;
		

		assertEquals( "11:59 pm", testTime.getTime12() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		}	// end testGetTime12()

	
	/**
	 * Test method for getTime24().
	 */
	@Test
	@DisplayName( "getTime24()" )
	void testGetTime24()
		{
		Time testTime ;
		
		/* ----- */
		
		System.out.println( "Testing: (00, 00)" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 0, 0 ) ;
		
		
		assertEquals( "0000", testTime.getTime24() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: (09, 00)" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 9, 0 ) ;
		

		assertEquals( "0900", testTime.getTime24() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: (10, 00)" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 10, 0 ) ;
		

		assertEquals( "1000", testTime.getTime24() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: (12, 00)" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 12, 0 ) ;
		

		assertEquals( "1200", testTime.getTime24() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: (23, 00)" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 23, 0 ) ;
		

		assertEquals( "2300", testTime.getTime24() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: (07, 09)" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 7, 9 ) ;
		

		assertEquals( "0709", testTime.getTime24() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: (07, 10)" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 7, 10 ) ;
		

		assertEquals( "0710", testTime.getTime24() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: (07, 59)" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 7, 59 ) ;
		

		assertEquals( "0759", testTime.getTime24() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		/* ----- */
		
		System.out.println( "Testing: (23, 59)" ) ;
		currentTestsAttempted++ ;
		
		testTime =					null ;	// reset the pointer
		testTime =					new Time( 23, 59 ) ;
		

		assertEquals( "2359", testTime.getTime24() ) ;
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		}	// end testGetTime24()

	}	// end class TimeTest

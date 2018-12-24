package Testcases;

import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class skippackage {
	
	//private static final boolean DataAvailable = false;

	@Test
	public void testCaseEnabling(){
			System.out.println("I'm Not Ready, please don't execute me");
		}
	/*@Test
	public void testCaseSkipException(){
		
			//System.out.println("Im in skip exception");
			throw new SkipException("Skipping this exception");
		}*/
	@BeforeMethod
	public void skip()
	{
		throw new SkipException("skipping below method");
	}

	@Test
	public void testCaseConditionalSkipException(){
		System.out.println("Im in Conditional Skip");
		
	}

}

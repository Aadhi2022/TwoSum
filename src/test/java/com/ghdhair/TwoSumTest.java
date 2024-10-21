package com.ghdhair;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TwoSumTest {
	@Test
	void nullCheck() 
	{
		int[] arr= {5,2,7,9};
		int target=0;
		int[] ans=TwoSum.twoSum(arr,target);
		
		assertEquals("No target found",ans);
	}
	
	@Test
	void validtwoSum1()
	{
		int[] arr= {5,2,7,9};
		int target=7;
		int[] expected= {0,1};
		int[] ans=TwoSum.twoSum(arr,target);
		assertEquals(expected, ans);
	}
	
	@Test
	void validtwoSum2()
	{
		int[] arr= {5,2,7,9};
		int target=9;
		int[] expected= {1,2};
		int[] ans=TwoSum.twoSum(arr,target);
		assertEquals(expected, ans);
	}
	

}

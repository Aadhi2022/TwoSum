package com.ghdhair;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class TwoSumTest {
	@Test
	public void nullCheck() 
	{
		int[] arr= {5,2,7,9};
		int target=0;
		int[] ans=TwoSum.twoSum(arr,target);
		assertNull(ans);
		//assertEquals("No target found",ans);
	}
	
	@Test
	public void validtwoSum1()
	{
		int[] arr= {5,2,7,9};
		int target=7;
		int[] expected= {1,0};
		int[] ans=TwoSum.twoSum(arr,target);
		assertArrayEquals(expected, ans);
	}
	
	@Test
	public void validtwoSum2()
	{
		int[] arr= {5,2,7,9};
		int target=9;
		int[] expected= {2,1};
		int[] ans=TwoSum.twoSum(arr,target);
		assertArrayEquals(expected, ans);
	}
	@Test
	public void twoSum()
	{
		int[] arr= {5,5};
		int target=10;
		int[] expected= {1,0};
		int[] ans=TwoSum.twoSum(arr,target);
		assertArrayEquals(expected, ans);
	}
	
	

}
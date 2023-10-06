package com.lbrce.devops;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UservalidationTesting {
	@Test
	public void testCasel()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("srinu", "srinu@12345"));
	}
	public void testCase2()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("lbrce", "lbrce@85"));
	}
	public void testCase3()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("Srinu", "Srinu@12345"));
	}
	public void testCase4()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("srinu", "srinu@12345"));
	}
	public void testCase5()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("srinu", "srinu@12345"));
	}

}

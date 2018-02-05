package com.capgemini.junit;

import com.capgemini.validator.*;
import static org.junit.Assert.*;

//import org.junit.Test;
import org.junit.*;

import com.capgemini.bin.*;
import com.capgemini.collection.*;
import com.capgemini.exception.*;
import com.capgemini.validator.*;

public class ValidatorTest {

	Validator val=new Validator();
	
	@Test
	public void testID() throws ItemException {

		Assert.assertEquals(true,val.validate_id("123"));
		
	}
	
	
	@Test
	public void testPrice() throws ItemException {

		Assert.assertEquals(true,val.validate_price("5.66"));
		
	}
	
	@Test
	public void testName() throws ItemException {

		Assert.assertEquals(true,val.validate_name("Krishna"));
		
	}
	
	

}

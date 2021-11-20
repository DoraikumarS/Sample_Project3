package org.online.support;

import org.junit.Test;
import org.mockito.Mockito;

public class UtilityTest {

	@Test
	public void test_getdate() {
		Utility utility = new Utility();
		utility.getCurrentDate();
		utility.getNameFromDB();
		
		Utility utility2 = Mockito.mock(Utility.class);
		Mockito.when(utility2.getNameFromDB()).thenReturn("DummyValue");
		
		System.out.println("Mocked value is " + utility2.getNameFromDB());
	}
}

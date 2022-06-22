package org.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderc {
	@DataProvider(name="data",parallel = true)
	@Test
	private Object[][] inputData() {
		return new Object[][] {
			{"baskar","baski"},
			{"aru","aruchamy"},
			{"suria","suira123"},
		};
	}
	}
	

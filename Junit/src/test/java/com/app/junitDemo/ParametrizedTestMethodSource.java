package com.app.junitDemo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ParametrizedTestMethodSource {
	

	// argument = each value stored in method or enum class or value source
	
	@ParameterizedTest(name = "Method value {arguments}") // this will execute the method
	@MethodSource("stringParameters") // this will give the input
	public void getdatafromMethod(String input)
	{
		System.out.println("The value from method is: " + input);
	}
	
	
	// This method will pass a range of values
	
	public static Stream<String> stringParameters()
	{
		
		return Stream.of("Monday","tuesday","Wednesday");
	}
	
	

}

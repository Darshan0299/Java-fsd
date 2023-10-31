package com.app.junitDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.converter.ArgumentConversionException;

public class ToStringArgumentConverter {
	
	protected Object convert(Object source, Class<?> targetType) throws ArgumentConversionException {
		// TODO Auto-generated method stub
        Assertions.assertEquals(String.class, targetType, "Can only convert to String");
        return String.valueOf(source);

	}


}

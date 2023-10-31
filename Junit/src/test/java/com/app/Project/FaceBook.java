package com.app.Project;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
@DisplayName("Facebook Log In Page Test")
@ParameterizedTest(name = "Csv source {arguments}")
@CsvSource({"@darshanjsd@gmail.com, Darshan02$"})

public @interface FaceBook {

}

package com.app.Project;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
@DisplayName("Google Search Engine Test")
@ParameterizedTest(name = "Check Search {arguments}")
@ValueSource(strings={"Simplilearn"})

public @interface GoogleSearchPageTestAnnoation {

}

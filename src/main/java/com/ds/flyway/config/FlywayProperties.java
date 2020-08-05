package com.ds.flyway.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//@ConfigurationProperties(prefix = "spring.flyway")
public class FlywayProperties {

    private boolean enable = true;

    private boolean checkLocation = true;

    private List<String> locations = new ArrayList<>(Collections.singleton("classpath:db/migration"));
}

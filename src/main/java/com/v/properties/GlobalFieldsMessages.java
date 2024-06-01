package com.v.properties;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@ConfigurationProperties(prefix = "app")
@EnableConfigurationProperties
public class GlobalFieldsMessages {

	private Map<String, String> fieldsConstants = new HashMap<>();

	public Map<String, String> getFieldsConstants() {
		return fieldsConstants;
	}

	public void setFieldsConstants(Map<String, String> fieldsConstants) {
		this.fieldsConstants = fieldsConstants;
	}	
}

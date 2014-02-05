package com.tengen;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class HelloWorldFreeMarkerStyle {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.setClassForTemplateLoading(HelloWorldFreeMarkerStyle.class, "/");

		try {
			
			Template helloTemplate = configuration.getTemplate("hello.ftl");
			StringWriter writer = new StringWriter();
			Map<String, Object> helloMap = new HashMap<String, Object>();
			helloMap.put("name", "FreeMaker");
			
			helloTemplate.process(helloMap, writer);
			
			System.out.println(writer);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
}

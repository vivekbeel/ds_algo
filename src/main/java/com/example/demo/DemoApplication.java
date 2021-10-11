package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) { 
		/*
		 * Properties props http://localhost:8080/api/v1/template/print?queryId=print&args=facility_id:af2eb940-471d-11ea-b7a5-dac6dc2e3f05-73,reportTemplateId:dischargeEMR,contentType:pdf,id:03722670-0a0c-11eb-8311-72155a0df24e-73,,primaryKeyIdentifier:03722670-0a0c-11eb-8311-72155a0df24e-73&filter=&session_id=eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlOTdiZTc4My0wYTEzLTExZWItYmI3MS02YWZiYWQ1N2ZjZmMtMjgiLCJpYXQiOjE2MDIyMzY2MjAsInN1YiI6ImFjY291bnRfdXNlciIsImlzcyI6ImthcmV4cGVydCIsImV4cCI6MzIwNDQ3NTA0MH0.Z2csxWMFetrhwr1geJ2O3l1A0oWzbIG21X5R-JVXaDM&dataUrl=https://karexpert.epc01.kxaction.com= System.getProperties();
		 * props. setProperty("javax.accessibility.assistive_technologies", "");
		 */
		DevTunnel.main(null);
		//System.setProperty("server.contextPath", "/myapp");
		//System.setProperty("server.servlet.context-path", "/myapp");
		//System.setProperty("server.port", "9999");
		SpringApplication.run(DemoApplication.class, args);
	}

}

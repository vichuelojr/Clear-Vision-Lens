package com.app.clearVisionLens;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ClearVisionLensApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClearVisionLensApplication.class, args);
	}

}

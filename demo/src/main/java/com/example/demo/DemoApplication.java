package com.example.demo;

import com.example.demo.service.CsvReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private CsvReader csvReader;

	String csvFilePath = "C:\\csv\\input.csv";

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		csvReader.readFromCsv(csvFilePath);
		csvReader.readFromCsv2(csvFilePath);
	}
}

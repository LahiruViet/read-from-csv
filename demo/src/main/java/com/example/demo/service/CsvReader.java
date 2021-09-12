package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.StringTokenizer;

@Service
public class CsvReader {

    public void readFromCsv(String csvFilePath) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFilePath));
            String line = "";

            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split(",");
                for (String value: values) {
                    System.out.println(value);
                }

            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public void readFromCsv2(String csvFilePath) {

        try (BufferedReader br = Files.newBufferedReader(Paths.get(csvFilePath))){

            String str = "";
            //reading file line by line
            while((str = br.readLine()) != null){

                StringTokenizer tokenizer = new StringTokenizer(str, ","); // for csv file data comm(,) is delimeter

                while (tokenizer.hasMoreElements()) {
                    System.out.println(tokenizer.nextElement());
                }
            }
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

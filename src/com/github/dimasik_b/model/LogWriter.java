package com.github.dimasik_b.model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class LogWriter {

    public void writePrizeInFile(Toy toy){
        try (FileWriter fileWriter = new FileWriter("raffles.txt", true);){
            fileWriter.write(toy.toString());
            fileWriter.write("\n");
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

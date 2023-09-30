import task1.FileGenerator;

import java.io.FileWriter;

import static task1.FileGenerator.*;

public class Main {
    public static void main(String[] args) {

        generateFile("in1", 1000, 1, 100000);
        generateFile("in2", 1000, 1, 100000);
        generateOutFile("in1.txt", "in2.txt");
    }
}
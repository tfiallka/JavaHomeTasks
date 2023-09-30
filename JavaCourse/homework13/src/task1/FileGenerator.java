package task1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public abstract class FileGenerator {


    private static int generateRandomIntData(int min, int max) {
         Random random = new Random();
        return random.nextInt(min, max);
    }
    public static void generateFile(String fileName, int size, int min, int max) {
        int i = 0;
        int number;
        try {
            try (FileWriter fileWriter = new FileWriter(fileName + ".txt")) {
                while (i < size) {
                    number = generateRandomIntData(min, max);
                    fileWriter.write(number + "\n");
                    i++;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void generateOutFile(String file1, String file2) {
        ArrayList<Integer> allNumbers = new ArrayList<>();
        int number;
        try {
            BufferedReader readerIn1 = new BufferedReader(new FileReader(file1));
            BufferedReader readerIn2 = new BufferedReader(new FileReader(file2));
            String s;
            while ((s = readerIn1.readLine()) != null) {
                allNumbers.add(Integer.parseInt(s));
            }
            while ((s = readerIn2.readLine()) != null) {
                allNumbers.add(Integer.parseInt(s));
            }
            Collections.sort(allNumbers);
            System.out.println(allNumbers);

            try (FileWriter outFileWriter = new FileWriter("out.txt")) {
                int i = 0;
                while (i < allNumbers.size()) {
                    number = allNumbers.get(i);
                    outFileWriter.write(number + "\n");
                    i++;
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void findAvgInFile(String file) {
        ArrayList<Integer> allNumbers = new ArrayList<>();
        int number;
        try {
            BufferedReader readerIn1 = new BufferedReader(new FileReader(file));
            String s;
            while ((s = readerIn1.readLine()) != null) {
                allNumbers.add(Integer.parseInt(s));
            }

            System.out.println(allNumbers);
            double avg = 0;
            int sum = 0;

                for (int i = 0; i < allNumbers.size(); i++) {
                    sum += allNumbers.get(i);
                    avg = (double) sum / (i +1);
                }
            System.out.println(avg);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
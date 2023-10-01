public class Main {
    public static void main(String[] args) {

        FileGenerator.generateFile("in1.txt", 1000, 1, 100000);
        FileGenerator.generateFile("in2.txt", 1000, 1, 100000);
        FileGenerator.generateOutFile("in1.txt", "in2.txt", "out.txt");
        FileGenerator.generateFile("avgFile.txt", 30, 1, 100);
        FileGenerator.findAvgInFile("avgFile.txt");
    }
}
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        //Англиcче алфавитти жана сандарды файлга жазыныз
        //A a
        //B b
        //C c
        //...
        //...
        //Z z
        //0
        //1
        //2
        //...
        //9
        //
        //Кайра эле ошол файлдан анын ичиндеги маалыматты окуп консольго чыгарышыныз керек
        //1: A a
        //2: B b
        //...
        //...
        //26: Z z
        //27: 0
        //28: 1
        //...
        //...
        //36: 9

        writerLetters();
        readerLetters();
    }

    private static void readerLetters() throws IOException {
        FileReader fileReader = new FileReader("EnglishLetters.txt");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
        }
        fileReader.close();
    }

//    private static void writerLetters() throws IOException {
//        FileWriter fileWriter = new FileWriter("EnglishLetters.txt");
//        fileWriter.write("A a");
//        fileWriter.write("B b");
//        fileWriter.write("C c");
//        fileWriter.write("D d");
//        fileWriter.write("E e");
//        fileWriter.write("F f");
//        fileWriter.write("G g");
//        fileWriter.write("H h");
//        fileWriter.write("I i");
//        fileWriter.write("J j");
//        fileWriter.write("K k");
//        fileWriter.write("L l");
//        fileWriter.write("M m");
//        fileWriter.write("N n");
//        fileWriter.write("O o");
//        fileWriter.write("P p");
//        fileWriter.write("Q q");
//        fileWriter.write("R r");
//        fileWriter.write("S s");
//        fileWriter.write("T t");
//        fileWriter.write("U u");
//        fileWriter.write("V v");
//        fileWriter.write("W w");
//        fileWriter.write("X x");
//        fileWriter.write("Y y");
//        fileWriter.write("Z z");
//        fileWriter.write("0");
//        fileWriter.write("1");
//        fileWriter.write("2");
//        fileWriter.write("3");
//        fileWriter.write("4");
//        fileWriter.write("5");
//        fileWriter.write("6");
//        fileWriter.write("7");
//        fileWriter.write("8");
//        fileWriter.write("9");
//        fileWriter.close();
//    }

    private static void writerLetters() throws IOException {
        FileWriter fileWriter = new FileWriter("EnglishLetters.txt");
        for (String s : Arrays.asList("A a", "B b", "C c", "D d", "E e", "F f", "G g", "H h", "I i", "J j", "K k", "L l", "M m", "N n", "O o", "P p", "Q q", "R r", "S s", "T t", "U u", "V v", "W w", "X x", "Y y", "Z z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9")) {
            fileWriter.write(s+"\n");
        }
        fileWriter.close();
    }
}
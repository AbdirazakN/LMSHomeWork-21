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
//        writerLetters2();
        readerLetters();
    }

    private static void readerLetters() throws IOException {
        FileReader fileReader = new FileReader("EnglishLetters.txt");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        fileReader.close();
    }

    private static void writerLetters() throws IOException {
        FileWriter fileWriter = new FileWriter("EnglishLetters.txt");
        fileWriter.write("A a\n");
        fileWriter.write("B b\n");
        fileWriter.write("C c\n");
        fileWriter.write("D d\n");
        fileWriter.write("E e\n");
        fileWriter.write("F f\n");
        fileWriter.write("G g\n");
        fileWriter.write("H h\n");
        fileWriter.write("I i\n");
        fileWriter.write("J j\n");
        fileWriter.write("K k\n");
        fileWriter.write("L l\n");
        fileWriter.write("M m\n");
        fileWriter.write("N n\n");
        fileWriter.write("O o\n");
        fileWriter.write("P p\n");
        fileWriter.write("Q q\n");
        fileWriter.write("R r\n");
        fileWriter.write("S s\n");
        fileWriter.write("T t\n");
        fileWriter.write("U u\n");
        fileWriter.write("V v\n");
        fileWriter.write("W w\n");
        fileWriter.write("X x\n");
        fileWriter.write("Y y\n");
        fileWriter.write("Z z\n");
        fileWriter.write("0\n");
        fileWriter.write("1\n");
        fileWriter.write("2\n");
        fileWriter.write("3\n");
        fileWriter.write("4\n");
        fileWriter.write("5\n");
        fileWriter.write("6\n");
        fileWriter.write("7\n");
        fileWriter.write("8\n");
        fileWriter.write("9\n");
        fileWriter.close();
    }

//    private static void writerLetters2() throws IOException {
//        FileWriter fileWriter = new FileWriter("EnglishLetters.txt");
//        for (String s : Arrays.asList("A a", "B b", "C c", "D d", "E e", "F f", "G g", "H h", "I i", "J j", "K k", "L l", "M m", "N n", "O o", "P p", "Q q", "R r", "S s", "T t", "U u", "V v", "W w", "X x", "Y y", "Z z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9")) {
//            fileWriter.write(s + "\n");
//        }
//        fileWriter.close();
//    }
}
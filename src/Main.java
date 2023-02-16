import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> name1 = new ArrayList<>();
        ArrayList<String> name2 = new ArrayList<>();
        ArrayList<String> name3 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 разных имён");
        for (int i = 0; i < 5; i++) {
            name1.add(scanner.next());
        }
        System.out.println("список 1 " + name1);
        System.out.println("введите 5 новых имён");
        for (int i = 0; i < 5; i++) {
            name2.add(scanner.next());
        }
        System.out.println("Список B " + name2 );
        for (int i = 0; i < 5; i++) {
            name2.add(name1.get(i));
            name3.add(name2.get(i));
        }
        System.out.println("список 3 " + name3);
        Collections.sort(name3, Comparator.comparing(String :: length));
        System.out.println(" сортировка по длине строк " + name3);
    }
}

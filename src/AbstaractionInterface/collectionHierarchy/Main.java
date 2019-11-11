package AbstaractionInterface.collectionHierarchy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AddCollection addCollection = new AddCollection();
        AddRemovable addremoveColletion = new AddRemoveCollection();
        MyListImpl myList = new MyListImpl();

        String[] strings = input.nextLine().split(" ");
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        for (String i : strings) {
            sb1.append(addCollection.add(i)).append(" ");
            sb2.append(addremoveColletion.add(i)).append(" ");
            sb3.append(myList.add(i)).append(" ");
        }
        System.out.println(sb1.toString());
        System.out.println(sb2.toString());
        System.out.println(sb3.toString());
        int size = Integer.parseInt(input.nextLine());
        for (int i = 0; i < size; i++) {
            System.out.print(addremoveColletion.remove() + " ");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(myList.remove() + " ");
        }
    }
}

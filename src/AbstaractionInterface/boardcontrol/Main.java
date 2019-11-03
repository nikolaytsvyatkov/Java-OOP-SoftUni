package AbstaractionInterface.boardcontrol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] strings =  input.nextLine().split(" ");
        List<Identifiable> list = new ArrayList<>();
        while (!strings[0].equals("End")) {
            switch (strings.length) {
                case 2:
                    Identifiable robot = new Robot(strings[1], strings[0]);
                    list.add(robot);
                    break;
                case 3:
                    Identifiable person = new Citizen(strings[0],Integer.parseInt(strings[1]), strings[2]);
                    list.add(person);
                    break;
            }
            strings = input.nextLine().split(" ");
        }
        String lastDigit = input.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().endsWith(lastDigit)) {
                System.out.println(list.get(i).getId());
            }
        }
    }
}

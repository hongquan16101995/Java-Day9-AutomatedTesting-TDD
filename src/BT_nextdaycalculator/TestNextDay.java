package BT_nextdaycalculator;

import java.util.Scanner;

public class TestNextDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day: ");
        int day = sc.nextInt();
        System.out.println("Enter month: ");
        int month = sc.nextInt();
        System.out.println("Enter year: ");
        int year = sc.nextInt();

        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        if(nextDayCalculator.checkYear(year)) {
            nextDayCalculator.display(day, month, year);
        }else
            nextDayCalculator.display1(day, month, year);
    }
}

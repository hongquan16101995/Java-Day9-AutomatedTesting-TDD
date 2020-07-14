package BT_fizzbuzz;

import java.util.Scanner;

public class TestFizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        int num1 = num%10;
        int num2 = (num-num1)/10;

        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.getNum(num1);
        fizzBuzz.getNum2(num2);

        if(num%15 == 0){
            System.out.println("FizzBuzz");
        }else if(num%5 == 0){
            System.out.println("Buzz");
        }else if(num%3 == 0){
            System.out.println("Fizz");
        }else if(num >=1 && num <=20) {
            System.out.println(fizzBuzz.getA());
        }else if(num == 100){
            System.out.println("One hundred");
        }else
            System.out.println(fizzBuzz.getB() + " - " + fizzBuzz.getA());
    }
}

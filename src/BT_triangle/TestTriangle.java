package BT_triangle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter edge A : ");
        int edgeA = sc.nextInt();
        System.out.println("Enter edge B : ");
        int edgeB = sc.nextInt();
        System.out.println("Enter edge C : ");
        int edgeC = sc.nextInt();

        Triangle triangle = new Triangle();
        if(triangle.compareTriangle(edgeA, edgeB, edgeC) == 0){
            System.out.println("Not a triangle!");
        }else if(triangle.compareTriangle(edgeA, edgeB, edgeC) == 1){
            System.out.println("A normal triangle");
        }else if(triangle.compareTriangle(edgeA, edgeB, edgeC) == 2){
            System.out.println("A isosceles triangle");
        }else
            System.out.println("A equilateral triangle");
    }
}

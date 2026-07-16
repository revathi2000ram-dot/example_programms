package com.loops;

import java.util.Scanner;

public class perfect {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == n)
            System.out.println(n + " is a Perfect Number");
        else
            System.out.println(n + " is Not a Perfect Number");

        sc.close();
    }
}




























/*package com.loops;

import java.util.Scanner;

public class HarshadNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;
        int sum = 0;

        while (temp > 0) {
            sum = sum + (temp % 10);
            temp = temp / 10;
        }

        if (n % sum == 0) {
            System.out.println(n + " is a Harshad Number");
        } else {
            System.out.println(n + " is Not a Harshad Number");
        }

        sc.close();
    }
}
*/
































/*package com.loops;

import java.util.Scanner;

public class ugly {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;

        while (temp % 2 == 0) {
            temp = temp / 2;
        }

        while (temp % 3 == 0) {
            temp = temp / 3;
        }

        while (temp % 5 == 0) {
            temp = temp / 5;
        }

        if (temp == 1) {
            System.out.println(n + " is an Ugly Number");
        } else {
            System.out.println(n + " is Not an Ugly Number");
        }

        sc.close();
    }
}
*/
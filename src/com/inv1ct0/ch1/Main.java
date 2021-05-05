package com.inv1ct0.ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        salaryOfDeveloper(reader);
        closeToFive(10, 3);
        multi("pro", 3);
        rectangle(3, 4);
        square(10);
        initializeArray();
        triangle();
        devArray(reader);

        System.out.println("Сумма введенных чисел: " + sumIf());

        Robot robot1 = new Robot("bob", 15, 60);
        Robot robot2 = new Robot("sam", 20, 45);
        System.out.println(robot1.fight(robot2));

        Woman woman1 = new Woman("Alice", 30);
        Man man1 = new Man("Bob", 25, woman1);
        woman1.setHusband(man1);
        Cat cat1 = new Cat("Barsik", 10, woman1);
        Dog dog1 = new Dog("Jack", 8, woman1);
        System.out.println(cat1.getOwner().getName());
        System.out.println(dog1.getOwner().getName());
        System.out.println("Husband of "+ woman1.getName() + " is " + woman1.getHusband().getName());
        System.out.println("Wife of "+ man1.getName() + " is " + man1.getWife().getName());

        int[] arr = new int[3];

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Введите " + i + " значение массива (число): ");
            arr[i] = Integer.parseInt(reader.readLine());
        }
        for(int value : arr) {
            System.out.print("[" + value + "] ");
        }
        int res = 0;
        for (int value : arr) {
            res += value;
        }
        System.out.println("Сумма элементов массива: " + res);

        System.out.println("Минимальное значение из массива: " + min(arr));
        System.out.println("Максимальное значение из массива: " + max(arr));

        String[] strArr = new String[5];
    	int[] numArr = new int[5];

	    for(int k = 0; k < strArr.length; k++) {
            System.out.print("Введите " + k + " значение массива (строка): ");
		    strArr[k] = reader.readLine();
	    }

	    for(int m = 0;m < numArr.length;m++) {
		    numArr[m] = strArr[m].length();
		    System.out.println("[" + numArr[m] + "] ");
	    }

        Human grandfather1 = new Human("John", true, 81);
        Human grandmother1 = new Human("Marta", false, 74);
        Human grandfather2 = new Human("James", true, 83);
        Human grandmother2 = new Human("Margaret", false, 79);

        Human father = new Human("Karl", true, 44, grandfather1, grandmother1);
        Human mother = new Human("Alice", false, 38, grandfather2, grandmother2);

        Human child1 = new Human("bob", true, 10, father, mother);
        Human child2 = new Human("kate", false, 15, father, mother);

        System.out.println(father.getFather().getName());
    }

    private static void triangle() {
        for(int i = 0; i < 10; i++) {
            for(int j = i; j > 0; j--) {
                System.out.print("8");
            }
            System.out.println();
        }
    }

    private static int min(int[] arr) {
        int min = arr[0];
        for(int i = 1; i< arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    private static void salaryOfDeveloper(BufferedReader reader) throws IOException {
        System.out.println("Введите имя, зарплату, количество месяцев:");
        String name = reader.readLine();
        int cash = Integer.parseInt(reader.readLine());
        int years = Integer.parseInt(reader.readLine());
        talk(name, cash, years);
    }

    private static void devArray(BufferedReader reader) throws IOException {
        int[] fullNumArr = new int[10];

        System.out.println("Введите массив из 10 элементов(числа): ");
        for(int k = 0; k < fullNumArr.length; k++) {
            fullNumArr[k] = Integer.parseInt(reader.readLine());
        }

        int[] firstHalfOfArr = Arrays.copyOf(fullNumArr, 5);
        int[] secondHalfOfArr = Arrays.copyOfRange(fullNumArr, 5, 10);
        for (int a:firstHalfOfArr) {
            System.out.print("[" + a + "] ");
        }
        System.out.println();
        for (int b:secondHalfOfArr) {
            System.out.print("[" + b + "] ");
        }
    }

    public static int max(int[] array) {
	    int max = array[0];
	    for(int i = 1; i < array.length; i++) {
		    if(array[i] > max) {
			    max = array[i];
		    }
	    }
	    return max;
    }

    public static void initializeArray() throws IOException {
	    String[] arr = new String[5];
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	    for(int i = 0; i < arr.length-2; i++) {
            System.out.println("Введите " + i + " значение массива (строка): ");
		    arr[i] = reader.readLine();
	    }
	    printArray(arr);
    }

    public static void printArray(String[] arr) {
	    for(int i=arr.length-1; i>=0; i--) {
		    System.out.print("[" + arr[i] + "] ");
	    }
    }

    private static void talk(String name, int a, int b) {
        System.out.println(name + " будет зарабатывать $" + a + " в час через " + b + " месяцев");
    }

    private static void closeToFive(int a, int b) {
        if(Math.abs(a - 5) < Math.abs(b - 5)) {
            System.out.println("Ближайшее к 5: " + a);
        } else {
            System.out.println("Ближайшее к 5: " + b);
        }
    }

    private static void multi(String a, int b) {
        System.out.println("Строка " + a + " выведена на экран " + b + " раз:");
        for(int i = 0; i < b; i++) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    private static void rectangle(int a, int b) {
        System.out.println("Квадрат m на n:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }

    private static void square(int p) {
        System.out.println("Квадрат размером " + p + " на " + p);
        int b = 0;
        while (b < p) {
            int a = 0;
            while (a < p) {
                System.out.print("P ");
                a++;
            }
            System.out.println();
            b++;
        }
    }

    private static int sumIf() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;
        System.out.print("Введите число (-1 для окончания ввода): ");
        String str = reader.readLine();
        while (!str.equals("-1")) {
            System.out.print("Введите число (-1 для окончания ввода): ");
            result = result + Integer.parseInt(str);
            str = reader.readLine();
        }
        return result;
    }
}

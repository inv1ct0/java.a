package com.inv1ct0.ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[]{1, 1, 31, 3, 4, 5, 7, 5, 6, 2, 4, 7, 6};
//        System.out.println(findUniqueNumber(arr));
//        System.out.println(maxNum(arr));
//        System.out.println(minNum(arr));
//        initList(reader);
        initListUnlim(reader);
    }

    public static int findUniqueNumber(int[] arr) {
        int count = 0;
        int temp;
        for (int j : arr) {
            for (int k : arr) {
                if (j == k) {
                    count++;
                }
            }
            if(count == 1) {
                return j;
            }
            count = 0;
        }
        return -1;
    }

    public static int maxNum(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int minNum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void initList(BufferedReader reader) throws IOException {
        int CAPACITY = 5;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < CAPACITY; i++) {
            list.add(Integer.valueOf(reader.readLine()));
        }
        for (int a : list) {
            System.out.print(a + " ");
        }
    }

    public static void initListUnlim(BufferedReader reader) throws IOException {
        List<Integer> list = new ArrayList<>();
        while(true){
            String s = reader.readLine();
            if(!(s.equals(""))) {
                list.add(Integer.valueOf(s));
            } else {
                break;
            }
        }
        for (int a : list) {
            System.out.print(a + " ");
        }
        System.out.println();
        deleteAllFives(list);
    }

    public static void evenNotEven(BufferedReader reader) {
    }

    public static void deleteAllFives(List<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i) > 5) {
                arrayList.remove(i);
                System.out.println("удален элемент с индексом " + i);
            }
        }
        for (Integer a : arrayList) {
            System.out.println(a + " ");
        }
    }
}

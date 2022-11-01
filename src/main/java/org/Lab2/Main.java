package org.Lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        PowerSet powerSet = new PowerSet();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of the set: ");
        int n= input.nextInt();
        ArrayList<String> set=new ArrayList<>();
        System.out.println("Enter "+n+" strings: ");
        for (int i=0;i<n;i++){
            set.add(input.next());
        }
        first:
        do {
            System.out.println("for the recursive approach enter 1");
            System.out.println("for the iterative approach enter 2");
            System.out.println("for exit enter 0");
            int choice = input.nextInt();
            powerSet.setSet(set);
            switch (choice) {
                case 1:
                    powerSet.generateSubsetsRecursive(0);
                    powerSet.sortSubSets();
                    System.out.println(powerSet.getSubSets());
                    powerSet.getSubSets().clear();
                    break;
                case 2:
                    powerSet.generateSubsetsIterative();
                    powerSet.sortSubSets();
                    System.out.println(powerSet.getSubSets());
                    powerSet.getSubSets().clear();
                    break;
                case 0:
                    break first;
            }
        }while (true);
    }
}
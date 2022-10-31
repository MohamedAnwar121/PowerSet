package org.Lab2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PowerSet powerSet = new PowerSet();
        ArrayList<String> set = new ArrayList<>(Arrays.asList("12","13","14"));
        powerSet.setSet(set);
        powerSet.generateSubsetsRecursive(0);
        powerSet.sortSubSets();
        System.out.println(powerSet.getSubSets());

        powerSet.getSubSets().clear();

        powerSet.generateSubsetsIterative();
        powerSet.sortSubSets();
        System.out.println(powerSet.getSubSets());
        //System.out.println(powerSet.getSubSets());
    }
}
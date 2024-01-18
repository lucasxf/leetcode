package com.lucasxf.stacks_and_queues.stacks;

import java.sql.SQLOutput;

/**
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
 * <p>
 * For example, given s = "ab#c" and t = "ad#c", return true. Because of the backspace, the strings are both equal to "ac".
 */
public class BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {
        final StringBuilder resultS = new StringBuilder();
        final StringBuilder resultT = new StringBuilder();
        System.out.println("Input S: " + s);
        for (char c : s.toCharArray()) {
            System.out.println("S: " + resultS);
            if (c == '#' && resultS.length() > 0) {
                resultS.deleteCharAt(resultS.length() - 1);
            } else if (c != '#') {
                resultS.append(c);
            }
        }
        System.out.println("Res S: " + resultS);
        System.out.println("Input T: " + t);
        for (char c : t.toCharArray()) {
            System.out.println("T str: " + resultT);
            if (c == '#' && resultT.length() > 0) {
                resultT.deleteCharAt(resultT.length() - 1);
            } else if (c != '#') {
                resultT.append(c);
            }
            System.out.println("T end: " + resultT);
        }
        System.out.println("Res T: " + resultT);
        return resultS.toString().contentEquals(resultT);
    }

}

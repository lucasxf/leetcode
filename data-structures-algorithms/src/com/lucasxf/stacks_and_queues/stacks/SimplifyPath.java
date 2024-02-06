package com.lucasxf.stacks_and_queues.stacks;

import java.util.Collections;
import java.util.Stack;

/**
 * Given a string path, which is an absolute path (starting with a slash '/') to a file or directory
 * in a Unix-style file system, convert it to the simplified canonical path.
 * <p>
 * In a Unix-style file system, a period '.' refers to the current directory, a double period '..' refers to
 * the directory up a level, and any multiple consecutive slashes (i.e. '//') are treated as a single slash '/'.
 * For this problem, any other format of periods such as '...' are treated as file/directory names.
 * <p>
 * The canonical path should have the following format:
 * <p>
 * The path starts with a single slash '/'.
 * Any two directories are separated by a single slash '/'.
 * The path does not end with a trailing '/'.
 * The path only contains the directories on the path from the root directory to the target file or directory (i.e., no period '.' or double period '..')
 * Return the simplified canonical path.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: path = "/home/"
 * Output: "/home"
 * Explanation: Note that there is no trailing slash after the last directory name.
 * <p>
 * Example 2:
 * <p>
 * Input: path = "/../"
 * Output: "/"
 * Explanation: Going one level up from the root directory is a no-op, as the root level is the highest level you can go.
 * <p>
 * Input: path = "/home//foo/"
 * Output: "/home/foo"
 * Explanation: In the canonical path, multiple consecutive slashes are replaced by a single one.
 */
public class SimplifyPath {

    public String simplifyPath(String path) {
        System.out.println("Path: " + path);
        Stack<Character> stack = new Stack<>();
        int bracketCount = 1;
        for (char c : path.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
            }
            if (c == '/') {
                bracketCount++;
                stack.push(c);
            }
            while (bracketCount > 1) {

            }
            if (c == '/') {
                bracketCount++;
                stack.push(c);
            } else if (c == '.') {
                while (stack.size() > 1 && bracketCount < 2) {
                    if (stack.pop() == '/') {
                        bracketCount++;
                    }
                }
            } else {
                stack.push(c);
            }
        }
        if (stack.size() > 1 && stack.peek() == '/') {
            stack.pop();
        }

        return String.valueOf(stack);
    }

}

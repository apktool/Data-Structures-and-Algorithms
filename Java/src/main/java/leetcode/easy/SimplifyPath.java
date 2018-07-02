package leetcode.easy;

import java.util.*;

/**
 * @author apktool
 * @date 2018-07-02 21:44
 * *
 * Given an absolute path for a file (Unix-style), simplify it.
 *
 * For example,
 * path = "/home/", => "/home"
 * path = "/a/./b/../../c/", => "/c"
 *
 * Corner Cases:
 *
 * Did you consider the case where path = "/../"?
 * In this case, you should return "/".
 * Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".
 * In this case, you should ignore redundant slashes and return "/home/foo".
 */
public class SimplifyPath {
    public String simplifyPath(String path) {
        Deque<String> stack = new LinkedList<String>();
        Set<String> skip = new HashSet<String>(Arrays.asList("..", ".", ""));
        for (String dir : path.split("/")) {
            if (dir.equals("..") && !stack.isEmpty()) {
                stack.pop();
            } else if (!skip.contains(dir)) {
                stack.push(dir);
            }
        }

        String res = "";

        while (!stack.isEmpty()) {
            res = "/" + stack.pop() + res;
        }

        return res.isEmpty() ? "/" : res;
    }

    public static void main(String[] args) {
        String path = "/a/./b/../../c/";
        String result;

        SimplifyPath haha = new SimplifyPath();
        result = haha.simplifyPath(path);
        System.out.println(result);
    }
}

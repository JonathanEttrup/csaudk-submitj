// Version: 2017091401
import java.io.*;
import java.util.*;
public class Closest {
    public int computeClosest(ArrayList<Integer> input) {
        // Implement your code here to return the shortest distance between two numbers!
        return Math.abs(input.get(1) - input.get(0));
    }

    public static void testAll() {
        clearTerminal();
        testSinglePair();
        testSinglePairInv();
        test1();
        test2();
    }

    public static void testSinglePair() {
        int[] input = { 3, 5 };
        int correctAnswer = 2;

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i : input) list.add(i);

        int output = new Closest().computeClosest(list);

        if (output != correctAnswer)
            outputFail("testSinglePair",
                       "Expected output " + correctAnswer +
                       " but got " + output);
        else
            outputPass("testSinglePair");
    }

    public static void testSinglePairInv() {
        int[] input = { 7, 4 };
        int correctAnswer = 3;

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i : input) list.add(i);

        int output = new Closest().computeClosest(list);

        if (output != correctAnswer)
            outputFail("testSinglePairInv",
                       "Expected output " + correctAnswer +
                       " but got " + output);
        else
            outputPass("testSinglePairInv");
    }

    public static void test1() {
        int[] input = { 95, 66, 82, 63, 78, 37, 100, 96, 98, 17, 13, 7, 28, 74, 73, 77, 41, 25, 53, 93 };
        int correctAnswer = 96 - 95;

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i : input) list.add(i);

        int output = new Closest().computeClosest(list);

        if (output != correctAnswer)
            outputFail("test1",
                       "Expected output " + correctAnswer +
                       " but got " + output);
        else
            outputPass("test1");
    }

    public static void test2() {
        int[] input = { 275, 938, 8, 77, 649, 803, 500, 823, 519, 711, 422, 227, 235, 655, 373 };
        int correctAnswer = 655 - 649;

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i : input) list.add(i);

        int output = new Closest().computeClosest(list);

        if (output != correctAnswer)
            outputFail("test2",
                       "Expected output " + correctAnswer +
                       " but got " + output);
        else
            outputPass("test2");
    }

    private static void clearTerminal() {
        System.out.print('\u000C');
    }

    private static void outputPass(String testName) {
        System.out.println("[Pass " + testName + "]");
    }

    private static void outputFail(String testName, String message) {
        System.out.println("[FAIL " + testName + "] " + message);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for (int t = 0; t < testcases; ++t) {
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < n; ++i) list.add(sc.nextInt());
            System.out.println(new Closest().computeClosest(list));
        }
    }
}

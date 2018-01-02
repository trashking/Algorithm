// Given a positive integer, return its corresponding column title as appear in an Excel sheet.
//
// For example:
//
//     1 -> A
//     2 -> B
//     3 -> C
//     ...
//     26 -> Z
//     27 -> AA
//     28 -> AB
//
// Credits:Special thanks to @ifanchu for adding this problem and creating all test cases.

package LeetCode_168;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        //System.out.println(convertToTitle(n));

        while (n-- > 0) {
            System.out.println(convertToTitle(n));
        }

    }

    private static String convertToTitle(int n) {
        String result = "";
        while (n != 0) {
            int tmp = (n - 1) % 26;
            result = (char)('A' + tmp) + result;
            System.out.println(tmp);
            n = (n - 1)/ 26;
        }

        return result;
    }
}

//Solutions:
//public class Solution {
//    public String convertToTitle(int n) {
//        String result = "";
//        int tmp = n;
//        while(tmp >26){
//            int digit = (tmp - 1) % 26;
//            result = (char)(digit + 65) + result;
//            tmp = (tmp - 1)/ 26;
//        }
//        //tmp <= 26
//        result = (char)(tmp + 64) + result;
//        return result;
//    }//converToTitle
//}
//
//public class Solution {
//    public String convertToTitle(int n) {
//        String result = "";
//        while (n != 0) {
//            int tmp = (n - 1) % 26;
//            result = (char)('A' + tmp) + result;
//            n = (n - 1)/ 26;
//        }
//        return result;
//    }
//}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(passwordBuilder());
    }

    public static String passwordBuilder() {
        String nums = "1234567890";
        String mini = "abcdefghijklmnopqrstuvwxyz";
        String max = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String symbols = "!@#$%¨&*()_+?/|-";
        String password = "";
        while (password.length() <= 15) {
            int num = (int) (Math.random() * nums.length() + 1);
            int numMini = (int) (Math.random() * mini.length() + 1);
            int numMax = (int) (Math.random() * max.length() + 1);
            int numSymbols = (int) (Math.random() * symbols.length() + 1);
            password += nums.charAt(num);
            password += mini.charAt(numMini);
            password += max.charAt(numMax);
            password += symbols.charAt(numSymbols);

        }
        return password;
    }
}
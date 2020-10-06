package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(recursion3(10, 5));
        System.out.println(recursion4(0, 0, 3, 15));
        System.out.println(recursion5(1567));
        System.out.println(recursion6(13, 2));
        System.out.println(recursion10(17, 71));
        System.out.println(recursion11());
    }

    public static String recursion3(int A, int B) {
        if (A > B) {
            return A + " " + recursion3(A - 1, B);
        } else {
            if (A == B) {
                return Integer.toString(A);
            }
            return A + " " + recursion3(A + 1, B);
        }
    }

    public static int recursion4(int len, int sum, int k, int s) {
        if (len == k) if (sum == s) {
            return 1;
        } else {
            return 0;
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        for (int i = c; i < 10; i++) {
            res += recursion4(len + 1, sum + i, k, s);
        }
        return res;
    }

    public static int recursion5(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + recursion5(n / 10);
        }
    }

    public static boolean recursion6(int n, int i) {
        // i- доп. параметр рекурсии(делитель n). При вызове должен равняться двум.
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % i == 0) {
            return false;
        } else if (i < n / 2) {
            return recursion6(n, i + 1);
        } else {
            return true;
        }
    }

    public static int recursion10(int n, int i) {
        return (n == 0) ? i : recursion10(n / 10, i * 10 + n % 10);
    }

    public static int recursion11() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n == 1) {
            int m = in.nextInt();
            // Базовый случай
            if (m == 1) {
                // Шаг рекурсии / рекурсивное условие
                return recursion11() + n + m;
            } else {
                int k = in.nextInt();
                // Базовый случай
                if (k == 1) {
                    // Шаг рекурсии / рекурсивное условие
                    return recursion11() + n + m + k;
                } else {
                    return n + m + k;
                }
            }
        } else {
            int m = in.nextInt();
            // Базовый случай
            if (m == 1) {
                // Шаг рекурсии / рекурсивное условие
                return recursion11() + n + m;
            } else {
                return n + m;
            }
        }
    }

    public static void recursion12() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n > 0) {
            // Шаг рекурсии / рекурсивное условие
            if (n % 2 == 1) {
                System.out.println(n);
                recursion12();
            } else {
                recursion12();
            }
        }
    }

    public static void recursion13() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n > 0) {
            int m = in.nextInt();
            System.out.println(n);
            // Базовый случай
            if (m > 0) {
                // Шаг рекурсии / рекурсивное условие
                recursion13();
            }
        }
    }
}
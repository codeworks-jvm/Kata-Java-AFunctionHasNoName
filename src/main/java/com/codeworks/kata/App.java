package com.codeworks.kata;

public class App
{
    public static String aFunctionAsNoName(String input) {
        int k = 0;
        int j = input.length();
        int m = 1;
        int i = 100;
        String l = "";
        String q = "";
        int h = 4 * j;
        int u = 0;
        int v = 0;
        int s = 0;
        int t = 0;
        boolean b = false;
        int g = h / 2;

        if (j <= k) {
            return "";
        }

        if (input.length() == m) {
            return input.substring(0, 1);
        }

        for (i = 1; i < h/2; i++) {
            q = "";
            u = Math.floorDiv(i, 2) - 1;
            v = Math.floorDiv(i, 2);

            if (i%2 == m) {
                q = String.valueOf(input.charAt(v));
                v += 1;
                s = q.length();
                t = l.length() + q.length();

                if (s > t - s){
                    l = q;
                }

            }

            b = false;
            while(u > -1 && v < g / 2 && !b) {
                if (input.charAt(u) == input.charAt(v)) {
                    q = input.charAt(u) + q + input.charAt(v);
                    u -= 1;
                    v += 1;
                    s = q.length();
                    t = l.length() + q.length();

                    if (s > t - s){
                        l = q;
                    }
                } else {
                    b = true;
                }
            }
        }

        return l;
    }
}

package org.example;

public class p {
    static int month(String mon) {
        if (mon.equals("Jan")) {
            return 1;
        } else if (mon.equals("Feb")) {
            return 2;
        } else if (mon.equals("Mar")) {
            return 3;
        } else if (mon.equals("Apr")) {
            return 4;
        } else if (mon.equals("Mai")) {
            return 5;
        } else if (mon.equals("Jun")) {
            return 6;
        } else if (mon.equals("Jul")) {
            return 7;
        } else if (mon.equals("Aug")) {
            return 8;
        } else if (mon.equals("Sep")) {
            return 9;
        } else if (mon.equals("Oct")) {
            return 10;
        } else if (mon.equals("Nov")) {
            return 11;
        } else if (mon.equals("Dec")) {
            return 12;
        }
        return 0;
    }

    public static void main(String[] args) {
        String str = "1st Mar 1974";
        String[] arr = str.split(" ");
        int mon = month(arr[1]);
        int date = datefun(arr[0]);
        int year=Integer.parseInt(arr[2]);
        System.out.println(year+"-0"+mon+"-0"+date);
    }

    private static int datefun(String s) {
        int i = 0;
        for (; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                break;
            }
        }
        String substring = s.substring(0, i );
        int n=Integer.parseInt(substring);
        return n;
    }
}

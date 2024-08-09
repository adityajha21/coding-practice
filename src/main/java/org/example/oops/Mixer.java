package org.example.oops;

import java.io.*;
class Mixer
{
    public static void main(String[] args) {
        int num = 126;
        try {
            System.out.println(intToStringTimeFormat(num));
        } catch (NumberFormatException e) {
            e.getMessage();
        }

    }
    public static int intToStringTimeFormat(int time)
    {
        String strTemp = new String();
        int minutes = time / 60;
        int seconds = time % 60;

        if (minutes < 10)
            strTemp = Integer.toString(minutes) + ":";
        else
            strTemp = Integer.toString(minutes) + ":";

        if (seconds < 10)
            strTemp = strTemp + Integer.toString(seconds);
        else
            strTemp = strTemp + Integer.toString(seconds);

        return Integer.parseInt(strTemp);
    }

}
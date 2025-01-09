package org.example.string;

public class CompareTwoVersion {
    public static void main(String[] args) {
        String version1 = "2.92";
        String version2 = "1.92.00.01";
        if(compareVersion(version1,version2))
            System.out.println("Version1 is latest");
        else System.out.println("Version2 is latest");

    }

    private static boolean compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int maxLength = Math.max(v1.length,v2.length);
        for (int i = 0; i < maxLength; i++) {
            int value1 = Integer.parseInt(v1[i]);
            int value2 = Integer.parseInt(v2[i]);
            if(value1 > value2) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
}

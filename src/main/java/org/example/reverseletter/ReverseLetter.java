package org.example.reverseletter;

public class ReverseLetter {


    public String reverse(String str) {

        if (str == null){
            return "";
        }

        //

        char[] chars = str.toCharArray();

        int left = 0;
        int right = chars.length - 1;


        while (left < right) {


            if (!Character.isLetter(chars[left])) {
                left++;
                continue;
            }
            if (!Character.isLetter(chars[right])) {
                right--;
                continue;
            }

            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;

            left++;
            right--;
        }

        return new String(chars);
    }



}



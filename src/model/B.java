package model;

import java.util.regex.Pattern;

class B {

    public static void main(String[] args) {
        String text = "0761821354";
        String regex = "07[01245678][0-9]{7}";
        
        boolean status = Pattern.compile("07[01245678][0-9]{7}").matcher(text).matches();
        System.out.println(status);
    }

}

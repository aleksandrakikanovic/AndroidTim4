package com.example.androidtim4.validation;

public class ContactValidation {
    public static boolean validationForFolder(String displayname, String firstname, String lastname, String email){
        boolean isValid;
        if(displayname.equals("") || firstname.equals("") || lastname.equals("") || email.equals("")){
            isValid = false;
        }else {
            isValid = true;
        }return isValid;
    }
}

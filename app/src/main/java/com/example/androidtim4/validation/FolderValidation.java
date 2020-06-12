package com.example.androidtim4.validation;

public class FolderValidation {

    public static boolean validationForFolder(String name){
        boolean isValid;
        if(name.equals("")){
            isValid = false;
        }else {
            isValid = true;
        }return isValid;
    }
}

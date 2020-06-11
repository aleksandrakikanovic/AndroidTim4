package com.example.androidtim4.validation;

import android.widget.Toast;
import com.example.androidtim4.CreateEmailActivity;

public class EmailValidation {

    public static boolean validationForEmail(String to, String subject, String content ){
        boolean isValid;
        if(to.equals("") || subject.equals("") || content.equals("")){
            isValid=false;
        }else{
            isValid=true;
        }return isValid;
    }
}

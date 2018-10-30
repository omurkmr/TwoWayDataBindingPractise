package omurkumru.com.dataBindingExample;

import android.databinding.BindingAdapter;
import android.widget.TextView;

public class PasswordStrengthAdapter {

    @BindingAdapter("passStrength")
    public static void setPassStrength(TextView view, String enteredPass){

        if (enteredPass.isEmpty()){
            view.setText("Empty Password");
        }else if (enteredPass.length()<4){
            view.setText("Weak");
        }else if (enteredPass.length()>4 && enteredPass.length()<8){
            view.setText("Moderate");
        }else if (enteredPass.length()>8){
            view.setText("Good");
        }

    }
}

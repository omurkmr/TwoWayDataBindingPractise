package omurkumru.com.dataBindingExample.models;


import android.databinding.BaseObservable;
import android.databinding.Bindable;

import omurkumru.com.dataBindingExample.BR;

public class UserModel extends BaseObservable {

    private String pass;

    public UserModel() {
    }

    @Bindable
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
        notifyPropertyChanged(BR.pass);
    }
}

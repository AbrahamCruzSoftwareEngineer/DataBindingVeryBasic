package com.example.simple_data_binding.Model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Albrtx on 29/11/2017.
 */
/*This BaseObservable implements Observable interface.
By extending from BaseObservable class it is easy to listen
for update when the value in the fields change.*/
public class User extends BaseObservable {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // In this example I need to listen for changes in email field.
    // So I add @Bindable annotation to the getter for email
    @Bindable
    public String getEmail() {
        return email;
    }

    // I call notifyPropertyChanged(BR.email). Where BR is auto
    // generated class and email is field name.
    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(com.example.simple_data_binding.BR.email);
    }
}

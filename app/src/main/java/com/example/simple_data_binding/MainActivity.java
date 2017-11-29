package com.example.simple_data_binding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.simple_data_binding.Model.User;
import com.example.simple_data_binding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();
      /*OJO: Here we create a ActivityMainBinding object which is auto generated according to
      the layout name. Since the layout name is activity_main it is ActivityMainBinding.*/
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //OJO: It is initialized as,
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        //Then we create a new User object and set name.
        User user = new User();
        user.setName("Abraham Cruz");
        //This model is then tied to the view using the binding.setUser() method. Similarly the Actvity using setActivity() method.
        binding.setUser(user);
        binding.setActivity(this);

    }

    public void onButtonClick(String email){
        //Since we are using two way binding for email field we can get the value using the getter binding.getUser().getEmail().
        Toast.makeText(this, "Email" +binding.getUser().getEmail(), Toast.LENGTH_LONG).show();
        Toast.makeText(this, "email" +email, Toast.LENGTH_LONG).show();
    }
}

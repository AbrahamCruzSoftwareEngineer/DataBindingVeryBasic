package com.example.simple_data_binding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.simple_data_binding.Model.User;
import com.example.simple_data_binding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        User user = new User();
        user.setName("Abraham Cruz");
        binding.setUser(user);
        binding.setActivity(this);

    }

    public void onButtonClick(String email){
        Toast.makeText(this, "Email" +binding.getUser().getEmail(), Toast.LENGTH_LONG).show();
        Toast.makeText(this, "email" +email, Toast.LENGTH_LONG).show();
    }
}

package com.example.techvanto1;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.techvanto1.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
            TextView simple_form1;
            EditText Firstname1;
            EditText FatherName1;
            EditText MotherName1;
            EditText dob1;
            EditText state1;
            EditText city1;
            EditText pin1;
            EditText contact1;
            EditText address1;
            Button save;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simple_form1=findViewById(R.id.simple_form);
        Firstname1=findViewById(R.id.Firstname);
        FatherName1=findViewById(R.id.FatherName);
        MotherName1=findViewById(R.id.MotherName);
        dob1=findViewById(R.id.dob);
        state1=findViewById(R.id.state);
        city1=findViewById(R.id.city);
        pin1=findViewById(R.id.pin);
        contact1=findViewById(R.id.contact);
        address1=findViewById(R.id.address);
        save=findViewById(R.id.save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userinput = Firstname1.getText().toString();
                Firstname1.setText(userinput);
                FatherName1.setText(userinput);
                MotherName1.setText(userinput);
                dob1.setText(userinput);
                state1.setText(userinput);
                city1.setText(userinput);
                pin1.setText(userinput);
                contact1.setText(userinput);
                address1.setText(userinput);

            }
        });

            }
        }





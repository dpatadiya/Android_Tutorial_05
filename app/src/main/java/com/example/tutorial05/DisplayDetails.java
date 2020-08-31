package com.example.tutorial05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayDetails extends AppCompatActivity
{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView edtFirstName=findViewById(R.id.txtFirstName);
        TextView edtLastName=findViewById(R.id.txtLastName);
        TextView edtemail=findViewById(R.id.txtemail);
        TextView edtPassword=findViewById(R.id.txtPassword);
        TextView edtGender=findViewById(R.id.txtGender);
        TextView edtCity=findViewById(R.id.txtCity);
        TextView edtBranch=findViewById(R.id.txtBranch);
        TextView edtStatus=findViewById(R.id.txtStatus);

        Intent intent =getIntent();

        edtFirstName.setText("First Name : "+intent.getStringExtra(MainActivity.Extra_FirstName));
        edtLastName.setText("Last Name : "+intent.getStringExtra(MainActivity.Extra_LastName));
        edtemail.setText("Username : "+intent.getStringExtra(MainActivity.Extra_email));
        edtPassword.setText("Password : "+intent.getStringExtra(MainActivity.Extra_password));
        edtGender.setText("Gender : "+intent.getStringExtra(MainActivity.Extra_Gender));
        edtCity.setText("City : "+intent.getStringExtra(MainActivity.Extra_City));
        edtBranch.setText("Branch : "+intent.getStringExtra(MainActivity.Extra_Branch));
        edtStatus.setText("Status : "+intent.getStringExtra(MainActivity.Extra_Status));

    }
}
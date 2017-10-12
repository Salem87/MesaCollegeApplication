package com.example.stu00001.mesacollegeapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    Button callButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        callButton = (Button)findViewById(R.id.call);
        callButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent callIntent = new Intent (Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("(619) 388-2600"));
                startActivity(callIntent);
            }

        });
    }

    public void mesacollegeapplication(View view){
        Intent mesacollegeapplication = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sdmesa.edu/"));
        startActivity(mesacollegeapplication);
    }

}

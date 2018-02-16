package com.example.didact.u4registrofinal;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnmasinfo;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnmasinfo(View view){
        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        dialogomasinfo dialogo = new dialogomasinfo();
        dialogo.show(fragmentManager, "btnmasinfo");
    }

    public void clicklistareserva (View view){
        Intent i=new Intent(getApplicationContext(),listareservaactivity.class);
        startActivity(i);

        
    }


}

package com.example.agnisai.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void numberActivity(View view)
    {
        Intent numberActivityIntent = new Intent(this,Numbers.class);
        startActivity(numberActivityIntent);
    }

    public void familyActivity(View view)
    {
        Intent familyActivityIntent = new Intent(this,Family.class);
        startActivity(familyActivityIntent);
    }

    public void pharsesActivity(View view)
    {
        Intent pharsesActivityIntent = new Intent(this,Pharses.class);
        startActivity(pharsesActivityIntent);
    }

    public void greetingsActivity(View view)
    {
        Intent greetingActivityIntent = new Intent(this, Colors.class);
        startActivity(greetingActivityIntent);
    }
}

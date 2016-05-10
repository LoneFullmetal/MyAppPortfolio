package com.treyjacobsen.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void clicker(View v) {
        Context context = getApplicationContext();
        Button btn = (Button)v;
        CharSequence text = "";
        if(btn == (Button)findViewById(R.id.btnPopularMovies)) {
            text = "This button will launch my popular movies app!";
        } else if (btn == (Button)findViewById(R.id.btnStockHawk)) {
            text = "This button will launch my stock hawk app!";
        } else if (btn == (Button)findViewById(R.id.btnBuildItBigger)) {
            text = "This button will launch my build it bigger app!";
        } else if (btn == (Button)findViewById(R.id.btnMakeYourAppMaterial)) {
            text = "This button will launch my make your app material app!";
        } else if (btn == (Button)findViewById(R.id.btnGoUbiquitous)) {
            text = "This button will launch my go ubiquitous app!";
        } else if (btn == (Button)findViewById(R.id.btnCapstone)) {
            text = "This button will launch my capstone app!";
        }
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}

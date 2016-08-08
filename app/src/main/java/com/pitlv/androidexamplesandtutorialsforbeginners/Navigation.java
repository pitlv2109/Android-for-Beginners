package com.pitlv.androidexamplesandtutorialsforbeginners;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Navigation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        multiActivity();
        tabs();
    }

    public void multiActivity()
    {
        Button open = (Button) findViewById(R.id.nav_multi);
        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Navigation.this, com.pitlv.androidexamplesandtutorialsforbeginners.Nav.MultiActivity.class);
                startActivity(intent);
            }
        });
    }

    public void tabs()
    {
        Button open = (Button) findViewById(R.id.nav_tab);
        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Please check back later!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

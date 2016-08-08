package com.pitlv.androidexamplesandtutorialsforbeginners;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user_input_controls();
        menus();
        user_input_events();
        navigation();
        layouts();
        misc();
    }

    public void user_input_controls()
    {
        Button user_input_controls = (Button) findViewById(R.id.main_user_input_controls);
        user_input_controls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UserInputControls.class);
                startActivity(intent);
            }
        });
    }

    public void menus()
    {
        Button menus = (Button) findViewById(R.id.main_menus);
        menus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Menu.class);
                startActivity(intent);
            }
        });
    }

    public void user_input_events()
    {
        Button menus = (Button) findViewById(R.id.main_user_input_events);
        menus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UserInputEvents.class);
                startActivity(intent);
            }
        });
    }

    public void navigation()
    {
        Button menus = (Button) findViewById(R.id.main_navigation);
        menus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Navigation.class);
                startActivity(intent);
            }
        });
    }

    public void layouts()
    {
        Button menus = (Button) findViewById(R.id.main_layouts);
        menus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Please check back later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void misc()
    {
        Button menus = (Button) findViewById(R.id.main_misc);
        menus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Please check back later!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

package com.pitlv.androidexamplesandtutorialsforbeginners;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menus);

        options_menu();
        popup_menu();
    }

    public void options_menu()
    {
        Button toggle_button = (Button) findViewById(R.id.menus_options);
        toggle_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, com.pitlv.androidexamplesandtutorialsforbeginners.Menus.OptionsMenuActivity.class);
                startActivity(intent);
            }
        });
    }

    public void popup_menu()
    {
        Button toggle_button = (Button) findViewById(R.id.menus_popup);
        toggle_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, com.pitlv.androidexamplesandtutorialsforbeginners.Menus.PopupMenuActivity.class);
                startActivity(intent);
            }
        });
    }
}

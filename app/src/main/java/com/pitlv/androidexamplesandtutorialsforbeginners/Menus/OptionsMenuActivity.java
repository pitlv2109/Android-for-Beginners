package com.pitlv.androidexamplesandtutorialsforbeginners.Menus;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.pitlv.androidexamplesandtutorialsforbeginners.R;

public class OptionsMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_menu);
        description();
        learn_more();
    }

    public void description()
    {
        TextView des = (TextView) findViewById(R.id.options_menu_des);
        des.append("What is overflow menu? Check out for yourself at the topper right corner.");
    }

    public void learn_more()
    {
        Button learnMore = (Button) findViewById(R.id.learn_more);
        learnMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("https://www.youtube.com/watch?v=SF3Hh31clqQ");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater red = getMenuInflater();
        red.inflate(R.menu.options_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        RelativeLayout option_menu_layout = (RelativeLayout) findViewById(R.id.options_menu_layout);

        switch (item.getItemId()) {
            case R.id.menu_red:
                option_menu_layout.setBackgroundColor(Color.RED);
                return true;

            case R.id.menu_green:
                option_menu_layout.setBackgroundColor(Color.GREEN);
                return true;

            case R.id.menu_yellow:
                option_menu_layout.setBackgroundColor(Color.YELLOW);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

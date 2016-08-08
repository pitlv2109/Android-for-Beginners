package com.pitlv.androidexamplesandtutorialsforbeginners.UIE;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.pitlv.androidexamplesandtutorialsforbeginners.R;

public class LongClickActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_long_click);
        description();
        long_press();
        learn_more();
    }

    public void description()
    {
        TextView des = (TextView) findViewById(R.id.long_click_des);
        des.append("There may be situation in which your app needs to " +
                "provide options to the user on long pressing a view. " +
                "For example as in the messenger app, when you long press a conversation " +
                "there will be a pop-up menu option to delete the conversation.");
    }

    public void long_press()
    {
        Button long_press = (Button) findViewById(R.id.long_press);
        long_press.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "You have pressed it long :)", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        long_press.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Not long enough :(",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void learn_more()
    {
        Button learnMore = (Button) findViewById(R.id.learn_more);
        learnMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("http://androidbite.blogspot.com/2013/03/android-long-press-event-handle-example.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }
}

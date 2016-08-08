package com.pitlv.androidexamplesandtutorialsforbeginners.Nav;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.pitlv.androidexamplesandtutorialsforbeginners.R;

public class MultiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi);
        description();
        openAnotherActivity();
        learn_more();
    }

    public void description()
    {
        TextView des = (TextView) findViewById(R.id.multi_des);
        des.append("Most of the time, an app has more than one screen (activity).");
    }

    public void openAnotherActivity()
    {
        Button open = (Button) findViewById(R.id.multi_another);
        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MultiActivity.this, com.pitlv.androidexamplesandtutorialsforbeginners.Nav.MultiActivity2.class);
                startActivity(intent);
            }
        });
    }
    public void learn_more()
    {
        Button learnMore = (Button) findViewById(R.id.learn_more);
        learnMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("kiory.com/blog/multiple-activities-on-android-app");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }
}

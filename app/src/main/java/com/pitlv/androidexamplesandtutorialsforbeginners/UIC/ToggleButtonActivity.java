package com.pitlv.androidexamplesandtutorialsforbeginners.UIC;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.pitlv.androidexamplesandtutorialsforbeginners.R;

public class ToggleButtonActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);
        description();
        testButton();
        learnMore();
    }

    public void description()
    {
        TextView des = (TextView) findViewById(R.id.toggle_text);

        des.append("Toggle button is a button which has only two states, for example," +
                " “on and “off”. It’s best alternative to radio buttons " +
                "to turn on or turn off a function.");
    }

    // Tests ToggleButton
    public void testButton()
    {
        Button testButton = (Button) findViewById(R.id.update_tb);
        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ToggleButton tb1 = (ToggleButton) findViewById(R.id.toggle_buttton_1);
                ToggleButton tb2 = (ToggleButton) findViewById(R.id.toggle_buttton_2);

                String tb1Text, tb2Text;
                tb1Text = tb1.getText().toString();
                tb2Text = tb2.getText().toString();

                Toast.makeText(ToggleButtonActivity.this, "Left ToggleButton: " + tb1Text + "\n" +
                        "Right ToggleButton: " + tb2Text, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void learnMore()
    {
        Button learnMore = (Button) findViewById(R.id.learn_more);
        learnMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("http://www.mkyong.com/android/android-togglebutton-example/");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }
}

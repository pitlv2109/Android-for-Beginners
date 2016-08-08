package com.pitlv.androidexamplesandtutorialsforbeginners.UIC;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.pitlv.androidexamplesandtutorialsforbeginners.R;

public class RadioButtonActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        radioGroup = (RadioGroup) findViewById(R.id.radio_group);
        description();
        learnMore();
    }

    public void description()
    {
        TextView des = (TextView) findViewById(R.id.radio_button_text);
        des.append("RadioButton is a two-states button that can be either checked or unchecked. " +
                "When the radio button is unchecked, the user can click it to check it. ");
    }

    public void onClear (View v)
    {
        radioGroup.clearCheck();
    }

    public void onSubmit (View v)
    {
        if (radioGroup.getCheckedRadioButtonId() != -1)
        {
            RadioButton rb = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
            Toast.makeText(RadioButtonActivity.this, rb.getText(), Toast.LENGTH_SHORT).show();
        }
        else
            Toast.makeText(RadioButtonActivity.this, "Nothing is selected.", Toast.LENGTH_SHORT).show();

    }

    public void learnMore()
    {
        Button learnMore = (Button) findViewById(R.id.learn_more);
        learnMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("http://javatechig.com/android/android-radio-button-example");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }
}

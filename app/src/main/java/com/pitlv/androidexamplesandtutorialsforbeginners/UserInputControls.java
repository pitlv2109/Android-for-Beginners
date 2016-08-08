package com.pitlv.androidexamplesandtutorialsforbeginners;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class UserInputControls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input_controls);

        toggle_button();
        radio_button();
        edit_text_button();
        auto_complete_button();
        spinner_button();
    }

    public void toggle_button()
    {
        Button toggle_button = (Button) findViewById(R.id.uic_toggle_button);
        toggle_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserInputControls.this, com.pitlv.androidexamplesandtutorialsforbeginners.UIC.ToggleButtonActivity.class);
                startActivity(intent);
            }
        });
    }

    public void radio_button()
    {
        Button radio_button = (Button) findViewById(R.id.uic_radio_button);
        radio_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserInputControls.this, com.pitlv.androidexamplesandtutorialsforbeginners.UIC.RadioButtonActivity.class);
                startActivity(intent);
            }
        });
    }

    public void edit_text_button()
    {
        Button edit_text_button = (Button) findViewById(R.id.uic_edit_text);
        edit_text_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserInputControls.this, com.pitlv.androidexamplesandtutorialsforbeginners.UIC.EditTextActivity.class);
                startActivity(intent);
            }
        });
    }

    public void auto_complete_button()
    {
        Button auto_complete_button = (Button) findViewById(R.id.uic_autocomplete);
        auto_complete_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserInputControls.this, com.pitlv.androidexamplesandtutorialsforbeginners.UIC.AutoCompleteActivity.class);
                startActivity(intent);
            }
        });
    }

    public void spinner_button()
    {
        Button auto_complete_button = (Button) findViewById(R.id.uic_spinner);
        auto_complete_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserInputControls.this, com.pitlv.androidexamplesandtutorialsforbeginners.UIC.SpinnerActivity.class);
                startActivity(intent);
            }
        });
    }
}

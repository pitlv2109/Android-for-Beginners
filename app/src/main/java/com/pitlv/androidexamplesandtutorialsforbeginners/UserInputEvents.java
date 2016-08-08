package com.pitlv.androidexamplesandtutorialsforbeginners;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class UserInputEvents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input_events);
        long_click();
        drag_and_drop();
        background();
        advanced_drag_and_drop();
    }

    public void long_click()
    {
        Button lc = (Button) findViewById(R.id.uie_long_click);
        lc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserInputEvents.this, com.pitlv.androidexamplesandtutorialsforbeginners.UIE.LongClickActivity.class);
                startActivity(intent);
            }
        });
    }

    public void drag_and_drop()
    {
        Button lc = (Button) findViewById(R.id.uie_drag_and_drop);
        lc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserInputEvents.this, com.pitlv.androidexamplesandtutorialsforbeginners.UIE.DragAndDropActivity.class);
                startActivity(intent);
            }
        });
    }

    public void background()
    {
        Button lc = (Button) findViewById(R.id.uie_background_image);
        lc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserInputEvents.this, com.pitlv.androidexamplesandtutorialsforbeginners.UIE.BackgroundActivity.class);
                startActivity(intent);
            }
        });
    }

    public void advanced_drag_and_drop()
    {
        Button lc = (Button) findViewById(R.id.uic_advanced_drag_and_drop);
        lc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserInputEvents.this, com.pitlv.androidexamplesandtutorialsforbeginners.UIE.AdvancedDragAndDropActivity.class);
                startActivity(intent);
            }
        });
    }
}

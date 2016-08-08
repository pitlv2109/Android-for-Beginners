package com.pitlv.androidexamplesandtutorialsforbeginners.UIC;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.pitlv.androidexamplesandtutorialsforbeginners.R;

public class EditTextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        description();
    }

    public void description()
    {
        TextView des = (TextView) findViewById(R.id.edit_view_text);
        des.append("A EditText is an overlay over TextView that configures itself to be editable. " +
                "It is the predefined subclass of TextView that includes rich editing capabilities.");
    }

    public void submit (View v)
    {
        EditText name = (EditText) findViewById(R.id.et_name);
        EditText number = (EditText) findViewById(R.id.et_number);

        Toast.makeText(EditTextActivity.this, "Hi " + name.getText().toString() + ". My favorite number is"
        + " 7.", Toast.LENGTH_SHORT).show();
    }

    public void learn_more()
    {
        Uri webpage = Uri.parse("http://www.tutorialspoint.com/android/android_edittext_control.htm");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}

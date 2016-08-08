package com.pitlv.androidexamplesandtutorialsforbeginners.UIC;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import com.pitlv.androidexamplesandtutorialsforbeginners.R;

public class AutoCompleteActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete);

        description();

        String str[]={"Arun","Mathev","Vishnu","Vishal","Arjun",
                "Arul","Balaji","Babu","Boopathy","Godwin","Nagaraj", "pitlv2109",
        "Liverpool", "LOL", "XCode", "Zoo", "Star", "Road", "Rich", "King", "Chaos",
        "Nano", "Map", "Fun", "Hello", "Ultimate"};

        AutoCompleteTextView t1 = (AutoCompleteTextView)
                findViewById(R.id.auto_complete_view);

        ArrayAdapter<String> adp = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,str);

        t1.setThreshold(1);
        t1.setAdapter(adp);
    }

    public void description()
    {
        TextView des = (TextView) findViewById(R.id.auto_complete_text);
        des.append("An editable text view that shows completion suggestions automatically while the user is typing. " +
                "The list of suggestions is displayed in a drop down menu from which the user can choose an item to " +
                "replace the content of the edit box with.");
    }

    public void learn_more (View v)
    {
        Uri webpage = Uri.parse("http://sampleprogramz.com/android/autocompletetextview.php");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}

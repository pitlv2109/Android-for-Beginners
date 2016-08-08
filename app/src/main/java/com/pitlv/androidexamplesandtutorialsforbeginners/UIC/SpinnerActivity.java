package com.pitlv.androidexamplesandtutorialsforbeginners.UIC;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.pitlv.androidexamplesandtutorialsforbeginners.R;

public class SpinnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        description();
        spinner();
    }

    public void description()
    {
        TextView des = (TextView) findViewById(R.id.spinner_text);
        des.append("Spinners provide a quick way to select one value from a set. " +
                "In the default state, a spinner shows its currently selected value. " +
                "Touching the spinner displays a dropdown menu with all other available values, " +
                "from which the user can select a new one.");
    }

    public void spinner()
    {
        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        final String[] mobileOS = {"Android", "iOS", "Symbian", "Windowns Phone", "BlackBerry OS"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, mobileOS);

        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                        int pos = spinner.getSelectedItemPosition();
                        Toast.makeText(getApplicationContext(), mobileOS[+pos] + " is love, " + mobileOS[+pos] + " is life :D", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );
    }

    public void learn_more()
    {
        Button learnMore = (Button) findViewById(R.id.learn_more);
        learnMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("http://www.learn2crack.com/2013/12/android-spinner-dropdown-example.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }
}

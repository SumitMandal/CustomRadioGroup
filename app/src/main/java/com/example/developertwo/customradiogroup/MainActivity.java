package com.example.developertwo.customradiogroup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup1);

        // Checked change Listener for RadioGroup 1
        radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioAndroid:
                        Toast.makeText(getApplicationContext(), "Android RadioButton checked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioiPhone:
                        Toast.makeText(getApplicationContext(), "iPhone RadioButton checked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioWindows:
                        Toast.makeText(getApplicationContext(), "windows RadioButton checked", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });
    }
}

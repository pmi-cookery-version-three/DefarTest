package com.example.new_3_27_febrar;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GRT extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grt);

        TextView textView = (TextView)findViewById(R.id.textView);
        TextView textView1 = (TextView)findViewById(R.id.textView2);

        Intent intent = getIntent();

        textView.setText(intent.getExtras().getString("first"));
        textView1.setText(intent.getExtras().getString("two"));
    }
}

package com.example.new_3_27_febrar;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button =(Button)findViewById(R.id.but);
        final EditText editFirst = (EditText)findViewById(R.id.editText);
        final EditText editTwo = (EditText)findViewById(R.id.editText2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String first = editFirst.getText().toString();
                String two = editTwo.getText().toString();
                Intent intent = new Intent(MainActivity.this,GRT.class);
                intent.putExtra("first",first);
                intent.putExtra("two",two);
                startActivity(intent);
            }
        });
    }
}

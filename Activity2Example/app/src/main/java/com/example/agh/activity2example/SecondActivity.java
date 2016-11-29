package com.example.agh.activity2example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        /* Uzyskujemy intencję, która wywołała tę aktywność */
        Intent intent = getIntent();

        /* Uzyskujemy dane za pomocą klucza */
        String val1 = intent.getStringExtra("1");
        String val2 = intent.getStringExtra("2");

        TextView textView=(TextView) findViewById(R.id.message);
        textView.setText(val1+"\n"+val2);
    }

    public void closeActivity(View view) {
        finish();
    }

}

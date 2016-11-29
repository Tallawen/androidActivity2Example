package com.example.agh.activity2example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openSecondActivity(View view) {
        /* Tworzymy obiekt intencji */
        Intent intent = new Intent(this, SecondActivity.class);

        /* Przekazujemy wiadomości */
        intent.putExtra("1", "wiadomość 1");
        intent.putExtra("2", "inna wiadomość");

        /* Uruchamiamy */
        startActivityForResult(intent, -1);
    }
}

package com.example.tickets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nameID;
    private EditText placeIn;
    private EditText timeIn;
    private EditText timeOut;
    private EditText costIn;
    private Button button;

    private String ID;
    private String timeSend;
    private String time;
    private String cost;
    private String place;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameID = findViewById(R.id.nameID);
        placeIn = findViewById(R.id.placeIn);
        timeIn = findViewById(R.id.timeIn);
        timeOut = findViewById(R.id.timeOut);
        costIn = findViewById(R.id.costIn);
        button = findViewById(R.id.button);

        button.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            ID = nameID.getText().toString();
            timeSend = timeIn.getText().toString();
            time = timeOut.getText().toString();
            cost = costIn.getText().toString();
            place = placeIn.getText().toString();

            User user = new User(ID, timeSend, time, cost, place);

            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

            intent.putExtra(User.class.getSimpleName(), user);

            startActivity(intent);
        }
    };
}
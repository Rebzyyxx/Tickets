package com.example.tickets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView dataMainActivity;
    private Button button;

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        dataMainActivity = findViewById(R.id.dataUser);
        button = findViewById(R.id.button);

        Bundle bundleIntent = getIntent().getExtras();

        if (bundleIntent != null) {

            user = (User) bundleIntent.getSerializable(User.class.getSimpleName());

            dataMainActivity.setText("ID " + user.getID() + "\n"
                    + "Время отправки "+ user.setTimeIn() + "\n"
                    + "Время прибытия "+ user.setTime() + "\n"
                    + "Стоимость "+ user.setCost() + "\n"
                    + "Место отправки "+ user.getPlace());
        }

        button.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    };
}
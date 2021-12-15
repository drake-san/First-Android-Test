package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SanDay();
    }

    private String[] days=new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "San Day"};
    private int dayIndex=new Random().nextInt(days.length);
    private String day=days[dayIndex];
    private Button button;

    public void SanDay()
    {
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!day.equals("San Day"))
                    Toast.makeText(MainActivity.this,"It will be "+day+" until you close me",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this,"Feel lucky!It's "+day+" for you",Toast.LENGTH_SHORT).show();
            }
        });
    }

}
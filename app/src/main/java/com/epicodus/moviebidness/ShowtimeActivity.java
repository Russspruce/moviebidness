package com.epicodus.moviebidness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ArrayAdapter;

public class ShowtimeActivity extends AppCompatActivity {
    private TextView mShowtimeInfo;
    private TextView mShowtimeTimes;
    private ListView mShowtimeListView;
//    private TextView mShowtimeView;
    private String[] showtimes = new String[] {"4:30", "7:00", "9:55"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showtime);

//        mShowtimeListView = (ListView) findViewById(R.id.showtimeListView);
        mShowtimeInfo = (TextView) findViewById(R.id.showtimeInfo);
        mShowtimeTimes = (TextView) findViewById(R.id.showtimeTimes);
//        mShowtimeView = (TextView) findViewById(R.id.showTimeView);

//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, showtimes);
//        mShowtimeListView.setAdapter(adapter);

        Intent intent = getIntent();
        String showtime = intent.getStringExtra("showtimes");
        mShowtimeTimes.setText("4:30\n7:00\n9:55");

    }
}

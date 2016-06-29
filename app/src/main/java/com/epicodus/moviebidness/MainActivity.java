package com.epicodus.moviebidness;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind (R.id.poster) ImageView mPoster;
    @Bind (R.id.showtimeButton) Button mShowtimeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mPoster.setOnClickListener(this);
        mShowtimeButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v == mPoster) {
            Uri uri = Uri.parse("https://www.rottentomatoes.com/m/the_lobster/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }

        if(v == mShowtimeButton) {
            Intent intent = new Intent(MainActivity.this,ShowtimeActivity.class);
            startActivity(intent);

        }
    }
}

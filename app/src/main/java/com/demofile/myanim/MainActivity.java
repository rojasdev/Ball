package com.demofile.myanim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View ballBounceView = new BallBounceView(this);
        setContentView(ballBounceView);
        ballBounceView.setBackgroundColor(Color.BLACK);
    }
}

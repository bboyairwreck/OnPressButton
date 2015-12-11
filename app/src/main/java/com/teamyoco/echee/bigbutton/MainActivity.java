package com.teamyoco.echee.bigbutton;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnClickMe = (Button) findViewById(R.id.btnClickMe);

        btnClickMe.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_DOWN) {
                    btnClickMe.setText("Down");
                } else if (event.getAction()==MotionEvent.ACTION_UP){
                    btnClickMe.setText("Click Me");
                }
                return true;
            }
        });
    }

}

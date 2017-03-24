package com.example.alumno.myapplication_20170323;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by alumno on 23/03/2017.
 */

public class MyListener implements View.OnClickListener {

    private TextView txt1;

    @Override
    public void onClick(View v) {
        // Perform action on click

        if (v.getId() == R.id.btn1) {
            Log.d("CLICK", "SE HIZO CLICK EN BTN 1");
        } else {
            Log.d("CLICK", "SE HIZO CLICK EN BTN 2");
        }
    }
}

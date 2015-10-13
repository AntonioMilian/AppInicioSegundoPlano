package com.example.antonio.appiniciosegundoplano;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Antonio on 11/10/2015.
 */
public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Toast.makeText(getApplicationContext(), "mensaje",Toast.LENGTH_LONG ).show();
        Intent service = new Intent(this, ExampleService.class);
        startService(service);

    }
}

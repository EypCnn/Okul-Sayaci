package com.eypcnn.okulsayac;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import me.anwarshahriar.calligrapher.Calligrapher;

/**
 * Created by EypCnn on 28.09.2017.
 */

public class Bom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        Calligrapher calligrapher = new Calligrapher( this );
        calligrapher.setFont( this, "montserrat.ttf", true );
    }
}
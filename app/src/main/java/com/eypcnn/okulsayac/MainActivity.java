package com.eypcnn.okulsayac;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Date;

import me.anwarshahriar.calligrapher.Calligrapher;

/**
 * Created by EypCnn on 25.09.2017.
 */

public class MainActivity extends AppCompatActivity {

    TextView gunuzunygs,gunuzunlys1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        Calligrapher calligrapher = new Calligrapher( this );
        calligrapher.setFont( this, "sdd.ttf", true );

        gunuzunygs = (TextView) findViewById( R.id.gunuzunygs );
        gunuzunlys1 = (TextView) findViewById( R.id.gunuzunlys1 );

        startTimer();
    }

    public void buttonEyp(View view) {
        Intent cnn = new Intent( MainActivity.this,AnaSayfa.class );
        startActivity( cnn );
    }

    private void startTimer() {
        new CountDownTimer(gunuzunygs(),1000) {
            public void onTick(long millisUntilFinished) {
                int days = (int) (millisUntilFinished / (1000 * 60 * 60 * 24));
                int hours = (int) ((millisUntilFinished / (1000 * 60 * 60)) % 24);
                int mins = (int) ((millisUntilFinished / (1000 * 60)) % 60);
                int sec = (int) ((millisUntilFinished / (1000)) % 60);

                gunuzunygs.setText( String.format( "%d Gun %02d:%02d:%02d", days, hours, mins, sec ) );
            }

            public void onFinish() {
            }
        }.start();

        new CountDownTimer(lys1(),1000) {
            public void onTick(long millisUntilFinished) {
                int days = (int) (millisUntilFinished / (1000 * 60 * 60 * 24));
                int hours = (int) ((millisUntilFinished / (1000 * 60 * 60)) % 24);
                int mins = (int) ((millisUntilFinished / (1000 * 60)) % 60);
                int sec = (int) ((millisUntilFinished / (1000)) % 60);

                gunuzunlys1.setText( String.format( "%d Gun %02d:%02d:%02d", days, hours, mins, sec ) );
            }

            public void onFinish() {
            }
        }.start();
    }

    private long gunuzunygs() {
        Date currentDate = new Date();
        Date endDate = new Date( currentDate.getYear() + 1, 5, 8 );

        return endDate.getTime() - currentDate.getTime();
    }

    private long lys1() {
        Date currentDate = new Date();
        Date endDate = new Date( currentDate.getYear() + 1, -0, 22 );

        return endDate.getTime() - currentDate.getTime();
    }

    public void instagramphey(View view) {
        Intent browserIntent =new Intent( Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/eyupcanyilmaz/") );
        startActivity( browserIntent );
    }
}

package com.eypcnn.okulsayac;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import me.anwarshahriar.calligrapher.Calligrapher;

/**
 * Created by EypCnn on 28.09.2017.
 */

public class AnaSayfa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.hakkimda );

        Calligrapher calligrapher = new Calligrapher( this );
        calligrapher.setFont( this, "montserrat.ttf", true );
    }

    public void buttonCnn(View v) {
        Intent eyp = new Intent( AnaSayfa.this, Bom.class );
        startActivity( eyp );
    }

    public void calistir(View v) {
            Intent intent = null, chooser = null;

    if(v.getId()==R.id.button){

    intent = new Intent( Intent.ACTION_SEND );
    intent.setData( Uri.parse( "mailto:" ) );
    String[] to = {"eypcnn06@gmail.com"};
    intent.putExtra( Intent.EXTRA_EMAIL, to);
    intent.putExtra( Intent.EXTRA_SUBJECT, "Uygulamadan Gönderildi" );
    intent.putExtra( Intent.EXTRA_TEXT, "Mailin İçeriği" );
    intent.setType( "messages/rfc822" );
    chooser=Intent.createChooser( intent, "Mail Gönder" );
    startActivity( chooser );
    }
}
}
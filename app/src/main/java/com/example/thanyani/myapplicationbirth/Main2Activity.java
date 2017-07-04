package com.example.thanyani.myapplicationbirth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    private Button btnDetails;
    private TextView venue,date,time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnDetails =(Button)  findViewById(R.id.btnDetails) ;
        venue =(TextView)  findViewById(R.id.txtVenue) ;
        date  =(TextView)  findViewById(R.id.txtDate ) ;
        time  =(TextView)  findViewById(R.id.txtTime ) ;

        btnDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String venues="Vhutuwangadzebu";
                String dates="21 June 2016";
                String times="13:00";



                venue.setText(venues);
                date.setText(dates);
                time.setText(times);
            }
        });
    }

}

package com.b2b.home.axisacknowledgement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getIntent().getExtras().get("sequence")!=null){
            String sequence=getIntent().getExtras().get("sequence").toString();
            String status=sequence.split("\\*")[0];
            String amount=sequence.split("\\*")[1];
            String from=sequence.split("\\*")[2];
            String to=sequence.split("\\*")[3];
            TextView t= (TextView) findViewById(R.id.text);
            if(status.equals("1"))
            t.setText("Amount "+amount+"Transfered to your account from "+from+" to "+to);
            else
                t.setText("Failed");

        }

    }
}

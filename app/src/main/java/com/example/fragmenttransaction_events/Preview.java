package com.example.fragmenttransaction_events;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Preview extends AppCompatActivity {
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        tv=findViewById(R.id.tv);

        getData();
    }

    private void getData() {
        Model model=(Model) getIntent().getSerializableExtra("model");
        tv.setText("Tittle: "+model.getTittle()+"\n Description: "+model.getDesc()+"\n Start Date"+
                model.getStart_date()+"\n Start Time: "+model.getStart_time()+"\nEnd Time: "+
                model.end_time+"\n End Date: "+model.getEnd_date()+"\nPrice: "+model.getPrice());
    }
}
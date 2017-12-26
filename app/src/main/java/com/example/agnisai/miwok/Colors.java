package com.example.agnisai.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    private MediaPlayer play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        final ArrayList<subList> numbers = new ArrayList<subList>();
        ArrayList<String> l = new ArrayList<String>();
        numbers.add(new subList("Red","Yerupu",R.drawable.color_red,R.raw.color_red));
        numbers.add(new subList("White","Talupu",R.drawable.color_white,R.raw.color_white));
        numbers.add(new subList("Yellow","Pasupu",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));
        numbers.add(new subList("DustyYellow","chandhanam",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        numbers.add(new subList("Black","nalupu",R.drawable.color_black,R.raw.color_black));


//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,l);
        myAdaptor adaptor1 = new myAdaptor(this,numbers,R.color.colortetxview);
        ListView text = (ListView) findViewById(R.id.list);
        text.setAdapter(adaptor1);

        text.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                subList number = numbers.get(position);
                play = MediaPlayer.create(Colors.this,number.getmAudioResourseId());
                play.start();
            }
        });
    }
}

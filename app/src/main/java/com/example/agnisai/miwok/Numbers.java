package com.example.agnisai.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    private MediaPlayer play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        final ArrayList<subList> numbers = new ArrayList<subList>();
        ArrayList<String> l = new ArrayList<String>();
        numbers.add(new subList("One","Okkathi",R.drawable.number_one,R.raw.number_one));
        numbers.add(new subList("Two","Rondhu",R.drawable.number_two,R.raw.number_two));
        numbers.add(new subList("Three","Mudhu",R.drawable.number_three,R.raw.number_three));
        numbers.add(new subList("Four","Naalugu",R.drawable.number_four,R.raw.number_four));
        numbers.add(new subList("Five","Iddhu",R.drawable.number_five,R.raw.number_five));
        numbers.add(new subList("Six","Aarru",R.drawable.number_six,R.raw.number_six));
        numbers.add(new subList("Seven","Yadhu",R.drawable.number_seven,R.raw.number_seven));
        numbers.add(new subList("Eight","Yenimidhi",R.drawable.number_eight,R.raw.number_eight));
        numbers.add(new subList("Nine","Thomidhi",R.drawable.number_nine,R.raw.number_nine));
        numbers.add(new subList("Ten","Padhi",R.drawable.number_ten,R.raw.number_ten));

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,l);
        myAdaptor adaptor1 = new myAdaptor(this,numbers,R.color.numbertextview);
        ListView text = (ListView) findViewById(R.id.list);
        text.setAdapter(adaptor1);
        text.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                subList number = numbers.get(position);
                play = MediaPlayer.create(Numbers.this,number.getmAudioResourseId());
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        Toast.makeText(Numbers.this, "Audio completed", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}

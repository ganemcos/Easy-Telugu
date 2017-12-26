package com.example.agnisai.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Pharses extends AppCompatActivity {

    private MediaPlayer play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        final ArrayList<subList> numbers = new ArrayList<subList>();
        ArrayList<String> l = new ArrayList<String>();
        numbers.add(new subList("How are You feeling","Alla unnaru",R.raw.phrase_how_are_you_feeling));
        numbers.add(new subList("Are you coming","Meru Vasthunara",R.raw.phrase_are_you_coming));
        numbers.add(new subList("Come here","Ithu ra",R.raw.phrase_come_here));
        numbers.add(new subList("I am coming","Neneu vasthuna",R.raw.phrase_im_coming));
        numbers.add(new subList("Lets Go","Sara veldham",R.raw.phrase_lets_go));
        numbers.add(new subList("My name is","Naa peru",R.raw.phrase_my_name_is));
        numbers.add(new subList("Where_are_you_going","Ekadiki valthunav",R.raw.phrase_where_are_you_going));
        numbers.add(new subList("what_is_your_name","Nee peru Yendhi",R.raw.phrase_what_is_your_name));
        numbers.add(new subList("Yes_im_coming","Nenu vastuna",R.raw.phrase_yes_im_coming));
        numbers.add(new subList("Im_feeling_good","Nenu bagaunnanu",R.raw.phrase_im_feeling_good));


//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,l);
        myAdaptor adaptor1 = new myAdaptor(this,numbers,R.color.phrasestextview);
        ListView text = (ListView) findViewById(R.id.list);
        text.setAdapter(adaptor1);
        text.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                subList number = numbers.get(position);
                play = MediaPlayer.create(Pharses.this,number.getmAudioResourseId());
                play.start();
            }
        });
    }
}

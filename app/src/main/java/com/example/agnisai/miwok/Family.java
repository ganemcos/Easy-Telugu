package com.example.agnisai.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Family extends AppCompatActivity {

    private MediaPlayer play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        final ArrayList<subList> numbers = new ArrayList<subList>();
        ArrayList<String> l = new ArrayList<String>();
        numbers.add(new subList("Father","Nanna",R.drawable.family_father,R.raw.family_father));
        numbers.add(new subList("Mother","Amma",R.drawable.family_mother,R.raw.family_mother));
        numbers.add(new subList("Elder Brother","Anna",R.drawable.family_daughter,R.raw.family_older_brother));
        numbers.add(new subList("Younger Brother","Thamudhu",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        numbers.add(new subList("Elder Sister","Akka",R.drawable.family_older_sister,R.raw.family_older_sister));
        numbers.add(new subList("Younger Sister","Challi",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        numbers.add(new subList("Son","Koduku",R.drawable.family_son,R.raw.family_son));
        numbers.add(new subList("GrandMother","Bhama",R.drawable.family_grandmother,R.raw.family_grandmother));
        numbers.add(new subList("GrandFather","Thatha",R.drawable.family_grandfather,R.raw.family_grandfather));


//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,l);
        myAdaptor adaptor1 = new myAdaptor(this,numbers,R.color.relationstextview);
        ListView text = (ListView) findViewById(R.id.list);
        text.setAdapter(adaptor1);
        text.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                subList number = numbers.get(position);
                play = MediaPlayer.create(Family.this,number.getmAudioResourseId());
                play.start();
            }
        });
    }
}

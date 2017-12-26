package com.example.agnisai.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.agnisai.miwok.R.id.text_container;

/**
 * Created by Acer on 21-12-2017.
 */

public class myAdaptor extends ArrayAdapter<subList> {
     private int mColorResourceId;


    public myAdaptor(Context context, ArrayList<subList> sublist) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, sublist);

    }
    public myAdaptor(Context context, ArrayList<subList> sublist,int colorresourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, sublist);
        mColorResourceId = colorresourceId;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listitemview = convertView;
        if (listitemview == null) {
            listitemview = LayoutInflater.from(getContext()).inflate(
                    R.layout.sublist, parent, false);
        }

        subList currentsublist = getItem(position);

        TextView DefaultView = (TextView) listitemview.findViewById(R.id.version_name);
        DefaultView.setText(currentsublist.getDefaultword());

        TextView teluguView = (TextView) listitemview.findViewById(R.id.version_number);
        teluguView.setText(currentsublist.getTeluguword());

        ImageView imageView = (ImageView)listitemview.findViewById(R.id.image);


        if (currentsublist.hasImage()) {
            imageView.setImageResource(currentsublist.getImageresorce());
            imageView.setVisibility(View.VISIBLE);

        } else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listitemview.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(),mColorResourceId);


        textContainer.setBackgroundColor(color);

//

//
        return listitemview;

    }




}

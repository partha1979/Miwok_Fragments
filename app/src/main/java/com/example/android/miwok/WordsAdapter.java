package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by parthachakraborty on 10/11/17.
 */

public class WordsAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordsAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
    if(listItemView == null) {
        listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
    }
        Word currentWord = getItem(position);

        TextView miwokView = (TextView) listItemView.findViewById(R.id.default_text_view);
        miwokView.setText(currentWord.getmDefaultTranslation());

        TextView defaultView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        defaultView.setText(currentWord.getmMiwokTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if(currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getmImageId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;

    }
}


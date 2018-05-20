package com.rajewska.bearin;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class SleepFragment extends Fragment {
    public SleepFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

//        ArrayList of hostels

        final ArrayList<com.rajewska.bearin.Word> words = new ArrayList<com.rajewska.bearin.Word>();
        words.add(new com.rajewska.bearin.Word("Ostkreuz, S3 S5 S7 S8 S41 S42",
                "a&o Berlin Friedrichshain", R.drawable.ao));
        words.add(new com.rajewska.bearin.Word("Rosenthaler Platz, U8",
                "The Circus Hotel", R.drawable.circus));
        words.add(new com.rajewska.bearin.Word("Möckernbrücke, U1 U3 U7",
                "Grand Hostel Berlin", R.drawable.grand));
        words.add(new com.rajewska.bearin.Word("Stadtmitte, U2, U6",
                "Cityhostel Berlin", R.drawable.cityhostel));
        words.add(new com.rajewska.bearin.Word("Alexander Platz, U2 U6 U8 S3...",
                "ONE80°", R.drawable.one80));
        words.add(new com.rajewska.bearin.Word("Alexander Platz, U2 U6 U8 S3...",
                "Citystay Hostel Berlin", R.drawable.citystay));
        words.add(new com.rajewska.bearin.Word("Rosa Luxemburg Platz, U2",
                "Wombat's Berlin", R.drawable.wombat));


        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.light_pink_bg);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
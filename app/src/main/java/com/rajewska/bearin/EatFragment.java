package com.rajewska.bearin;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class EatFragment extends Fragment {
    public EatFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

//        ArrayList of locations

        final ArrayList<com.rajewska.bearin.Word> words = new ArrayList<com.rajewska.bearin.Word>();
        words.add(new com.rajewska.bearin.Word("Eberswalder Straße, U2",
                "Minty", R.drawable.minty));
        words.add(new com.rajewska.bearin.Word("Görlitzer Bahnhof, U1",
                "Kimchi Princess", R.drawable.kimchi));
        words.add(new com.rajewska.bearin.Word("Rosenthaler Platz, U8",
                "W-Der Imbiss", R.drawable.imbiss));
        words.add(new com.rajewska.bearin.Word("Eberswalder Straße, U2",
                "Prater", R.drawable.prater));
        words.add(new com.rajewska.bearin.Word("Schönleinstraße, U8",
                "Burrito Baby", R.drawable.burrito));
        words.add(new com.rajewska.bearin.Word("Schwedter Str., M1 12",
                "Babel", R.drawable.babel));
        words.add(new com.rajewska.bearin.Word("Prenzlauer Allee, S1, S8, S41...",
                "Agni", R.drawable.agni));

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.light_blue_bg);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}

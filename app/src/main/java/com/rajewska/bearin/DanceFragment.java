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


public class DanceFragment extends Fragment {
    public DanceFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

//        ArrayList of locations

        final ArrayList<com.rajewska.bearin.Word> locations = new ArrayList<>();
        locations.add(new com.rajewska.bearin.Word("Berlin Ostbahnhof, S3 S5 S7 S9",
                "Berghain", R.drawable.berghain));
        locations.add(new com.rajewska.bearin.Word("Heinrich-Heine-Straße, U8",
                "Tresor", R.drawable.tresor));
        locations.add(new com.rajewska.bearin.Word("Schlesisches Tor, U1 U3",
                "Watergate", R.drawable.watergate));
        locations.add(new com.rajewska.bearin.Word("Brunnenstr./Invalidenstr., 12...",
                "ACUD", R.drawable.acud));
        locations.add(new com.rajewska.bearin.Word("Warschauer Str., S3 S5 S7 S9...",
                "Urban Spree", R.drawable.urban));
        locations.add(new com.rajewska.bearin.Word("Schlesisches Tor, U1 U3",
                "Arena", R.drawable.imbiss));
        locations.add(new com.rajewska.bearin.Word("Warschauer Str., S3 S5 S7 S9...",
                "Suicide Circus", R.drawable.imbiss));


        WordAdapter adapter = new WordAdapter(getActivity(), locations, R.color.light_pink_bg);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
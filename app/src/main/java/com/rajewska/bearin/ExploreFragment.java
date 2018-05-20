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

public class ExploreFragment extends Fragment {
    
    public ExploreFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

//        ArrayList of restaurants

        final ArrayList<com.rajewska.bearin.Word> words = new ArrayList<com.rajewska.bearin.Word>();
        words.add(new com.rajewska.bearin.Word("Adlershof, S8 S9 S45 S46 S85",
                "Aerodynamic Park", R.drawable.aerodynamic));
        words.add(new com.rajewska.bearin.Word("Kottbuser Tor, U1 U8",
                "Museum of Things", R.drawable.museum));
        words.add(new com.rajewska.bearin.Word("Nollendorfplatz, U1 U2 U3 U4",
                "Bauhaus Archive", R.drawable.bauhaus));
        words.add(new com.rajewska.bearin.Word("Karlshorst, S3",
                "Model Park", R.drawable.model));
        words.add(new com.rajewska.bearin.Word("Möckernbrücke, U1 U3 U7",
                "Liquidrom", R.drawable.liquidrom));
        words.add(new com.rajewska.bearin.Word("Eberswalder Straße, U2",
                "Mauerpark", R.drawable.mauer));
        words.add(new com.rajewska.bearin.Word("Rosenthaler Platz, U8",
                "Teufelsberg", R.drawable.teufel));


        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.light_blue_bg);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}

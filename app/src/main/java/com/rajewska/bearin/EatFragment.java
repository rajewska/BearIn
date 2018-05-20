package com.rajewska.bearin;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class EatFragment extends Fragment {
    public EatFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView;
        rootView = inflater.inflate(R.layout.word_list, container, false);

//        ArrayList of locations

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Eberswalder Straße, U2",
                "Minty", R.drawable.minty));
        locations.add(new Location("Görlitzer Bahnhof, U1",
                "Kimchi Princess", R.drawable.kimchi));
        locations.add(new Location("Rosenthaler Platz, U8",
                "W-Der Imbiss", R.drawable.imbiss));
        locations.add(new Location("Eberswalder Straße, U2",
                "Prater", R.drawable.prater));
        locations.add(new Location("Schönleinstraße, U8",
                "Burrito Baby", R.drawable.burrito));
        locations.add(new Location("Schwedter Str., M1 12",
                "Babel", R.drawable.babel));
        locations.add(new Location("Prenzlauer Allee, S1, S8, S41...",
                "Agni", R.drawable.agni));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.light_blue_bg);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}

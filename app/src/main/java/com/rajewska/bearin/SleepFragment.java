package com.rajewska.bearin;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class SleepFragment extends Fragment {
    public SleepFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

//        ArrayList of locations

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Ostkreuz, S3 S5 S7 S8 S41 S42",
                "a&o Berlin Friedrichshain", R.drawable.ao));
        locations.add(new Location("Rosenthaler Platz, U8",
                "The Circus Hotel", R.drawable.circus));
        locations.add(new Location("Möckernbrücke, U1 U3 U7",
                "Grand Hostel Berlin", R.drawable.grand));
        locations.add(new Location("Stadtmitte, U2, U6",
                "Cityhostel Berlin", R.drawable.cityhostel));
        locations.add(new Location("Alexander Platz, U2 U6 U8 S3...",
                "ONE80°", R.drawable.one80));
        locations.add(new Location("Alexander Platz, U2 U6 U8 S3...",
                "Citystay Hostel Berlin", R.drawable.citystay));
        locations.add(new Location("Rosa Luxemburg Platz, U2",
                "Wombat's Berlin", R.drawable.wombat));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.light_pink_bg);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
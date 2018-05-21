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
        locations.add(new Location(getString(R.string.ostkreuz),
                getString(R.string.ao), R.drawable.ao));
        locations.add(new Location(getString(R.string.rosenthaler),
                getString(R.string.circus), R.drawable.circus));
        locations.add(new Location(getString(R.string.mockern),
                getString(R.string.grand), R.drawable.grand));
        locations.add(new Location(getString(R.string.stadtmitte),
                getString(R.string.cityhostel), R.drawable.cityhostel));
        locations.add(new Location(getString(R.string.alex),
                getString(R.string.one80), R.drawable.one80));
        locations.add(new Location(getString(R.string.alex),
                getString(R.string.citystay), R.drawable.citystay));
        locations.add(new Location(getString(R.string.rosalux),
                getString(R.string.wombat), R.drawable.wombat));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.light_pink_bg);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
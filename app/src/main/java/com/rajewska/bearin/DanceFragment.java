package com.rajewska.bearin;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class DanceFragment extends Fragment {
    public DanceFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

//        ArrayList of locations

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getString(R.string.ostbahnhof),
                getString(R.string.berghain), R.drawable.berghain));
        locations.add(new Location(getString(R.string.heinrich),
                getString(R.string.tresor), R.drawable.tresor));
        locations.add(new Location(getString(R.string.schlesi),
                getString(R.string.watergate), R.drawable.watergate));
        locations.add(new Location(getString(R.string.brunnen),
                getString(R.string.acud), R.drawable.acud));
        locations.add(new Location(getString(R.string.warschauer),
                getString(R.string.urban), R.drawable.urban));
        locations.add(new Location(getString(R.string.schlesi),
                getString(R.string.arena), R.drawable.arena));
        locations.add(new Location(getString(R.string.warschauer),
                getString(R.string.suicide), R.drawable.suicide));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.light_pink_bg);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
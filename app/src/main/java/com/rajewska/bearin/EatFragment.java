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
        rootView = inflater.inflate(R.layout.location_list, container, false);

//        ArrayList of locations

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.eberswalder),
                getString(R.string.minty), R.drawable.minty));
        locations.add(new Location(getString(R.string.gorli),
                getString(R.string.kimchi), R.drawable.kimchi));
        locations.add(new Location(getString(R.string.rosenthaler),
                getString(R.string.imbiss), R.drawable.imbiss));
        locations.add(new Location(getString(R.string.eberswalder),
                getString(R.string.prater), R.drawable.prater));
        locations.add(new Location(getString(R.string.schonlein),
                getString(R.string.burrito), R.drawable.burrito));
        locations.add(new Location(getString(R.string.schwedter),
                getString(R.string.babel), R.drawable.babel));
        locations.add(new Location(getString(R.string.prenzlauer),
                getString(R.string.agni), R.drawable.agni));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.light_blue_bg);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}

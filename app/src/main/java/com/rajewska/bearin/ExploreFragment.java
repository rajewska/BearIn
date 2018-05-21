package com.rajewska.bearin;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ExploreFragment extends Fragment {

    public ExploreFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

//        ArrayList of locations

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.adlershof),
                getString(R.string.aerodynamic), R.drawable.aerodynamic));
        locations.add(new Location(getString(R.string.kotti),
                getString(R.string.things), R.drawable.museum));
        locations.add(new Location(getString(R.string.nollendorf),
                getString(R.string.bauhaus), R.drawable.bauhaus));
        locations.add(new Location(getString(R.string.karlshorst),
                getString(R.string.model), R.drawable.model));
        locations.add(new Location(getString(R.string.mockern),
                getString(R.string.liquidrom), R.drawable.liquidrom));
        locations.add(new Location((getString(R.string.eberswalder)),
                getString(R.string.mauer), R.drawable.mauer));
        locations.add(new Location(getString(R.string.rosenthaler),
                getString(R.string.teufel), R.drawable.teufel));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.light_blue_bg);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}

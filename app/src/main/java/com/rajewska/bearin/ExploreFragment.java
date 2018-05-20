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
        View rootView = inflater.inflate(R.layout.word_list, container, false);

//        ArrayList of restaurants

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Adlershof, S8 S9 S45 S46 S85",
                "Aerodynamic Park", R.drawable.aerodynamic));
        locations.add(new Location("Kottbuser Tor, U1 U8",
                "Museum of Things", R.drawable.museum));
        locations.add(new Location("Nollendorfplatz, U1 U2 U3 U4",
                "Bauhaus Archive", R.drawable.bauhaus));
        locations.add(new Location("Karlshorst, S3",
                "Model Park", R.drawable.model));
        locations.add(new Location("Möckernbrücke, U1 U3 U7",
                "Liquidrom", R.drawable.liquidrom));
        locations.add(new Location("Eberswalder Straße, U2",
                "Mauerpark", R.drawable.mauer));
        locations.add(new Location("Rosenthaler Platz, U8",
                "Teufelsberg", R.drawable.teufel));


        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.light_blue_bg);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}

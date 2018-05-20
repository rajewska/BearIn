package com.rajewska.bearin;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {
    /**
     * Resource ID for the background color for this list of words
     */
    private int mColorResourceId;

    public LocationAdapter(Activity context, ArrayList<Location> locations, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, locations);
        mColorResourceId = colorResourceId;
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the object located at this position in the list
        Location currentLocation = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        locationTextView.setText(currentLocation.getLocation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        // Get the name from the current object and
        // set this text on the name TextView
        nameTextView.setText(currentLocation.getName());

        // Find the ImageView in the list_item.xml layout with the ID location_image_view
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.location_image_view);
        // Get the image resource ID from the current location object and
        if (currentLocation.hasImage()) {
            // set the image to iconView
            imageView.setImageResource(currentLocation.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }
}

package com.example.appty.addidababatourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by appty on 30/12/17.
 */


public class ListAdapter extends ArrayAdapter<Place> {

    public ListAdapter(Context context, ArrayList<Place> list) {
        super(context, 0, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.place_item, parent, false);
        }

        // Create a PlaceDetail object and assign the current item in the ListView to it
        Place currentItem = getItem(position);

        // Make sure the currentItem in the ListView is not null
        if (currentItem != null) {
            ImageView img = listItemView.findViewById(R.id.image);
            img.setImageResource(currentItem.getImageResource());

            TextView title = listItemView.findViewById(R.id.title);
            title.setText(currentItem.getTitle());

            TextView disc = listItemView.findViewById(R.id.disc);
            disc.setText(currentItem.getDescription());

        }
        return listItemView;
    }
}

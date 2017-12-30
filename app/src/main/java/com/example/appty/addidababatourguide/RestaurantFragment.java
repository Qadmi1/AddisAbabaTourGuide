package com.example.appty.addidababatourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by appty on 30/12/17.
 */

public class RestaurantFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View itemView = inflater.inflate(R.layout.item_list, container, false);

        //Create a list of LandMarks
        ArrayList<Place> list = new ArrayList<>();
        list.add(new Place(R.drawable.oda_restuarants, R.string.oda, R.string.oda_desc));
        list.add(new Place(R.drawable.shiro, R.string.shiro, R.string.shiro_desc));
        list.add(new Place(R.drawable.chane_restaurant, R.string.chane, R.string.chane_desc));
        list.add(new Place(R.drawable.yod_restaurant, R.string.yod, R.string.yod_desc));
        list.add(new Place(R.drawable.tewodros_square, R.string.brundo, R.string.brundo_desc));

        //Create an instance of our custom Adapter
        ListAdapter listAdapter = new ListAdapter(getActivity(), list);

        //Find the ListView with id list_item in the item_list.xml layout
        ListView mainList = itemView.findViewById(R.id.list_item);

        //Set the Adapter we created above to our ListView
        mainList.setAdapter(listAdapter);

        // Change the title in the ActionBar
        getActivity().setTitle(R.string.restaurants);

        return itemView;
    }
}

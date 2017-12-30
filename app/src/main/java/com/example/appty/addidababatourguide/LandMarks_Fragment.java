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


public class LandMarks_Fragment extends Fragment {



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View itemView = inflater.inflate(R.layout.item_list, container, false);

        //Create a list of LandMarks
        ArrayList<Place> list = new ArrayList<>();
        list.add(new Place(R.drawable.img_5159, R.string.menelik, R.string.menelik_disc));
        list.add(new Place(R.drawable.mesquel, R.string.meskel, R.string.meskel_disc));
        list.add(new Place(R.drawable.menelik_square, R.string.menelik_square, R.string.menilik_square_disc));
        list.add(new Place(R.drawable.meyazia_27_square, R.string.meyazia, R.string.meyazia_disc));
        list.add(new Place(R.drawable.tewodros_square, R.string.twedros, R.string.twedros_disc));

        //Create an instance of our custom Adapter
        ListAdapter listAdapter = new ListAdapter(getActivity(), list);

        //Find the ListView with id list_item in the item_list.xml layout
        ListView mainList = itemView.findViewById(R.id.list_item);

        //Set the Adapter we created above to our ListView
        mainList.setAdapter(listAdapter);

        // Change the title in the ActionBar
        getActivity().setTitle(R.string.landmarks);
        return itemView;
    }
}


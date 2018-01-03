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
 * Created by appty on 03/01/18.
 */

public class ReligeiousSitesFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View itemView = inflater.inflate(R.layout.item_list, container, false);

        //Create a list of LandMarks
        ArrayList<Place> list = new ArrayList<>();
        list.add(new Place(R.drawable.palace, R.string.goerge, R.string.goerge_desc));
        list.add(new Place(R.drawable.trinity, R.string.entoto, R.string.entoto_desc));
        list.add(new Place(R.drawable.lilibella, R.string.adadi, R.string.adadi_desc));
        list.add(new Place(R.drawable.melka, R.string.raguel, R.string.raguel_desc));
        list.add(new Place(R.drawable.medhane, R.string.anwar, R.string.anwar_desc));

        //Create an instance of our custom Adapter
        ListAdapter listAdapter = new ListAdapter(getActivity(), list);

        //Find the ListView with id list_item in the item_list.xml layout
        ListView mainList = itemView.findViewById(R.id.list_item);

        //Set the Adapter we created above to our ListView
        mainList.setAdapter(listAdapter);

        // Change the title in the ActionBar
        getActivity().setTitle(R.string.religious);

        return itemView;
    }
}

package com.example.appty.addidababatourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by appty on 30/12/17.
 */

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View itemView = inflater.inflate(R.layout.home_page, container, false);
        // Change the title in the ActionBar
        getActivity().setTitle(R.string.home);

        return itemView;
    }
}

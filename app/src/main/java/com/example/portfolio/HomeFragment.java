package com.example.portfolio;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    ListView listView;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        listView = v.findViewById(R.id.lvProduct);

        String[] menuItems = {"Do1", "Do2", "Do3", "Do2", "Do3", "Do2", "Do3", "Do2", "Do3", "Do2", "Do3", "Do2", "Do3", "Do2", "Do3", "Do2", "Do3", "Do2", "Do3"};

        ArrayAdapter<String> ListViewAdapter = new ArrayAdapter<String>(
                getActivity(), android.R.layout.simple_list_item_1, menuItems);

        listView.setAdapter(ListViewAdapter);

        return v;
    }

}

package com.example.tugasdrawer.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugasdrawer.AdapterList;
import com.example.tugasdrawer.DataItem;
import com.example.tugasdrawer.R;

import java.util.ArrayList;
import java.util.List;

public class MinumanKhas extends Fragment implements AdapterList.ItemClickListener {

    private RecyclerView recyclerView;
    private AdapterList adapter;
    private List<DataItem> dataList;
    public MinumanKhas() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.minuman_khas_fragment, container, false);

        recyclerView = view.findViewById(R.id.rvList2);
        dataList = new ArrayList<>();

        dataList.add(new DataItem("Kopi Jetak", "4.9", R.drawable.kopi_jetak, "Add to favourite"));
        dataList.add(new DataItem("Es Dawet Durian", "5.0", R.drawable.esdawet_durian, "Add to favourite"));
        dataList.add(new DataItem("Wedang Blung", "4.9", R.drawable.wedang_blung, "Add to favourite"));
        dataList.add(new DataItem("Wedang Coro", "4.8", R.drawable.wedang_coro, "Add to favourite"));
        dataList.add(new DataItem("Wedang Pejuh", "4.9", R.drawable.wedang_pejuh, "Add to favourite"));
        dataList.add(new DataItem("Sekoteng", "5.0", R.drawable.sekoteng, "Add to favourite"));

        adapter = new AdapterList(dataList, getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onItemClick(View view, int position) {

    }
}

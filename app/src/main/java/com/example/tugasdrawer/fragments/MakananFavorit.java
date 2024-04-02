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

public class MakananFavorit extends Fragment implements AdapterList.ItemClickListener{

    private RecyclerView recyclerView;
    private AdapterList adapter;
    private List<DataItem> dataList;

    public MakananFavorit() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.makanan_favorit_fragment, container, false);

        recyclerView = view.findViewById(R.id.rvList3);
        dataList = new ArrayList<>();

        dataList.add(new DataItem("Nasi Pindang", "5.0", R.drawable.nasi_pindang));
        dataList.add(new DataItem("Soto Kudus", "5.0", R.drawable.soto_kudus));
        dataList.add(new DataItem("Sate Kerbau", "4.8", R.drawable.sate_kerbau));
        dataList.add(new DataItem("Kopi Jetak", "4.9", R.drawable.kopi_jetak));
        dataList.add(new DataItem("Es Dawet Durian", "5.0", R.drawable.esdawet_durian));

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

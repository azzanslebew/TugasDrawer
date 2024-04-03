package com.example.tugasdrawer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugasdrawer.fragments.MakananKhas;
import com.example.tugasdrawer.fragments.MinumanKhas;

import java.util.List;

public class AdapterList extends RecyclerView.Adapter<AdapterList.ViewHolder> {

    private List<DataItem> datalist;
    private Context context;
    private ItemClickListener mClickListener;

    public AdapterList(List<DataItem> datalist, Context context) {
        this.datalist = datalist;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterList.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_view_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterList.ViewHolder holder, int position) {
        DataItem dataItem= datalist.get(position);
        holder.textNama.setText(dataItem.getNama());
        holder.textRating.setText(dataItem.getRating());
        holder.imageGambar.setImageResource(dataItem.getGambar());
        holder.button.setText(dataItem.getButton());
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView textNama, textRating;
        ImageView imageGambar;
        Button button;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textNama = itemView.findViewById(R.id.textNama);
            textRating = itemView.findViewById(R.id.textRating);
            imageGambar = itemView.findViewById(R.id.gambar);
            button = itemView.findViewById(R.id.button);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    DataItem getItem(int id) {
        return datalist.get(id);
    }

    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}

package com.mbkm.tugas7_gits;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {

    private ArrayList<Daftar> daftar;
    private Context context;

    public AdapterRecyclerView(Context context, ArrayList<Daftar> daftar) {
        this.context = context;
        this.daftar = daftar;
    }

    @Override
    public AdapterRecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.nama.setText(daftar.get(i).getNama());
        Picasso.get().load(daftar.get(i).getUrl()).resize(100, 100)
                .centerCrop()
                .placeholder(R.drawable.loading)
                .error(R.drawable.image2)
                .into(viewHolder.gambar);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView nama;
        ImageView gambar;

        public ViewHolder(View view) {
            super(view);

            nama = (TextView) view.findViewById(R.id.DaftarNama);
            gambar = (ImageView) view.findViewById(R.id.imageView);
        }
    }

    @Override
    public int getItemCount() {
        return daftar.size();
    }
}

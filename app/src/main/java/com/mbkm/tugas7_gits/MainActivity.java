package com.mbkm.tugas7_gits;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter recyclerViewAdapter;
    RecyclerView.LayoutManager recylerViewLayoutManager;

    String[] nama = {"Alpha","Beta","Charlie","Delta"};
    String[] url = {"https://instagram.fcgk27-1.fna.fbcdn.net/v/t51.2885-15/sh0.08/e35/p640x640/241729582_395739688625845_2212968315757942974_n.jpg?_nc_ht=instagram.fcgk27-1.fna.fbcdn.net&_nc_cat=1&_nc_ohc=0nQOhqIym5cAX_yFnvB&edm=AP_V10EBAAAA&ccb=7-4&oh=c65f844d76b4034066a24b0bdf2f7b25&oe=61450E89&_nc_sid=4f375e",
                    "https://instagram.fcgk27-1.fna.fbcdn.net/v/t51.2885-15/e35/241526660_884466422456761_6520144069155846188_n.jpg?_nc_ht=instagram.fcgk27-1.fna.fbcdn.net&_nc_cat=1&_nc_ohc=PyXp83Y51QAAX9Gc5VW&edm=AP_V10EBAAAA&ccb=7-4&oh=f15fef4aef4f10b76d4666f18f7207af&oe=6145304F&_nc_sid=4f375e",
                    "https://scontent-sin6-1.cdninstagram.com/v/t51.2885-15/sh0.08/e35/s750x750/240943480_823799024914423_8956368850889555977_n.jpg?_nc_ht=scontent-sin6-1.cdninstagram.com&_nc_cat=107&_nc_ohc=kkEjC8NVawcAX-Jy91K&edm=AP_V10EBAAAA&ccb=7-4&oh=2cfc2bbb168d90e6294fd96b552f51b2&oe=61463E6C&_nc_sid=4f375e",
                    "https://scontent-sin6-1.cdninstagram.com/v/t51.2885-15/sh0.08/e35/s750x750/240405503_1656399684565591_1259552054550162497_n.jpg?_nc_ht=scontent-sin6-1.cdninstagram.com&_nc_cat=107&_nc_ohc=_VF29LxN5VUAX-2TXYQ&edm=AP_V10EBAAAA&ccb=7-4&oh=ce7514b830d66f88f71a7ca60eebcd06&oe=6146C7CB&_nc_sid=4f375e"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recylerViewLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(recylerViewLayoutManager);
        ArrayList daftar = Data();
        recyclerViewAdapter = new AdapterRecyclerView(getApplicationContext(),daftar);
        recyclerView.setAdapter(recyclerViewAdapter);
    }

    private ArrayList Data(){
        ArrayList arrayList = new ArrayList<>();
        for(int i = 0; i < nama.length; i++){
            Daftar daftar = new Daftar();
            daftar.setNama(nama[i]);
            daftar.setUrl(url[i]);
            arrayList.add(daftar);
        }
        return arrayList;
    }

}
package com.app.chaerrull.myself.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.app.chaerrull.myself.Adapter.ActivityAdapter;
import com.app.chaerrull.myself.Adapter.FriendsAdapter;
import com.app.chaerrull.myself.R;

import java.util.ArrayList;
import java.util.List;

/*
Mohammad Chaerrull Febriansyah
10117171 - IF5

04-Mei : Membuat Splash Screen (Poin 1)
06-Mei : Membuat Walkthrought  (Poin 2)
08-Mei : Membuat Menu Menggunakan Bottom Navigation (Poin 3)
10-Mei : Membuat Halaman Menu Home (Poin 3.a)
14-Mei : Membuat Halaman Menu Activity dan Halaman Gallery (Poin 3.b & 3.c)
15-Mei : Membuat Halaman Favorite Musik dan Halaman Profile (Poin 3.d & 3.e)

 */

public class ActivityFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_activity, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable final Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        final List<String> items = new ArrayList<>();
        items.add("Maulana");
        items.add("Raisya");
        items.add("Tofan");
        items.add("Musyafa");
        items.add("Danu");
        items.add("Inas");
        items.add("Yasmin");
        items.add("Magfirani");
        items.add("Imran");
        items.add("Fadli");
        items.add("Raiz");
        items.add("Afri");

        final RecyclerView recyclerView = (RecyclerView) getActivity().findViewById(R.id.recyclerViewFriend);
        final LinearLayoutManager HorizontalLayoutManager = new LinearLayoutManager(getActivity() , LinearLayoutManager.HORIZONTAL, false);
        final FriendsAdapter friendsAdapter = new FriendsAdapter(items);
        recyclerView.setLayoutManager(HorizontalLayoutManager);
        recyclerView.smoothScrollToPosition(recyclerView.getBottom());
        recyclerView.setAdapter(friendsAdapter);


        final List<String> items_kegiatan = new ArrayList<>();
        items_kegiatan.add("Bangun Tidur");
        items_kegiatan.add("Mandi Pagi");
        items_kegiatan.add("Mengerjakan Tugas");
        items_kegiatan.add("Membaca Buku");
        items_kegiatan.add("Kursus Bahasa Inggris");
        items_kegiatan.add("Membantu Orang Tua");
        items_kegiatan.add("Bermain Bersama Adik");
        items_kegiatan.add("Memasak");
        items_kegiatan.add("Berolahraga");
        items_kegiatan.add("Menjaga Toko Keluarga");
        items_kegiatan.add("Menonton Film");
        items_kegiatan.add("Berbelanja");
        items_kegiatan.add("Tidur");
        items_kegiatan.add("Shalat");

        final RecyclerView recyclerView_kegiatan = (RecyclerView) getActivity().findViewById(R.id.recyclerViewKegiatan);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        final ActivityAdapter activityAdapter = new ActivityAdapter(items_kegiatan);
        recyclerView_kegiatan.setLayoutManager(linearLayoutManager);
        recyclerView_kegiatan.smoothScrollToPosition(recyclerView_kegiatan.getBottom());
        recyclerView_kegiatan.setAdapter(activityAdapter);
    }
}

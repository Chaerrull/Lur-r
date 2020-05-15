package com.app.chaerrull.myself.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.chaerrull.myself.Adapter.GalleryAdapter;
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

public class GalleryFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        return view;
    }
    @Override
    public void onActivityCreated(@Nullable final Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        final List<Integer> items = new ArrayList<>();
        items.add(R.drawable.gallery_1);
        items.add(R.drawable.gallery_2);
        items.add(R.drawable.gallery_3);
        items.add(R.drawable.gallery_4);
        items.add(R.drawable.foto_home);
        items.add(R.drawable.gallery_5);
        items.add(R.drawable.gallery_6);
        items.add(R.drawable.gallery_7);


        final RecyclerView recyclerView = (RecyclerView) getActivity().findViewById(R.id.recyclerViewGallery);
        final LinearLayoutManager GridLayoutManager = new GridLayoutManager(getActivity(), 2 , LinearLayoutManager.VERTICAL, false);
        final GalleryAdapter galleryAdapter = new GalleryAdapter(items);
        recyclerView.setLayoutManager(GridLayoutManager);
        recyclerView.setAdapter(galleryAdapter);
    }

}

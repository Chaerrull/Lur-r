package com.app.chaerrull.myself.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.app.chaerrull.myself.R;

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

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.GalleryHolder> {
        private final List<Integer> mItem;

        public GalleryAdapter(final List<Integer> items) {
            mItem = items;
        }

        @Override
        public GalleryHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
            final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gallery_item, parent, false);
            return new GalleryHolder(view);
        }

        @Override
        public void onBindViewHolder(final GalleryHolder holder, final int position) {
            final Integer item = mItem.get(position);
            holder.mimageView.setImageResource(item);
        }

        @Override
        public int getItemCount() {
            return mItem.size();
        }

        class GalleryHolder extends RecyclerView.ViewHolder {
            private final ImageView mimageView;

            public GalleryHolder(final View itemView) {
                super(itemView);
                mimageView = (ImageView) itemView.findViewById(R.id.IsiGallery);
            }

        }
    }

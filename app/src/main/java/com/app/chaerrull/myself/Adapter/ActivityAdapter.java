package com.app.chaerrull.myself.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.app.chaerrull.myself.R;
import com.app.chaerrull.myself.fragment.ActivityFragment;

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


public class ActivityAdapter extends RecyclerView.Adapter<ActivityAdapter.HolderKegiatan> {
    private final List<String> mItem_kegiatan;

    public ActivityAdapter(final List<String> items_kegiatan) {
        mItem_kegiatan = items_kegiatan;
    }

    @Override
    public HolderKegiatan onCreateViewHolder(final ViewGroup parent, final int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.daily_activity, parent, false);
        return new HolderKegiatan(view);
    }

    @Override
    public void onBindViewHolder(final HolderKegiatan holder, final int position) {
        final String item_kegiatan = mItem_kegiatan.get(position);
        holder.getTextView().setText(item_kegiatan);
    }

    @Override
    public int getItemCount() {
        return mItem_kegiatan.size();
    }

    class HolderKegiatan extends RecyclerView.ViewHolder {
        private final TextView mTextView;

        public HolderKegiatan(final View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.kegiatan);
        }

        public TextView getTextView() {
            return mTextView;
        }
    }
}

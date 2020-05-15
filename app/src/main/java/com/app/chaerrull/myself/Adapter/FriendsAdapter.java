package com.app.chaerrull.myself.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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

public class FriendsAdapter extends RecyclerView.Adapter<FriendsAdapter.FriendHolder> {
    private final List<String> mItems;

    public FriendsAdapter(final List<String> items) {
        mItems = items;
    }

    @Override
    public FriendHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.friend_list, parent, false);
        return new FriendHolder(view);
    }

    @Override
    public void onBindViewHolder(final FriendHolder holder, final int position) {
        final String item = mItems.get(position);
        holder.getTextView().setText(item);
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    class FriendHolder extends RecyclerView.ViewHolder {
        private final TextView mTextView;

        public FriendHolder(final View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.namaTeman);
        }

        public TextView getTextView() {
            return mTextView;
        }
    }
}

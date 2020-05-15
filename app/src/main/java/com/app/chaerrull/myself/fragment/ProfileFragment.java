package com.app.chaerrull.myself.fragment;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import com.app.chaerrull.myself.R;


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

public class ProfileFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ImageButton Instagram = (ImageButton) getActivity().findViewById(R.id.instagram);
        ImageButton Facebook = (ImageButton) getActivity().findViewById(R.id.facebook);
        ImageButton Twitter = (ImageButton) getActivity().findViewById(R.id.twitter);
        ImageButton Map = (ImageButton) getActivity().findViewById(R.id.map);

        Instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent instagramintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/mcfebriansyah"));
                startActivity(instagramintent);
            }
        });

        Facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent facebookintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/M.Chaerrull"));
                startActivity(facebookintent);
            }
        });

        Twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent twitterintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/McFebriansyah"));
                startActivity(twitterintent);
            }
        });

        Map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Aulia+Putri+Cell/@-6.874794,107.5347273,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68e45b66e1ec1d:0xfdfa7469dfd8932b!8m2!3d-6.874794!4d107.536916"));
                startActivity(mapintent);
            }
        });

        ImageButton about = (ImageButton) getActivity().findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });

    }
    private void showDialog(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getActivity());
        alertDialogBuilder.setTitle("About This App");
        alertDialogBuilder
                .setMessage("App Version : V 0.6")
                .setIcon(R.mipmap.ic_launcher)
                .setCancelable(false)
                .setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });


        AlertDialog alertDialog = alertDialogBuilder.create();

        alertDialog.show();
    }
}

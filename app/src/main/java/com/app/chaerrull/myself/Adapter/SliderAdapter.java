package com.app.chaerrull.myself.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

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


public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater inflater;

    public int[] ImageArray = { 0 , R.drawable.gambar2,0 };
    public String[] TitleArray = {"Hai... It's me Chaerrull","And you can find me with one of these media","Seriously.... Just press the button below"};
    public String[] DescArray  = {"Thank you for installing this App, this is an app for you who want to know me further","Now go on",""};

    public SliderAdapter(Context context){
        this.context = context;

    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view==object);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view= inflater.inflate(R.layout.slide,container,false);
        LinearLayout linearLayout = (LinearLayout)view.findViewById(R.id.linearlayout);
        ImageView imageView = (ImageView)view.findViewById(R.id.imgSlide);
        TextView title = (TextView)view.findViewById(R.id.txtTitle);
        TextView desc = (TextView)view.findViewById(R.id.descSlide);

        linearLayout.setBackgroundColor(Color.rgb(39, 161, 198));
        imageView.setImageResource(ImageArray[position]);
        title.setText(TitleArray[position]);
        desc.setText(DescArray[position]);
        container.addView(view);

        return view;
    }

    @Override
    public int getCount() {
        return TitleArray.length;
    }
}

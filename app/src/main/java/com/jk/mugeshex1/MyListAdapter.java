package com.jk.mugeshex1;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

class MyListAdapter extends  ArrayAdapter<String>  {
    private final Activity context;
    String[] str1;
    String[] str2;
    String[] str3;
    String[] str4;



    public MyListAdapter(MainActivity context, ArrayList<String> str1, ArrayList<String> str2, ArrayList<String> str3, ArrayList<String> str4) {
        super((Context) context, R.layout.ex,str1);
        this.context = (Activity) context;
        this.str1 = str1.toArray(new String[0]);
        this.str2= str2.toArray(new String[0]);
        this.str3=str3.toArray(new String[0]);
        this.str4=str4.toArray(new String[0]);



    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.ex, null,true);

        TextView Location = (TextView) rowView.findViewById(R.id.tv3);
        TextView Area=(TextView) rowView.findViewById(R.id.tv5);
        TextView Selection=(TextView)rowView.findViewById(R.id.tv7);
        TextView km=(TextView)rowView.findViewById(R.id.tv9);
        Location.setText(str1[position]);
        Area.setText(str2[position+1]);
        Selection.setText(str3[position+1]);
        km.setText(str4[position]);

        return rowView;

    };

}

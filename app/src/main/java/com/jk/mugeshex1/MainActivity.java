package com.jk.mugeshex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
   public static ListView list;
    public static ArrayList<String> str1=new ArrayList<String>();
    public static ArrayList<String> str2=new ArrayList<String>();
    public static ArrayList<String> str3=new ArrayList<String>();
    public static ArrayList<String> str4=new ArrayList<String>();
   public static int[] in=new int[10];
   //public static String[] st=new String[10];
    public static String item1,item2,item3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       str1.add("Democity1");
       str1.add("Democity2");
       str1.add("Democity3");
       str1.add("Democity4");
       str1.add("Democity5");
       str4.add("150");
        str4.add("500");
        str4.add("50");
        str4.add("900");
        str4.add("350");
        for(int i=0;i<5;i++)
        {
            in[i]=Integer.parseInt(str4.get(i));

        }
        final Spinner spinner1 = (Spinner) findViewById(R.id.sp1);
        final Spinner spinner2 = (Spinner) findViewById(R.id.sp2);
        final Spinner spinner3 = (Spinner) findViewById(R.id.sp3);
        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line
                ,str1);
        spinner1.setAdapter(adapter1);


         str2.add("--");

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                 item1=(String)spinner1.getItemAtPosition(position);
                if(item1=="Democity1")
                {
                    Toast.makeText(MainActivity.this,item1,Toast.LENGTH_SHORT).show();
                    area1();
                    str1.clear();
                    str1.add("Democity1");
                    str1.add("Democity1");
                    str1.add("Democity1");
                    str1.add("Democity1");
                    str1.add("Democity1");
                }
                else if(item1=="Democity2")
                {
                    Toast.makeText(MainActivity.this,item1,Toast.LENGTH_SHORT).show();
                    area2();
                    str1.clear();
                    str1.add("Democity2");
                    str1.add("Democity2");
                    str1.add("Democity2");
                    str1.add("Democity2");
                    str1.add("Democity2");


                }



            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter<String> adapter2=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line
                ,str2);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                 item2=(String)spinner2.getItemAtPosition(position);
                if(item2=="City1Area1")
                {
                    Toast.makeText(MainActivity.this,item2,Toast.LENGTH_SHORT).show();
                    str2.clear();
                    str2.add("City1Area1");
                    str2.add("City1Area1");
                    str2.add("City1Area1");
                    str2.add("City1Area1");
                    str2.add("City1Area1");
                    str2.add("City1Area1");
                    sel1();



                }
                else if(item2=="City1Area2")
                {
                    Toast.makeText(MainActivity.this,item2,Toast.LENGTH_SHORT).show();
                    sel2();
                    str2.clear();
                    str2.add("City1Area2");
                    str2.add("City1Area2");
                    str2.add("City1Area2");
                    str2.add("City1Area2");
                    str2.add("City1Area2");
                    str2.add("City1Area2");


                }
                else if(item2=="Demo2Area1")
                {
                    Toast.makeText(MainActivity.this,item2,Toast.LENGTH_SHORT).show();
                    sel1();
                    str2.clear();
                    str2.add("City2Area1");
                    str2.add("City2Area1");
                    str2.add("City2Area1");
                    str2.add("City2Area1");
                    str2.add("City2Area1");
                    str2.add("City2Area1");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        str3.add("--");
        ArrayAdapter<String> adapter3=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line
                ,str3);
        spinner3.setAdapter(adapter3);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                 item3=(String)spinner3.getItemAtPosition(position);
                if(item3=="D1A1Shop1")
                {
                    Toast.makeText(MainActivity.this,item3,Toast.LENGTH_SHORT).show();

                    call();
                    de();

                }
                else if(item3=="D1A1Shop2")
                {
                    Toast.makeText(MainActivity.this,item3,Toast.LENGTH_SHORT).show();
                    call();
                }
                else if(item3=="D1A1Shop3")
                {
                    Toast.makeText(MainActivity.this,item3,Toast.LENGTH_SHORT).show();
                    call();
                }
                else if(item3=="D1A1Shop4")
                {
                    Toast.makeText(MainActivity.this,item3,Toast.LENGTH_SHORT).show();
                    call();
                }
                else if(item3=="D1A1Shop5")
                {
                    Toast.makeText(MainActivity.this,item3,Toast.LENGTH_SHORT).show();
                    call();
                }



            }



            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });





    }

    public static void area1()
    {
        str2.clear();
        str2.add(0,"--");
        str2.add("City1Area1");
        str2.add("City1Area2");
        str2.add("City1Area3");
        str2.add("City1Area4");
        str2.add("City1Area5");



    }
   public static void area2()
    {
        str2.clear();
        str2.add(0,"--");
        str2.add("Demo2Area1");
        str2.add("Demo2Area2");
        str2.add("Demo2Area3");
        str2.add("Demo2Area4");
        str2.add("Demo2Area5");


    }
    public static void sel1()
    {
        str3.clear();
        str3.add(0,"--");
        str3.add("D1A1Shop1");
        str3.add("D1A1Shop2");
        str3.add("D1A1Shop3");
        str3.add("D1A1Shop4");
        str3.add("D1A1Shop5");



    }
    public static void sel2()
    {
        str3.clear();
        str3.add(0,"--");
        str3.add("D1A2Shop1");
        str3.add("D1A2Shop2");
        str3.add("D1A2Shop3");
        str3.add("D1A2Shop4");
        str3.add("D1A2Shop5");


    }
    public void call()
    {

        MyListAdapter adapter4=new MyListAdapter(this,str1,str2,str3,str4);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter4);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0) {
                    //code specific to first list item
                    Toast.makeText(getApplicationContext(),"Place Your First Option Code",Toast.LENGTH_SHORT).show();
                }
                if(position == 1) {
                    //code specific to first list item
                    Toast.makeText(getApplicationContext(),"Place Your First Option Code",Toast.LENGTH_SHORT).show();
                }
            }

        });

    }
public static void de()
{
    if(item1=="Democity1"||item1=="Democity2"||item1=="Democity3"||item1=="Democity4"||item1=="Democity5")
    {
            str1.clear();
          str1.add("Democity1");
        str1.add("Democity2");
        str1.add("Democity3");
        str1.add("Democity4");
        str1.add("Democity5");


    }
}
public  static void sort()
{
    int i,j,s;
    //String str;
    for(i=0;i<5;i++)
    {
        for (j=0;j<5;j++)
        {
            if(in[i]<=in[j])
            {
                s=in[i];
                //str=st[i];
                in[i]=in[j];
                //st[i]=st[j];
                in[j]=s;
                //st[j]=str;
            }
        }
    }
    str4.clear();
    str3.clear();
    for(i=0;i<5;i++)
    {
        str4.add(String.valueOf(in[i]));
    }
}

}

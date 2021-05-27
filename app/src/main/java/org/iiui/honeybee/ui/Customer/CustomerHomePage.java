package org.iiui.honeybee.ui.Customer;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import org.iiui.honeybee.Adapter;
import org.iiui.honeybee.HoneyItemsActivity;
import org.iiui.honeybee.PopularItemsAdapter;
import org.iiui.honeybee.R;
import org.iiui.honeybee.TrendingItemsAdapter;

import java.util.ArrayList;


public class CustomerHomePage extends Fragment
{
    RecyclerView recyclerView,recyclerView1,recyclerView2;
    CardView honey,plant,dryfruit;
    String names[]={"Honey Item1","Honey Item2","Honey Item3","Honey Item4","Honey Item5"};
    String names1[]={"Honey Item11","Honey Item22","Honey Item33","Honey Item44","Honey Item55"};
    String prices[]={"34.50 Pkr","10.50 Pkr","354.50 Pkr","14.50 Pkr","8.50 Pkr"};
    int images[]={R.drawable.honeyitem1,R.drawable.honeyitem1,R.drawable.honeyitem1,R.drawable.honeyitem1,R.drawable.honeyitem1};

    RecyclerView.LayoutManager RecyclerViewLayoutManager;
    RecyclerView.LayoutManager RecyclerViewLayoutManager1;
    RecyclerView.LayoutManager RecyclerViewLayoutManager2;
    Adapter adapter;
    PopularItemsAdapter adapter1;
    TrendingItemsAdapter adapter2;
    LinearLayoutManager HorizontalLayout;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_homepage, container, false);
        honey=root.findViewById(R.id.cardViewhoney);
        dryfruit=root.findViewById(R.id.cardViewdryfruit);
        plant=root.findViewById(R.id.cardViewplant);
        honey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(),HoneyItemsActivity.class);
                startActivity(intent);
            }
        });

        recyclerView
                = (RecyclerView) root.findViewById(R.id.recyclerview);
        recyclerView1
                = (RecyclerView) root.findViewById(R.id.recyclerview2);
        recyclerView2
                = (RecyclerView) root.findViewById(R.id.recyclerview3);
        RecyclerViewLayoutManager
                = new LinearLayoutManager(
               getContext());
        RecyclerViewLayoutManager1
                = new LinearLayoutManager(
                getContext());
        RecyclerViewLayoutManager2
                = new LinearLayoutManager(
                getContext());

        // Set LayoutManager on Recycler View
        recyclerView.setLayoutManager(
                RecyclerViewLayoutManager);
        recyclerView1.setLayoutManager(
                RecyclerViewLayoutManager1);
        recyclerView2.setLayoutManager(

                RecyclerViewLayoutManager2);


        // calling constructor of adapter
        // with source list as a parameter
        adapter = new Adapter(getContext(),names,prices,images);
        adapter1 = new PopularItemsAdapter(getContext(),names1,prices,images);
        adapter2 = new TrendingItemsAdapter(getContext(),names,prices,images);

        // Set Horizontal Layout Manager
        // for Recycler view
        HorizontalLayout
                = new LinearLayoutManager(getContext(),
                LinearLayoutManager.HORIZONTAL,
                false);
        recyclerView.setLayoutManager(HorizontalLayout);

        HorizontalLayout
                = new LinearLayoutManager(getContext(),
                LinearLayoutManager.HORIZONTAL,
                false);
        recyclerView1.setLayoutManager(HorizontalLayout);

        HorizontalLayout
                = new LinearLayoutManager(getContext(),
                LinearLayoutManager.HORIZONTAL,
                false);
        recyclerView2.setLayoutManager(HorizontalLayout);

        // Set adapter on recycler view
        recyclerView.setAdapter(adapter);
        recyclerView1.setAdapter(adapter1);
        recyclerView2.setAdapter(adapter2);


    // Function to add items in RecyclerView.



        return  root;
    }






}








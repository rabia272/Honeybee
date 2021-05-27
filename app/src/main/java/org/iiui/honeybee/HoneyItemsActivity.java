package org.iiui.honeybee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class HoneyItemsActivity extends AppCompatActivity {
    String names[]={"Honey Item1","Honey Item2","Honey Item3","Honey Item4","Honey Item5"};
    String prices[]={"34.50$","10.50$","354.50$","14.50$","8.50$"};
    RecyclerView recyclerViewhn;
    RecyclerView.LayoutManager RecyclerViewLayoutManager;
  AllHoneyItemsAdapter adapterh;
    LinearLayoutManager HorizontalLayout;
    int images[]={R.drawable.honeyitem1,R.drawable.honeyitem1,R.drawable.honeyitem1,R.drawable.honeyitem1,R.drawable.honeyitem1};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_honey_items);
        recyclerViewhn=findViewById(R.id.honeyItemsrecyclerView);

        RecyclerViewLayoutManager
                = new LinearLayoutManager(getApplicationContext());
        recyclerViewhn.setLayoutManager(
                RecyclerViewLayoutManager);
        adapterh = new AllHoneyItemsAdapter(getApplicationContext(),prices,names,images);
       GridLayoutManager gridLayoutManager
                = new GridLayoutManager(getApplicationContext(),2,
                GridLayoutManager.VERTICAL,
                false);
        recyclerViewhn.setLayoutManager(gridLayoutManager);
        recyclerViewhn.setAdapter(adapterh);
    }
}
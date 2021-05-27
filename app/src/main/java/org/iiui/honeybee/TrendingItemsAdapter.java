package org.iiui.honeybee;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TrendingItemsAdapter extends RecyclerView.Adapter<TrendingItemsAdapter.MyViewHolder> {

    // List with String type
    String data1[];
    String data2[];
    int images[];

    Context context;
    private TrendingItemsAdapter.OnItemClickListener mListener;
    public interface OnItemClickListener{
        void onItemClick(int position);
    }
    public  void setOnItemClickListener(TrendingItemsAdapter.OnItemClickListener listener)
    {
        mListener=listener;
    }
    public  TrendingItemsAdapter(Context ct, String s1[],String s2[],int img[])
    {
        context=ct;
        data1=s1;
        images=img;
        data2=s2;
    }


    @NonNull
    @Override
    public TrendingItemsAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.trendingitems,parent,false);

        return new TrendingItemsAdapter.MyViewHolder(view,mListener);
    }

    @Override
    public void onBindViewHolder(@NonNull TrendingItemsAdapter.MyViewHolder holder, int position) {
        holder.t1.setText(data1[position]);
        holder.img1.setImageResource(images[position]);
        holder.t2.setText(data2[position]);


    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView t1;
        ImageView img1;
        TextView t2;
        public MyViewHolder(@NonNull View itemView, final TrendingItemsAdapter.OnItemClickListener listener) {
            super(itemView);
            t1=itemView.findViewById(R.id.textview1);
            img1=itemView.findViewById(R.id.imageView55);
            t2=itemView.findViewById(R.id.textView66);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(listener!=null)
                    {
                        int position=getAdapterPosition();
                        if(position!=RecyclerView.NO_POSITION)
                        {
                            listener.onItemClick(position);
                        }
                    }
                }
            });

        }
    }
}




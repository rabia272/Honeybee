package org.iiui.honeybee;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AllHoneyItemsAdapter  extends RecyclerView.Adapter<AllHoneyItemsAdapter.MyViewHolder> {

    // List with String type
    String data1[];
    String data2[];
    int images[];

    Context context;
    private  AllHoneyItemsAdapter.OnItemClickListener mListener;
    public interface OnItemClickListener{
        void onItemClick(int position);
    }
    public  void setOnItemClickListener( AllHoneyItemsAdapter.OnItemClickListener listener)
    {
        mListener=listener;
    }
    public   AllHoneyItemsAdapter(Context ct, String s1[],String s2[],int img[])
    {
        context=ct;
        data1=s1;
        images=img;
        data2=s2;
    }


    @NonNull
    @Override
    public AllHoneyItemsAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.honeyitemsrow,parent,false);

        return new AllHoneyItemsAdapter.MyViewHolder(view,mListener);
    }

    @Override
    public void onBindViewHolder(@NonNull  AllHoneyItemsAdapter.MyViewHolder holder, int position) {
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
        public MyViewHolder(@NonNull View itemView, final AllHoneyItemsAdapter.OnItemClickListener listener) {
            super(itemView);
            t1=itemView.findViewById(R.id.textView9h);
            img1=itemView.findViewById(R.id.imageView4h);
            t2=itemView.findViewById(R.id.textView10h);
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



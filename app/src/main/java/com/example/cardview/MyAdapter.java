package com.example.cardview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<BrandViewHolder> {
    private Context mContext; // class name
    private List<BrandData> mBrandList;

    MyAdapter(Context mContext, List<BrandData> mBrandList)
    {
           this.mContext = mContext;
           this.mBrandList = mBrandList;

    }


    public BrandViewHolder onCreateViewHolder(ViewGroup parent,int viewType)
    {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item_row,parent,false);
        return new BrandViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(final BrandViewHolder holder, int position)
    {
        holder.mImage.setImageResource(mBrandList.get(position).getBrandImage());
        holder.mTitle.setText(mBrandList.get(position).getBrandTitle());

    }

    @Override
    public int getItemCount() {
        return mBrandList.size();
    }


}

class BrandViewHolder extends RecyclerView.ViewHolder
{
    ImageView mImage;
    TextView mTitle;
    CardView mCardView;

    public BrandViewHolder(@NonNull View itemView)
    {
        super(itemView);

        mImage = itemView.findViewById(R.id.brandImage);
        mTitle = itemView.findViewById(R.id.Title);
        mCardView = itemView.findViewById(R.id.cardView);
    }
}


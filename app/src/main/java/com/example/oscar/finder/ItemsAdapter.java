package com.example.oscar.finder;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.MyViewHolder> {

    private Context mContext;
    private List<Item> itemList;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, count;
        public ImageView thumbnail, overflow;
        public ImageButton imgButton;



        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            count = (TextView) view.findViewById(R.id.count);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
            overflow = (ImageView) view.findViewById(R.id.overflow);


        }
    }


    public ItemsAdapter(Context mContext, List<Item> itemList) {
        this.mContext = mContext;
        this.itemList = itemList;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        Item item = itemList.get(position);
        Uri myUri = Uri.parse(item.getUrl());
        holder.title.setText(item.getName());
        holder.count.setText(item.getNum() + " number");
        holder.thumbnail.setImageURI(myUri);


        // loading cover using Glide library
        Glide.with(mContext).load(item.getAddress()).into(holder.thumbnail);

        holder.overflow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(),MapsActivity.class));
            }
        });
     /*       @Override
            public void onClick(View view) {
                showPopupMenu(holder.overflow);
            }
        });*/
    }


    /**
     * Showing popup menu when tapping on maps
     *//*
          private void showPopupMenu(View view) {
        Intent mapsIntent = new Intent(mContext, MapsActivity.class);
        PopupMenu popup = new PopupMenu(mContext, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu_item, popup.getMenu());
        popup.setOnMenuItemClickListener(new MyMenuItemClickListener());
        popup.show();

    }*/

    /**
     * Click listener for popup menu items
     */
 /*   class MyMenuItemClickListener implements PopupMenu.OnMenuItemClickListener {
        public MyMenuItemClickListener() {

        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {

            switch (menuItem.getItemId()) {
                case R.id.action_maps:
                    Toast.makeText(mContext,  "karta öppnad", Toast.LENGTH_SHORT).show();


                    return true;

                *//*case R.id.action_play_next:
                    Toast.makeText(mContext, "next", Toast.LENGTH_SHORT).show();
                    return true;*//*
                default:
            }
            return false;
        }
    }*/

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
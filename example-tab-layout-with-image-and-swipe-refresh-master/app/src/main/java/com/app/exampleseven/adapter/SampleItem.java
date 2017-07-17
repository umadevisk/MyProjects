package com.app.exampleseven.adapter;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.exampleseven.R;
import com.mikepenz.fastadapter.items.AbstractItem;

public class SampleItem extends AbstractItem<SampleItem, SampleItem.ViewHolder> {

    public String date;
    public String title;
    public  String desc;
    public int Image;
    //The unique ID for this type of item
    @Override
    public int getType() {
        return R.id.adapter_sample_item_id1;

    }



    //The layout to be used for this type of item
    @Override
    public int getLayoutRes() {
        return R.layout.adapter_sample_item;
    }

    public SampleItem withName(String desc,String title,String Date,int image) {
        this.desc = desc;
        this.title = title;
        this.date = Date;
        this.Image=image;
        return this;
    }

    //The logic to bind your data to the view
    @Override
    public void bindView(ViewHolder viewHolder) {
        super.bindView(viewHolder);

        viewHolder.desc.setText(desc);
        viewHolder.title.setText(title);
        viewHolder.date.setText(date);

        viewHolder.image.setImageResource(Image);

    }

    //The viewHolder used for this item. This viewHolder is always reused by the RecyclerView so scrolling is blazing fast
    protected static class ViewHolder extends RecyclerView.ViewHolder {
        protected TextView desc,title,date;
        protected  ImageView image;

        public ViewHolder(View view) {
            super(view);
            this.desc = (TextView) view.findViewById(R.id.desc);
            this.title = (TextView) view.findViewById(R.id.title);
            this.date = (TextView) view.findViewById(R.id.date);
            image=(ImageView)view.findViewById(R.id.image);



        }
    }
}
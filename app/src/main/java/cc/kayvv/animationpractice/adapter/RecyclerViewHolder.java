package cc.kayvv.animationpractice.adapter;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import cc.kayvv.animationpractice.R;
import cc.kayvv.animationpractice.SecondActivity;

/**
 * Created by Kay on 2017/3/7.
 */

public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    ImageView mItemImage;
    TextView mItemTitle;

    public RecyclerViewHolder(View itemView) {
        super(itemView);
        mItemImage = (ImageView)itemView.findViewById(R.id.view_item_image);
        mItemTitle = (TextView)itemView.findViewById(R.id.view_item_title);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Context context = itemView.getContext();
        Intent intent=new Intent(context,SecondActivity.class);
        //context.startActivity(intent,ActivityOptions.makeSceneTransitionAnimation((Activity) context, mItemImage, "sharedView").toBundle());
        context.startActivity(intent);
    }
}

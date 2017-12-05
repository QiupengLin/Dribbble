package com.example.qiupenglin.dribbble_app.view.shot_list;

import android.view.View;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.example.qiupenglin.dribbble_app.R;
import com.example.qiupenglin.dribbble_app.view.base.BaseViewHolder;

import butterknife.BindView;

class ShotViewHolder extends BaseViewHolder {

    @BindView(R.id.shot_clickable_cover) public View cover;
    @BindView(R.id.shot_like_count) public TextView likeCount;
    @BindView(R.id.shot_bucket_count) public TextView bucketCount;
    @BindView(R.id.shot_view_count) public TextView viewCount;
    @BindView(R.id.shot_image) public SimpleDraweeView image;

    public ShotViewHolder(View itemView) {
        super(itemView);
    }
}

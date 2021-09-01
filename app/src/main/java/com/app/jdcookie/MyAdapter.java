package com.app.jdcookie;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

import org.jetbrains.annotations.NotNull;

/**
 * @author mrzhu
 * on 9/1/21
 * ClassName：
 */
public class MyAdapter extends BaseQuickAdapter<String, BaseViewHolder> {


    public MyAdapter() {
        super(R.layout.item_main_layout);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, String s) {

        baseViewHolder.setText(R.id.item_main_text, s);
    }
}

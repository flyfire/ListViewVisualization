package com.joker.listviewtest;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Item1 extends LinearLayout {
  private TextView tv;

  public Item1(Context context) {
    this(context, null);
  }

  public Item1(Context context,
      @Nullable AttributeSet attrs) {
    this(context, attrs, 0);
  }

  public Item1(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    inflate(context, R.layout.item_1, this);
    tv = findViewById(R.id.tv_content);
  }

  @Override public String toString() {
    return "\n" + "Item1---" + tv.getText();
  }
}

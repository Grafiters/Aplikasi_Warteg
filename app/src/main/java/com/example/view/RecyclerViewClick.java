package com.example.view;

import android.view.View;

public interface RecyclerViewClick {
    void onClick(View view, int position);
    void onLong(View view, int position);
}

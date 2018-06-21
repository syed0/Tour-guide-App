package com.example.tourguide.tourguide;

import android.content.Context;

import java.util.ArrayList;

public class restaurent_data {
    public static void initFoodList(ArrayList<custom> custom, Context context) {
        custom.add(new custom(R.string.r_1, R.string.r_s1));
        custom.add(new custom(R.string.r_2, R.string.r_s2));
        custom.add(new custom(R.string.r_3, R.string.r_s3));
        custom.add(new custom(R.string.r_4, R.string.r_s4));
        custom.add(new custom(R.string.r_5, R.string.r_s5));
        custom.add(new custom(R.string.r_6, R.string.r_s6));
        custom.add(new custom(R.string.r_7, R.string.r_s7));

    }
}

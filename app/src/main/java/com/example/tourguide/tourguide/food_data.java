package com.example.tourguide.tourguide;

import android.content.Context;

import java.util.ArrayList;

public class food_data {
    public static void initFoodList(ArrayList<custom> custom, Context context) {
        custom.add(new custom(R.drawable.roganjosh, R.string.f_1, R.string.f_1));
        custom.add(new custom(R.drawable.dumolav, R.string.f_2, R.string.f_2));
        custom.add(new custom(R.drawable.lyodurchaman, R.string.f_3, R.string.f_3));
        custom.add(new custom(R.drawable.modurpulao, R.string.f_4, R.string.f_4));
        custom.add(new custom(R.drawable.thenduk, R.string.f_5, R.string.f_5));
        custom.add(new custom(R.drawable.thukpa, R.string.f_6, R.string.f_6));

    }
}

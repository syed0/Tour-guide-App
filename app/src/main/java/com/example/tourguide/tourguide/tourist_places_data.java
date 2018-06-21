package com.example.tourguide.tourguide;

import android.content.Context;

import java.util.ArrayList;

public class tourist_places_data {
    public static void initFoodList(ArrayList<custom> custom, Context context) {
        custom.add(new custom(R.string.t_p_1, R.string.t_ps1));
        custom.add(new custom(R.string.t_p_2, R.string.t_ps1));
        custom.add(new custom(R.string.t_p_3, R.string.t_ps3));
        custom.add(new custom(R.string.t_p_4, R.string.t_ps4));
        custom.add(new custom(R.string.t_p_5, R.string.t_ps5));
        custom.add(new custom(R.string.t_p_6, R.string.t_ps6));
        custom.add(new custom(R.string.t_p_7, R.string.t_ps7));
        custom.add(new custom(R.string.t_p_8, R.string.t_ps8));


    }
}

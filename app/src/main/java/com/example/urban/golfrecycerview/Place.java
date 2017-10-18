package com.example.urban.golfrecycerview;

import android.content.Context;

/**
 * Created by urban on 18. 10. 2017.
 */

public class Place {
    public String name;
    public String imageName;

    public int getImageResourceId(Context context) {
        return context.getResources().getIdentifier(this.imageName, "drawable", context.getPackageName());
    }
}
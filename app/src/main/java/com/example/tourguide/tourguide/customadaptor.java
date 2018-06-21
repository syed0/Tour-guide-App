package com.example.tourguide.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class customadaptor extends ArrayAdapter<custom> {
    public customadaptor(Activity context, ArrayList<custom> numbers) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, numbers);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.common_layout, parent, false);
        }


        custom current = getItem(position);

        ImageView nameImageView = (ImageView) convertView.findViewById(R.id.image);
        assert current != null;
        nameImageView.setImageResource(current.getImageid());

        TextView nameTextView = (TextView) convertView.findViewById(R.id.text1);

        nameTextView.setText(current.getName());
        TextView nameTextView1 = (TextView) convertView.findViewById(R.id.text2);

        nameTextView1.setText(current.getSubname());


        return convertView;
    }

}

package com.example.instagram.adaptors;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.R;
import com.example.instagram.classes.stories;

import java.util.ArrayList;

public class Adaptors extends RecyclerView.Adapter<Adaptors.viewHolder> {

    Context context;
    private ArrayList<stories> arrayList;

    public Adaptors(Context context, ArrayList<stories> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    public viewHolder onCreateViewHolder( ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.stories_items,viewGroup,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(viewHolder viewHolder, int i) {
        stories stories=arrayList.get(i);

        viewHolder.name.setText(stories.getName());

        viewHolder.imageView.setImageResource(stories.getImg());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView name;
        ImageView imageView;
        public viewHolder(View itemView) {
            super(itemView);

            name=itemView.findViewById(R.id.storyUsername);
            imageView=itemView.findViewById(R.id.profileImageView);
        }
    }
}

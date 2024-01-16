package com.example.instagram.adaptors;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.R;
import com.example.instagram.classes.post;

import java.util.ArrayList;

public class postadaptors extends RecyclerView.Adapter<postadaptors.ViewHolder>
{
    private Context context;
    private ArrayList<post> posts;


    public postadaptors(Context context, ArrayList<post> posts) {
        this.context = context;
        this.posts = posts;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(context).inflate(R.layout.post_items,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder( ViewHolder viewHolder, int i) {
             post post=posts.get(i);

             viewHolder.username.setText(post.getUsername());
             viewHolder.userdp.setImageResource(post.getProfilepicture());
             viewHolder.img.setImageResource(post.getImg());
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView userdp,img;
        private TextView username;
        public ViewHolder(View itemView) {
            super(itemView);
            userdp=itemView.findViewById(R.id.profilePicture);
            img=itemView.findViewById(R.id.imagePost);
            username=itemView.findViewById(R.id.username);
        }
    }
}

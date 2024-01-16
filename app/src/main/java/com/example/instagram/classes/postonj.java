package com.example.instagram.classes;

import com.example.instagram.R;

import java.util.ArrayList;

public class postonj {

    public postonj() {
    }
    public ArrayList<post> postarrayList()
    {
        ArrayList<post> posts=new ArrayList<>();
        posts.add(new post(R.drawable.nithi,R.drawable.nithidp,"nithi____"));
        posts.add(new post(R.drawable.rajesh,R.drawable.rajesh,"heart__hacker.rk"));
        posts.add(new post(R.drawable.mukilan,R.drawable.mukilan,"mr_pm14"));
        posts.add(new post(R.drawable.partha,R.drawable.parthadp,"im_partha14"));
        posts.add(new post(R.drawable.sanjith,R.drawable.sanjithdp,"sanjith_m_s"));
        posts.add(new post(R.drawable.navaneethan,R.drawable.navaneethan,"navanethan_005"));
        posts.add(new post(R.drawable.mukilan,R.drawable.mukilan,"mr_pm14"));



        return posts;
    }
}

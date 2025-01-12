package com.example.instagram.activitiess;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.instagram.R;
import com.example.instagram.adaptors.Adaptors;
import com.example.instagram.adaptors.postadaptors;
import com.example.instagram.classes.postonj;
import com.example.instagram.classes.stories_onj;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView r=findViewById(R.id.recyclerView);
        r.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        stories_onj stories_onj=new stories_onj();
        Adaptors adaptors=new Adaptors(this,stories_onj.arrayList());
        r.setAdapter(adaptors);



        RecyclerView t=findViewById(R.id.recyclerView1);
        t.setLayoutManager(new LinearLayoutManager(this));
        postonj postonj=new postonj();
        postadaptors postadaptors=new postadaptors(this,postonj.postarrayList());
        t.setAdapter(postadaptors);

        bottomNavigationView=findViewById(R.id.bottombar);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();
                if(id==R.id.search)
                {
                    Intent intent=new Intent(MainActivity.this, search.class);
                    startActivity(intent);
                } if (id==R.id.reels) {

                    Intent intent=new Intent(MainActivity.this, reels.class);
                    startActivity(intent);
                } if (id==R.id.profie) {
                    Intent intent=new Intent(MainActivity.this, profile.class);
                    startActivity(intent);

                }
                if(id==R.id.plus)
                {
                    Intent intent=new Intent(MainActivity.this, plus.class);
                    startActivity(intent);
                }

                return true;

            }
        });

    }
}
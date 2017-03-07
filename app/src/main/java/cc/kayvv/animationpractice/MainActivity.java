package cc.kayvv.animationpractice;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import cc.kayvv.animationpractice.adapter.RecyclerViewAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        final ImageView firstView = (ImageView)findViewById(R.id.first_image);
        firstView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                //context.startActivity(intent,ActivityOptions.makeSceneTransitionAnimation((Activity) context, mItemImage, "sharedView").toBundle());
                startActivity(intent,ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, firstView, "sharedView").toBundle());
            }
        });


//        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);
//        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter();
//        recyclerView.setAdapter(recyclerAdapter);

    }
}

package com.vishal.quadb;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ImageView imageView = findViewById(R.id.imageView);
        TextView title = findViewById(R.id.title);
        TextView summary = findViewById(R.id.summary);
        TextView network = findViewById(R.id.network);
        TextView premiered = findViewById(R.id.premiered);

        Intent intent = getIntent();
        Show show = intent.getParcelableExtra("show");

        if (show != null) {
            title.setText(show.getName());
            summary.setText(show.getSummary());
            Glide.with(this)
                    .load(show.getImage().getOriginal())
                    .placeholder(R.drawable.logo) // Optional: Placeholder image but put it because like some movie dont have image
                    .into(imageView);

            network.setText("Network: " + show.getNetwork().getName());
            premiered.setText("Premiered: " + show.getPremiered());
        }
    }
}

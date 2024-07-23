package com.vishal.quadb;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
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
        TextView genres = findViewById(R.id.genres);
        TextView language = findViewById(R.id.language);
        TextView rating = findViewById(R.id.rating);
        Button officialSite = findViewById(R.id.officialSite);
        TextView externals = findViewById(R.id.externals);
        TextView previousEpisode = findViewById(R.id.previousEpisode);

        Intent intent = getIntent();
        Show show = intent.getParcelableExtra("show");

        if (show != null) {
            title.setText(show.getName() != null ? show.getName() : "N/A");
            summary.setText(show.getSummary() != null ? show.getSummary() : "N/A");

            if (show.getImage() != null && show.getImage().getOriginal() != null) {
                Glide.with(this).load(show.getImage().getOriginal()).into(imageView);
            } else {
                imageView.setImageResource(R.drawable.logo); // Set a placeholder image if null
            }

            if (show.getNetwork() != null) {
                network.setText("Network: " + (show.getNetwork().getName() != null ? show.getNetwork().getName() : "N/A"));
            } else {
                network.setText("Network: N/A");
            }

            premiered.setText("Premiered: " + (show.getPremiered() != null ? show.getPremiered() : "N/A"));
            genres.setText("Genres: " + (show.getGenres() != null ? String.join(", ", show.getGenres()) : "N/A"));
            language.setText("Language: " + (show.getLanguage() != null ? show.getLanguage() : "N/A"));
            rating.setText("Rating: " + (show.getRating() != null && show.getRating().getAverage() != 0 ? show.getRating().getAverage() : "N/A"));
            externals.setText("IMDB: " + (show.getExternals() != null && show.getExternals().getImdb() != null ? show.getExternals().getImdb() : "N/A"));

            if (show.getOfficialSite() != null) {
                officialSite.setOnClickListener(v -> {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(show.getOfficialSite()));
                    startActivity(browserIntent);
                });
            } else {
                officialSite.setEnabled(false);
                officialSite.setText("No Official Site");
            }

            if (show.getLinks() != null && show.getLinks().getPreviousepisode() != null) {
                previousEpisode.setText("Previous Episode: " + show.getLinks().getPreviousepisode().getName());
            } else {
                previousEpisode.setText("Previous Episode: N/A");
            }
        }
    }
}

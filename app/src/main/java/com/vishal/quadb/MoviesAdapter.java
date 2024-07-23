package com.vishal.quadb;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MovieViewHolder> {

    private Context context;
    private List<Show> showList;

    public MoviesAdapter(Context context, List<Show> showList) {
        this.context = context;
        this.showList = showList;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_movie, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        Show show = showList.get(position);
        holder.title.setText(show.getName());
        holder.summary.setText(show.getSummary());

        if (show.getImage() != null && show.getImage().getMedium() != null) {
            Glide.with(context).load(show.getImage().getMedium()).into(holder.thumbnail);
        } else {
            holder.thumbnail.setImageResource(R.drawable.logo); // Placeholder image if URL is null because like some movie dont have image
        }


        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetailsActivity.class);
            intent.putExtra("show", show); // Passes the Show object
            context.startActivity(intent);
        });
    }


    @Override
    public int getItemCount() {
        return showList.size();
    }

    public static class MovieViewHolder extends RecyclerView.ViewHolder {
        TextView title, summary;
        ImageView thumbnail;

        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            summary = itemView.findViewById(R.id.summary);
            thumbnail = itemView.findViewById(R.id.thumbnail);
        }
    }
}

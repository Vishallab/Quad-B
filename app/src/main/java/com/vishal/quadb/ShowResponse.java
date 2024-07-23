package com.vishal.quadb;


import java.util.ArrayList;
import java.util.List;

public class ShowResponse {
    private Show show;

    public Show getShow() {
        return show;
    }

    public static List<Show> getShows(List<ShowResponse> showResponses) {
        List<Show> shows = new ArrayList<>();
        for (ShowResponse showResponse : showResponses) {
            shows.add(showResponse.getShow());
        }
        return shows;
    }
}

package com.vishal.quadb;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class Show implements Parcelable {
    private String name;
    private String summary;
    private Image image;
    private Network network;
    private String premiered;
    private List<String> genres;
    private String language;
    private Rating rating;
    private String officialSite;
    private Externals externals;
    private Links links;

    protected Show(Parcel in) {
        name = in.readString();
        summary = in.readString();
        image = in.readParcelable(Image.class.getClassLoader());
        network = in.readParcelable(Network.class.getClassLoader());
        premiered = in.readString();
        genres = in.createStringArrayList();
        language = in.readString();
        rating = in.readParcelable(Rating.class.getClassLoader());
        officialSite = in.readString();
        externals = in.readParcelable(Externals.class.getClassLoader());
        links = in.readParcelable(Links.class.getClassLoader());
    }

    public static final Creator<Show> CREATOR = new Creator<Show>() {
        @Override
        public Show createFromParcel(Parcel in) {
            return new Show(in);
        }

        @Override
        public Show[] newArray(int size) {
            return new Show[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(summary);
        dest.writeParcelable(image, flags);
        dest.writeParcelable(network, flags);
        dest.writeString(premiered);
        dest.writeStringList(genres);
        dest.writeString(language);
        dest.writeParcelable(rating, flags);
        dest.writeString(officialSite);
        dest.writeParcelable(externals, flags);
        dest.writeParcelable(links, flags);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public String getSummary() {
        return summary;
    }

    public Image getImage() {
        return image;
    }

    public Network getNetwork() {
        return network;
    }

    public String getPremiered() {
        return premiered;
    }

    public List<String> getGenres() {
        return genres;
    }

    public String getLanguage() {
        return language;
    }

    public Rating getRating() {
        return rating;
    }

    public String getOfficialSite() {
        return officialSite;
    }

    public Externals getExternals() {
        return externals;
    }

    public Links getLinks() {
        return links;
    }

    public static class Image implements Parcelable {
        private String medium;
        private String original;

        protected Image(Parcel in) {
            medium = in.readString();
            original = in.readString();
        }

        public static final Creator<Image> CREATOR = new Creator<Image>() {
            @Override
            public Image createFromParcel(Parcel in) {
                return new Image(in);
            }

            @Override
            public Image[] newArray(int size) {
                return new Image[size];
            }
        };

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(medium);
            dest.writeString(original);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public String getMedium() {
            return medium;
        }

        public String getOriginal() {
            return original;
        }
    }

    public static class Network implements Parcelable {
        private String name;

        protected Network(Parcel in) {
            name = in.readString();
        }

        public static final Creator<Network> CREATOR = new Creator<Network>() {
            @Override
            public Network createFromParcel(Parcel in) {
                return new Network(in);
            }

            @Override
            public Network[] newArray(int size) {
                return new Network[size];
            }
        };

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(name);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public String getName() {
            return name;
        }
    }

    public static class Rating implements Parcelable {
        private double average;

        protected Rating(Parcel in) {
            average = in.readDouble();
        }

        public static final Creator<Rating> CREATOR = new Creator<Rating>() {
            @Override
            public Rating createFromParcel(Parcel in) {
                return new Rating(in);
            }

            @Override
            public Rating[] newArray(int size) {
                return new Rating[size];
            }
        };

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeDouble(average);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public double getAverage() {
            return average;
        }
    }

    public static class Externals implements Parcelable {
        private String imdb;

        protected Externals(Parcel in) {
            imdb = in.readString();
        }

        public static final Creator<Externals> CREATOR = new Creator<Externals>() {
            @Override
            public Externals createFromParcel(Parcel in) {
                return new Externals(in);
            }

            @Override
            public Externals[] newArray(int size) {
                return new Externals[size];
            }
        };

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(imdb);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public String getImdb() {
            return imdb;
        }
    }

    public static class Links implements Parcelable {
        private PreviousEpisode previousepisode;

        protected Links(Parcel in) {
            previousepisode = in.readParcelable(PreviousEpisode.class.getClassLoader());
        }

        public static final Creator<Links> CREATOR = new Creator<Links>() {
            @Override
            public Links createFromParcel(Parcel in) {
                return new Links(in);
            }

            @Override
            public Links[] newArray(int size) {
                return new Links[size];
            }
        };

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(previousepisode, flags);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public PreviousEpisode getPreviousepisode() {
            return previousepisode;
        }

        public static class PreviousEpisode implements Parcelable {
            private String name;
            private String href;

            protected PreviousEpisode(Parcel in) {
                name = in.readString();
                href = in.readString();
            }

            public static final Creator<PreviousEpisode> CREATOR = new Creator<PreviousEpisode>() {
                @Override
                public PreviousEpisode createFromParcel(Parcel in) {
                    return new PreviousEpisode(in);
                }

                @Override
                public PreviousEpisode[] newArray(int size) {
                    return new PreviousEpisode[size];
                }
            };

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeString(name);
                dest.writeString(href);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public String getName() {
                return name;
            }

            public String getHref() {
                return href;
            }
        }
    }
}

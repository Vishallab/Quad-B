package com.vishal.quadb;

import android.os.Parcel;
import android.os.Parcelable;

public class Show implements Parcelable {
    private String name;
    private String summary;
    private Image image;
    private Network network;
    private String premiered;

    protected Show(Parcel in) {
        name = in.readString();
        summary = in.readString();
        image = in.readParcelable(Image.class.getClassLoader());
        network = in.readParcelable(Network.class.getClassLoader());
        premiered = in.readString();
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
}

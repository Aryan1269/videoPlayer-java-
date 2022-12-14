package com.example.player;

import android.os.Parcel;
import android.os.Parcelable;

public class MediaFiles implements Parcelable {

    private  String id;
    private  String title;
    private  String displayName;
    private  String size;
    private  String duration;
    private  String path;
    private  String dataAddad;

    public MediaFiles(String id, String title, String displayName, String size, String duration, String path, String dataAddad) {
        this.id = id;
        this.title = title;
        this.displayName = displayName;
        this.size = size;
        this.duration = duration;
        this.path = path;
        this.dataAddad = dataAddad;
    }

    protected MediaFiles(Parcel in) {
        id = in.readString();
        title = in.readString();
        displayName = in.readString();
        size = in.readString();
        duration = in.readString();
        path = in.readString();
        dataAddad = in.readString();
    }

    public static final Creator<MediaFiles> CREATOR = new Creator<MediaFiles>() {
        @Override
        public MediaFiles createFromParcel(Parcel in) {
            return new MediaFiles(in);
        }

        @Override
        public MediaFiles[] newArray(int size) {
            return new MediaFiles[size];
        }
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDataAddad() {
        return dataAddad;
    }

    public void setDataAddad(String dataAddad) {
        this.dataAddad = dataAddad;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(id);
        parcel.writeString(title);
        parcel.writeString(displayName);
        parcel.writeString(size);
        parcel.writeString(duration);
        parcel.writeString(path);
        parcel.writeString(dataAddad);
    }
}

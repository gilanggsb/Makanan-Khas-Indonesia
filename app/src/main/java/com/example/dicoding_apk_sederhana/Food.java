package com.example.dicoding_apk_sederhana;

import android.os.Parcel;
import android.os.Parcelable;

public class Food implements Parcelable {
    private String name;
    private String detail;
    private int photo;


    protected Food(Parcel in) {
        name = in.readString();
        detail = in.readString();
        photo = in.readInt();
    }

    public Food(String name, String detail, int imgPhoto) {
        this.name = name;
        this.detail = detail;
        this.photo = imgPhoto;
    }


    public static final Creator<Food> CREATOR = new Creator<Food>() {
        @Override
        public Food createFromParcel(Parcel in) {
            return new Food(in);
        }

        @Override
        public Food[] newArray(int size) {
            return new Food[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(detail);
        parcel.writeInt(photo);
    }

    public Food() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

}

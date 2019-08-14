package com.example.recyclerview;

import android.os.Parcel;
import android.os.Parcelable;

public class Pokemon implements Parcelable{

    String name,image,type,ability,height,weight,desc;

    public Pokemon(String name, String image, String type, String ability, String height, String weight, String desc) {
        this.name = name;
        this.image = image;
        this.type = type;
        this.ability = ability;
        this.height = height;
        this.weight = weight;
        this.desc = desc;
    }

    public Pokemon(String name, String image) {
        this.name = name;
        this.image = image;
    }

    protected Pokemon(Parcel in) {
        name = in.readString();
        image = in.readString();
        type = in.readString();
        ability = in.readString();
        height = in.readString();
        weight = in.readString();
        desc = in.readString();
    }

    public static final Creator<Pokemon> CREATOR = new Creator<Pokemon>() {
        @Override
        public Pokemon createFromParcel(Parcel in) {
            return new Pokemon(in);
        }

        @Override
        public Pokemon[] newArray(int size) {
            return new Pokemon[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(image);
        dest.writeString(type);
        dest.writeString(ability);
        dest.writeString(height);
        dest.writeString(weight);
        dest.writeString(desc);
    }
}

package com.alwaysbaked.noteskeeper.data;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;


@Entity
public class ListItem {

    @PrimaryKey
    @NonNull
    private String itemId;

    private String title;

    private int colorResource;

    public ListItem(String itemId, String title, int colorResource) {
        this.itemId = itemId;
        this.title = title;
        this.colorResource = colorResource;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getColorResource() {
        return colorResource;
    }

    public void setColorResource(int colorResource) {
        this.colorResource = colorResource;
    }

}
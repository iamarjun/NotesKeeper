package com.alwaysbaked.noteskeeper.data;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface ListItemDao {

    @Query("SELECT * FROM ListItem")
    LiveData<List<ListItem>> getListItem();

    @Query("SELECT * FROM ListItem WHERE itemId = :itemId")
    LiveData<ListItem> getListItemById(String itemId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Long insertListItem(ListItem listItem);

    @Delete
    void deleteListItem(ListItem listItem);

}

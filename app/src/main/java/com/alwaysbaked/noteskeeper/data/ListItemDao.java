package com.alwaysbaked.noteskeeper.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

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

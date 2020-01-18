package com.alwaysbaked.noteskeeper.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {ListItem.class}, version = 1)
public abstract class ListItemDatabase extends RoomDatabase {

    public abstract ListItemDao listItemDao();
}

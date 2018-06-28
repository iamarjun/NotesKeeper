package com.alwaysbaked.noteskeeper.dependencyinjection;

import android.app.Application;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.persistence.room.Room;

import com.alwaysbaked.noteskeeper.data.ListItemDao;
import com.alwaysbaked.noteskeeper.data.ListItemDatabase;
import com.alwaysbaked.noteskeeper.data.ListItemRepository;
import com.alwaysbaked.noteskeeper.viewmodel.CustomViewModelFactory;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RoomModule {

    private final ListItemDatabase database;

    public RoomModule(Application application) {
        this.database = Room.databaseBuilder(
                application,
                ListItemDatabase.class,
                "ListItem.db"
        ).build();
    }

    @Provides
    @Singleton
    ListItemRepository provideListItemRepository(ListItemDao listItemDao){
        return new ListItemRepository(listItemDao);
    }

    @Provides
    @Singleton
    ListItemDao provideListItemDao(ListItemDatabase database){
        return database.listItemDao();
    }

    @Provides
    @Singleton
    ListItemDatabase provideListItemDatabase(Application application){
        return database;
    }

    @Provides
    @Singleton
    ViewModelProvider.Factory provideViewModelFactory(ListItemRepository repository){
        return new CustomViewModelFactory(repository);
    }
}

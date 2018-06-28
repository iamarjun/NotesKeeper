package com.alwaysbaked.noteskeeper.dependencyinjection;

import android.app.Application;

import com.alwaysbaked.noteskeeper.RoomDemoApplication;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    private final RoomDemoApplication application;
    public ApplicationModule(RoomDemoApplication application) {
        this.application = application;
    }

    @Provides
    RoomDemoApplication provideRoomDemoApplication(){
        return application;
    }

    @Provides
    Application provideApplication(){
        return application;
    }
}

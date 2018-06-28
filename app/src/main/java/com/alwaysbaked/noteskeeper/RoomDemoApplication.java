package com.alwaysbaked.noteskeeper;

import android.app.Application;

import com.alwaysbaked.noteskeeper.dependencyinjection.ApplicationComponent;
import com.alwaysbaked.noteskeeper.dependencyinjection.ApplicationModule;
import com.alwaysbaked.noteskeeper.dependencyinjection.DaggerApplicationComponent;
import com.alwaysbaked.noteskeeper.dependencyinjection.RoomModule;

/**
 * DispatchingAndroidInjector helps to inject Member Variables into Activities, Fragments, and so
 * forth.
 * <p>
 * https://github.com/googlesamples/android-architecture-components/blob/master/GithubBrowserSample/app/src/main/java/com/android/example/github/GithubApp.java
 */

public class RoomDemoApplication extends Application {
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .roomModule(new RoomModule(this))
                .build();

    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}

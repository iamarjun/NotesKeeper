package com.alwaysbaked.noteskeeper.dependencyinjection;

import android.app.Application;

import com.alwaysbaked.noteskeeper.create.CreateFragment;
import com.alwaysbaked.noteskeeper.detail.DetailFragment;
import com.alwaysbaked.noteskeeper.list.ListFragment;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Annotated as a Singelton since we don't want to have multiple instances of a Single Database,
 * <p>
 */

@Singleton
@Component(modules = {ApplicationModule.class, RoomModule.class})
public interface ApplicationComponent {

    void inject(ListFragment listFragment);
    void inject(CreateFragment createFragment);
    void inject(DetailFragment detailFragment);

    Application application();

}

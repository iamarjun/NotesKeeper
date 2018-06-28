package com.alwaysbaked.noteskeeper.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.os.AsyncTask;

import com.alwaysbaked.noteskeeper.data.ListItem;
import com.alwaysbaked.noteskeeper.data.ListItemRepository;

public class NewListItemViewModel extends ViewModel {

    private ListItemRepository repository;

    public NewListItemViewModel(ListItemRepository repository) {
        this.repository = repository;
    }

    public void addNewItemToDatabase(ListItem listItem){
        AddItemTask task = new AddItemTask();
        task.execute(listItem);
    }

    private class AddItemTask extends AsyncTask<ListItem, Void, Void>{

        @Override
        protected Void doInBackground(ListItem... listItems) {
            repository.insertListItem(listItems[0]);
            return null;
        }
    }
}

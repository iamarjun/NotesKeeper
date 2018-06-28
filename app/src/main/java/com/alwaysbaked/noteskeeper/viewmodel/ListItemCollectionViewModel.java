package com.alwaysbaked.noteskeeper.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.os.AsyncTask;

import com.alwaysbaked.noteskeeper.data.ListItem;
import com.alwaysbaked.noteskeeper.data.ListItemRepository;

import java.util.List;

public class ListItemCollectionViewModel extends ViewModel{

    private ListItemRepository repository;

    public ListItemCollectionViewModel(ListItemRepository repository) {
        this.repository = repository;
    }

    public LiveData<List<ListItem>> getListItems(){
        return repository.getListOfData();
    }

    public void deleteListItem(ListItem listItem){
        DeleteItemTask task = new DeleteItemTask();
        task.execute(listItem);
    }

    private class DeleteItemTask extends AsyncTask<ListItem, Void, Void>{

        @Override
        protected Void doInBackground(ListItem... listItems) {
            repository.deleteListItem(listItems[0]);
            return null;
        }
    }
}

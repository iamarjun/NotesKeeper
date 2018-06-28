package com.alwaysbaked.noteskeeper.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.alwaysbaked.noteskeeper.data.ListItem;
import com.alwaysbaked.noteskeeper.data.ListItemRepository;

public class ListItemViewModel extends ViewModel {

    private ListItemRepository repository;

    public ListItemViewModel(ListItemRepository repository) {
        this.repository = repository;
    }

    public LiveData<ListItem> getListItemById(String itemId ){
        return repository.getListItem(itemId);
    }
}

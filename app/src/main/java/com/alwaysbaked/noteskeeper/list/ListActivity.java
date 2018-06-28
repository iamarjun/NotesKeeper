package com.alwaysbaked.noteskeeper.list;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;

import com.alwaysbaked.noteskeeper.R;
import com.alwaysbaked.noteskeeper.util.BaseActivity;

public class ListActivity extends BaseActivity {

    private static final String LIST_FRAG = "LSIT_FRAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        FragmentManager manager = getSupportFragmentManager();

        ListFragment fragment = (ListFragment) manager.findFragmentByTag(LIST_FRAG);

        if (fragment == null){
            fragment = ListFragment.newInstance();
        }

        addFragmentToActivity(manager, fragment, R.id.root_activity_list, LIST_FRAG);
    }
}

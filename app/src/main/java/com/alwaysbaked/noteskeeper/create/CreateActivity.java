package com.alwaysbaked.noteskeeper.create;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;

import com.alwaysbaked.noteskeeper.R;
import com.alwaysbaked.noteskeeper.util.BaseActivity;

public class CreateActivity extends BaseActivity {

    private static final String CREATE_FRAG = "CREATE_FRAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        FragmentManager manager = getSupportFragmentManager();

        CreateFragment fragment = (CreateFragment) manager.findFragmentByTag(CREATE_FRAG);

        if (fragment == null){
            fragment = CreateFragment.newInstance();
        }

        addFragmentToActivity(manager, fragment, R.id.root_activity_create, CREATE_FRAG);
    }
}

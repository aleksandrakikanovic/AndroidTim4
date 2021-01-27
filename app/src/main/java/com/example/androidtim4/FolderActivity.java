package com.example.androidtim4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidtim4.service.FolderService;


import java.util.List;

import model.Folder;


public class FolderActivity extends AppCompatActivity {
    TextView name;
    private Folder mFolder, previewFolder;

    private List<Folder> childFolders;




    private static final String TAG = "FolderActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_folder);

        Log.d(TAG, "onCreate: called.");
        mFolder = (Folder) getIntent().getSerializableExtra("folder");
        String folderName = (!mFolder.getFolder_name().isEmpty()) ? mFolder.getFolder_name() : "";
        System.out.println(folderName);
        getSupportActionBar().setTitle(folderName);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.save_folder:
                FolderService.addFolder(name.getText().toString());
                break;
            case R.id.go_back_folder:
                Intent intent = new Intent(FolderActivity.this,FoldersActivity.class);
                startActivity(intent);
                break;
            default:
                break;

        }
        return true;
    }
    @Override
    public void onStart() {
        super.onStart();
    }
    @Override
    public void onRestart() {
        super.onRestart();
    }
    @Override
    public void onResume() {
        super.onResume();
    }
    @Override
    public void onPause() {
        super.onPause();
    }
    @Override
    public void onStop() {
        super.onStop();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
    }


}

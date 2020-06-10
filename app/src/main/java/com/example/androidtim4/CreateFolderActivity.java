package com.example.androidtim4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.androidtim4.service.FolderService;
import com.example.androidtim4.service.ServiceUtil;
import com.example.androidtim4.serviceInterface.FolderInterface;
import model.Folder;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CreateFolderActivity extends AppCompatActivity {

    public static Context context;
    TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_folder);
        androidx.appcompat.widget.Toolbar toolbar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.toolbar_create_folder);
        setSupportActionBar(toolbar);
        name = findViewById(R.id.add_name);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.create_folder_toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.save_folder:
                FolderService.addFolder(name.getText().toString());
                break;
            case R.id.cancel_folder:
                Intent intent = new Intent(CreateFolderActivity.this, FoldersActivity.class);
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

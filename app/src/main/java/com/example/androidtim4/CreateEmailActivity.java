package com.example.androidtim4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.androidtim4.service.MessageService;
import com.example.androidtim4.service.ServiceUtil;
import com.example.androidtim4.serviceInterface.FolderInterface;
import com.example.androidtim4.serviceInterface.MessageInterface;

import java.util.Date;

import model.Folder;
import model.Message;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CreateEmailActivity extends AppCompatActivity {

    public static Context context;
    TextView to;
    TextView cc;
    TextView bcc;
    TextView subject;
    TextView content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_email);
        androidx.appcompat.widget.Toolbar toolbar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.toolbar_create_email);
        setSupportActionBar(toolbar);
         to = findViewById(R.id.edit_create_email_to);
         cc = findViewById(R.id.edit_create_email_cc);
         subject = findViewById(R.id.edit_create_email_subject);
         bcc = findViewById(R.id.edit_create_email_bcc);
         content = findViewById(R.id.edit_create_email_content);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.create_email_toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.save_email:
                MessageService.sendMail(to.getText().toString(), cc.getText().toString(), bcc.getText().toString(), subject.getText().toString(), content.getText().toString());
                break;
            case R.id.cancel_email:
                //sacuvati u drafts
                Toast.makeText(getApplicationContext(), "Message saved in drafts", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(CreateEmailActivity.this, EmailsActivity.class);
                startActivity(intent);
                break;
            case R.id.back_email:
                Intent i = new Intent(CreateEmailActivity.this, EmailsActivity.class);
                startActivity(i);
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

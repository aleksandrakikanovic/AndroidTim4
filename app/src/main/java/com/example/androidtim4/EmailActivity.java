package com.example.androidtim4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

import model.Message;

public class EmailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        TextView fromText = findViewById(R.id.from_email);
        Bundle bundle = getIntent().getExtras();
        Message message = (Message) bundle.getSerializable("Email");
        fromText.setText(message.getFrom());

        TextView bccText = findViewById(R.id.bcc_email);
        bccText.setText(message.getBcc());

        TextView toText = findViewById(R.id.to_email);
        toText.setText(message.getTo());

        TextView subjectText = findViewById(R.id.subject_email);
        toText.setText(message.getSubject());

        TextView ccText = findViewById(R.id.cc_email);
        ccText.setText(message.getCc());

        TextView contentText = findViewById(R.id.content_email);
        contentText.setText(message.getContent());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.replay_email:
                break;
            case R.id.forward_email:
                Intent intent1 = new Intent();
            case R.id.save_email:
                Intent intent2 = new Intent();
            case R.id.back_email:
                Intent intent = new Intent(EmailActivity.this, EmailsActivity.class);
                startActivity(intent);
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

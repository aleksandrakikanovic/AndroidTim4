package com.example.androidtim4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
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

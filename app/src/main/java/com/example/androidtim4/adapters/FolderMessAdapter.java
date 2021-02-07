package com.example.androidtim4.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidtim4.FoldersActivity;
import com.example.androidtim4.R;

import java.util.List;

import model.Message;

public class FolderMessAdapter extends RecyclerView.Adapter<FolderMessAdapter.MyviewHolder> {

    Context context;
    List<Message> messageList;

    public FolderMessAdapter(Context context, List<Message> messageList) {
        this.context = context;
        this.messageList = messageList;
    }
    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
        notifyDataSetChanged();
    }

    @Override
    public FolderMessAdapter.MyviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.messageview_adapter, parent, false);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FoldersActivity.context, "Will be implemented soon", Toast.LENGTH_SHORT).show();
            }
        });
        return new MyviewHolder(view);
    }

    @Override
    public void onBindViewHolder(FolderMessAdapter.MyviewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        if (messageList != null) {
            return messageList.size();
        }
        return 0;
    }

    public class MyviewHolder extends RecyclerView.ViewHolder {
        TextView subject;
        FolderAdapter.OnNoteListener onNoteListener;

        public MyviewHolder(View itemView) {
            super(itemView);
            subject = (TextView) itemView.findViewById(R.id.textView_Subject);


        }
    }
}
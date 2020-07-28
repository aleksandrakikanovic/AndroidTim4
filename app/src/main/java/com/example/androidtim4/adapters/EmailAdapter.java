package com.example.androidtim4.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


import androidx.recyclerview.widget.RecyclerView;

import com.example.androidtim4.EmailActivity;
import com.example.androidtim4.EmailsActivity;
import com.example.androidtim4.FoldersActivity;
import com.example.androidtim4.R;

import java.util.List;

import model.Folder;
import model.Message;

public class EmailAdapter extends RecyclerView.Adapter<EmailAdapter.MyviewHolder> {

    Context context;
    List<Message> messageList;

    public EmailAdapter(Context context,List<Message> messageList){
        this.context=context;
        this.messageList= messageList;
    }
    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
        notifyDataSetChanged();
    }


    @Override
    public EmailAdapter.MyviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.message_vieww_adapter,parent,false);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EmailsActivity.context, "Will be implemented soon", Toast.LENGTH_SHORT).show();
            }
        });
        return new EmailAdapter.MyviewHolder(view);
    }

    @Override
    public void onBindViewHolder(EmailAdapter.MyviewHolder holder, int position) {
    //    holder.dateTime.setText(messageList.get(position).getDateTime().toString());
      //  holder.from.setText(messageList.get(position).getFrom());
        holder.subject.setText(messageList.get(position).getSubject());
        //holder.content.setText(messageList.get(position).getContent());
        //holder.tag.setText(messageList.get(position).getCc());

    }

    @Override
    public int getItemCount() {
        if(messageList != null){
            return messageList.size();
        }
        return 0;
    }

    public class MyviewHolder extends RecyclerView.ViewHolder {
        TextView dateTime;
        TextView from;
        TextView subject;
        TextView content;
        TextView tag;


        public MyviewHolder(View itemView) {
            super(itemView);
          //  dateTime = (TextView)itemView.findViewById(R.id.textview_DateTime);
           // from = (TextView)itemView.findViewById(R.id.textView_From);
            subject = (TextView)itemView.findViewById(R.id.textView_Subject);
           // content = (TextView)itemView.findViewById(R.id.textView_Content);
           // tag = (TextView)itemView.findViewById(R.id.textView_Tag);
        }
    }
}



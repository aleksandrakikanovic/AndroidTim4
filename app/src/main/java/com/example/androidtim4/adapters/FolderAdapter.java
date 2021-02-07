package com.example.androidtim4.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.androidtim4.FoldersActivity;
import com.example.androidtim4.R;
import java.util.List;
import model.Folder;

public class FolderAdapter extends RecyclerView.Adapter<FolderAdapter.MyviewHolder> {

    Context context;
    private OnNoteListener mOnNoteListener;
    List<Folder> folderList;

    public FolderAdapter(Context context,List<Folder> folderList){
        this.context= context;
        this.folderList=folderList;
    }
    //proba
    public FolderAdapter(Context context,List<Folder> folderList,OnNoteListener onNoteListener) {
        this.context = context;
        this.folderList = folderList;
        this.mOnNoteListener = onNoteListener;
    }


    public FolderAdapter(List<Folder> folderList) {
        this.folderList = folderList;
    }

    public void setFolderList(List<Folder> folderList) {
        this.folderList = folderList;
        notifyDataSetChanged();
    }


    @Override
    public FolderAdapter.MyviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.folderview_adapter, parent, false);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FoldersActivity.context, "Will be implemented soon", Toast.LENGTH_SHORT).show();
           }
        });
        return new MyviewHolder(view, mOnNoteListener);
    }

    @Override
    public void onBindViewHolder(FolderAdapter.MyviewHolder holder, int position) {

        holder.folder_name.setText(folderList.get(position).getFolder_name());

    }


    @Override
    public int getItemCount() {
        if (folderList != null) {
            return folderList.size();
        }
        return 0;
    }


    public class MyviewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView folder_name;
        OnNoteListener onNoteListener;

        public MyviewHolder(View itemView, OnNoteListener onNoteListener) {
            super(itemView);
            folder_name = (TextView) itemView.findViewById(R.id.textview_folderName);
            this.onNoteListener=onNoteListener;
            itemView.setOnClickListener(this);


        }


        @Override
        public void onClick(View v) {
            onNoteListener.onNoteClick(getAdapterPosition());
        }
    }
    public interface OnNoteListener {
        void onNoteClick(int position);
    }
}






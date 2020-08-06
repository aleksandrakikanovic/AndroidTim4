package com.example.androidtim4.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.androidtim4.FoldersActivity;
import com.example.androidtim4.ProfileActivity;
import com.example.androidtim4.R;

import java.util.List;

import model.Account;
import model.Folder;

public class AccountAdapter  extends RecyclerView.Adapter<AccountAdapter.MyviewHolder>{
    Context context;
    List<Account> accountList;

//xxxxx

    public AccountAdapter(Context context, List<Account> accountList) {
        this.context = context;
        this.accountList = accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
        notifyDataSetChanged();
    }

    @Override
    public AccountAdapter.MyviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.accountview_adapter,parent,false);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProfileActivity.context, "Will be implemented soon", Toast.LENGTH_SHORT).show();
            }
        });
        return new AccountAdapter.MyviewHolder(view);
    }

    @Override
    public void onBindViewHolder(AccountAdapter.MyviewHolder holder, int position) {
        holder.account_name.setText(accountList.get(position).getUsername());
    }

    @Override
    public int getItemCount() {
        if(accountList != null){
            return accountList.size();
        }
        return 0;
    }

    public class MyviewHolder extends RecyclerView.ViewHolder {
        TextView account_name;

        public MyviewHolder(View itemView) {
            super(itemView);
            account_name = (TextView)itemView.findViewById(R.id.textview_folderName);
        }
    }
}



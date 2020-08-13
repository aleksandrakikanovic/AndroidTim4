package com.example.androidtim4.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.androidtim4.ProfileActivity;
import com.example.androidtim4.R;

import java.util.List;

import model.Account;


public class UserAccountsAdapter  extends RecyclerView.Adapter<UserAccountsAdapter.MyviewHolder>{
    Context context;
    List<Account> accountList;

    public UserAccountsAdapter(Context context, List<Account> accountList) {
        this.context = context;
        this.accountList = accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
        notifyDataSetChanged();
    }

    @Override
    public UserAccountsAdapter.MyviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.user_accounts_adapter,parent,false);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProfileActivity.context, "Will be implemented soon", Toast.LENGTH_SHORT).show();
            }
        });
        return new UserAccountsAdapter.MyviewHolder(view);
    }

    @Override
    public void onBindViewHolder(UserAccountsAdapter.MyviewHolder holder, int position) {
        holder.username.setText(accountList.get(position).getUsername());
        holder.email.setText(accountList.get(position).getSmtpAddress());
    }

    @Override
    public int getItemCount() {
        if(accountList != null){
            return accountList.size();
        }
        return 0;
    }

    public class MyviewHolder extends RecyclerView.ViewHolder {
        TextView email;
        TextView username;
        public MyviewHolder(View itemView) {
            super(itemView);
            email = (TextView)itemView.findViewById(R.id.email_u);
            username = (TextView)itemView.findViewById(R.id.username_u);

        }
    }
}
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

import model.Contact;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.MyviewHolder> {
    Context context;
    List<Contact> contactList;


    public ContactAdapter(Context context, List<Contact> contactList) {
        this.context = context;
        this.contactList = contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
        notifyDataSetChanged();
    }


    @Override
    public ContactAdapter.MyviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contactview_adapter, parent, false);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FoldersActivity.context, "xxx", Toast.LENGTH_SHORT).show();
            }
        });
        return new MyviewHolder(view);

    }

    @Override
    public void onBindViewHolder(ContactAdapter.MyviewHolder holder, int position) {
        holder.displayname.setText(contactList.get(position).getDisplayname());
        holder.email.setText(contactList.get(position).getEmail());
        holder.firstname.setText(contactList.get(position).getFirstname());
        holder.lastname.setText(contactList.get(position).getLastname());


    }

    @Override
    public int getItemCount() {
        if (contactList != null) {
            return contactList.size();
        }
        return 0;
    }

    public class MyviewHolder extends RecyclerView.ViewHolder  {
        TextView displayname;
        TextView firstname;
        TextView lastname;
        TextView email;


        public MyviewHolder(View itemView) {
            super(itemView);
            displayname = (TextView) itemView.findViewById(R.id.textview_displayname);
            email = (TextView) itemView.findViewById(R.id.textview_email);
            firstname = (TextView) itemView.findViewById(R.id.textview_firstname);
            lastname = (TextView) itemView.findViewById(R.id.textview_lastname);

        }


    }
}


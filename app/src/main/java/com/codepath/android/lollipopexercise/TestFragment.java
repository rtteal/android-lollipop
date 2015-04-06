package com.codepath.android.lollipopexercise;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codepath.android.lollipopexercise.activities.ContactsActivity;
import com.codepath.android.lollipopexercise.adapters.ContactsAdapter;
import com.codepath.android.lollipopexercise.models.Contact;

import java.util.ArrayList;
import java.util.List;

public class TestFragment extends Fragment{
    private ContactsAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_test, container, false);

        // Find RecyclerView and bind to adapter
        final RecyclerView rvContacts = (RecyclerView) v.findViewById(R.id.rvContacts);

        // allows for optimizations
        rvContacts.setHasFixedSize(true);

        // Define 2 column grid layout
        final GridLayoutManager layout = new GridLayoutManager(getActivity(), 2);

        // Unlike ListView, you have to explicitly give a LayoutManager to the RecyclerView to position items on the screen.
        // There are three LayoutManager provided at the moment: GridLayoutManager, StaggeredGridLayoutManager and LinearLayoutManager.
        rvContacts.setLayoutManager(layout);

        // get data
        List<Contact> contacts = getContacts();

        // Create an adapter
        mAdapter = new ContactsAdapter(getActivity(), contacts);

        // Bind adapter to list
        rvContacts.setAdapter(mAdapter);

        return v;
    }

    private List<Contact> getContacts() {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact(1, "Adam", R.drawable.contact_one, "4153508881"));
        contacts.add(new Contact(2, "Sarah", R.drawable.contact_two, "4153508882"));
        contacts.add(new Contact(3, "Bob", R.drawable.contact_three, "4153508883"));
        contacts.add(new Contact(4, "John", R.drawable.contact_four, "4153508884"));
        contacts.add(new Contact(5, "Jill", R.drawable.contact_five, "4153508885"));
        contacts.add(new Contact(6, "Mark", R.drawable.contact_six, "4153508886"));
        contacts.add(new Contact(7, "Susan", R.drawable.contact_seven, "4153508887"));
        contacts.add(new Contact(8, "Ryan", R.drawable.contact_eight, "4153508888"));
        contacts.add(new Contact(9, "Jeff", R.drawable.contact_nine, "4153508889"));
        return contacts;
    }
}

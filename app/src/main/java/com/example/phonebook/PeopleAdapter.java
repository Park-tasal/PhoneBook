package com.example.phonebook;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

class PeopleAdapter extends BaseAdapter {
    ArrayList<People> items = new <People>ArrayList();

    public void addItem(People item) {
        items.add(item);

    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        PeopleItem view = null;
        if (convertView == null) {
            view = new PeopleItem(parent.getContext());
        } else {
            view = (PeopleItem) convertView;

        }

        People item = items.get(position);
        view.setName(item.getName());
        view.setNumber(item.getNumber());
        view.setPeopleFace(item.getFaceNum());
        return view;
    }

}

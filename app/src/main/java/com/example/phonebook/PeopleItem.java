package com.example.phonebook;

import android.content.Context;
import android.media.Image;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

class PeopleItem extends LinearLayout{
        TextView peopleName;
        TextView peopleNumber;
        ImageView peopleFace;
    public PeopleItem(Context context) {
        super(context);
        init(context);
    }

    public PeopleItem(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.people_item,this, true);

        peopleName = findViewById(R.id.peopleName);
        peopleNumber = findViewById(R.id.peopleNumber);
        peopleFace = findViewById(R.id.viewFace);
    }

    public void setName(String name) {
        peopleName.setText(name);
    }

    public void setNumber(String number) {
        peopleNumber.setText(number);
    }

    public void setPeopleFace(int face) {
        peopleFace.setImageResource(face);
    }
}

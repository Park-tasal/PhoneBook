package com.example.phonebook;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button addPeople;
    EditText people;
    EditText mobile;
    ListView listView;
    ImageView facN;
    String flag;
    InputMethodManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addPeople = findViewById(R.id.button1);
        listView = findViewById(R.id.peopleList);
        people = findViewById(R.id.name);
        mobile = findViewById(R.id.number);
        facN = findViewById(R.id.face);
        manager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);

        final PeopleAdapter adapter = new PeopleAdapter();
        listView.setAdapter(adapter);

        people.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people.requestFocus();
                manager.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);

            }
        });

        addPeople.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.Q)
            @Override
            public void onClick(View v) {
                String name = people.getText().toString();
                String number = mobile.getText().toString();


//|| adapter.items.get(adapter.items.size()-1).getNumber().equals(number)
                if (!number.isEmpty() || !name.isEmpty() ) {

                    adapter.addItem(new People(name, number, R.drawable.ic_launcher_foreground));
                    adapter.notifyDataSetChanged();
                }


                people.setText(null);
                mobile.setText(null);
            }
        });

    }


}
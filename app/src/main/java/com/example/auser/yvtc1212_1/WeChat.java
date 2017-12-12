package com.example.auser.yvtc1212_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class WeChat extends AppCompatActivity {

    EditText editText;
    ListView listView;
    ArrayAdapter<String> adapter;
    public String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_we_chat);
        editText=(EditText)findViewById(R.id.editText);
        listView=(ListView)findViewById(R.id.listView1);
        adapter=new ArrayAdapter<String>(this,R.layout.simple_list_item_1,R.id.text1);
        listView.setAdapter(adapter);


        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        myRef.setValue("Hello, World!");

        // Read from the database
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                value = dataSnapshot.getValue(String.class);
                Log.d("45", "Value is: " + value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("87", "Failed to read value.", error.toException());
            }
        });
    }
    public void onClick(View v){
        adapter.add(editText.getText().toString());
        adapter.add(value);
    }

}

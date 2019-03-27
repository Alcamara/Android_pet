package com.example.petlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class PetDetailsActivity extends AppCompatActivity {

    EditText age, name;
    ImageView petPic;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_details);

        age = findViewById(R.id.editText);
        name = findViewById(R.id.editText2);

        petPic = findViewById(R.id.petPic);
        petPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent getPetPic = new Intent(Intent.ACTION_PICK);
                getPetPic.setType("image/*");
                getPetPic.
            }
        });
    }
}

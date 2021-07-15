package com.example.practicalmidterm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CustomerInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_info);
    }

    public void btnSubmit(View view){
        //Submit action
        Intent intent = new Intent(this, MenuActivity.class);
        intent.putExtra("from", "Main");
        this.startActivity(intent);
    }

    public void btnCancel(View view){
        //Cancel
        finish();
    }

}

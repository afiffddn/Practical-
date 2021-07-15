package com.example.practicalmidterm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MenuActivity extends AppCompatActivity {

    EditText menu1, menu2, menu3, menu4, menu5;
    CheckBox cb1,cb2,cb3,cb4,cb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        menu1 = findViewById(R.id.etQuantity1);
        menu2 = findViewById(R.id.etQuantitiy2);
        menu3 = findViewById(R.id.etQuantitiy3);
        menu4 = findViewById(R.id.etQuantitiy4);
        menu5 = findViewById(R.id.etQuantitiy5);
        cb1 = findViewById(R.id.cbMenu1);
        cb2 = findViewById(R.id.cbMenu2);
        cb3 = findViewById(R.id.cbMenu3);
        cb4 = findViewById(R.id.cbMenu4);
        cb5 = findViewById(R.id.cbMenu5);
    }

    public void btnCancel(View view) {
        finish();
    }

    public void btnSubmit (View view){
        Intent intent = new Intent(this, CheckoutActivity.class);
        intent.putExtra("q_menu1", menu1.getText().toString());
        intent.putExtra("q_menu2", menu2.getText().toString());
        intent.putExtra("q_menu3", menu3.getText().toString());
        intent.putExtra("q_menu4", menu4.getText().toString());
        intent.putExtra("q_menu5", menu5.getText().toString());
        intent.putExtra("c_menu1", cb1.isChecked());
        intent.putExtra("c_menu2", cb2.isChecked());
        intent.putExtra("c_menu3", cb3.isChecked());
        intent.putExtra("c_menu4", cb4.isChecked());
        intent.putExtra("c_menu5", cb5.isChecked());

        this.startActivity(intent);
    }

    public void cbMenu1 (View view){
        if (cb1.isChecked()){
            menu1.setEnabled(true);
        }
        else {
            menu1.setEnabled(false);
        }
    }

    public void cbMenu2 (View view){
        if (cb2.isChecked()){
            menu2.setEnabled(true);
        }
        else {
            menu2.setEnabled(false);
        }
    }

    public void cbMenu3 (View view){
        if (cb3.isChecked()){
            menu3.setEnabled(true);
        }
        else {
            menu3.setEnabled(false);
        }
    }

    public void cbMenu4 (View view){
        if (cb4.isChecked()){
            menu4.setEnabled(true);
        }
        else {
            menu4.setEnabled(false);
        }
    }

    public void cbMenu5 (View view){
        if (cb5.isChecked()){
            menu5.setEnabled(true);
        }
        else {
            menu5.setEnabled(false);
        }
    }
}

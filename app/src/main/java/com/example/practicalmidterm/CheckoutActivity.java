package com.example.practicalmidterm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class CheckoutActivity extends AppCompatActivity {

    TextView tvOrder, tvPay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        tvOrder = findViewById(R.id.tvOrderDesc);
        tvPay = findViewById(R.id.tvPay);

        Intent intent = getIntent();
        int menu1 = Integer.parseInt(intent.getStringExtra("q_menu1"));
        int menu2 = Integer.parseInt(intent.getStringExtra("q_menu2"));
        int menu3 = Integer.parseInt(intent.getStringExtra("q_menu3"));
        int menu4 = Integer.parseInt(intent.getStringExtra("q_menu4"));
        int menu5 = Integer.parseInt(intent.getStringExtra("q_menu5"));

        ArrayList<String> orderList = new ArrayList<>();
        if (intent.getBooleanExtra("c_menu1", false) == true){
            orderList.add("Nasi Lemak (RM2.00) Quantity :"  + menu1);
        }
        if (intent.getBooleanExtra("c_menu2", false) == true){
            orderList.add( "Spaghetti (RM8.00) Quantity : " +  menu2 );
        }
        if (intent.getBooleanExtra("c_menu3", false) == true){
            orderList.add("Chicken Chop (RM12.00) Quantity : " +  menu3);
        }
        if (intent.getBooleanExtra("c_menu4", false) == true){
            orderList.add("Orange Juice (RM3.00) Quantity : " +  menu4);
        }
        if (intent.getBooleanExtra("c_menu5", false) == true){
            orderList.add("Apple Juice (RM3.00) Quantity : " +  menu5);
        }

        for (int i=0;i<orderList.size();i++){
            int c = i+1;
            tvOrder.setText(tvOrder.getText() + "\n" + c + ". " + orderList.get(i));
        }

        menu1 *= 2;
        menu2 *= 8;
        menu3 *= 12;
        menu4 *= 3;
        menu5 *= 3;
        int total = menu1 + menu2 + menu3 + menu4 + menu5;

        tvPay.setText("Total Payment : RM " + total + ".00");
    }

    public void btnOK (View view){
        finish();
        moveTaskToBack(true);

    }

    public void btnBack (View view){
        Intent intent = new Intent(this, MenuActivity.class);
        this.startActivity(intent);
    }
}

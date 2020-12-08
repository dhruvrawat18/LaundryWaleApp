package team.orion.androidcustomerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import team.orion.androidcustomerapp.R;

public class OrderActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        TextView orderNo = findViewById(R.id.orderNo);
        TextView eta = findViewById(R.id.eta);
        TextView total = findViewById(R.id.total);

        Bundle bundle = getIntent().getExtras();
        int displayHour = bundle.getInt("display_hour");
        int displayMinute=  bundle.getInt("display_min");;
        int displayDayOfMonth = bundle.getInt("display_day");;
        String displayMonth = bundle.getString("display_month");
        int displayYear = bundle.getInt("display_year");;
        int totalAmount = bundle.getInt("total_amount");


        orderNo.setText("Order No. : 32423");
        eta.setText("Delivery ETA  : " + "0"+displayHour+":"+displayMinute+" "+displayDayOfMonth+" "+displayMonth+" "+displayYear);
        total.setText("Total Amount: rs."+totalAmount);

    }
}
package com.example.android.app;




import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

/**
 * Created by muhammad saalim wani on 20-03-2018.
 */

public class jeh extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jeh);
        EditText status = (EditText) findViewById(R.id.message);
        Button button = (Button) findViewById(R.id.button);
//      //.  button.setVisibility(View.INVISIBLE);
//        Random r = new Random();
//        int low = 20;
//       int high = 30;
//        int result ;//= 65;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
//            String address = extras.getString("MessageNumber");
            String message = extras.getString("Message");
//            TextView addressField = (TextView) findViewById(R.id.address);
            EditText messageField = (EditText) findViewById(R.id.message);
//            addressField.setText("Message from: " + address);
            messageField.setText("Message : " + message, TextView.BufferType.EDITABLE);
//            if(message.equals("Between 0 to 5ft"))
//            {
//                status.setText("Safe");
//            }
//            else if(message.equals("Between 5 to 10ft"))
//           {
//               status.setText("Monitor the updates");
//           }
//           else if(message.equals("Between 10 to 15ft"))
//            {
//                status.setText("Pack the essentials for evacuation, refer to help");
//            }
//            else
//            {
//                status.setText("Evacuate now");
//            }


//         result=r.nextInt(high - low) + low;
//        editText.setText("55");
//        if (result > 25) {
//            button.setVisibility(View.VISIBLE);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(getApplicationContext(), helpp.class);
//                startActivity(i);
//
//            }
//        });


//    }
        }
    }
}

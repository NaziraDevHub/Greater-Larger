package com.nazira.greaterlarger;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    EditText editText1,editText2;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        calculate = findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String myString1 = editText1.getText().toString();
                String myString2 = editText2.getText().toString();

                if (myString1.length()>0 && myString2.length()>0) {

                    int myNumber1 = Integer.parseInt(myString1);
                    int myNumber2 = Integer.parseInt(myString2);

                    if (myNumber1>myNumber2) {
                        Toast.makeText(MainActivity.this,myNumber1+" > "+myNumber2,Toast.LENGTH_LONG).show();

                    } else if (myNumber1<myNumber2) {
                        Toast.makeText(MainActivity.this,myNumber1+" < "+myNumber2,Toast.LENGTH_LONG).show();

                    } else if (myNumber1 ==myNumber2){
                        Toast.makeText(MainActivity.this,myNumber1+" = "+myNumber2,Toast.LENGTH_LONG).show();

                    }
                } else {

                    Toast.makeText(MainActivity.this,"Please enter both numbers.",Toast.LENGTH_LONG).show();
                }


            }
        });


    }
}
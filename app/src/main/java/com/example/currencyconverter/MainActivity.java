package com.example.currencyconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }

    public void conv(View view) {
        TextInputLayout til1 = findViewById(R.id.layout1);
        TextInputLayout til2 = findViewById(R.id.layout2);
        MaterialAutoCompleteTextView matv1 =findViewById(R.id.list1);
        MaterialAutoCompleteTextView matv2 =findViewById(R.id.list2);
        MaterialButton mb = findViewById(R.id.btn);
        EditText et = findViewById(R.id.input);
        String in = et.getText().toString();
        double val ;
        if (matv1.getText().toString().isEmpty())
        {
            til1.setError("Select option");
        }else if (matv2.getText().toString().isEmpty())
        {
            til2.setError("Select option");
        } else if (et.getText().toString().isEmpty())
        {
            til1.setError("Insert Amount");
        }
        //first selected item
        if(matv1.getText().toString().equals("US Dollar (USD)")&& matv2.getText().toString().equals("EURO (EUR)"))
        {
            val=Double.parseDouble(in)*0.91;
            et.setText(Double.toString(val));
        }
        else if(matv1.getText().toString().equals("US Dollar (USD)")&& matv2.getText().toString().equals("Japenese Yen (JPY)"))
        {
            val=Double.parseDouble(in)*148.72;
            et.setText(Double.toString(val));
        }
        else if(matv1.getText().toString().equals("US Dollar (USD)")&& matv2.getText().toString().equals("Swiss Franc (CHF)"))
        {
            val=Double.parseDouble(in)*0.86;
            et.setText(Double.toString(val));
        }
        else if(matv1.getText().toString().equals("US Dollar (USD)")&& matv2.getText().toString().equals("Australian Dollar (AUD)"))
        {
            val=Double.parseDouble(in)*1.47;
            et.setText(Double.toString(val));
        }
        else if(matv1.getText().toString().equals("US Dollar (USD)")&& matv2.getText().toString().equals("Tunisian Dinar (TND)"))
        {
            val=Double.parseDouble(in)*3.07;
            et.setText(Double.toString(val));
        }
        //second selected item
        if(matv1.getText().toString().equals("EURO (EUR)")&& matv2.getText().toString().equals("US Dollar (USD)"))
        {
            val=Double.parseDouble(in)*1.10;
            et.setText(Double.toString(val));
        }
        else if(matv1.getText().toString().equals("EURO (EUR)")&& matv2.getText().toString().equals("Japenese Yen (JPY)"))
        {
            val=Double.parseDouble(in)*163.25;
            et.setText(Double.toString(val));
        }
        else if(matv1.getText().toString().equals("EURO (EUR)")&& matv2.getText().toString().equals("Swiss Franc (CHF)"))
        {
            val=Double.parseDouble(in)*0.94;
            et.setText(Double.toString(val));
        }
        else if(matv1.getText().toString().equals("EURO (EUR)")&& matv2.getText().toString().equals("Australian Dollar (AUD)"))
        {
            val=Double.parseDouble(in)*1.61;
            et.setText(Double.toString(val));
        }
        else if(matv1.getText().toString().equals("EURO (EUR)")&& matv2.getText().toString().equals("Tunisian Dinar (TND)"))
        {
            val=Double.parseDouble(in)*3.37;
            et.setText(Double.toString(val));
        }
        //third item selected
        if(matv1.getText().toString().equals("Japenese Yen (JPY)")&& matv2.getText().toString().equals("US Dollar (USD)"))
        {
            val=Double.parseDouble(in)*0.0067;
            et.setText(Double.toString(val));
        }
        else if(matv1.getText().toString().equals("Japenese Yen (JPY)")&& matv2.getText().toString().equals("EURO (EUR)"))
        {
            val=Double.parseDouble(in)*0.0061;
            et.setText(Double.toString(val));
        }
        else if(matv1.getText().toString().equals("Japenese Yen (JPY)")&& matv2.getText().toString().equals("Swiss Franc (CHF)"))
        {
            val=Double.parseDouble(in)*0.0058;
            et.setText(Double.toString(val));
        }
        else if(matv1.getText().toString().equals("Japenese Yen (JPY)")&& matv2.getText().toString().equals("Australian Dollar (AUD)"))
        {
            val=Double.parseDouble(in)*0.0099;
            et.setText(Double.toString(val));
        }
        else if(matv1.getText().toString().equals("Japenese Yen (JPY)")&& matv2.getText().toString().equals("Tunisian Dinar (TND)"))
        {
            val=Double.parseDouble(in)*0.021;
            et.setText(Double.toString(val));
        }
        //4th selected item
        if(matv1.getText().toString().equals("Swiss Franc (CHF)")&& matv2.getText().toString().equals("US Dollar (USD)"))
        {
            val=Double.parseDouble(in)*1.17;
            et.setText(Double.toString(val));
        }
        else if(matv1.getText().toString().equals("Swiss Franc (CHF)")&& matv2.getText().toString().equals("EURO (EUR)"))
        {
            val=Double.parseDouble(in)*1.06;
            et.setText(Double.toString(val));
        }
        else if(matv1.getText().toString().equals("Swiss Franc (CHF)")&& matv2.getText().toString().equals("Japenese Yen (JPY)"))
        {
            val=Double.parseDouble(in)*173.44;
            et.setText(Double.toString(val));
        }
        else if(matv1.getText().toString().equals("Swiss Franc (CHF)")&& matv2.getText().toString().equals("Australian Dollar (AUD)"))
        {
            val=Double.parseDouble(in)*1.72;
            et.setText(Double.toString(val));
        }
        else if(matv1.getText().toString().equals("Swiss Franc (CHF)")&& matv2.getText().toString().equals("Tunisian Dinar (TND)"))
        {
            val=Double.parseDouble(in)*3.58;
            et.setText(Double.toString(val));
        }
        //5th selected item
        if(matv1.getText().toString().equals("Australian Dollar (AUD)")&& matv2.getText().toString().equals("US Dollar (USD)"))
        {
            val=Double.parseDouble(in)*0.68;
            et.setText(Double.toString(val));
        }
        else if(matv1.getText().toString().equals("Australian Dollar (AUD)")&& matv2.getText().toString().equals("EURO (EUR)"))
        {
            val=Double.parseDouble(in)*0.62;
            et.setText(Double.toString(val));
        }
        else if(matv1.getText().toString().equals("Australian Dollar (AUD)")&& matv2.getText().toString().equals("Japenese Yen (JPY)"))
        {
            val=Double.parseDouble(in)*101.09;
            et.setText(Double.toString(val));
        }
        else if(matv1.getText().toString().equals("Australian Dollar (AUD)")&& matv2.getText().toString().equals("Swiss Franc (CHF)"))
        {
            val=Double.parseDouble(in)*0.59;
            et.setText(Double.toString(val));
        }
        else if(matv1.getText().toString().equals("Australian Dollar (AUD)")&& matv2.getText().toString().equals("Tunisian Dinar (TND)"))
        {
            val=Double.parseDouble(in)*2.10;
            et.setText(Double.toString(val));
        }
        //6th selected item
        if(matv1.getText().toString().equals("Tunisian Dinar (TND)")&& matv2.getText().toString().equals("US Dollar (USD)"))
        {
            val=Double.parseDouble(in)*0.33;
            et.setText(Double.toString(val));
        }
        else if(matv1.getText().toString().equals("Tunisian Dinar (TND)")&& matv2.getText().toString().equals("EURO (EUR)"))
        {
            val=Double.parseDouble(in)*0.30;
            et.setText(Double.toString(val));
        }
        else if(matv1.getText().toString().equals("Tunisian Dinar (TND)")&& matv2.getText().toString().equals("Japenese Yen (JPY)"))
        {
            val=Double.parseDouble(in)*48.42;
            et.setText(Double.toString(val));
        }
        else if(matv1.getText().toString().equals("Tunisian Dinar (TND)")&& matv2.getText().toString().equals("Swiss Franc (CHF)"))
        {
            val=Double.parseDouble(in)*0.28;
            et.setText(Double.toString(val));
        }
        else if(matv1.getText().toString().equals("Tunisian Dinar (TND)")&& matv2.getText().toString().equals("Australian Dollar (AUD)"))
        {
            val=Double.parseDouble(in)*0.48;
            et.setText(Double.toString(val));
        }

    }
}
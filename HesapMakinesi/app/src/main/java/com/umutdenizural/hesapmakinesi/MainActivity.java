package com.umutdenizural.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Number1Text; // EditText kullanıcının metin girişi yapmasına izin veren bileşen.
    EditText Number2Text;
    TextView ResultText;  // TextView kullanıcıya metin veya bilgi göstermek için kullanılan bileşen.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Number1Text = findViewById(R.id.Number1Text); // findViewById(R.id."değişken") belirtilen android bileşenini bulmaya yarar.
        Number2Text = findViewById(R.id.Number2Text);
        ResultText = findViewById(R.id.ResultText);
    }

    public void sum(View view){ // (View view) bir görünüm tarafından çağrılıcağını ifade ediyor.
        if (Number1Text.getText().toString().matches("")||Number2Text.getText().toString().matches("")) { // .matches() ıf koşulundaki string buna eşit mi anlamı katıyor
            ResultText.setText("Enter Number!");
        }
        else {

            int number1 = Integer.parseInt(Number1Text.getText().toString()); // Integer.parseInt("string yazılacak") int i stringe ye çevirir.
            int number2 = Integer.parseInt(Number2Text.getText().toString()); // Number2Text.getText().toString() girilen ifadeyi çağırır stringe dönüştürür.
            int result = number1+number2;
            ResultText.setText("Result: "+result); // ResultText. setText("içindeki ifade str olmalı") ResultText de yazılacak değerle değiştirir.
        }
    }

    public void deduct(View view){
        if (Number1Text.getText().toString().matches("")||Number2Text.getText().toString().matches("")) {
            ResultText.setText("Enter Number!");
        }
        else {

            int number1 = Integer.parseInt(Number1Text.getText().toString());
            int number2 = Integer.parseInt(Number2Text.getText().toString());
            int result = number1-number2;
            ResultText.setText("Result: "+result);
        }

    }
    public void multiply(View view){
        if (Number1Text.getText().toString().matches("")||Number2Text.getText().toString().matches("")) {
            ResultText.setText("Enter Number!");
        }
        else {

            int number1 = Integer.parseInt(Number1Text.getText().toString());
            int number2 = Integer.parseInt(Number2Text.getText().toString());
            int result = number1*number2;
            ResultText.setText("Result: "+result);
        }
    }
    public void divide(View view){
        if (Number1Text.getText().toString().matches("")||Number2Text.getText().toString().matches("")) {
            ResultText.setText("Enter Number!");
        }
        else {

            int number1 = Integer.parseInt(Number1Text.getText().toString());
            int number2 = Integer.parseInt(Number2Text.getText().toString());
            int result = number1/number2;
            ResultText.setText("Result: "+result);

        }

    }

}
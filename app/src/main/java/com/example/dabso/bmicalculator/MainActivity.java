package com.example.dabso.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private EditText editTextWeight,editTextHeight;
    private TextView textViewResult;
    private ImageView imageViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextHeight=(EditText) findViewById(R.id.editTextHeight);
        editTextWeight=(EditText) findViewById(R.id.editTextWeight);
        textViewResult=(TextView) findViewById(R.id.textViewResult);
        imageViewResult=(ImageView) findViewById(R.id.imageViewResult);
    }
    public void calculateBMI(View view){
        double weight,height,bmi;
        weight=Double.parseDouble(editTextWeight.getText().toString());
        height=Double.parseDouble(editTextHeight.getText().toString());
        bmi=weight/(height*height);
        if(bmi<19.0){
            imageViewResult.setImageResource(R.drawable.under);
            textViewResult.setText("Your BMI is "+bmi+". You are UnderWeight!");
        }
        else if(bmi>=19.0 && bmi<25.0){
            imageViewResult.setImageResource(R.drawable.normal);
            textViewResult.setText("Your BMI is "+bmi+". You are Normal!");
        }
        else if(bmi>=25.0){
            imageViewResult.setImageResource(R.drawable.over);
            textViewResult.setText("Your BMI is "+bmi+". Be careful!");
        }
    }
    public void resetBMI(View view){
        editTextHeight.setText("");
        editTextWeight.setText("");
        textViewResult.setText("");
        imageViewResult.setImageResource(R.drawable.empty);
    }
}

package com.example.bkt3;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.Edits;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CongActivity extends AppCompatActivity {

    private EditText a,b;
    private Button submit,save;
    private TextView result,list;
    private List<String> mList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cong);

        a = findViewById(R.id.Edt1);
        b = findViewById(R.id.Edt2);
        submit = findViewById(R.id.submitBtn);
        save = findViewById(R.id.saveBtn);
        result = findViewById(R.id.KetquaTV);
        list = findViewById(R.id.listKq);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double num1 = Double.parseDouble(a.getText().toString());
                Double num2 = Double.parseDouble(b.getText().toString());
                Double ans = num1 + num2;
                result.setText(ans+"");
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double num1 = Double.parseDouble(a.getText().toString());
                Double num2 = Double.parseDouble(b.getText().toString());
                Double ans = num1 + num2;
                mList.add(a.getText().toString() +" + "+b.getText().toString() +" = "+ans+"\n");
                String res = "";
                for(String a : mList){
                    res += a;
                }
                list.setText(res);
            }
        });
    }
}
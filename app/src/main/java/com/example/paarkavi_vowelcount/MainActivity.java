package com.example.paarkavi_vowelcount;

import androidx.appcompat.app.AppCompatActivity;

import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText sent=findViewById(R.id.sentence);
        TextView count=findViewById(R.id.vcount);
        Button b1=findViewById(R.id.vcb);
        Editable s =sent.getText();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int c=0;
                for (int i = 0; i < s.length(); i++) {
                    char letters = s.charAt(i);
                    switch(letters){
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                            c++;
                    }
                }
                String str=String.valueOf(c);
                count.setText(str);
            }
        });
    }
}
package com.example.ex11;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {
    EditText eT;
    int oper = 0; // 1; +,2;-,3; *,4; /
    String temp;
    Double num1 = 0.0, num2 = 0.0;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eT = (EditText) findViewById(R.id.eT);

        //temp = eT.getText().toString();
        //acc = Double.parseDouble(temp);


    }


    public static boolean check(String temp) {
        if ((temp == "") || (temp == " ") || (temp == "-") || (temp == ".") || (temp == "-.")) {
            return false;
        } else {
            return true;
        }

    }


    public void onPlus(View view) {
        temp = eT.getText().toString();
        if (check(temp)) {
            if (oper == 0) {
                num1 = Double.parseDouble(temp);
            } else {
                num2 = Double.parseDouble(temp);
                switch (oper) {
                    case 1:
                        num1 = num1 + num2;
                        break;
                    case 2:
                        num1 = num1 - num2;
                        break;
                    case 3:
                        num1 = num1 / num2;
                        break;
                    case 4:
                        num1 = num1 * num2;
                        break;
                }
            }
            eT.setHint("" + num1);
            eT.setText("");
            oper = 1;

        } else {
            Toast.makeText(this, "wrong input", Toast.LENGTH_SHORT).show();
        }
    }

    public void onMin(View view) {
        temp = eT.getText().toString();
        if (check(temp)) {
            if (oper == 0) {
                num1 = Double.parseDouble(temp);
            } else {
                num2 = Double.parseDouble(temp);
                switch (oper) {
                    case 1:
                        num1 = num1 + num2;
                        break;
                    case 2:
                        num1 = num1 - num2;
                        break;
                    case 3:
                        num1 = num1 / num2;
                        break;
                    case 4:
                        num1 = num1 * num2;
                        break;
                }
            }
            eT.setHint("" + num1);
            eT.setText("");
            oper = 2;

        } else {
            Toast.makeText(this, "wrong input", Toast.LENGTH_SHORT).show();
        }


    }

    public void onDev(View view) {
        temp = eT.getText().toString();
        if (check(temp)) {
            if (oper == 0) {
                num1 = Double.parseDouble(temp);
            } else {
                num2 = Double.parseDouble(temp);
                switch (oper) {
                    case 1:
                        num1 = num1 + num2;
                        break;
                    case 2:
                        num1 = num1 - num2;
                        break;
                    case 3:
                        num1 = num1 / num2;
                        break;
                    case 4:
                        num1 = num1 * num2;
                        break;
                }
            }
            eT.setHint("" + num1);
            eT.setText("");
            oper = 3;

        } else {
            Toast.makeText(this, "wrong input", Toast.LENGTH_SHORT).show();
        }
    }

    public void onMult(View view) {
        temp = eT.getText().toString();
        if (check(temp)) {
            if (oper == 0) {
                num1 = Double.parseDouble(temp);
            } else {
                num2 = Double.parseDouble(temp);
                switch (oper) {
                    case 1:
                        num1 = num1 + num2;
                        break;
                    case 2:
                        num1 = num1 - num2;
                        break;
                    case 3:
                        num1 = num1 / num2;
                        break;
                    case 4:
                        num1 = num1 * num2;
                        break;
                }
            }
            eT.setHint("" + num1);
            eT.setText("");
            oper = 4;

        } else {
            Toast.makeText(this, "wrong input", Toast.LENGTH_SHORT).show();
        }


    }

    public void onAcc(View view) {
        oper = 0;
        eT.setHint("");
        eT.setText("");

    }

    public void onEqual(View view) {
        temp = eT.getText().toString();
        if (check(temp)) {
            if (oper == 0) {
                num1 = Double.parseDouble(temp);
            } else {
                num2 = Double.parseDouble(temp);
                switch (oper) {
                    case 1:
                        num1 = num1 + num2;
                        break;
                    case 2:
                        num1 = num1 - num2;
                        break;
                    case 3:
                        num1 = num1 / num2;
                        break;
                    case 4:
                        num1 = num1 * num2;
                        break;
                }
            }
            eT.setText("" + num1);
            oper = 0;

        } else {
            Toast.makeText(this, "wrong input", Toast.LENGTH_SHORT).show();
        }
    }

    public void onCr(View view) {
        Intent si = new Intent(this, Main1Activity.class);
        si.putExtra("res", num1);
        startActivity(si);
    }
}
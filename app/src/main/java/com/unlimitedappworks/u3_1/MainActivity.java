package com.unlimitedappworks.u3_1;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edt_mail;
    private SharedPreferences sh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_mail = (EditText) findViewById(R.id.edt_mail);
        sh = getSharedPreferences("pref", 0);
        edt_mail.setText(sh.getString("mail", ""));
    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.btn_guardar:
                sh.edit().putString("mail", edt_mail.getText().toString()).commit();
                break;
            case R.id.btn_salir:
                finish();
                break;
        }
    }
}

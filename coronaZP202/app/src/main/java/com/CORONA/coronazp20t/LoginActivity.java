package com.CORONA.coronazp20t;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.CORONA.coronazp20_2.SearchActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//atudaromas langas
        setContentView(R.layout.activity_login);//pridedamas vaizdas
        //kodas rasomas nuo cia
        Button login=findViewById(R.id.Login);//susiejamas vaizde esantis elementas su kodu
        final EditText username=findViewById(R.id.username);
        final EditText password=findViewById(R.id.password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //cia rasomas kodas kuris vykdomas paspaudus mygtuka
                Toast.makeText(LoginActivity.this, "Prisijungimo vardas yra:"+
                        username.getText().toString() + "\n" + "slaptazodis:" +
                        password.getText().toString(), Toast.LENGTH_LONG).show();
                //ketinimas pereiti i paieskos langa                is kur               i kur
                Intent goToSearchActivity=new Intent(LoginActivity.this, SearchActivity.class);
                startActivity(goToSearchActivity);
            }
        });
    }
}

package com.example.exercicio.pedidos.Atividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.exercicio.pedidos.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Metodo( View view){
        Intent intent = new Intent(this, cadastroPedidosListActivity.class);
        startActivity(intent);
    }



}

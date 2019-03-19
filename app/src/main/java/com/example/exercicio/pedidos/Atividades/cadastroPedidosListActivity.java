package com.example.exercicio.pedidos.Atividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.example.exercicio.pedidos.Modelos.Pedido;
import com.example.exercicio.pedidos.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class cadastroPedidosListActivity extends AppCompatActivity {
    ArrayList<Pedido> arrayPedido = new ArrayList<Pedido>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pedidos);
    }



    public void cadastrar(View view){
        EditText textNome = findViewById(R.id.textNome);
        EditText textSobreNome = findViewById(R.id.textSobreNome);
        EditText textEmail = findViewById(R.id.textEmail);
        EditText textTelefone = findViewById(R.id.textTelefone);

        String nome, sobreNome, email, telefone;

        nome = textNome.getText().toString();
        sobreNome = textSobreNome.getText().toString();
        email = textEmail.getText().toString();
        telefone = textTelefone.getText().toString();

        Pedido pedido= new Pedido(nome,sobreNome,email,telefone);


        Toast.makeText(cadastroPedidosListActivity.this, pedido.toString(),Toast.LENGTH_LONG).show();
        Toast.makeText(cadastroPedidosListActivity.this, "Cadastrado e Adicionado com sucesso!!",Toast.LENGTH_LONG).show();
        arrayPedido.add(pedido);




    }


    public void List(View view){
        List<HashMap<String, String>> colecao = new ArrayList<>();
        for(Pedido p : arrayPedido){
            HashMap<String, String> map = new HashMap<>();
            map.put("nome", p.getNome());
            map.put("SobreNome" ,p.getSobreNome());
            map.put("Email", p.getEmail());
            map.put("Telefone",p.getTelefone());

            colecao.add(map);



        }

        String[] de = {"nome", "SobreNome", "Email","Telefone"};
        int[] para = {R.id.textNome,R.id.textSobreNome, R.id.textEmail, R.id.textTelefone};

        ListView listViewItens = findViewById(R.id.listViewItens);

        SimpleAdapter adapter = new SimpleAdapter(this, colecao,R.layout.itens,de,para);

        listViewItens.setAdapter(adapter);
    }


}

package com.example.myapplicationteste;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private ListView listLocais;
    private String[] itens = {
            "Filosofia","Geografia",
            "Sociologia", "Quimica",
            "Programação Orientada a Objetos", "Historia", "Fisica",
            "Biologia", "TCC", "Programação a Internet", "Inglês",
            "Topicos Especias em Informatica", "Português","Matematica", "Redes de Computadores"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listLocais = findViewById(R.id.listlocais);


                            //Criar adaptador para a Lista
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,//layout da lista
                android.R.id.text1,//id do layout
                itens // a lista a ser passada
        );

                            // Adicionar adaptador para a Lista
        listLocais.setAdapter(adaptador);

                            //Adiciona clique na lista
        listLocais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String valorSelecionado = listLocais.getItemAtPosition(i).toString();
                dialog(view , valorSelecionado);

            }

            public void dialog(View view, String valorSelecionado){
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);

                //configurar titulo e mensage
                dialog.setMessage("Deseja Matricular-se nessa matéria?");

                //configurar cancelamento do alert dialog
                dialog.setCancelable(false);

                //configurar icone
                dialog.setIcon(android.R.drawable.ic_btn_speak_now);

                //configurar açoes para sim e nâo
                dialog.setPositiveButton("sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"A matricula na disciplina " + valorSelecionado + " foi realizada", Toast.LENGTH_SHORT).show();

                    }
                });

                dialog.setNegativeButton("nao", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Executar a", Toast.LENGTH_SHORT).show();

                    }
                });
                dialog.create();
                dialog.show();
            }


        });
    }
}

package br.com.senaijandira.financas;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AdicionarReceitaActivity extends AppCompatActivity {

    EditText
            txt_salario,
            txt_aluguel,
            txt_duplicatas,
            txt_outros;


    TextView txt_total,
            txt_saldo;

    Button btn_calcular,
            btn_salvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_receita);

        txt_aluguel = (EditText) findViewById(R.id.txt_aluguel);
        txt_total = (TextView) findViewById(R.id.txt_total);
        txt_salario = (EditText) findViewById(R.id.txt_salario);
        txt_duplicatas = (EditText) findViewById(R.id.txt_duplicatas);
        txt_outros = (EditText) findViewById(R.id.txt_outros);
        txt_saldo = (TextView) findViewById(R.id.txt_saldo);

        btn_calcular = (Button) findViewById(R.id.btn_calcular);
        btn_salvar = (Button) findViewById(R.id.btn_salvar);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Float aluguel = Float.parseFloat(txt_aluguel.getText().toString());
                Float salario = Float.parseFloat(txt_salario.getText().toString());
                Float duplicatas = Float.parseFloat(txt_duplicatas.getText().toString());
                Float outros = Float.parseFloat(txt_outros.getText().toString());

                Float total = aluguel + salario + duplicatas + outros;

                txt_saldo.setText(total.toString());
            }
        });


    }

    public Boolean inserir(Context context, Receita r) {

        //acessar o banco em modo escrita
        SQLiteDatabase db = new DbHelper(context).getWritableDatabase();

        ContentValues valores = new ContentValues();
        valores.put("salario", r.getSalario());
        valores.put("aluguel", r.getAluguel());
        valores.put("duplicatas", r.getDuplicatas());
        valores.put("outros", r.getOutros());


        

        Long id = db.insert("tbl_contatos", null, valores);

        if (id != -1)
            return true;
        else
            return false;


    }



}

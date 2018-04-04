package br.com.senaijandira.financas;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class FinancasDAO {

    public Boolean inserir(Context context, Receita r) {

        //acessar o banco em modo escrita
        SQLiteDatabase db = new DbHelper(context).getWritableDatabase();

        ContentValues valores = new ContentValues();
        valores.put("aluguel", r.getAluguel());
        valores.put("duplicatas", r.getDuplicatas());
        valores.put("id", r.getId());
        valores.put("outros", r.getOutros());
        valores.put("salario", r.getSalario());





        Long id = db.insert("tbl_financas", null, valores);

        if (id != -1)
            return true;
        else
            return false;


    }

    public Boolean inserir(Context context, Desepesa d) {

        //acessar o banco em modo escrita
        SQLiteDatabase db = new DbHelper(context).getWritableDatabase();

        ContentValues valores = new ContentValues();
        valores.put("transporte", d.getTransporte());
        valores.put("saude", d.getSaude());
        valores.put("lazer", d.getLazer());
        valores.put("moradia", d.getMoradia());
        valores.put("salario", d.getSalario());
        valores.put("outros", d.getOutros());
        valores.put("id", d.getId());





        Long id = db.insert("tbl_financas", null, valores);

        if (id != -1)
            return true;
        else
            return false;


    }




}

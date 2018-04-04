package br.com.senaijandira.financas;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by 17170088 on 03/04/2018.
 */

public class DbHelper extends SQLiteOpenHelper {

    //Nome do Banco
    private static String DB_NAME = "financas.db";

    //Versão do Banco
    private static int DB_VERSION = 1;

    public DbHelper (Context ctx){
        super (ctx, DB_NAME, null, DB_VERSION);
    }

    //Aqui seão criadas tabelas
    //ou qualquer estrutura inicial

    @Override
    public void onCreate(SQLiteDatabase db) {

        String receita = "create table tbl_receita ( "+"_id integer primary key autoincrement, "+
                " salario text,"+
                " aluguel text,"+
                " duplicatas text, "+
                " outros text); ";

        db.execSQL(receita);

        String despesa = "create table tbl_despesa ( "+"_id integer primary key autoincrement, "+
                " transporte text,"+
                " saude text,"+
                " lazer text, "+
                " salario text,"+
                " outros text,"+
                " moradia text);";

        db.execSQL(despesa);

    }

    //Nesse métodoro serão feitas todas atualizações do banco
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion , int newVersion) {

        db.execSQL("drop table tbl_contatos;");
        onCreate(db);

    }
}




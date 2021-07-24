package com.example.atry;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

public class user extends SQLiteOpenHelper {
    private Context context;
    private static final String DATABASE_NAME ="SECURITY";
    private static final int DATABASE_VERSION =1;
    private static final String table_NAME ="Software";
    private static final String column_name ="id";
    private static final String column_email ="email";
    private static final String column_title ="title_phone";
    private static final String column_author ="Address";
    private static final String column_IME ="IME";

    public user(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query=
                "CREATE TABLE "+ table_NAME +
                        " ("+ column_name +" INTEGER PRIMARY KEY AUTOINCREMENT," +
                        column_title +" TEXT," +column_author +" TEXT," +column_email +" TEXT," + column_IME +" TEXT);";
        db.execSQL(query);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + table_NAME);
        onCreate(db);

    }
    void addnext(String name,String type, String serial,String email, String IME){
        SQLiteDatabase db =this.getWritableDatabase();
        ContentValues cb= new ContentValues();
        cb.put(column_name,name);
        cb.put(column_email,email);
        cb.put(column_author,type);
        cb.put(column_title,serial);
        cb.put(column_IME,IME);
        long result= db.insert(table_NAME,null,cb);
        if (result ==-1){
            Toast.makeText(context, "successful added", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(context, "failed", Toast.LENGTH_SHORT).show();
        }
    }
}

package com.rosana.petagrampersistencia.db;

import android.content.ContentValues;
import android.content.Context;

import com.rosana.petagrampersistencia.R;
import com.rosana.petagrampersistencia.classes.Mascota;

import java.util.ArrayList;

public class ConstructorRanking {

    private Context context;

    public ConstructorRanking(Context context) {
        this.context = context;
    }

    public ArrayList<Mascota> getRanking(){

        BaseDatos db = new BaseDatos( context );
        return db.getRanking();
    }

    public void insertMascotas( BaseDatos db ){
        ContentValues contentValues = new ContentValues();
        contentValues.put( Config.TABLE_MASCOTAS_NOMBRE, "Sol" );
        contentValues.put( Config.TABLE_MASCOTAS_FOTO, R.drawable.sol );
        db.insertMascota( contentValues );

        contentValues = new ContentValues();
        contentValues.put( Config.TABLE_MASCOTAS_NOMBRE, "Jack" );
        contentValues.put( Config.TABLE_MASCOTAS_FOTO, R.drawable.jack );
        db.insertMascota( contentValues );

        contentValues = new ContentValues();
        contentValues.put( Config.TABLE_MASCOTAS_NOMBRE, "Bianca" );
        contentValues.put( Config.TABLE_MASCOTAS_FOTO, R.drawable.bianca );
        db.insertMascota( contentValues );
    }
}


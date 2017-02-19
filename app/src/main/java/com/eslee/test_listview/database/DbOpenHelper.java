package com.eslee.test_listview.database;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by eslee on 2017-02-19.
 */

public class DbOpenHelper {
    private static final String DATABASE_NAME = "healthfree.db";
    private static final int DATABASE_VERSION = 1;
    private static SQLiteDatabase mDB;
    private DatabaseHelper mDBHelper;
    private Context mCtx;

    private class DatabaseHelper extends SQLiteOpenHelper{

        //생성자
        public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
            super(context,name,factory,version);
        }

        // 최초 DB를 만들때 한번만 호출
        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(DataBases.UserTable._CREATE);
            db.execSQL(DataBases.PointTable._CREATE);
            db.execSQL(DataBases.HealthTable._CREATE);
            db.execSQL(DataBases.LocationTable._CREATE);
        }

        // 버전이 업데이트 되었을 경우 DB를 다시 만들어 준다.
        @Override
        public void onUpgrade(SQLiteDatabase db, int i, int i1) {
            db.execSQL("DROP TABLE IF EXISTS " + DataBases.UserTable._TABLENAME);
            db.execSQL("DROP TABLE IF EXISTS " + DataBases.PointTable._TABLENAME);
            db.execSQL("DROP TABLE IF EXISTS " + DataBases.HealthTable._TABLENAME);
            db.execSQL("DROP TABLE IF EXISTS " + DataBases.LocationTable._TABLENAME);
            onCreate(db);
        }
    }

    public DbOpenHelper(Context context){
        this.mCtx = context;
    }

    public DbOpenHelper open() throws SQLException{
        mDBHelper = new DatabaseHelper(mCtx,DATABASE_NAME,null,DATABASE_VERSION);
        mDB = mDBHelper.getWritableDatabase();
        return this;
    }

    public void close(){
        mDB.close();
    }

}

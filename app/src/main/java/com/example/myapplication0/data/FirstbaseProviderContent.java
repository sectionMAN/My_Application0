package com.example.myapplication0.data;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

import com.example.myapplication0.Utils;


public class FirstbaseProviderContent extends ContentProvider {
    private DatabaseHandler dbh;
    private  static final UriMatcher mather = new UriMatcher(UriMatcher.NO_MATCH);
    static {
        mather.addURI(Utils.AUTHORITY, Utils.PATH_MY+"/#", 100);
    }
    @Override
    public boolean onCreate() {
        dbh = new DatabaseHandler(getContext());
        return true;


    }


    @Override
    public Cursor query( Uri uri, String[] projection,  String selection, String[] selectionArgs,  String sortOrder) {
        Cursor cursor ;
        SQLiteDatabase db = dbh.getReadableDatabase();
        int math = mather.match(uri);
        if (math == 100) {
            selection = Utils.KEY_PHOTOS+"=?";
        cursor = db.query(Utils.TABLE_NAME, projection, selection, selectionArgs, null, null, sortOrder);
            return cursor;}
     else{
         String a = "uri gavno";
         throw new IllegalArgumentException(a);
        }
    }


    @Override
    public String getType( Uri uri) {
        return null;
    }


    @Override
    public Uri insert( Uri uri,  ContentValues values) {
        return null;
    }

    @Override
    public int delete( Uri uri,  String selection,  String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update( Uri uri,  ContentValues values,  String selection,  String[] selectionArgs) {
        return 0;
    }
}

package com.example.myapplication0;

import android.net.Uri;

public class Utils {
    public static final int DB_VERSION = 11;
    public static final String DB_NAME = "firstbase.db";
    public static final String TABLE_NAME = "My";
    public static final String KEY_ID = "id";
    public static final String KEY_PHOTOS = "photos";
    public static final String KEY_URL = "url";

    public static final String PATH_MY = "My";
    public static final String SHEMA = "content://";
    public static final String AUTHORITY = " com.example.myapplication0";
    public static final Uri BASE_CONTENT_URI = Uri.parse(SHEMA+AUTHORITY);
}

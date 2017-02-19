package com.eslee.test_listview.database;

import android.provider.BaseColumns;

/**
 * Created by eslee on 2017-02-19.
 */

public final class DataBases {
    public static final class UserTable implements BaseColumns{
        public static final String USER_ID = "USER_ID";
        public static final String EMAIL = "EMAIL";
        public static final String USER_NAME = "USER_NAME";
        public static final String USER_TYPE = "USER_TYPE";
        public static final String CREATE_DATE = "CREATE_DATE";
        public static final String _TABLENAME = "USER_INFO";
        public static final String _CREATE =
                "CREATE TABLE " + _TABLENAME+"("
                        + _ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                        + USER_ID + " TEXT NOT NULL, "
                        + EMAIL + " TEXT , "
                        + USER_NAME + " TEXT , "
                        + USER_TYPE + " TEXT , "
                        + CREATE_DATE + " TEXT );";
    }

    public static final class PointTable implements BaseColumns{
        public static final String USER_ID = "USER_ID";
        public static final String USE_TYPE = "USE_TYPE";
        public static final String USE_POINT = "USE_POINT";
        public static final String USE_WHERE = "USE_WHERE";
        public static final String USE_DATE = "USE_DATE";
        public static final String LOCATION = "LOCATION";
        public static final String _TABLENAME = "USE_POINT";
        public static final String _CREATE =
                "CREATE TABLE " + _TABLENAME+"("
                        + _ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                        + USER_ID + " TEXT NOT NULL, "
                        + USE_TYPE + " TEXT NOT NULL , "
                        + USE_POINT + " INTEGER , "
                        + USE_WHERE + " TEXT , "
                        + USE_DATE + " TEXT , "
                        + LOCATION + " TEXT );";
    }

    public static final class HealthTable implements BaseColumns{
        public static final String USER_ID = "USER_ID";
        public static final String STEPS = "STEPS";
        public static final String START_TIME = "START_TIME";
        public static final String END_TIME = "END_TIME";
        public static final String CALORIE = "CALORIE";
        public static final String DISTANCE = "DISTANCE";
        public static final String _TABLENAME = "HEALTH";
        public static final String _CREATE =
                "CREATE TABLE " + _TABLENAME+"("
                        + _ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                        + USER_ID + " TEXT NOT NULL, "
                        + STEPS + " INTEGER , "
                        + START_TIME + " TEXT , "
                        + END_TIME + " TEXT , "
                        + CALORIE + " REAL , "
                        + DISTANCE + " REAL );";
    }

    public static final class LocationTable implements BaseColumns{
        public static final String USER_ID = "USER_ID";
        public static final String LAT = "STEPS";
        public static final String LON = "START_TIME";
        public static final String CREATE_DATE = "END_TIME";
        public static final String _TABLENAME = "LOCATION";
        public static final String _CREATE =
                "CREATE TABLE " + _TABLENAME+"("
                        + _ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                        + USER_ID + " TEXT NOT NULL , "
                        + LAT + " REAL NOT NULL , "
                        + LON + " REAL NOT NULL , "
                        + CREATE_DATE + " TEXT );";
    }



}

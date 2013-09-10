package com.hofman.motivation.todos.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ChecklistOpenHelper extends SQLiteOpenHelper {
	private static final int DATABASE_VERSION = 1;
	private static final String CHECKLIST_TABLE_NAME = "checklist";
	private static final String CHECKLIST_TABLE_CREATE = 
			"CREATE TABLE " + CHECKLIST_TABLE_NAME + " (TASKNAME TEXT, DATEDUE TEXT);";
	ChecklistOpenHelper(Context context) {
		super(context, CHECKLIST_TABLE_NAME, null, DATABASE_VERSION);
		
	}
	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CHECKLIST_TABLE_CREATE);
	}
	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

}

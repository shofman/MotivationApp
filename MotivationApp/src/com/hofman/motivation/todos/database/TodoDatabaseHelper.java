package com.hofman.motivation.todos.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TodoDatabaseHelper extends SQLiteOpenHelper {
	private static final int DATABASE_VERSION = 1;
	private static final String CHECKLIST_TABLE_NAME = "todotable.db";	
	
	public TodoDatabaseHelper(Context context) {
		super(context, CHECKLIST_TABLE_NAME, null, DATABASE_VERSION);
		
	}
	@Override
	public void onCreate(SQLiteDatabase db) {
		TodoTable.onCreate(db);
	}
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
		TodoTable.onUpgrade(db, oldV, newV);		
	}

}

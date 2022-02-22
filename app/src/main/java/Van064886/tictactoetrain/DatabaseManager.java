package Van064886.tictactoetrain;


import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DatabaseManager extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "scores.db";
    private static final int DATABASE_VERSION = 2;

    public DatabaseManager(Context context){
        super(context, DATABASE_NAME,null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String strSql = "create table T_Scores (" +
                "id integer primary key autoincrement," +
                "players text not null," +
                "winner text not null," +
                "date integer not null " +
                ")";
        sqLiteDatabase.execSQL(strSql);
        Log.i("DATABASE", "onCreate invoked");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String strSql = "drop table T_Scores";
        sqLiteDatabase.execSQL(strSql);
        this.onCreate(sqLiteDatabase);
        Log.i("DATABASE", "onUpgrade invoked");
    }

    public void insertScore(String players, String winner){
        players = players.replace("'", "''");
        String strSql = "insert into T_Scores(players, winner, date) values('" +
                players+"', '"+winner+"', "+new Date().getTime()+")";
        this.getWritableDatabase().execSQL(strSql);
        Log.i("DATABASE", "insertScore invoked");
    }

    public List<ScoreItem> readScores(){
        List<ScoreItem> scores = new ArrayList<>();
        String strSql = "select * from T_Scores";
        Cursor cursor = this.getReadableDatabase().rawQuery(strSql, null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            ScoreItem scoreItem = new ScoreItem(cursor.getInt(0), cursor.getString(1), cursor.getString(2), new Date(cursor.getInt(3)));
            scores.add(scoreItem);
            cursor.moveToNext();
        }
        cursor.close();
        return scores;
    }
}
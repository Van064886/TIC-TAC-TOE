package Van064886.tictactoetrain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class scoreActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        List<ScoreItem> scoreItemList = jouerActivity.databaseManager.readScores();
/*       scoreItemList.add(new ScoreItem(1, "Tom vs Nina", "Winner: Nina", new Date()));
         scoreItemList.add(new ScoreItem(2, "Tom vs Jerry", "Winner: Jerry", new Date()));
*/
        ListView scoreListView = findViewById(R.id.scoreList);
        scoreListView.setAdapter(new ScoreItemAdapter(this, scoreItemList));
    }
}
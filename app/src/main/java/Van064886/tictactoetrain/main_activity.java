package Van064886.tictactoetrain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class main_activity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Onclicks methods
    public void onQuitter(View view)
    {
        finish();
    }

    public void onJouer(View view)
    {
        Intent jouerA = new Intent(getApplicationContext() , playersName.class );
        startActivity(jouerA);
        finish();
    }

    public void onScore(View view)
    {
        Intent scoreA = new Intent(getApplicationContext() , scoreActivity.class );
        startActivity(scoreA);
        finish();
    }
}
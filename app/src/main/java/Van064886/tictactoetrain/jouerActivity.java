package Van064886.tictactoetrain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class jouerActivity extends AppCompatActivity
{
    // Définition du symbole
    static char symbol = 'X';
    // Définition des boutons
    Button btnA1 , btnA2 , btnA3 , btnB1 , btnB2 , btnB3 , btnC1 , btnC2 , btnC3;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jouer);

        // Affectation des boutons aux variables btns
        btnA1 = (Button) findViewById(R.id.btn1);
        btnA2 = (Button) findViewById(R.id.btn2);
        btnA3 = (Button) findViewById(R.id.btn3);
        btnB1 = (Button) findViewById(R.id.btn4);
        btnB2 = (Button) findViewById(R.id.btn5);
        btnB3 = (Button) findViewById(R.id.btn6);
        btnC1 = (Button) findViewById(R.id.btn7);
        btnC2 = (Button) findViewById(R.id.btn8);
        btnC3 = (Button) findViewById(R.id.btn9);

    }

    public void writeBtn( Button btn )
    {
        btn.setText(symbol);

        // Modification de symbol selon sa valeur
        if ( symbol == 'X' )
        {
            symbol = 'O';
        }
        else
        {
            symbol = 'X';
        }
    }
    public void gameControl(View view)
    {
        writeBtn( (Button) view );
    }
}
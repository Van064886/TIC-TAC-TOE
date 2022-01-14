package Van064886.tictactoetrain;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class jouerActivity extends AppCompatActivity
{
    // Déclaration des boutons
    private Button btnA1 ;
    private Button btnA2;
    private Button btnA3;
    private Button btnB1;
    private Button btnB2;
    private Button btnB3;
    private Button btnC1;
    private Button btnC2;
    private Button btnC3;

    // Déclaration du symbole a inscire
    private static String symbol = "O";

    // Fonctions
    public  void gameFunction( View v , String name )
    {
        boolean continuer = true;
        Toast.makeText(getApplicationContext(),
                "You clicked on ", Toast.LENGTH_SHORT).show();

        // Gestion de la saisie
        if ( symbol == "X" )
            symbol = "O";
        else
            symbol = "X";

        switch ( name )
        {
            case "btn1" :
                if (continuer)
                    btnA1.setText(symbol);
                break;
            case "btn2" :
                if (continuer)
                    btnA2.setText(symbol);
                break;
            case "btn3" :
                if (continuer)
                    btnA3.setText(symbol);
                break;
            case "btn4" :
                if (continuer)
                    btnB1.setText(symbol);
                break;
            case "btn5" :
                if (continuer)
                    btnB2.setText(symbol);
                break;
            case "btn6" :
                if (continuer)
                    btnB3.setText(symbol);
                break;
            case "btn7" :
                if (continuer)
                    btnC1.setText(symbol);
                break;
            case "btn8" :
                if (continuer)
                    btnC2.setText(symbol);
                break;
            case "btn9" :
                if (continuer)
                    btnC3.setText(symbol);
                break;
            default:
                break;
        }

        // Verification de la fin de jeu
        if ( ( btnA1.getText().toString() == "X" && btnB1.getText().toString() == "X"  &&
                btnC1.getText().toString() == "X" ) || ( btnA1.getText().toString() == "0" &&
                btnB1.getText().toString() == "0" && btnC1.getText().toString() == "0" )  )
        {
            // Modification de la couleur des textes et du background du boutton
            btnA1.setBackgroundColor(Color.WHITE);
            btnA1.setTextColor(Color.BLACK);
            btnB1.setBackgroundColor(Color.WHITE);
            btnB1.setTextColor(Color.BLACK);
            btnC1.setBackgroundColor(Color.WHITE);
            btnC1.setTextColor(Color.BLACK);

            // On met continuer à false
            continuer = false;

            // Message de succès
            Toast.makeText(getApplicationContext() , " Vous avez gagné " ,
                    Toast.LENGTH_SHORT).show();
        }
        if ( ( btnA2.getText().toString() == "X" && btnB2.getText().toString() == "X"  &&
                btnC2.getText().toString() == "X" ) || ( btnA2.getText().toString() == "0" &&
                btnB2.getText().toString() == "0" && btnC2.getText().toString() == "0" )  )
        {
            // Modification de la couleur des textes et du background du boutton
            btnA2.setBackgroundColor(Color.WHITE);
            btnA2.setTextColor(Color.BLACK);
            btnB2.setBackgroundColor(Color.WHITE);
            btnB2.setTextColor(Color.BLACK);
            btnC2.setBackgroundColor(Color.WHITE);
            btnC2.setTextColor(Color.BLACK);

            // On met continuer à false
            continuer = false;

            // Message de succès
            Toast.makeText(getApplicationContext() , " Vous avez gagné " ,
                    Toast.LENGTH_SHORT).show();
        }
        if ( ( btnA3.getText().toString() == "X" && btnB3.getText().toString() == "X"  &&
                btnC3.getText().toString() == "X" ) || ( btnA3.getText().toString() == "0" &&
                btnB3.getText().toString() == "0" && btnC3.getText().toString() == "0" )  )
        {
            // Modification de la couleur des textes et du background du boutton
            btnA3.setBackgroundColor(Color.WHITE);
            btnA3.setTextColor(Color.BLACK);
            btnB3.setBackgroundColor(Color.WHITE);
            btnB3.setTextColor(Color.BLACK);
            btnC3.setBackgroundColor(Color.WHITE);
            btnC3.setTextColor(Color.BLACK);

            // On met continuer à false
            continuer = false;

            // Message de succès
            Toast.makeText(getApplicationContext() , " Vous avez gagné " ,
                    Toast.LENGTH_SHORT).show();
        }
        if ( ( btnA1.getText().toString() == "X" && btnB2.getText().toString() == "X"  &&
                btnC3.getText().toString() == "X" ) || ( btnA1.getText().toString() == "0" &&
                btnB2.getText().toString() == "0" && btnC3.getText().toString() == "0" )  )
        {
            // Modification de la couleur des textes et du background du boutton
            btnA1.setBackgroundColor(Color.WHITE);
            btnA1.setTextColor(Color.BLACK);
            btnB2.setBackgroundColor(Color.WHITE);
            btnB2.setTextColor(Color.BLACK);
            btnC3.setBackgroundColor(Color.WHITE);
            btnC3.setTextColor(Color.BLACK);

            // On met continuer à false
            continuer = false;

            // Message de succès
            Toast.makeText(getApplicationContext() , " Vous avez gagné " ,
                    Toast.LENGTH_SHORT).show();
        }
        if ( ( btnA3.getText().toString() == "X" && btnB2.getText().toString() == "X"  &&
                btnC1.getText().toString() == "X" ) || ( btnA3.getText().toString() == "0" &&
                btnB2.getText().toString() == "0" && btnC1.getText().toString() == "0" )  )
        {
            // Modification de la couleur des textes et du background du boutton
            btnA3.setBackgroundColor(Color.WHITE);
            btnA3.setTextColor(Color.BLACK);
            btnB2.setBackgroundColor(Color.WHITE);
            btnB2.setTextColor(Color.BLACK);
            btnC1.setBackgroundColor(Color.WHITE);
            btnC1.setTextColor(Color.BLACK);

            // On met continuer à false
            continuer = false;

            // Message de succès
            Toast.makeText(getApplicationContext() , " Vous avez gagné " ,
                    Toast.LENGTH_SHORT).show();
        }
        if ( ( btnA1.getText().toString() == "X" && btnA2.getText().toString() == "X"  &&
                btnA3.getText().toString() == "X" ) || ( btnA1.getText().toString() == "0" &&
                btnA2.getText().toString() == "0" && btnA3.getText().toString() == "0" )  )
        {
            // Modification de la couleur des textes et du background du boutton
            btnA1.setBackgroundColor(Color.WHITE);
            btnA1.setTextColor(Color.BLACK);
            btnA2.setBackgroundColor(Color.WHITE);
            btnA2.setTextColor(Color.BLACK);
            btnA3.setBackgroundColor(Color.WHITE);
            btnA3.setTextColor(Color.BLACK);

            // On met continuer à false
            continuer = false;

            // Message de succès
            Toast.makeText(getApplicationContext() , " Vous avez gagné " ,
                    Toast.LENGTH_SHORT).show();
        }
        if ( ( btnB1.getText().toString() == "X" && btnB2.getText().toString() == "X"  &&
                btnB3.getText().toString() == "X" ) || ( btnB1.getText().toString() == "0" &&
                btnB2.getText().toString() == "0" && btnB3.getText().toString() == "0" )  )
        {
            // Modification de la couleur des textes et du background du boutton
            btnB1.setBackgroundColor(Color.WHITE);
            btnB1.setTextColor(Color.BLACK);
            btnB2.setBackgroundColor(Color.WHITE);
            btnB2.setTextColor(Color.BLACK);
            btnB3.setBackgroundColor(Color.WHITE);
            btnB3.setTextColor(Color.BLACK);

            // On met continuer à false
            continuer = false;

            // Message de succès
            Toast.makeText(getApplicationContext() , " Vous avez gagné " ,
                    Toast.LENGTH_SHORT).show();
        }
        if ( ( btnC1.getText().toString() == "X" && btnC2.getText().toString() == "X"  &&
                btnC3.getText().toString() == "X" ) || ( btnC1.getText().toString() == "0" &&
                btnC2.getText().toString() == "0" && btnC3.getText().toString() == "0" )  )
        {
            // Modification de la couleur des textes et du background du boutton
            btnC1.setBackgroundColor(Color.WHITE);
            btnC1.setTextColor(Color.BLACK);
            btnC2.setBackgroundColor(Color.WHITE);
            btnC2.setTextColor(Color.BLACK);
            btnC3.setBackgroundColor(Color.WHITE);
            btnC3.setTextColor(Color.BLACK);

            // On met continuer à false
            continuer = false;

            // Message de succès
            Toast.makeText(getApplicationContext() , " Vous avez gagné " ,
                    Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jouer);

        // Gestion des évènements
        btnA1 = findViewById(R.id.btn1);
        btnA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v ) {
               // btnA1.setText(symbol);
                String name = "btn1";
                gameFunction( v , name );
            }
        });

        btnA2 = findViewById(R.id.btn2);
        btnA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // btnA2.setText("X");
                String name = "btn2";
                gameFunction( v , name );
            }
        });

        btnA3 = findViewById(R.id.btn3);
        btnA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btnA3.setText("X");
                String name = "btn3";
                gameFunction( v , name );
            }
        });

        btnB1 = findViewById(R.id.btn4);
        btnB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btnB1.setText("X");
                String name = "btn4";
                gameFunction( v , name );
            }
        });

        btnB2 = findViewById(R.id.btn5);
        btnB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btnB2.setText("X");
                String name = "btn5";
                gameFunction( v , name );
            }
        });

        btnB3 = findViewById(R.id.btn6);
        btnB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btnB3.setText("X");
                String name = "btn6";
                gameFunction( v , name );
            }
        });

        btnC1 = findViewById(R.id.btn7);
        btnC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btnC1.setText("X");
                String name = "btn7";
                gameFunction( v , name );
            }
        });

        btnC2 = findViewById(R.id.btn8);
        btnC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // btnC2.setText("X");
                String name = "btn8";
                gameFunction( v , name );
            }
        });

        btnC3 = findViewById(R.id.btn9);
        btnC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btnC3.setText("X");
                String name = "btn9";
                gameFunction( v , name );
            }
        });

    }


}
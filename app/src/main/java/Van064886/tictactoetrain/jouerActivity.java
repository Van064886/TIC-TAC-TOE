package Van064886.tictactoetrain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
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

    // Déclaration des textviews de nom de joueur
    private TextView joueur1Text;
    private TextView joueur2Text;

    // Déclaration du bouton retour
    private Button retourBtn ;

    // Déclaration du symbole a inscire
    private static String symbol = "0";

    // Déclaration du booléén continuer
    private static boolean continuer = true;

    // Fonctions
    public  void gameFunction( View v , String name )
    {
        // Gestion de la saisie
        if ( symbol == "X" )
            symbol = "0";
        else
            symbol = "X";

        switch ( name )
        {
            case "btn1" :
                if (btnA1.getText() == "" && continuer)
                    btnA1.setText(symbol);
                break;
            case "btn2" :
                if (btnA2.getText() == "" && continuer)
                    btnA2.setText(symbol);
                break;
            case "btn3" :
                if (btnA3.getText() == "" && continuer)
                    btnA3.setText(symbol);
                break;
            case "btn4" :
                if (btnB1.getText() == "" && continuer)
                    btnB1.setText(symbol);
                break;
            case "btn5" :
                if (btnB2.getText() == "" && continuer)
                    btnB2.setText(symbol);
                break;
            case "btn6" :
                if (btnB3.getText() == "" && continuer)
                    btnB3.setText(symbol);
                break;
            case "btn7" :
                if (btnC1.getText() == "" && continuer)
                    btnC1.setText(symbol);
                break;
            case "btn8" :
                if (btnC2.getText() == "" && continuer)
                    btnC2.setText(symbol);
                break;
            case "btn9" :
                if (btnC3.getText() == "" && continuer)
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

        // Création d'un bouton pour rediriger les joueurs vers la page prinicpale
        if (!continuer)
        {
            retourBtn.setVisibility(View.VISIBLE);
            retourBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v)
                {
                    // On reinitialise continuer a true
                    continuer = true;

                    // Retour a la page d'acceuil
                    Intent acceuil = new Intent( getApplicationContext() , MainActivity.class );
                    startActivity(acceuil);
                    finish();
                }
            });
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jouer);

        // Récupération des variables de noms stockés dans l'activité précédente
        Intent nameActivity = getIntent();
        String nomJoueur1 = nameActivity.getStringExtra("joueur1Name");
        String nomJoueur2 = nameActivity.getStringExtra("joueur2Name");

        // Définition des text views de nom d'utilisateur
        joueur1Text = findViewById(R.id.textJoueur1);
        joueur2Text = findViewById(R.id.textJoueur2);

        // Insertion des noms de joueurs dans les text views
        joueur1Text.setText(nomJoueur1);
        joueur2Text.setText(nomJoueur2);

        // Définition du layout contenant le bouton retour
        retourBtn = findViewById(R.id.retourBtn);
        retourBtn.setVisibility(View.INVISIBLE);

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
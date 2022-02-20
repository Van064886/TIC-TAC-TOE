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

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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

    // Décaration de la variable id pour les sauvegardes
    public static  int id = 0;

    // Déclaration des textviews de nom de joueur
    private TextView joueur1Text;
    private TextView joueur2Text;

    // Déclaration des textViews de symbols
    private TextView symbolX;
    private TextView symbolO;

    // Déclaration du bouton retour
    private Button retourBtn ;

    // Déclaration du bouton rejouer
    private Button rejouerBtn;

    // Déclaration du symbole a inscire
    private static String symbol = "0";

    // Déclaration du booléen continuer
    private static boolean continuer = true;

    // Déclaration des variables nom de joueurs à utiliser
    private static String nomJoueur1;
    private static String nomJoueur2;

    // Message de succès
    private String successMsg = "a gagné";

    // Creation de la variable active qui contient la couleur justifiant le joueur actif
    int active = Color.parseColor("#1C0C42");

    // Fonctions
    public void symbolManager()
    {
        if ( symbol == "X" )
            symbol = "0";
        else
            symbol = "X";
    }

    public void gameMessage( String message )
    {
        Toast.makeText(getApplicationContext() ,  message ,
                Toast.LENGTH_SHORT).show();
    }

    public void gameInit()
    {
        continuer = true;
        symbol = "0";
    }
/*
    public void saveScore( String winnerName ) throws JSONException {
        int score = 1;

        // Création du fichier
        JSONObject winner = new JSONObject();
        winner.put("nom", winner);
        winner.put("score", score);

        String winnerString =  winner.toString();
        File file = new File( getApplicationContext().getFilesDir() , "save.JSON" );
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        try {
            bufferedWriter.write( winnerString );
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
 */
    public void saveScore( String winnerName )
    {
        JSONObject jsonObject = new JSONObject();
        //JSONObject.put("id" , id);
        id++;
    }
    public void playerNamesManager()
    {
        // Modifications suivant la valeur de la variable symbol
        if ( symbol == "X" )
        {
            // On ramène la coloration du coté de joueur 1 au blanc
            joueur1Text.setTextColor(Color.WHITE);
            symbolX.setTextColor(Color.WHITE);

            // On met la coloration du joueur 2 au violet
            joueur2Text.setTextColor(active);
            symbolO.setTextColor(active);
        }
        else if ( symbol == "0" )
        {
            // On ramène la coloration du coté de joueur 2 au blanc
            joueur2Text.setTextColor(Color.WHITE);
            symbolO.setTextColor(Color.WHITE);

            // On met la coloration du joueur 1 au violet
            joueur1Text.setTextColor(active);
            symbolX.setTextColor(active);
        }
    }

    public void buttonValueProcessor( String name )
    {
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
    }

    public void equalityChecker()
    {
        if ( btnA1.getText().toString() != "" && btnB1.getText().toString() != "" && btnC1.getText().toString() != "" &&
                btnA2.getText().toString() != "" && btnB2.getText().toString() != "" && btnC2.getText().toString() != "" &&
                btnA3.getText().toString() != "" && btnB3.getText().toString() != "" && btnC3.getText().toString() != ""
                && continuer )
        {
            // Message pour signaler l'égalité
            Toast.makeText( getApplicationContext() , "Aucun vainqueur" , Toast.LENGTH_SHORT ).show();

            // Gestion du bouton rejouer
            rejouerBtn.setVisibility(View.VISIBLE);
            rejouerBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v)
                {
                    // On vide la zone de jeu
                    btnA1.setText("");
                    btnA2.setText("");
                    btnA3.setText("");
                    btnB1.setText("");
                    btnB2.setText("");
                    btnB3.setText("");
                    btnC1.setText("");
                    btnC2.setText("");
                    btnC3.setText("");

                    // On réinitialise les valeurs de controle du jeu
                    gameInit();

                    // On remet rejouerBtn et retourBtn en mode invisible
                    rejouerBtn.setVisibility( View.INVISIBLE );
                    retourBtn.setVisibility( View.INVISIBLE );
                }
            });

            // Gestion du bouton retour
            retourBtn.setVisibility(View.VISIBLE);
            retourBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v)
                {
                    // On reinitialise les variables de controle du jeu
                    gameInit();

                    // Retour a la page d'acceuil
                    Intent acceuil = new Intent( getApplicationContext() , main_activity.class );
                    startActivity(acceuil);
                    finish();
                }
            });
        }
    }

    public void winChecker()
    {
        if (!continuer)
        {
            // Gestion du bouton rejouer
            rejouerBtn.setVisibility(View.VISIBLE);
            rejouerBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v)
                {
                    // On reinitialise les valeurs de controle du jeu
                    gameInit();

                    // Redirection vers l'activité de la page en conservant les anciens noms de joueurs
                    Intent replay = new Intent( getApplicationContext() , jouerActivity.class );
                    replay.putExtra("joueur1Name" , nomJoueur1);
                    replay.putExtra("joueur2Name" , nomJoueur2);
                    startActivity(replay);
                    finish();
                }
            });

            // Gestion du bouton retour
            retourBtn.setVisibility(View.VISIBLE);
            retourBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v)
                {
                    // On reinitialise les variables de controle du jeu
                    gameInit();

                    // Retour a la page d'acceuil
                    Intent acceuil = new Intent( getApplicationContext() , main_activity.class );
                    startActivity(acceuil);
                    finish();
                }
            });
        }

    }

    public void gameChecker()
    {
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
            if ( btnA1.getText().toString() == "X" && btnB1.getText().toString() == "X"  &&
                    btnC1.getText().toString() == "X" )
            {
                successMsg = nomJoueur1 + " " + successMsg;
                gameMessage( successMsg );
            }
            else if ( btnA1.getText().toString() == "0" &&
                    btnB1.getText().toString() == "0" && btnC1.getText().toString() == "0" )
            {
                successMsg = nomJoueur2 + " " + successMsg;
                gameMessage( successMsg );
            }

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
            if ( btnA2.getText().toString() == "X" && btnB2.getText().toString() == "X"  &&
                    btnC2.getText().toString() == "X" )
            {
                successMsg = nomJoueur1 + " " + successMsg;
                gameMessage( successMsg );
            }
            else if ( btnA2.getText().toString() == "0" &&
                    btnB2.getText().toString() == "0" && btnC2.getText().toString() == "0" )
            {
                successMsg = nomJoueur2 + " " + successMsg;
                gameMessage( successMsg );
            }

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
            if ( btnA3.getText().toString() == "X" && btnB3.getText().toString() == "X"  &&
                    btnC3.getText().toString() == "X" )
            {
                successMsg = nomJoueur1 + " " + successMsg;
                gameMessage( successMsg );
            }
            else if ( btnA3.getText().toString() == "0" &&
                    btnB3.getText().toString() == "0" && btnC3.getText().toString() == "0" )
            {
                successMsg = nomJoueur2 + " " + successMsg;
                gameMessage( successMsg );
            }
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
            if ( btnA1.getText().toString() == "X" && btnB2.getText().toString() == "X"  &&
                    btnC3.getText().toString() == "X" )
            {
                successMsg = nomJoueur1 + " " + successMsg;
                gameMessage( successMsg );
            }
            else if ( btnA1.getText().toString() == "0" &&
                    btnB2.getText().toString() == "0" && btnC3.getText().toString() == "0" )
            {
                successMsg = nomJoueur2 + " " + successMsg;
                gameMessage( successMsg );
            }
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
            if ( btnA3.getText().toString() == "X" && btnB2.getText().toString() == "X"  &&
                    btnC1.getText().toString() == "X" )
            {
                successMsg = nomJoueur1 + " " + successMsg;
                gameMessage( successMsg );
            }
            else if ( btnA3.getText().toString() == "0" &&
                    btnB2.getText().toString() == "0" && btnC1.getText().toString() == "0" )
            {
                successMsg = nomJoueur2 + " " + successMsg;
                gameMessage( successMsg );
            }
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
            if ( btnA1.getText().toString() == "X" && btnA2.getText().toString() == "X"  &&
                    btnA3.getText().toString() == "X" )
            {
                successMsg = nomJoueur1 + " " + successMsg;
                gameMessage( successMsg );
            }
            else if ( btnA1.getText().toString() == "0" &&
                    btnA2.getText().toString() == "0" && btnA3.getText().toString() == "0" )
            {
                successMsg = nomJoueur2 + " " + successMsg;
                gameMessage( successMsg );
            }
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
            if ( btnB1.getText().toString() == "X" && btnB2.getText().toString() == "X"  &&
                    btnB3.getText().toString() == "X" )
            {
                successMsg = nomJoueur1 + " " + successMsg;
                gameMessage( successMsg );
            }
            else if ( btnB1.getText().toString() == "0" &&
                    btnB2.getText().toString() == "0" && btnB3.getText().toString() == "0" )
            {
                successMsg = nomJoueur2 + " " + successMsg;
                gameMessage( successMsg );
            }
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
            if ( btnC1.getText().toString() == "X" && btnC2.getText().toString() == "X"  &&
                    btnC3.getText().toString() == "X" )
            {
                successMsg = nomJoueur1 + " " + successMsg;
                gameMessage( successMsg );
            }
            else if ( btnC1.getText().toString() == "0" &&
                    btnC2.getText().toString() == "0" && btnC3.getText().toString() == "0" )
            {
                successMsg = nomJoueur2 + " " + successMsg;
                gameMessage( successMsg );
            }
        }

        // Redirection en cas d'égalité
        equalityChecker();

        // Création d'un bouton pour rediriger les joueurs vers la page prinicpale en cas de victoire
        winChecker();

    }


    public  void gameFunction( View v , String name )
    {
        // Gestion de la saisie
        symbolManager();

        // Gestion d'effets sur les noms de joueurs suivant la valeur de symbol
        playerNamesManager();

        // Ecriture dans le bouton
        buttonValueProcessor( name );

        // Gestion de la fin de la partie
        gameChecker();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jouer);

        // Récupération des variables de noms stockés dans l'activité précédente
        Intent nameActivity = getIntent();
        nomJoueur1 = nameActivity.getStringExtra("joueur1Name");
        nomJoueur2 = nameActivity.getStringExtra("joueur2Name");

        // Définition des text views de nom d'utilisateur
        joueur1Text = findViewById(R.id.textJoueur1);
        joueur2Text = findViewById(R.id.textJoueur2);

        // Insertion des noms de joueurs dans les text views
        joueur1Text.setText(nomJoueur1);
        joueur2Text.setText(nomJoueur2);

        // Définition des text views de symbols
        symbolX = findViewById(R.id.symbolX);
        symbolO = findViewById(R.id.symbolO);

        // On met la coloration du joueur 1 au violet
        joueur1Text.setTextColor(active);
        symbolX.setTextColor(active);

        // Définition du bouton retour
        retourBtn = findViewById(R.id.retourBtn);
        retourBtn.setVisibility(View.INVISIBLE);

        // Définition du bouton rejouer
        rejouerBtn = findViewById(R.id.rejouerBtn);
        rejouerBtn.setVisibility(View.INVISIBLE);

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
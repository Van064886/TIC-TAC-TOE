package Van064886.tictactoetrain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class playersName extends AppCompatActivity {

    // Declaration des elements views
    private Button valider;
    private EditText joueurNom1;
    private EditText joueurNom2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players_name);

        // Definition des elements views
        this.valider = findViewById(R.id.validerName);
        this.joueurNom1 = findViewById(R.id.joueur1Name);
        this.joueurNom2 = findViewById(R.id.joueur2Name);

        // Gestion des evenements
        this.valider.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                // Récupération des entrées de l'utilisateur
                String joueur1 = joueurNom1.getText().toString();
                String joueur2 = joueurNom2.getText().toString();

                // Création de la redirection et insertion des variables de noms
                Intent jouer = new Intent( getApplicationContext() , jouerActivity.class );
                jouer.putExtra("joueur1Name" , joueur1);
                jouer.putExtra("joueur2Name" , joueur2 );
                startActivity(jouer);
                finish();

            }
        });
    }
}
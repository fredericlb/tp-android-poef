package fr.epsi.tp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DisplayLegumesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_legumes);

        Intent intent = getIntent();
        String nom = intent.getStringExtra("nom");
        String couleur = intent.getStringExtra("couleur");

        TextView nomTextView = (TextView) findViewById(R.id.textNomLegume);
        TextView couleurTextView = (TextView) findViewById(R.id.textCouleurLegume);

        nomTextView.setText(nom);
        couleurTextView.setText(couleur);
    }


}

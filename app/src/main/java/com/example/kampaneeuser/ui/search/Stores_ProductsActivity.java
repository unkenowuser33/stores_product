package com.example.kampaneeuser.ui.search;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.kampaneeuser.R;

public class Stores_ProductsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stores_products);
        Button boton_ubicacion = findViewById(R.id.buttom_ubication);
        LinearLayout ly_ventana_desplegable = findViewById(R.id.ly_ventananDesplegable);

        LinearLayout ocultar = findViewById(R.id.ocultar);
        ImageView imagen = findViewById(R.id.imageViewProduct2);
        ConstraintLayout mostrar_constraintLayout = findViewById(R.id.mostrar);
        TextView salirx = findViewById(R.id.textView19);

        boton_ubicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ly_ventana_desplegable.getVisibility() == View.VISIBLE) {
                    ly_ventana_desplegable.setVisibility(View.GONE);
                } else {
                    ly_ventana_desplegable.setVisibility(View.VISIBLE);
                }
            }
        });

        imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ocultar.setVisibility(View.GONE);
                mostrar_constraintLayout.setVisibility(View.VISIBLE);
            }
        });
        salirx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar_constraintLayout.setVisibility(View.GONE);
                ocultar.setVisibility(View.VISIBLE);
            }
        });
    }
}
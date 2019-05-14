package crisdevelop.personal.chisdevelop.abusosexual;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.analytics.FirebaseAnalytics;

import java.util.Locale;


public class resultado extends AppCompatActivity implements View.OnClickListener
{


    static TextView RTA_BRAINSTRESS, PERSONAL, TRABAJO, CLIENTES, CLASIFICACION;

    static Button BACK;

    double total, personal, trabajo, clientes ;

    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        //CODIGO PARA ESCONDER EL STATUS BAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //CODIGO PARA ESCONDER EL STATUS BAR

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        setTitle("Resultado");

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        // DECLARACIÓN E INSTANCIA DE TEXTVIEWS PARA RESULTADOS

        RTA_BRAINSTRESS= findViewById(R.id.rta_brainstress);
        PERSONAL= findViewById(R.id.personal);
        TRABAJO= findViewById(R.id.trabajo);
        CLIENTES= findViewById(R.id.clientes);
        CLASIFICACION= findViewById(R.id.clasificacion);

        BACK= findViewById(R.id.back);
        BACK.setOnClickListener(this);


        Bundle i=getIntent().getExtras();

        total=i.getDouble("BRAINSTRESS_ENVIO");
        personal=i.getDouble("PERSONAL_ENVIO");
        trabajo=i.getDouble("TRABAJO_ENVIO");
        clientes=i.getDouble("CLIENTES_ENVIO");



        RTA_BRAINSTRESS.setText(String.format(Locale.getDefault(), "Total: %.0f puntos",total ));
        PERSONAL.setText(String.format(Locale.getDefault(), "Burnout Personal: %.0f puntos",personal ));
        TRABAJO.setText(String.format(Locale.getDefault(), "Burnout Trabajo:  %.0f puntos",trabajo ));
        CLIENTES.setText(String.format(Locale.getDefault(), "Burnout Clientes:  %.0f puntos",clientes ));


        if ( total <= 5 )

        {
            CLASIFICACION.setText("BURNOUT BAJO");
        }

        else if ( total >= 6 && total <= 10   )

        {
            CLASIFICACION.setText("BURNOUT MODERADO");
        }

        else if ( total >= 10 )

        {
            CLASIFICACION.setText("BURNOUT ALTO");
        }
    }

    @Override
    public void onClick(View v)
    {

        switch (v.getId())

        {
            case R.id.back:

                Intent i= new  Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
        }

    }

}


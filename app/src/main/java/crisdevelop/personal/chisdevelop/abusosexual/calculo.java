package crisdevelop.personal.chisdevelop.abusosexual;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.firebase.analytics.FirebaseAnalytics;

public class calculo extends AppCompatActivity implements View.OnClickListener

{

    static RadioButton UNO0, UNO1, UNO2, UNO3, UNO4, DOS0,DOS1, DOS2, DOS3, DOS4, TRES0, TRES1, TRES2, TRES3, TRES4, CUATRO0, CUATRO1, CUATRO2, CUATRO3, CUATRO4, CINCO0,CINCO1, CINCO2, CINCO3, CINCO4, SEIS0, SEIS1, SEIS2, SEIS3, SEIS4, SIETE0, SIETE1, SIETE2, SIETE3, SIETE4, OCHO0, OCHO1, OCHO2, OCHO3, OCHO4, NUEVE0, NUEVE1, NUEVE2, NUEVE3, NUEVE4, DIEZ0, DIEZ1, DIEZ2, DIEZ3, DIEZ4, ONCE0, ONCE1, ONCE2, ONCE3, ONCE4, DOCE0, DOCE1, DOCE2, DOCE3, DOCE4, TRECE0, TRECE1, TRECE2, TRECE3, TRECE4, CATORCE0, CATORCE1, CATORCE2, CATORCE3, CATORCE4, QUINCE0, QUINCE1, QUINCE2, QUINCE3, QUINCE4, DSEIS0, DSEIS1, DSEIS2, DSEIS3,DSEIS4,DSIETE0, DSIETE1, DSIETE2, DSIETE3, DSIETE4, DOCHO0, DOCHO1, DOCHO2, DOCHO3,DOCHO4, DNUEVE0, DNUEVE1, DNUEVE2, DNUEVE3, DNUEVE4;

    static Button CALCULAR, NUEVO;

    static Toast m;

    private FirebaseAnalytics mFirebaseAnalytics;

    static Button FORMULA, BACK;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        //CODIGO PARA ESCONDER EL STATUS BAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //CODIGO PARA ESCONDER EL STATUS BAR


        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculo);
        setTitle("Burnout Score");

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

//   INSTANCIA DE PREVISUALIZACIÓN DE PUNTAJES:


        UNO0 =findViewById(R.id.uno0);
        UNO1 =findViewById(R.id.uno1);
        UNO2 =findViewById(R.id.uno2);
        UNO3 =findViewById(R.id.uno3);
        UNO4 =findViewById(R.id.uno4);

        DOS0 =findViewById(R.id.dos0);
        DOS1 =findViewById(R.id.dos1);
        DOS2 =findViewById(R.id.dos2);
        DOS3 =findViewById(R.id.dos3);
        DOS4 =findViewById(R.id.dos4);

        TRES0 =findViewById(R.id.tres0);
        TRES1 =findViewById(R.id.tres1);
        TRES2 =findViewById(R.id.tres2);
        TRES3 =findViewById(R.id.tres3);
        TRES4 =findViewById(R.id.tres4);

        CUATRO0 =findViewById(R.id.cuatro0);
        CUATRO1 =findViewById(R.id.cuatro1);
        CUATRO2 =findViewById(R.id.cuatro2);
        CUATRO3 =findViewById(R.id.cuatro3);
        CUATRO4 =findViewById(R.id.cuatro4);

        CINCO0 =findViewById(R.id.cinco0);
        CINCO1 =findViewById(R.id.cinco1);
        CINCO2 =findViewById(R.id.cinco2);
        CINCO3 =findViewById(R.id.cinco3);
        CINCO4 =findViewById(R.id.cinco4);

        SEIS0 =findViewById(R.id.seis0);
        SEIS1 =findViewById(R.id.seis1);
        SEIS2 =findViewById(R.id.seis2);
        SEIS3 =findViewById(R.id.seis3);
        SEIS4 =findViewById(R.id.seis4);

        SIETE0 =findViewById(R.id.siete0);
        SIETE1 =findViewById(R.id.siete1);
        SIETE2 =findViewById(R.id.siete2);
        SIETE3 =findViewById(R.id.siete3);
        SIETE4 =findViewById(R.id.siete4);

        OCHO0 =findViewById(R.id.ocho0);
        OCHO1 =findViewById(R.id.ocho1);
        OCHO2 =findViewById(R.id.ocho2);
        OCHO3 =findViewById(R.id.ocho3);
        OCHO4 =findViewById(R.id.ocho4);

        NUEVE0 =findViewById(R.id.nueve0);
        NUEVE1 =findViewById(R.id.nueve1);
        NUEVE2 =findViewById(R.id.nueve2);
        NUEVE3 =findViewById(R.id.nueve3);
        NUEVE4 =findViewById(R.id.nueve4);

        DIEZ0 =findViewById(R.id.diez0);
        DIEZ1 =findViewById(R.id.diez1);
        DIEZ2 =findViewById(R.id.diez2);
        DIEZ3 =findViewById(R.id.diez3);
        DIEZ4 =findViewById(R.id.diez4);

        ONCE0 =findViewById(R.id.once0);
        ONCE1 =findViewById(R.id.once1);
        ONCE2 =findViewById(R.id.once2);
        ONCE3 =findViewById(R.id.once3);
        ONCE4 =findViewById(R.id.once4);

        DOCE0 =findViewById(R.id.doce0);
        DOCE1 =findViewById(R.id.doce1);
        DOCE2 =findViewById(R.id.doce2);
        DOCE3 =findViewById(R.id.doce3);
        DOCE4 =findViewById(R.id.doce4);

        TRECE0 =findViewById(R.id.trece0);
        TRECE1 =findViewById(R.id.trece1);
        TRECE2 =findViewById(R.id.trece2);
        TRECE3 =findViewById(R.id.trece3);
        TRECE4 =findViewById(R.id.trece4);

        CATORCE0 =findViewById(R.id.catorce0);
        CATORCE1 =findViewById(R.id.catorce1);
        CATORCE2 =findViewById(R.id.catorce2);
        CATORCE3 =findViewById(R.id.catorce3);
        CATORCE4 =findViewById(R.id.catorce4);

        QUINCE0 =findViewById(R.id.quince0);
        QUINCE1 =findViewById(R.id.quince1);
        QUINCE2 =findViewById(R.id.quince2);
        QUINCE3 =findViewById(R.id.quince3);
        QUINCE4 =findViewById(R.id.quince4);

        DSEIS0 =findViewById(R.id.dseis0);
        DSEIS1 =findViewById(R.id.dseis1);
        DSEIS2 =findViewById(R.id.dseis2);
        DSEIS3 =findViewById(R.id.dseis3);
        DSEIS4 =findViewById(R.id.dseis4);

        DSIETE0=findViewById(R.id.dsiete0);
        DSIETE1=findViewById(R.id.dsiete1);
        DSIETE2=findViewById(R.id.dsiete2);
        DSIETE3=findViewById(R.id.dsiete3);
        DSIETE4=findViewById(R.id.dsiete4);

        DOCHO0 =findViewById(R.id.docho0);
        DOCHO1 =findViewById(R.id.docho1);
        DOCHO2 =findViewById(R.id.docho2);
        DOCHO3 =findViewById(R.id.docho3);
        DOCHO4 =findViewById(R.id.docho4);

        DNUEVE0=findViewById(R.id.dnueve0);
        DNUEVE1=findViewById(R.id.dnueve1);
        DNUEVE2=findViewById(R.id.dnueve2);
        DNUEVE3 =findViewById(R.id.dnueve3);
        DNUEVE4 =findViewById(R.id.dnueve4);

        CALCULAR= findViewById(R.id.calcular);
        CALCULAR.setOnClickListener(this);


        BACK= findViewById(R.id.back);
        BACK.setOnClickListener(this);

    }



    @Override
    public void onClick(View v) {

        switch (v.getId())

        {
            case R.id.calcular:


                double UNO_RTA;

                if (UNO0.isChecked())
                    {
                        UNO_RTA = 0;
                    } else if (UNO1.isChecked())
                    {
                        UNO_RTA = 1;
                    } else if (UNO2.isChecked()) {
                        UNO_RTA = 2;
                    } else if (UNO3.isChecked()) {
                        UNO_RTA = 3;
                    } else  {
                        UNO_RTA = 4;
                    }


                // CONDICIONALES DOS


                double DOS_RTA;

                    if (DOS0.isChecked())
                    {
                        DOS_RTA = 0;
                    } else if (DOS1.isChecked())
                    { DOS_RTA = 1;

                    } else if (DOS2.isChecked()) {
                        DOS_RTA = 2;
                    } else if (DOS3.isChecked()) {
                        DOS_RTA = 3;
                    } else {
                        DOS_RTA = 4;
                    }


                // CONDICIONALES TRES


                double TRES_RTA;

                if (TRES0.isChecked())
                {
                    TRES_RTA = 0;
                } else if (TRES1.isChecked())
                {
                    TRES_RTA = 1;
                } else if (TRES2.isChecked()) {
                    TRES_RTA = 2;
                } else if (TRES3.isChecked()) {
                    TRES_RTA = 3;
                } else {
                    TRES_RTA = 4;
                }

                // CONDICIONALES Y CLASIFICACIÓN PARA FRECUENCIA RESPIRATORIA


                double CUATRO_RTA;

                if (CUATRO0.isChecked())
                    {
                        CUATRO_RTA = 0;
                    } else if (CUATRO1.isChecked())
                    {
                        CUATRO_RTA = 1;
                    } else if (CUATRO2.isChecked()) {
                        CUATRO_RTA = 2;
                    } else if (CUATRO3.isChecked()) {
                        CUATRO_RTA = 3;
                    } else {
                        CUATRO_RTA = 4;
                    }

                double CINCO_RTA;

                if (CINCO0.isChecked())
                    {
                        CINCO_RTA = 0;
                    } else if (CINCO1.isChecked())
                    {
                        CINCO_RTA = 1;
                    } else if (CINCO2.isChecked()) {
                        CINCO_RTA = 2;
                    } else if (CINCO3.isChecked()) {
                        CINCO_RTA = 3;
                    } else  {
                        CINCO_RTA = 4;
                    }

                double SEIS_RTA;

                    if (SEIS0.isChecked())
                    {
                        SEIS_RTA = 0;
                    }
                    else if (SEIS1.isChecked())
                    {
                        SEIS_RTA = 1;
                    }
                    else if (SEIS2.isChecked())
                    {
                        SEIS_RTA = 2;
                    }
                    else if (SEIS3.isChecked()) {
                        SEIS_RTA = 3;
                    }
                    else  {
                        SEIS_RTA = 4;
                    }

                // CONDICIONALES Y CLASIFICACIÓN PARA K


                double SIETE_RTA;

                if (SIETE0.isChecked())

                {
                    SIETE_RTA = 0;
                } else if (SIETE1.isChecked())

                {
                    SIETE_RTA = 1;
                } else if (SIETE2.isChecked()) {
                    SIETE_RTA = 2;
                } else if (SIETE3.isChecked()) {
                    SIETE_RTA = 3;
                } else {
                    SIETE_RTA = 4;
                }


                double OCHO_RTA;

                    if (OCHO0.isChecked())
                    {
                        OCHO_RTA = 0;
                    } else if (OCHO1.isChecked())
                    {
                        OCHO_RTA = 1;
                    } else if (OCHO2.isChecked()) {
                        OCHO_RTA = 2;
                    } else if (OCHO3.isChecked()) {
                        OCHO_RTA = 3;
                    } else
                    {
                        OCHO_RTA = 4;
                    }

                double NUEVE_RTA;

                    if (NUEVE0.isChecked())
                    {
                        NUEVE_RTA = 0;
                    } else if (NUEVE1.isChecked())

                    {
                        NUEVE_RTA = 1;
                    } else if (NUEVE2.isChecked()) {
                        NUEVE_RTA = 2;
                    } else if (NUEVE3.isChecked()) {
                        NUEVE_RTA = 3;
                    } else{
                        NUEVE_RTA = 4;
                    }


                double DIEZ_RTA;

                    if (DIEZ0.isChecked())
                    {
                        DIEZ_RTA = 0;
                    } else if (DIEZ1.isChecked())
                    {
                        DIEZ_RTA = 1;
                    } else if (DIEZ2.isChecked()) {
                        DIEZ_RTA = 2;
                    } else if (DIEZ3.isChecked()) {
                        DIEZ_RTA = 3;
                    } else  {
                        DIEZ_RTA = 4;
                    }

                double ONCE_RTA;

                if (ONCE0.isChecked())
                {
                    ONCE_RTA = 0;
                } else if (ONCE1.isChecked())
                {
                    ONCE_RTA = 1;
                } else if (ONCE2.isChecked()) {
                    ONCE_RTA = 2;
                } else if (ONCE3.isChecked()) {
                    ONCE_RTA = 3;
                } else{
                    ONCE_RTA = 4;
                }


                double DOCE_RTA;

                    if (DOCE0.isChecked())
                    {
                        DOCE_RTA = 0;
                    } else if (DOCE1.isChecked())
                    {
                        DOCE_RTA = 1;
                    } else if (DOCE2.isChecked()) {
                        DOCE_RTA = 2;
                    } else if (DOCE3.isChecked()) {
                        DOCE_RTA = 3;
                    } else  {
                        DOCE_RTA = 4;
                    }


        double TRECE_RTA;


                if (TRECE0.isChecked())
                {
                    TRECE_RTA = 0;
                } else if (TRECE1.isChecked())

                {
                    TRECE_RTA = 1;
                } else if (TRECE2.isChecked()) {
                    TRECE_RTA = 2;
                } else if (TRECE3.isChecked()) {
                    TRECE_RTA = 3;
                } else{
                    TRECE_RTA = 4;
                }

        double CATORCE_RTA;

        if (CATORCE0.isChecked())
        {
            CATORCE_RTA = 0;

        } else if (CATORCE1.isChecked())
        {
            CATORCE_RTA = 1;
        } else if (CATORCE2.isChecked()) {
            CATORCE_RTA = 2;
        } else if (CATORCE3.isChecked()) {
            CATORCE_RTA = 3;
        } else  {
            CATORCE_RTA = 4;
        }



        double QUINCE_RTA;

        if (QUINCE0.isChecked()){
            QUINCE_RTA = 0;
        } else if (QUINCE1.isChecked()){
            QUINCE_RTA = 1;
        } else if (QUINCE2.isChecked()) {
            QUINCE_RTA = 2;
        } else if (QUINCE3.isChecked()) {
            QUINCE_RTA = 3;
        } else {
            QUINCE_RTA = 4; }


        double DSEIS_RTA;


        if (DSEIS0.isChecked()){
            DSEIS_RTA = 0;
        } else if (DSEIS1.isChecked()){
            DSEIS_RTA = 1;
        } else if (DSEIS2.isChecked()) {
            DSEIS_RTA = 2;
        } else if (DSEIS3.isChecked()) {
            DSEIS_RTA = 3;
        } else  {
            DSEIS_RTA = 4;
        }


        double DSIETE_RTA;

            if (DSIETE0.isChecked())
            {
                DSIETE_RTA = 0;
            } else if (DSIETE1.isChecked())
            {
                DSIETE_RTA = 1;
            } else if (DSIETE2.isChecked()) {
                DSIETE_RTA = 2;
            } else if (DSIETE3.isChecked()) {
                DSIETE_RTA = 3;
            } else {
                DSIETE_RTA = 4;
            }

        double DOCHO_RTA;

                     if (DOCHO0.isChecked())
                {
                    DOCHO_RTA = 0;
                } else if (DOCHO1.isChecked())
                {
                    DOCHO_RTA = 1;
                } else if (DOCHO2.isChecked()) {
                    DOCHO_RTA = 2;
                } else if (DOCHO3.isChecked()) {
                    DOCHO_RTA = 3;
                } else {
                    DOCHO_RTA = 4;
                }


        double DNUEVE_RTA;

            if (DNUEVE0.isChecked())
            {
                DNUEVE_RTA = 0;
            }
            else if (DNUEVE1.isChecked())
            {
                DNUEVE_RTA = 1;
            } else if (DNUEVE2.isChecked())
            {
                DNUEVE_RTA = 2;
            } else if (DNUEVE3.isChecked()) {
                DNUEVE_RTA = 3;
            } else {
                DNUEVE_RTA = 4;
            }

                //SUMA DE LAS VARIABLES ANTERIORES

                double BRAINSTRESS_TOTAL=(UNO_RTA + DOS_RTA + TRES_RTA  + CUATRO_RTA + CINCO_RTA + SEIS_RTA + SIETE_RTA + OCHO_RTA + NUEVE_RTA + DIEZ_RTA + ONCE_RTA + DOCE_RTA + TRECE_RTA +CATORCE_RTA + QUINCE_RTA + DSEIS_RTA + DSIETE_RTA + DOCHO_RTA + DNUEVE_RTA );
                double PERSONAL_TOTAL=(UNO_RTA + DOS_RTA + TRES_RTA + CUATRO_RTA + CINCO_RTA + SEIS_RTA);
                double TRABAJO_TOTAL= (SIETE_RTA + OCHO_RTA + NUEVE_RTA + DIEZ_RTA + ONCE_RTA + DOCE_RTA + TRECE_RTA);
                double CLIENTES_TOTAL= (CATORCE_RTA + QUINCE_RTA + DSEIS_RTA + DSIETE_RTA + DOCHO_RTA + DNUEVE_RTA );

// MODULO DE //ENVIO DE DATOS A ACTIVITY RESPUESTA*****

                Intent intent = new Intent(this, resultado.class);

                intent.putExtra("BRAINSTRESS_ENVIO", BRAINSTRESS_TOTAL);
                intent.putExtra("PERSONAL_ENVIO", PERSONAL_TOTAL);
                intent.putExtra("TRABAJO_ENVIO", TRABAJO_TOTAL);
                intent.putExtra("CLIENTES_ENVIO", CLIENTES_TOTAL);


                startActivity(intent);
                break;


            case R.id.back:

                Intent i= new  Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);


                // Evento para FIREBASE

                Bundle intento = new Bundle();
                intento.putString(FirebaseAnalytics.Param.ITEM_ID,"CONTE ALGO" );
                intento.putString(FirebaseAnalytics.Param.ITEM_NAME,"BOTON FIREBASE aNALITICS");
                intento.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "number");
                mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT,intento);

                // Evento para FIREBASE






            default:
                break;
        }
    }
}


//http://www.estreslaboral.info/sindrome-de-burnout.html
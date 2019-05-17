package crisdevelop.personal.chisdevelop.abusosexual;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.google.firebase.analytics.FirebaseAnalytics;

public class Cifras extends AppCompatActivity implements View.OnClickListener

{


    static Button CONTINUAR, MENU, ENLACE;

    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //CODIGO PARA ESCONDER EL STATUS BAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //CODIGO PARA ESCONDER EL STATUS BAR

        super.onCreate(savedInstanceState);
        setContentView(R.layout.cifras);



        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        CONTINUAR = findViewById(R.id.continuar);
        CONTINUAR.setOnClickListener(this);

        MENU = findViewById(R.id.menu);
        MENU.setOnClickListener(this);

        ENLACE= findViewById(R.id.enlace1);
        ENLACE.setOnClickListener(new View.OnClickListener()
                                  {

                                      @Override
                                      public void onClick(View v)
                                      {

                                          // TODO Auto-generated method stub
                                          Intent in=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=37z7l35EMos"));
                                          startActivity(in);

                                      }
                                  }
        );


    }

    @Override
    public void onClick(View v)
    {

        switch (v.getId())

        {
            case R.id.menu:

                Intent i= new  Intent(getApplicationContext(), MenuPrincipal.class);
                startActivity(i);
                break;

            case R.id.continuar:

                Intent in= new  Intent(getApplicationContext(), Cifras.class);
                startActivity(in);
                break;

            default:
                break;
        }

    }
}

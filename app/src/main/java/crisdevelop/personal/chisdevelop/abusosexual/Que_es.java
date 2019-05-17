package crisdevelop.personal.chisdevelop.abusosexual;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.google.firebase.analytics.FirebaseAnalytics;


public class Que_es extends AppCompatActivity implements View.OnClickListener

{

    static Button CONTINUAR, MENU, INFO1, INFO2;

    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //CODIGO PARA ESCONDER EL STATUS BAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //CODIGO PARA ESCONDER EL STATUS BAR

        super.onCreate(savedInstanceState);
        setContentView(R.layout.que_es);



        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        CONTINUAR = findViewById(R.id.continuar);
        CONTINUAR.setOnClickListener(this);

        MENU = findViewById(R.id.menu);
        MENU.setOnClickListener(this);

        INFO1 = findViewById(R.id.info1);
        INFO1.setOnClickListener(this);

        INFO2 = findViewById(R.id.info2);
        INFO2.setOnClickListener(this);


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
            case R.id.info1:

                Intent inf= new  Intent(getApplicationContext(), infografia1.class);
                startActivity(inf);
                break;
            case R.id.info2:

                Intent info= new  Intent(getApplicationContext(), infografia2.class);
                startActivity(info);
                break;

            default:
                break;
        }

    }
}

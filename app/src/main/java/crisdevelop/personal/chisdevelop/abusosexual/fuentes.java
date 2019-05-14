package crisdevelop.personal.chisdevelop.abusosexual;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.google.firebase.analytics.FirebaseAnalytics;

public class fuentes extends AppCompatActivity implements View.OnClickListener
{

    static Button CONTINUAR, MENU;

    private FirebaseAnalytics mFirebaseAnalytics;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fuentes);

        //CODIGO PARA ESCONDER EL STATUS BAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //CODIGO PARA ESCONDER EL STATUS BAR

        CONTINUAR = findViewById(R.id.continuar);
        CONTINUAR.setOnClickListener(this);

        MENU = findViewById(R.id.menu);
        MENU.setOnClickListener(this);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())

        {
            case R.id.menu:

                Intent i= new  Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                break;

            case R.id.continuar:

                Intent in= new  Intent(getApplicationContext(), consecuencias.class);
                startActivity(in);
                break;

            default:
                break;
        }
    }
}

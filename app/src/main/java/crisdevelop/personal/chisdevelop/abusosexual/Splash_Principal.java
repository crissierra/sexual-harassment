package crisdevelop.personal.chisdevelop.abusosexual;

        import android.content.Context;
        import android.content.SharedPreferences;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.content.Intent;
        import android.os.Handler;
        import android.view.WindowManager;

        import com.crashlytics.android.Crashlytics;
        import io.fabric.sdk.android.Fabric;


public class Splash_Principal extends AppCompatActivity
{



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.splas_principal);

        //CODIGO PARA ESCONDER EL STATUS BAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //CODIGO PARA ESCONDER EL STATUS BAR


        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {

                // CREACION DE VARIABLE SHARED PARA PASAR A CONTRASEÑA O A MENÚ
                SharedPreferences inicio =  getSharedPreferences("primeravez", Context.MODE_PRIVATE);
                int primeravez = inicio.getInt("primeravez",0);
                // RECORDAR QUE SPREF INICIA EN 0 PORQUE SE LE DA LA GANA... ASÍ LO AJUSTE EN OTRO NUMERO


                // CREACION DE NUEVA VARIABLE PARA RECUPERAR LA APP (SOLICITADO POR EL USUARIO)

                SharedPreferences recuperacion =  getSharedPreferences("recuperacionkey", Context.MODE_PRIVATE);
                int recuperacionkey = recuperacion.getInt("recuperacionkey",0);
                // RECORDAR QUE SPREF INICIA EN 0 PORQUE SE LE DA LA GANA... ASÍ LO AJUSTE EN OTRO NUMERO



                //AQUI PONER LOS CONDICIONALES PARA CONTRASEÑA O PARA ENTRAR DE UNA AL MAIN

                if (recuperacionkey >= 50)
                {
                    startActivity(new Intent(getApplicationContext(), MenuPrincipal.class));
                    finish();
                }
                else{
                    startActivity(new Intent(getApplicationContext(),ConsultaPoliticasPrivacidad.class));
                    finish();
                }
            }

        },2200);
    }
}


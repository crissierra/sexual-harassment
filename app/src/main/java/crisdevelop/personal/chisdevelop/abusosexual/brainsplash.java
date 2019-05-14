package crisdevelop.personal.chisdevelop.abusosexual;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.VideoView;

import com.crashlytics.android.Crashlytics;
import com.google.firebase.analytics.FirebaseAnalytics;

import io.fabric.sdk.android.Fabric;

public class brainsplash extends AppCompatActivity {

    static VideoView videoView;

    private FirebaseAnalytics mFirebaseAnalytics;

    final int DEFAULT = -1;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //CODIGO PARA ESCONDER EL STATUS BAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //CODIGO PARA ESCONDER EL STATUS BAR

        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        setContentView(R.layout.brainsplash);


        getSupportActionBar().hide();
        videoView = findViewById(R.id.videoView);
        Uri video = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.introburnout1);
        videoView.setVideoURI(video);
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
        {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer)
            {

                if (isFinishing())
                    return;

                // CREACION DE VARIABLE SHARED PARA PASAR A CONTRASEÑA O A MENÚ
                SharedPreferences inicio =  getSharedPreferences("primeravez", Context.MODE_PRIVATE);
                int primeravez = inicio.getInt("primeravez",0);
                // RECORDAR QUE SPREF INICIA EN 0 PORQUE SE LE DA LA GANA... ASÍ LO AJUSTE EN OTRO NUMERO



                if (primeravez >= 50)
                {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    finish();
                }
                else{
                    startActivity(new Intent(getApplicationContext(),ConsultaPoliticasPrivacidad.class));
                    finish();
                }


            }
        });

        videoView.start();

    }
}

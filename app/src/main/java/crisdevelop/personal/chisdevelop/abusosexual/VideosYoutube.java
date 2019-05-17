package crisdevelop.personal.chisdevelop.abusosexual;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class VideosYoutube extends AppCompatActivity implements View.OnClickListener
{
    static Button VERVIDEO1, VERVIDEO2, VERVIDEO3, VOLVER;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.videos_youtube);

        //CODIGO PARA ESCONDER EL STATUS BAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //CODIGO PARA ESCONDER EL STATUS BAR

        VOLVER= findViewById(R.id.back);
        VOLVER.setOnClickListener(this);

        VERVIDEO1= findViewById(R.id.botonyoutube1);
        VERVIDEO1.setOnClickListener(this);
        VERVIDEO1.setOnClickListener(new View.OnClickListener()
                                     {
                                         @Override
                                         public void onClick(View v)
                                         {
                                             Intent in=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=ObRmAGmdk5M"));
                                             startActivity(in);
                                         }
                                     }
        );


        VERVIDEO2= findViewById(R.id.botonyoutube2);
        VERVIDEO2.setOnClickListener(this);
        VERVIDEO2.setOnClickListener(new View.OnClickListener()
                                     {
                                         @Override
                                         public void onClick(View v)
                                         {
                                             Intent in=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=ObRmAGmdk5M"));
                                             startActivity(in);
                                         }
                                     }
        );


        VERVIDEO3= findViewById(R.id.botonyoutube3);
        VERVIDEO3.setOnClickListener(this);
        VERVIDEO3.setOnClickListener(new View.OnClickListener()
                                     {
                                         @Override
                                         public void onClick(View v)
                                         {
                                             Intent in=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=ObRmAGmdk5M"));
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
        case R.id.back:

        Intent i= new  Intent(getApplicationContext(), MenuPrincipal.class);
        startActivity(i);
        }
    }
}

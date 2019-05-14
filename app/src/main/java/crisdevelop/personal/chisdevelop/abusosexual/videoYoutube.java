package crisdevelop.personal.chisdevelop.abusosexual;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class videoYoutube extends AppCompatActivity implements View.OnClickListener
{
    static Button VERVIDEO, VOLVER;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_youtube);

        //CODIGO PARA ESCONDER EL STATUS BAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //CODIGO PARA ESCONDER EL STATUS BAR

        VERVIDEO= findViewById(R.id.botonyoutube);
        VERVIDEO.setOnClickListener(this);

        VOLVER= findViewById(R.id.back);
        VOLVER.setOnClickListener(this);

        VERVIDEO.setOnClickListener(new View.OnClickListener()
                                     {

                                         @Override
                                         public void onClick(View v)
                                         {

                                             // TODO Auto-generated method stub
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

        Intent i= new  Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
        }
    }
}

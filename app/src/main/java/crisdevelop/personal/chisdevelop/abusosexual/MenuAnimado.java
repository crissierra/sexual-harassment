package crisdevelop.personal.chisdevelop.abusosexual;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MenuAnimado extends AppCompatActivity {

    ImageView clover;
    ImageButton icono1 ;
    LinearLayout textsplash, texthome, menus;
    Animation frombottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuanimado);

        frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);
        icono1 =  findViewById(R.id.icono1);
        textsplash = (LinearLayout) findViewById(R.id.textsplash);
        menus = (LinearLayout) findViewById(R.id.menus);



        //TRASNSITIONS

        icono1.animate().translationY(-1900).setDuration(800).setStartDelay(300);
        textsplash.animate().translationY(140).alpha(0).setDuration(800).setStartDelay(300);

        menus.startAnimation(frombottom);

        icono1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent (getApplicationContext(), ConsultaPoliticasPrivacidad.class);
                startActivity(intent);
            }
        });




    }
}

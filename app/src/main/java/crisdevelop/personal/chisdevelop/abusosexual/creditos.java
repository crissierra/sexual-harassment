package crisdevelop.personal.chisdevelop.abusosexual;


import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.analytics.FirebaseAnalytics;

public class creditos extends AppCompatActivity implements View.OnClickListener

{
    static Button VEREDGARDO;

    static Button FORMULA, BACK;
    static Button CERRAR, INFO;
    static Dialog MyDialog;



    private FirebaseAnalytics mFirebaseAnalytics;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //CODIGO PARA ESCONDER EL STATUS BAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //CODIGO PARA ESCONDER EL STATUS BAR

        super.onCreate(savedInstanceState);
        setContentView(R.layout.creditos);



        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);




    }


    // INSERTO CODIG DESDE ACA PARA ALERTDIOALOG

    public void MyCustomAlertDialog()
    {
        MyDialog = new Dialog(creditos.this);
        MyDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        MyDialog.setContentView(R.layout.fordesarrollador);


        CERRAR = MyDialog.findViewById(R.id.cerrar);
        INFO = MyDialog.findViewById(R.id.info);

        CERRAR.setEnabled(true);
        INFO.setEnabled(true);

        CERRAR.setOnClickListener(new View.OnClickListener()
                                  {
                                      @Override
                                      public void onClick(View v)
                                      {
                                          MyDialog.cancel();
                                      }
                                  }
        );


        INFO.setOnClickListener(new View.OnClickListener()
                                  {
                                      @Override
                                      public void onClick(View v)
                                      {
                                         Intent in= new  Intent(getApplicationContext(), desarrollador.class);
                                          startActivity(in);

                                          MyDialog.cancel();
                                      }
                                  }
        );




        MyDialog.show();
    }

// HASTA AQUI CÓDIGO ALERTDIOALOG DE FORMULAS






    @Override
    public void onClick(View v)
    {
        switch (v.getId())

        {



            default:
                break;
                        }
    }
}

package crisdevelop.personal.chisdevelop.abusosexual;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import com.google.firebase.analytics.FirebaseAnalytics;

public class desarrollador extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desarrollador);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        //CODIGO PARA ESCONDER EL STATUS BAR

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //CODIGO PARA ESCONDER EL STATUS BAR
    }
}

package crisdevelop.personal.chisdevelop.abusosexual;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class MenuPrincipal extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CODIGO PARA ESCONDER EL STATUS BAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //CODIGO PARA ESCONDER EL STATUS BAR


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//   INACTIVÉ EL FLOTTATING
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)

            {

                Toast.makeText(getApplicationContext(), "Redirigiendo a Playstore", Toast.LENGTH_SHORT).show();


                Intent in=new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=brain.personal.brain"));
                startActivity(in);

/*
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        }
        );

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();



        if (id == R.id.quesabes) {
            Intent intent=new Intent (this, Que_Sabes.class);
            startActivity(intent);

        } else if (id == R.id.cifras) {
            Intent intent=new Intent (this, Cifras.class);
            startActivity(intent);

        } else if (id == R.id.quees) {
            Intent intent=new Intent (this, Que_es.class);
            startActivity(intent);

        } else if (id == R.id.dsr) {
            Intent intent=new Intent (this, DSR.class);
            startActivity(intent);

        } else if (id == R.id.prevencion) {
            Intent intent=new Intent (this, Prevencion.class);
            startActivity(intent);

        } else if (id == R.id.biblioteca) {
            Intent intent=new Intent (this, Biblioteca.class);
            startActivity(intent);

        } else if (id == R.id.desarrollador) {
            Intent intent=new Intent (this, desarrollador.class);
            startActivity(intent);

        }else if (id == R.id.sitios) {
            Intent intent=new Intent (this, Sitios.class);
            startActivity(intent);
        }

        else if (id == R.id.video) {
            Intent intent=new Intent (this, VideosYoutube.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

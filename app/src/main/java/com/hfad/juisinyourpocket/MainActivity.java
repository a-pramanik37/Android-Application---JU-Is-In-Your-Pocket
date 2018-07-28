package com.hfad.juisinyourpocket;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.mainToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("JU Is In Your Pocket");

        firebaseAuth=FirebaseAuth.getInstance();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_signOut) {
            SignOut();
        }
        else if (id == R.id.action_about) {
            Intent intent = new Intent(this, AboutActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    public void SignOut() {
       /* AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.logout);
        builder.setTitle("Hey There!");
        builder.setMessage("Are You Sure to Sign Out?");
        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
        builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
                dialogInterface.cancel();
            }
        });
        builder.show();
        */

       firebaseAuth.signOut();
       finish();
       startActivity(new Intent(MainActivity.this,LoginActivity.class));
    }



    public void busSchedule(View view) {

        Intent intent = new Intent(this, BusScheduleActivity.class);
        startActivity(intent);

    }


    public void rickshawVara(View view) {
        Intent intent = new Intent(this, RickshawVaraActivity.class);
        startActivity(intent);
    }

    public void foods(View view) {
        Intent intent = new Intent(this, FoodsActivity.class);
        startActivity(intent);
    }

    public void organizations(View view) {
        Intent intent = new Intent(this, OrganizationsActivity.class);
        startActivity(intent);
    }

    public void places(View view) {
        Intent intent = new Intent(this, PlacesActivity.class);
        startActivity(intent);
    }

    public void InfoAndContact(View view) {
        Intent intent = new Intent(this, InfoActivity.class);
        startActivity(intent);
    }
}

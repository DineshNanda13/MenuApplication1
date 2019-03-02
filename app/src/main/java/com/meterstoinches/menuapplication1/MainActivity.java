package com.meterstoinches.menuapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.eg_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(getApplicationContext(),"sakku",Toast.LENGTH_LONG).show();
                return true;
            case R.id.item2:
                Toast.makeText(getApplicationContext(),"dinesh",Toast.LENGTH_LONG).show();
                return true;
            case R.id.item3:
                Toast.makeText(getApplicationContext(),"ankush",Toast.LENGTH_LONG).show();
                return true;
            case R.id.Subitem1:
                Toast.makeText(getApplicationContext(),"vivek",Toast.LENGTH_LONG).show();
                return true;
            case R.id.Subitem2:
                Toast.makeText(getApplicationContext(),"jagdeep",Toast.LENGTH_LONG).show();
                return true;
                default:
                    return super.onOptionsItemSelected(item);
        }

    }
}

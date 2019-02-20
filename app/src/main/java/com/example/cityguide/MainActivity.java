package com.example.cityguide;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        // lets define an array
        String[] attraction = {"Art Institute of Chicago", "MAGA Mile", "Willis Tower", "Navy Pier", "Water Tower"};
        // Above is a String array named attract and assigned five attractions. One was renamed Slightly.
        // declaring an Array Like declarations for variables of other types, an array declaration has two components: the data type and array name.

        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.travel, attraction));

        // the setListAdapter displays array (the attraction) in a generic List View layout.



    }
    protected void onListItemClick(ListView l, View v, int position, long id){
        //Responds to a users selection.  But how, with case statements!
        switch(position){
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://artic.edu")));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://themagnificentmile.com")));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, Willis.class));

                break;
            case 3:
                startActivity(new Intent(MainActivity.this, Pier.class));
                break;
            case 4:
                startActivity(new Intent(MainActivity.this, Water.class));

                break;
        }
    }
}

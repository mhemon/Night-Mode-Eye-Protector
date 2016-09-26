package ringtones.xploreictporshi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Root on 11/13/2015.
 */
public class Web extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setDisplayShowHomeEnabled(true);


    }

    public void facebook(View view) {
        Intent i=new Intent(Web.this,Facebook.class);
        startActivity(i);
    }

    public void twiter(View view) {
        Intent i=new Intent(Web.this,Twiter.class);
        startActivity(i);
    }
    public void websight(View view) {
        Intent i=new Intent(Web.this,Site.class);
        startActivity(i);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case android.R.id.home:
                // ProjectsActivity is my 'home' activity
                super.onBackPressed();
                return true;
        }
        return (super.onOptionsItemSelected(menuItem));
    }

}

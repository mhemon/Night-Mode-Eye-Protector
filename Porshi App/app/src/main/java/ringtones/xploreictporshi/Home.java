package ringtones.xploreictporshi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Root on 11/6/2015.
 */
public class Home extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toast.makeText(getBaseContext(),"welcome",Toast.LENGTH_SHORT).show();
    }

    public void gallery(View view) {
        Intent i=new Intent(Home.this,Photo.class);
        startActivity(i);
    }
    public void web(View view) {
        Intent i=new Intent(Home.this,Web.class);
        startActivity(i);
    }

    public void music(View view) {
        Intent i=new Intent(Home.this,RingtonesActivity.class);
        startActivity(i);
    }

    public void favourite(View view) {
        Intent i=new Intent(Home.this,FavoritesActivity.class);
        startActivity(i);
    }
    public void about(View view) {
        Intent i=new Intent(Home.this,DetailsPorshi.class);
        startActivity(i);
    }

}
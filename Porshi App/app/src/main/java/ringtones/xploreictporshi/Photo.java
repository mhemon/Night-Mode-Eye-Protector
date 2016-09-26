package ringtones.xploreictporshi;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.ZoomControls;

/**
 * Created by Root on 11/13/2015.
 */


public class Photo extends Activity {

    ZoomControls zoom;
    ImageView selectedImage;

    private Integer[] mImageIds = {
            R.drawable.image1,
            R.drawable.image5,
            R.drawable.image6,
            R.drawable.image7,
            R.drawable.image9,
            R.drawable.image10,
            R.drawable.image11,
            R.drawable.image12,
            R.drawable.image13,
            R.drawable.image15,
            R.drawable.image16,
            R.drawable.image18,
            R.drawable.image19,
            R.drawable.image20,
            R.drawable.image21,
            R.drawable.image22,
            R.drawable.image23,
            R.drawable.image24,
            R.drawable.image25,
            R.drawable.image26,
            R.drawable.image28,
            R.drawable.image30,
            R.drawable.image31,
            R.drawable.image32,
            R.drawable.image33,
            R.drawable.image35,
            R.drawable.image36,
            R.drawable.image38,
            R.drawable.image39,
            R.drawable.image40,
            R.drawable.image42,
            R.drawable.image43,
            R.drawable.image45,
            R.drawable.image48,
            R.drawable.image49,
            R.drawable.image50,
            R.drawable.image53,
            R.drawable.image54,
            R.drawable.image55,
            R.drawable.image57,
            R.drawable.image58,
            R.drawable.image60,
            R.drawable.image61,
            R.drawable.image62,
            R.drawable.image63,
            R.drawable.image64,
            R.drawable.image66
    };
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setDisplayShowHomeEnabled(true);


        Gallery gallery = (Gallery) findViewById(R.id.gallery1);
        selectedImage=(ImageView)findViewById(R.id.imageView1);
        zoom = (ZoomControls) findViewById(R.id.zoomControls1);

    gallery.setSpacing(1);
        gallery.setAdapter(new GalleryImageAdapter(this));



        // clicklistener for Gallery
        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
//                Toast.makeText(Photo.this, "Number of Image = " + position, Toast.LENGTH_SHORT).show();
                // show the selected Image
                selectedImage.setImageResource(mImageIds[position]);

            }
        });

        zoom.setOnZoomInClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                float x = selectedImage.getScaleX();
                float y = selectedImage.getScaleY();

                selectedImage.setScaleX((float) (x + 1));
                selectedImage.setScaleY((float) (y + 1));
            }
        });

        zoom.setOnZoomOutClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub


                float x = selectedImage.getScaleX();
                float y = selectedImage.getScaleY();

                selectedImage.setScaleX((float) (x - 1));
                selectedImage.setScaleY((float) (y - 1));
            }
        });

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

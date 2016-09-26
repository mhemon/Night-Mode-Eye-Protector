package ringtones.xploreictporshi;

/**
 * Created by Root on 11/14/2015.
 */
        import android.content.Context;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.BaseAdapter;
        import android.widget.Gallery;
        import android.widget.ImageView;

public class GalleryImageAdapter extends BaseAdapter
{
    private Context mContext;

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

    public GalleryImageAdapter(Context context)
    {
        mContext = context;
    }

    public int getCount() {
        return mImageIds.length;
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }


    // Override this method according to your need
    public View getView(int index, View view, ViewGroup viewGroup)
    {
        ImageView i = new ImageView(mContext);

        i.setImageResource(mImageIds[index]);
        i.setLayoutParams(new Gallery.LayoutParams(200, 200));

        i.setScaleType(ImageView.ScaleType.FIT_XY);

        return i;
    }
}

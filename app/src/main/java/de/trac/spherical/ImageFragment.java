package de.trac.spherical;

import android.graphics.Bitmap;
import android.support.v4.app.Fragment;

public abstract class ImageFragment extends Fragment {

    public abstract void updateBitmap(Bitmap bitmap);

    public MainActivity getMainActivity() {
        return (MainActivity) getActivity();
    }
}

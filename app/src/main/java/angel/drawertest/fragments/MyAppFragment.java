package angel.drawertest.fragments;

import android.support.v4.app.Fragment;

import angel.drawertest.MainActivity;

/**
 * Created by angel on 2/13/2017.
 */

public abstract class MyAppFragment extends Fragment {
    /**
     * get a unique string identifier for this fragment. Can be used as a key to add
     * into the back stack
     *
     * @return unique tag
     */
    public String getFragmentTag() {
        return this.getClass().getSimpleName();
    }

    /**
     * obtain the current instance of the activity holding this fragment
     * @return main activity instance
     */
    public MainActivity getMainActivity() {
        return (MainActivity) getActivity();
    }
}

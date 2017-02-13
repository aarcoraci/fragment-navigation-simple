package angel.drawertest.infrastructure;

import angel.drawertest.fragments.FragmentCategories;
import angel.drawertest.fragments.FragmentHome;
import angel.drawertest.fragments.FragmentItem;
import angel.drawertest.fragments.FragmentUsers;
import angel.drawertest.fragments.MyAppFragment;

/**
 * Created by angel on 2/13/2017.
 */

public class MyAppFragmentFactory {

    public static MyAppFragment getFragment(AppSection section) {
        switch (section) {
            case HOME:
                return new FragmentHome();
            case USERS:
                return new FragmentUsers();
            case CATEGORIES:
                return new FragmentCategories();
            case ITEMS:
                return new FragmentItem();
            default:
                return null;
        }
    }
}

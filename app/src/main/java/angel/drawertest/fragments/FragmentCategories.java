package angel.drawertest.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import angel.drawertest.R;
import angel.drawertest.infrastructure.AppSection;

/**
 * Created by angel on 2/11/2017.
 */

public class FragmentCategories extends MyAppFragment {

    private Button gotoItemDetailsButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_categories, container, false);

        gotoItemDetailsButton = (Button)view.findViewById(R.id.categories_goto_items);
        gotoItemDetailsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getMainActivity().navigateToSection(AppSection.ITEMS, true);
            }
        });

        getMainActivity().getSupportActionBar().setTitle("Categories");

        return view;

    }

}

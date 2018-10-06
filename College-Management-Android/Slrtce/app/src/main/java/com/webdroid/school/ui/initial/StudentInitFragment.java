package com.webdroid.school.ui.initial;

import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.webdroid.school.R;
import com.webdroid.school.base.BaseFragment;
import com.webdroid.school.data.model.YearBranch;
import com.webdroid.school.misc.widgets.DividerItemDecoration;
import com.webdroid.school.ui.activities.MainActivity;
import com.webdroid.school.ui.adapters.initAdapters.studentinitAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Coolalien on 2/24/2017.
 */

public class StudentInitFragment extends BaseFragment{

    private TextView toolbartitle, save_title;
    private RecyclerView rv;
    private studentinitAdapter studentinitAdapter;
    private List<YearBranch> yearBranches;

    /**
     * Instance of this class
     * @return
     */
    public static StudentInitFragment getInstance(){
        return new StudentInitFragment();
    }

    @Override
    protected int layoutId() {
        return R.layout.fragment_studentinit;
    }

    @Override
    protected void ui(View rootview) {
        toolbartitle = (TextView) rootview.findViewById(R.id.toolbar_title);
        save_title = (TextView) rootview.findViewById(R.id.save_init);
        rv = (RecyclerView) rootview.findViewById(R.id.rv);

    }

    @Override
    protected void function() {

        toolbartitle.setText(getString(R.string.setup));
        save_title.setText("SAVE");

        yearBranches = new ArrayList<>();

        yearBranches.add(new YearBranch("First Year"));
        yearBranches.add(new YearBranch("Second Year"));
        yearBranches.add(new YearBranch("Third Year"));
        yearBranches.add(new YearBranch("Fourth Year"));

        studentinitAdapter = new studentinitAdapter(getContext(), yearBranches);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        linearLayoutManager.setSmoothScrollbarEnabled(true);
        rv.setLayoutManager(linearLayoutManager);
        rv.setHasFixedSize(true);
        rv.addItemDecoration(new DividerItemDecoration(getContext(), 75));
        rv.setAdapter(studentinitAdapter);

        save_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(setContainerId(), StudentInitFragment2.getInstance()).commit();
            }
        });
    }

    @Override
    protected Fragment setfragment() {
        return null;
    }

    @Override
    protected int setContainerId() {
        return ((MainActivity) getActivity()).setContainerId();
    }
}

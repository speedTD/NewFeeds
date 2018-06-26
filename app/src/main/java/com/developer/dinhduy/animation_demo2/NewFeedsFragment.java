package com.developer.dinhduy.animation_demo2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
**/
public class NewFeedsFragment extends Fragment {

    private RecyclerView recyclerView;
    private NewfeedAdapter adapter;
    private List<Noidung> list=new ArrayList<>();
    private View mview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        mview=inflater.inflate(R.layout.fragment_new_feeds, container, false);

        recyclerView=(RecyclerView) mview.findViewById(R.id.List_new_feeds);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        for (int i=0;i<20;i++) {
            list.add(new Noidung("Tô Đình Duy " +i, "https://picsum.photos/600/300/?random&"+i));
        }

         adapter=new NewfeedAdapter(getContext(),list);

         recyclerView.setAdapter(adapter);
        return mview;
    }

}

package com.Techbus.ipinioapp;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;


public class ListJobsActivity extends Activity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private static String LOG_TAG = "CardViewActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_jobs);
      /*  Button button = (Button) findViewById(R.id.reject);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(ListJobsActivity.this, "Job Removed",	Toast.LENGTH_SHORT).show();
            }
        });*/
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new MyRecyclerViewAdapter(getDataSet());
        mRecyclerView.setAdapter(mAdapter);


    }
        @Override
        protected void onResume () {
            super.onResume();

        }

        private ArrayList<DataObject> getDataSet () {
            ArrayList results = new ArrayList<DataObject>();
            for (int index = 0; index < 20; index++) {
                DataObject obj = new DataObject("Job Id: " + index,
                        "jobLocation: " + index, "Amount:" + index + 400 + "Rs/hr");
                results.add(index, obj);
            }
            return results;
        }
    }

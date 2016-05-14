package com.Techbus.ipinioapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class JobDetail extends AppCompatActivity {
    static String JobId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_detail);
        Intent intent = getIntent(); // gets the previously created intent

        JobId = intent.getStringExtra("JobId");
        TextView jobIDTF;
        TextView LocationTF;
        TextView TimeTF;
        final Button accept,reject,Started,Completed;

        jobIDTF = (TextView) findViewById(R.id.JobID);
        LocationTF= (TextView) findViewById(R.id.Location);
        TimeTF = (TextView) findViewById(R.id.time);

        jobIDTF.setText("JOB ID #"+JobId);
        LocationTF.setText("Location"+"WhiteField");
        TimeTF.setText("Time"+"2:30 PM");
        accept=(Button)findViewById(R.id.AcceptJob);
        reject=(Button)findViewById(R.id.Cancel);
        Started=(Button)findViewById(R.id.StartedBT);
        Completed=(Button)findViewById(R.id.CompletedBT);
        accept.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(JobDetail.this, "Accepted", Toast.LENGTH_LONG).show();
                accept.setVisibility(View.GONE);
                reject.setVisibility(View.GONE);
                Started.setVisibility(View.VISIBLE);
                Completed.setVisibility(View.VISIBLE);

            }

        });
        reject.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(JobDetail.this, "Canceled", Toast.LENGTH_SHORT).show();
                finish();
            }

        });
        Started.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(JobDetail.this, "Started Journey", Toast.LENGTH_SHORT).show();
                 finish();


            }


        });
        Completed.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(JobDetail.this, "Job Completed thanks for your service", Toast.LENGTH_LONG).show();
                finish();
            }

        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_job_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

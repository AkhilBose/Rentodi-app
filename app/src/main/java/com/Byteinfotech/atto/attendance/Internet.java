package com.Byteinfotech.atto.attendance;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.Byteinfotech.atto.dblistview.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public class Internet extends AppCompatActivity {
private SwipeRefreshLayout mySwipeRefreshLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.internet);

        mySwipeRefreshLayout = (SwipeRefreshLayout)this.findViewById(R.id.swipeContainer);

        mySwipeRefreshLayout.setOnRefreshListener(
                new SwipeRefreshLayout.OnRefreshListener() {
                    @Override
                    public void onRefresh() {
                        Intent myIntent = new Intent(Internet.this, MainActivity.class);
                        startActivity(myIntent);
                        Internet.this.finish();
                    }
                }
        );
        Button ib_retry=(Button)findViewById(R.id.ib_retry);

        ib_retry.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Internet.this, MainActivity.class);
                startActivity(myIntent);
                Internet.this.finish();
            }
        });
    }


    @Override
    public void onBackPressed() {
        Intent myIntent = new Intent(Internet.this, MainActivity.class);
        myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(myIntent);
        Internet.this.finish();
    }
}

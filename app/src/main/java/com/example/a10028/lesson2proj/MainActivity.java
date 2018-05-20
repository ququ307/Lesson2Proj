package com.example.a10028.lesson2proj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"you clicked Add",Toast.LENGTH_SHORT).show();
                break;
            case R.id.Remove_item:
                Toast.makeText(this,"you clicked Remove",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
         return  true;
    }

    private  String TAG = "hello";
    private TextView btn_center;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1=(Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
                                       @Override
                                       public void onClick(View view) {
                                           Toast.makeText(MainActivity.this,"世界那么大，何时去看！",Toast.LENGTH_SHORT).show();
                                           Log.i(TAG, "had been onClick 西方");
                                       }
                                   });
        Button button2=(Button)findViewById(R.id.button2) ;
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent("com.example.a10028.lesson2proj.ACTION_1");
                startActivity(intent);
                Log.i(TAG, "had been onClick 北方");
            }
        });
        Button button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"世界那么大，我找到了你！",Toast.LENGTH_SHORT).show();
                Log.i(TAG, "had been onClick  东方");
            }
        });
        Button button4=(Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent("com.example.a10028.lesson2proj.ACTION");
                startActivity(intent);
                Log.i(TAG, "had been onClick  南方");
            }
        });


        Log.i(TAG, "start a click event");
        btn_center= (TextView) findViewById(R.id.btn_center);
        btn_center.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent =new Intent("com.example.a10028.lesson2proj.ACTION_START");
                startActivity(intent);
                Log.i(TAG, "had been onClick 世界中心");
            }


        });




    }
}


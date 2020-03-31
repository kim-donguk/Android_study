package org.techtown.myfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MainFragment fragment1;
    MenuFragment fragment2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment1 = new MainFragment();
        fragment2 = new MenuFragment();

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.mainFragment,fragment1);
            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.mainFragment,fragment2);
            }
        });
    }

    public void onFragmentChage(int index){
        if (index == 0){
            getSupportFragmentManager().beginTransaction().replace(R.id.mainFragment, fragment1).commit();
        }else if (index == 1){
            getSupportFragmentManager().beginTransaction().replace(R.id.mainFragment, fragment2).commit();
        }
    }
}

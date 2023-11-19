package ua.moyseienko.project;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_new_ip = null;
    Button btn_new_key = null;
    RecyclerView rc_view = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //views
        btn_new_ip = ( Button)findViewById(R.id.btn_new_ip);
        btn_new_key = ( Button)findViewById(R.id.btn_new_key);
        rc_view = ( RecyclerView) findViewById(R.id.rc_view);
        btn_new_key.setOnClickListener(listener);
        btn_new_ip.setOnClickListener(listener);

    }

    public View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_new_ip:
                    Intent addIp = new Intent(MainActivity.this, NewIpActivity.class);
                    startActivity(addIp);

                    break;
                case R.id.btn_new_key:
                    break;
            }
        }
    };
}

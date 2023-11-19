package ua.moyseienko.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NewIpActivity extends AppCompatActivity {

    Button btn_confirm_add_ip = null;
    EditText et_ip = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_ip_dialog);

        btn_confirm_add_ip = ( Button) findViewById(R.id.btn_confirm_ip_add);

        btn_confirm_add_ip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ip = et_ip.getText().toString();
                if (isValidIpAddress(ip)) {
                    // IP is valid, proceed with the intent
                    Intent intent = new Intent(NewIpActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    // IP is invalid, show an error message or handle accordingly
                    Toast.makeText(NewIpActivity.this, "Invalid IP address format", Toast.LENGTH_SHORT).show();
                }
            }
        });
        et_ip = (EditText) findViewById(R.id.et_new_ip);
    }

    private boolean isValidIpAddress(String ip) {
        String ipPattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        return ip.matches(ipPattern);
    }
}
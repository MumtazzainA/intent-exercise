package id.ac.polinema.intentexercise;

import static id.ac.polinema.intentexercise.R.id.button_ok;
import static id.ac.polinema.intentexercise.R.id.text_password;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ResourceCursorAdapter;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText nameUser = findViewById(R.id.text_fullname),emailUser=findViewById(R.id.text_email),passwordUser=findViewById(text_password);
        final Button btnok=findViewById(R.id.button_ok);
        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name= nameUser.getText().toString();
                String email= emailUser  .getText().toString();
                String pass= passwordUser.getText().toString();
                if(name.isEmpty()||email.isEmpty()||pass.isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "Filled Is Empty", Toast.LENGTH_SHORT).show();
                }else{
                    btnok.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                        }
                    });
                };
            }
        });
    }
}

package yudistirosaputro.gmail.com.belajar3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonExit = findViewById(R.id.button_exit);
        Button buttonNext = findViewById(R.id.button_next);

        buttonExit.setOnClickListener(this);
        buttonNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_exit:
                finish();
                break;
            case R.id.button_next:
                Intent intent = new Intent(this,Halaman2.class);
                startActivity(intent);
                break;
        }
    }
}

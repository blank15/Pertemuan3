package yudistirosaputro.gmail.com.belajar3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Halaman2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);

        Button buttonBack = findViewById(R.id.button_back);
        buttonBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_back:
            onBackPressed();
            break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}

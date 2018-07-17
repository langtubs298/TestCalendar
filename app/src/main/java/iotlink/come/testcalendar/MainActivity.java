package iotlink.come.testcalendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//11
        Toast.makeText(this, "t3", Toast.LENGTH_LONG).show();
        Toast.makeText(this, "t4", Toast.LENGTH_LONG).show();
        //change something
        //ss
    }
}

package firstapp.jalayeri.net.testapp;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityMain extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyFirstClass myFirstClass = new MyFirstClass();
        float ben = myFirstClass.benefit(45000000,14);
        String text = "میزان سود دریافتی شما برابر است با : "+ Float.toString(ben);
        Toast.makeText(ActivityMain.this,text,Toast.LENGTH_SHORT).show();
    }
}

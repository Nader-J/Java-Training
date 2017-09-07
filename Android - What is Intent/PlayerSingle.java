package firstapp.jalayeri.net.testapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by nader on 2017-09-02.
 */

public class PlayerSingle extends AppCompatActivity {
    TextView playername;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playersingle);
        playername = (TextView)findViewById(R.id.title);
        String newtitle = getIntent().getExtras().getString("playername");
        playername.setText(newtitle);
    }
}

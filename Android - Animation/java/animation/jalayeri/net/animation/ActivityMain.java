package animation.jalayeri.net.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class ActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btnStart,btnApply;

        btnStart = (Button)findViewById(R.id.btnStart);
        btnApply = (Button)findViewById(R.id.btnApply);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(ActivityMain.this,R.anim.animation);
                btnApply.startAnimation(animation);
            }
        });
    }
}

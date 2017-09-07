package menu.jalayeri.net.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,1,1,"Display");
        menu.add(0,2,2,"Graphic");
        menu.add(0,3,3,"Cpu");
        menu.add(0,4,4,"Other Setting");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case 1:
                Toast.makeText(ActivityMain.this,"Display",Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(ActivityMain.this,"Graphic",Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(ActivityMain.this,"Cpu",Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Toast.makeText(ActivityMain.this,"Other Setting",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

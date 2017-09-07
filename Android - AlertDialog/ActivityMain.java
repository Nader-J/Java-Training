package alertdialog.jalayeri.net.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlertDialog.Builder builder = new AlertDialog.Builder(ActivityMain.this)
                .setIcon(android.R.drawable.btn_dialog)
                .setMessage("آیا میخواهید خارج شوید ؟ ")
                .setPositiveButton("بله", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(ActivityMain.this,"yes",Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("خیر", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(ActivityMain.this,"no",Toast.LENGTH_SHORT).show();
                    }
                })
                .setNeutralButton("مطمئن نیستم", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(ActivityMain.this,"i dont know",Toast.LENGTH_SHORT).show();
                    }
                });
        builder.create().show();
    }
}

package array.jalayeri.net.array;

import android.support.v4.content.res.TypedArrayUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class ActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Dynamic Array
        ArrayList<String> FamilyMember = new ArrayList<>();
        for(int i=0;i<10;i++) {
            FamilyMember.add("Member Number" + i);
        }
        FamilyMember.remove(2);
        FamilyMember.add("Member Number 2");
        for (int i=0;i<FamilyMember.size();i++){
            Log.i("LOG", FamilyMember.get(i));
        } */
        /*  Static Array*/
        String[] FamilyMember = new String[10];

        for(int i=0;i<FamilyMember.length;i++){
            FamilyMember[i]= "Member Number " + i;
        }
        for (int i=0;i<FamilyMember.length;i++){
            Log.i("LOG",FamilyMember[i]);
            
        }
    }
}

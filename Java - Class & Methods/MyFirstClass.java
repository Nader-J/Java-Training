package firstapp.jalayeri.net.testapp;

import android.util.Log;

/**
 * Created by nader on 2017-09-04.
 */

public class MyFirstClass {
    public static String firstname = "Nader";
    public String Lastname = "Jalayeri";
    public Integer Age = 0;

    public void ShowName(){
        Log.i("LOG","firstname : " +firstname+" Last Name : " +Lastname);
    }
    public float benefit(float money,float percent){
        float anual = money*(percent/100);
        float ben=anual/12;
        return ben;
    }
}

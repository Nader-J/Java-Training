package jalayeri.net.videoplayer;

import android.app.Application;
import android.content.Context;

/**
 * Created by nader on 2017-09-05.
 */

public class G extends Application {
    public static Context context;
    public static String Packagename;
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        Packagename=getPackageName();
    }
}

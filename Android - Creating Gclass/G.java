package jalayeri.net.gclass;

import android.app.Application;
import android.content.Context;

/**
 * Created by nader on 2017-09-04.
 */

public class G extends Application {
    public static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }
}

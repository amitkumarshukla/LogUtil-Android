package shukla.amishu.com.errorutil;

import android.util.Log;

public class ErrorDebug {
    private static final String TAG = "SUPER_AWESOME_APP";
    public static void e(String message)
    {
        Log.e(TAG,message);
    }
}

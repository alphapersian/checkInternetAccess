
import android.content.Context;
import android.net.ConnectivityManager;

public class CheckInternet {

    Context mContext;

    public CheckInternet(Context mContext) {
        this.mContext = mContext;
    }

    public boolean isConnected() {

        boolean isConnected = false;
        ConnectivityManager cm =
                (ConnectivityManager) mContext.getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null &&
                cm.getActiveNetworkInfo().isConnectedOrConnecting();


    }

}

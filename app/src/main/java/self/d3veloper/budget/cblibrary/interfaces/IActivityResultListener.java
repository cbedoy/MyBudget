package self.d3veloper.budget.cblibrary.interfaces;

import android.content.Intent;

public interface IActivityResultListener {

    int getRequestCode();

    void onActivityResult(int resultCode, Intent intent);

}

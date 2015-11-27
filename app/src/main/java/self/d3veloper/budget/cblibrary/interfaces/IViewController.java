package self.d3veloper.budget.cblibrary.interfaces;

import android.view.View;

/**
 * Created by Carlos Bedoy on 2/16/15.
 * <p/>
 * Mobile App Developer - Bills Android
 * <p/>
 * Pademobile
 */
public interface IViewController
{
    View getViewController();

    String getTag();

    void onStop();

    void onStart();

    void onFinish();

    void onResume();

    void onPause();

    void onAttachToWindow();

    void onRemoveToWindow();

    void onLowMemory();

    void setActive(boolean buttonsStatus);

    boolean onBackPressed();

}

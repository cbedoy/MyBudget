package self.d3veloper.budget.cblibrary.interfaces;

import android.app.Activity;

import self.d3veloper.budget.cblibrary.viewcontrollers.AbstractViewController;


/**
 * Created by Carlos Bedoy on 28/12/2014.
 *
 * Mobile App Developer
 * CBLibrary
 *
 * E-mail: carlos.bedoy@gmail.com
 * Facebook: https://www.facebook.com/carlos.bedoy
 * Github: https://github.com/cbedoy
 */
public interface IAppViewManager
{
    Activity getActivity();
    void setBackgroundViewController(Object... values);
    void reActivateCurrentView();
    int getViewControllerWidth();
    int getViewControllerHeight();
    void presentViewForTag(String tag);
    void addViewWithTag(AbstractViewController controller, String tag);
    void addActivityResultListener(IActivityResultListener resultListener);
}

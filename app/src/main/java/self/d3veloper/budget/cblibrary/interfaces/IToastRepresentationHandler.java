package self.d3veloper.budget.cblibrary.interfaces;

/**
 * Created by Carlos Bedoy on 1/5/15.
 * <p/>
 * Mobile App Developer - Bills Android
 * <p/>
 * Pademobile
 */
public interface IToastRepresentationHandler
{
    void showToastWithMessage(String message);
    void showToastWithMessageAndCallback(String message, IToastRepresentationCallback callback);

    interface IToastRepresentationCallback
    {
        void run();
    }
}

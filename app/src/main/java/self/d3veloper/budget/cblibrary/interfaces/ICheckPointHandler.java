
package self.d3veloper.budget.cblibrary.interfaces;

import java.util.HashMap;
/**
 * Created by Carlos Bedoy on 26/12/14.
 *
 * Mobile App Developer @ Bills Android
 *
 * Pademobile
 */
public interface ICheckPointHandler
{
    void logEvent(String event);
    void logEvent(String event, boolean timed);
    void logEvent(String event, HashMap<String, String> parameters);
    void logEvent(String event, HashMap<String, String> parameters, boolean timed);
}

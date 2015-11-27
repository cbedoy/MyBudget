package self.d3veloper.budget.cblibrary.interfaces;
import java.lang.reflect.Method;
import java.util.HashMap;

import static self.d3veloper.budget.cblibrary.interfaces.IRestService.IRestCallback;

/**
 * Created by admin on 12/18/14.
 */
public interface IRestServiceCatchable
{
    void requestFromSHAWithHandler(String url,
                                   HashMap<String, Object> parameters,
                                   IRestCallback callback,
                                   String SHA1,
                                   Object className,
                                   Method method);

    HashMap<String, Object> readCacheResponseFromSHA(String sha);

    boolean writeCacheResponseForSHA(String sha, HashMap<String, Object> response);
}

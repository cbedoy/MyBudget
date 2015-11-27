package self.d3veloper.budget.cblibrary.business;


import self.d3veloper.budget.cblibrary.interfaces.IRestService;
import self.d3veloper.budget.cblibrary.interfaces.IRestServiceCacheable;

/**
 * Created by Carlos Bedoy on 28/12/2014.
 * <p/>
 * Mobile App Developer
 * CBLibrary
 * <p/>
 * E-mail: carlos.bedoy@gmail.com
 * Facebook: https://www.facebook.com/carlos.bedoy
 * Github: https://github.com/cbedoy
 */
public abstract class AbstractInformationService extends AbstractBusinessController
{
    private IRestService mRestService;
    private IRestServiceCacheable mRestServiceCacheable;

    public void setRestService(IRestService mRestService) {
        this.mRestService = mRestService;
    }

    public void setRestServiceCacheable(IRestServiceCacheable mRestServiceCacheable) {
        this.mRestServiceCacheable = mRestServiceCacheable;
    }
}

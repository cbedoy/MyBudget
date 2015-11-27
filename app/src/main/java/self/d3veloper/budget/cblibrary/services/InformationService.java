package self.d3veloper.budget.cblibrary.services;

import self.d3veloper.budget.cblibrary.interfaces.IMementoHandler;
import self.d3veloper.budget.cblibrary.interfaces.IMessageRepresentationHandler;
import self.d3veloper.budget.cblibrary.interfaces.IRestService;

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
public class InformationService
{
    private IMementoHandler mementoHandler;
    private IRestService restService;
    private IMessageRepresentationHandler messageRepresentationHandler;

    public void setMessageRepresentationHandler(IMessageRepresentationHandler messageRepresentationHandler) {
        this.messageRepresentationHandler = messageRepresentationHandler;
    }

    public void setMementoHandler(IMementoHandler mementoHandler) {
        this.mementoHandler = mementoHandler;
    }

    public void setRestService(IRestService restService) {
        this.restService = restService;
    }
}

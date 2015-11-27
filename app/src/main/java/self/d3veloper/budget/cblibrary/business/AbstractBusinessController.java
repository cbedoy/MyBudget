package self.d3veloper.budget.cblibrary.business;


import self.d3veloper.budget.cblibrary.interfaces.IBackCore;
import self.d3veloper.budget.cblibrary.interfaces.IMementoHandler;
import self.d3veloper.budget.cblibrary.interfaces.IMessageRepresentationHandler;

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
public abstract class AbstractBusinessController implements IBackCore
{
    protected IMementoHandler mMementoHandler;
    protected IMessageRepresentationHandler mMessageRepresentationHandler;

    public void setMementoHandler(IMementoHandler mementoHandler) {
        this.mMementoHandler = mementoHandler;
    }

    public void setMessageRepresentationHandler(IMessageRepresentationHandler messageRepresentationHandler) {
        this.mMessageRepresentationHandler = messageRepresentationHandler;
    }

}

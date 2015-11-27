package self.d3veloper.budget.cblibrary.interfaces;

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
import java.util.HashMap;

import self.d3veloper.budget.cblibrary.services.Memento;


public interface IMementoHandler {

    void clearStack();

    Memento getTopMemento();

    boolean popDataFor(Object owner);

    Object getLastOwnerWithBackSupport();

    void setStateForOwner(HashMap<String, Object> data, Object owner);

}

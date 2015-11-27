package self.d3veloper.budget.cblibrary.orm;

import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by Carlos Bedoy on 27/03/2015.
 * <p/>
 * Mobile App Developer
 * My Fuel Inversion
 * <p/>
 * E-mail: carlos.bedoy@gmail.com
 * Facebook: https://www.facebook.com/carlos.bedoy
 * Github: https://github.com/cbedoy
 */
public interface IORMService<cbedoy>
{
    void insertEntityFromClassWithSettersAndValues
            (
                    Class<cbedoy> className,
                    Method[] setters,
                    Object[] values
            );

    cbedoy loadEntityFromClassWithId
            (
                    Class<cbedoy> className,
                    long identifier
            );

    void  updateEntityFromClassWithIdSettersAndValues
            (
                    Class<cbedoy> className,
                    Method[] setters,
                    Object[] values,
                    long indentifier
            );

    void deleteEntityFromClassWithId
            (
                    Class<cbedoy> className,
                    long identifier
            );

    List<cbedoy> requestAllEntitiesFromClass
            (
                    Class<cbedoy> className
            );

}

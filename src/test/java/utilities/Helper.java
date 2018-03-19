package test.java.utilities;

import java.lang.reflect.Method;

/**
 * Created by rajivbhati on 3/1/18.
 */
public class Helper {

    public <T> T executeMethod(Object onClass, String thisMethod, Object... parameterValueList) throws Throwable{
        Class[] paramterTypes = null;
        if(parameterValueList != null){
            paramterTypes = new Class[parameterValueList.length];
            for ( int i =0; i < parameterValueList.length; i++)
                paramterTypes[i] = parameterValueList[i].getClass();
        }
        Method method = onClass.getClass().getMethod(thisMethod,paramterTypes);
//        Method method = onClass.getClass().getDeclaredMethod(thisMethod,paramterTypes);
        return (T) method.invoke(onClass,parameterValueList);
    }

    public <T> T executeMethodSequence(Object onThis, String... methods) throws Throwable{
        for (String method :methods)
            onThis = onThis == null ? null : this.executeMethod(onThis,method);
        return (T) onThis;
    }
}

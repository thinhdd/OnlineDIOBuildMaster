package com.qsoft.pilotproject.common;

import android.content.Context;
import android.widget.Toast;
import com.googlecode.androidannotations.annotations.EBean;
import com.googlecode.androidannotations.api.Scope;
import com.qsoft.pilotproject.common.utils.LogUtils;

/**
 * User: Le
 * Date: 11/4/13
 */
@EBean(scope = Scope.Singleton)
public class CommandExecutor
{
    public void execute(Context context, ICommandExecutable command, boolean throwException)
    {
        try
        {
            command.execute();
        }
        catch (Exception e)
        {
            if (throwException)
            {
                throw new RuntimeException(e);
            }
            else
            {
                Toast toast = Toast.makeText(context, e.getMessage(), Toast.LENGTH_LONG);
                toast.show();
                LogUtils.debugLog(context, "Execute command error. Cause: " + e.getMessage());
            }
        }
    }
}

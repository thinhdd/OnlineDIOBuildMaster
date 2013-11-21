package com.qsoft.pilotproject.common;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import com.bindroid.BindingMode;
import com.bindroid.ui.EditTextTextProperty;
import com.bindroid.ui.UiBinder;
import com.googlecode.androidannotations.annotations.EActivity;
import com.qsoft.pilotproject.common.annotation.ModelBinding;
import com.qsoft.pilotproject.common.annotation.SaveActivityState;
import com.qsoft.pilotproject.common.annotation.TransferScope;
import com.qsoft.pilotproject.common.utils.ClassUtils;
import com.qsoft.pilotproject.common.utils.LogUtils;
import com.qsoft.pilotproject.common.utils.StateUtils;

import java.io.Serializable;
import java.lang.reflect.Field;

//import com.qsoft.eip.research.annotationsandroid.CommandExecutor;

/**
 * User: Le
 * Date: 10/11/13
 */
@EActivity
public class SuperAnnotationActivity extends Activity implements IModelContainer
{
    // ------------------------------ FIELDS ------------------------------

    public final String TAG = this.getClass().getSimpleName();

    @SaveActivityState(TransferScope.WITHIN_ACTIVITY)
    protected Serializable model;

    @SaveActivityState(TransferScope.WITHIN_ACTIVITY)
    protected int requestCode;

//    @Bean
//    protected CommandExecutor commandExecutor;

// --------------------- GETTER / SETTER METHODS ---------------------

    @Override
    public Serializable getModel()
    {
        return model;
    }

// ------------------------ CANONICAL METHODS ------------------------

    @Override
    public String toString()
    {
        return getClass().getSimpleName() + "@" + Integer.toHexString(super.hashCode());
    }

// ------------------------ INTERFACE METHODS ------------------------


// --------------------- Interface IModelContainer ---------------------

    @Override
    public void setModel(Serializable model)
    {
        this.model = model;
        onModelLoaded();
    }

// -------------------------- OTHER METHODS --------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        StateUtils.loadState(this, savedInstanceState);
    }

    protected void onModelLoaded()
    {
        for (Field member : ClassUtils.getAllFields(this.getClass()))
        {
            if (!member.isAccessible())
            {
                member.setAccessible(true);
            }
            try
            {
                if (member.isAnnotationPresent(ModelBinding.class))
                {
                    Object uiComponent = member.get(this);
                    if (uiComponent instanceof EditText)
                    {
                        UiBinder.bind(new EditTextTextProperty((EditText) uiComponent), model,
                                member.getAnnotation(ModelBinding.class).value(), BindingMode.TWO_WAY);
                    }
                    else if (uiComponent instanceof Button)
                    {
                    }
                    // TODO: All common type
                }
            }
            catch (Exception e)
            {
                LogUtils.debugLog(this, e.getMessage(), e);
            }
        }
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        LogUtils.debugLog(this, "onResume() called");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        LogUtils.debugLog(this, "onSaveInstanceState() called");
        StateUtils.onSaveInstanceState(this, outState);
    }

    @Override
    protected void onDestroy()
    {
        StateUtils.onSaveInstanceState(this, null);
        super.onDestroy();
    }
}

//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations.
//


package com.qsoft.pilotproject.service;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.qsoft.pilotproject.common.authenticator.ApplicationAccountManager_;
import com.qsoft.pilotproject.data.dao.ProfileDAO_;
import com.qsoft.pilotproject.data.rest.OnlineDioClientProxy_;

public final class ProfileService_
    extends ProfileService
{

    private Context context_;

    private ProfileService_(Context context) {
        context_ = context;
        init_();
    }

    public void afterSetContentView_() {
        if (!(context_ instanceof Activity)) {
            return ;
        }
        ((OnlineDioClientProxy_) onlineDioClientProxy).afterSetContentView_();
        ((ApplicationAccountManager_) applicationAccountManager).afterSetContentView_();
        ((ProfileDAO_) profileDAO).afterSetContentView_();
    }

    /**
     * You should check that context is an activity before calling this method
     * 
     */
    public View findViewById(int id) {
        Activity activity_ = ((Activity) context_);
        return activity_.findViewById(id);
    }

    @SuppressWarnings("all")
    private void init_() {
        if (context_ instanceof Activity) {
            Activity activity = ((Activity) context_);
        }
        context = context_;
        onlineDioClientProxy = OnlineDioClientProxy_.getInstance_(context_);
        applicationAccountManager = ApplicationAccountManager_.getInstance_(context_);
        profileDAO = ProfileDAO_.getInstance_(context_);
    }

    public static ProfileService_ getInstance_(Context context) {
        return new ProfileService_(context);
    }

    public void rebind(Context context) {
        context_ = context;
        init_();
    }

}

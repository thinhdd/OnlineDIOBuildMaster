//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations.
//


package com.qsoft.pilotproject.service;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.qsoft.pilotproject.data.dao.FeedDAO_;
import com.qsoft.pilotproject.data.dao.ProfileDAO_;
import com.qsoft.pilotproject.data.dao.SyncToServiceDAO_;
import com.qsoft.pilotproject.data.rest.OnlineDioClientProxy_;

public final class SyncDataService_
    extends SyncDataService
{

    private Context context_;

    private SyncDataService_(Context context) {
        context_ = context;
        init_();
    }

    public void afterSetContentView_() {
        if (!(context_ instanceof Activity)) {
            return ;
        }
        ((SyncToServiceDAO_) syncToServiceDAO).afterSetContentView_();
        ((FeedDAO_) feedDAO).afterSetContentView_();
        ((OnlineDioClientProxy_) onlineDioClientProxy).afterSetContentView_();
        ((ProfileDAO_) profileDAO).afterSetContentView_();
        ((ServiceMapping_) serviceMapping).afterSetContentView_();
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
        syncToServiceDAO = SyncToServiceDAO_.getInstance_(context_);
        feedDAO = FeedDAO_.getInstance_(context_);
        onlineDioClientProxy = OnlineDioClientProxy_.getInstance_(context_);
        profileDAO = ProfileDAO_.getInstance_(context_);
        serviceMapping = ServiceMapping_.getInstance_(context_);
    }

    public static SyncDataService_ getInstance_(Context context) {
        return new SyncDataService_(context);
    }

    public void rebind(Context context) {
        context_ = context;
        init_();
    }

}

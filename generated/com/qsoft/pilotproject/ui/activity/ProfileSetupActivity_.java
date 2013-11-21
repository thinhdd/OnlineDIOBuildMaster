//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations.
//


package com.qsoft.pilotproject.ui.activity;

import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.googlecode.androidannotations.api.BackgroundExecutor;
import com.qsoft.pilotproject.R.id;
import com.qsoft.pilotproject.R.layout;
import com.qsoft.pilotproject.common.authenticator.ApplicationAccountManager_;
import com.qsoft.pilotproject.common.imageloader.ImageLoader_;
import com.qsoft.pilotproject.data.rest.OnlineDioClientProxy_;
import com.qsoft.pilotproject.service.ProfileService_;
import com.qsoft.pilotproject.ui.controller.ProfileController_;
import com.qsoft.pilotproject.ui.model.UiProfileModel;

public final class ProfileSetupActivity_
    extends ProfileSetupActivity
{

    private Handler handler_ = new Handler();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        setContentView(layout.profile_setup);
    }

    private void init_(Bundle savedInstanceState) {
        accountManager = ((AccountManager) this.getSystemService(Context.ACCOUNT_SERVICE));
        profileService = ProfileService_.getInstance_(this);
        onlineDioClientProxy = OnlineDioClientProxy_.getInstance_(this);
        profileController = ProfileController_.getInstance_(this);
        applicationAccountManager = ApplicationAccountManager_.getInstance_(this);
        imageLoader = ImageLoader_.getInstance_(this);
    }

    private void afterSetContentView_() {
        ibProfileCancel = ((ImageView) findViewById(id.ibProfileCancel));
        rlCover = ((RelativeLayout) findViewById(id.profile_relativeLayout));
        etPhone = ((EditText) findViewById(id.et_profile_phone));
        etFullName = ((EditText) findViewById(id.profile_et_name));
        ibProfileSave = ((ImageView) findViewById(id.ibProfileSave));
        tvBirthday = ((EditText) findViewById(id.profile_et_birthday));
        tvCountry = ((EditText) findViewById(id.profile_et_country));
        tvGender = ((TextView) findViewById(id.tv_profile_gender));
        imMale = ((ImageButton) findViewById(id.profile_ibright));
        ivProfile = ((ImageView) findViewById(id.profile_iv_icon));
        dpResult = ((DatePicker) findViewById(id.dpResult));
        tvProfileName = ((TextView) findViewById(id.tv_profile_name));
        etDescription = ((EditText) findViewById(id.profile_et_desciption));
        imFemale = ((ImageButton) findViewById(id.profile_ibleft));
        etDisplayName = ((TextView) findViewById(id.profile_et_displayname));
        {
            View view = findViewById(id.ibProfileCancel);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        ProfileSetupActivity_.this.doClickProfileCancel();
                    }

                }
                );
            }
        }
        {
            View view = findViewById(id.ibProfileSave);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        ProfileSetupActivity_.this.doSave();
                    }

                }
                );
            }
        }
        {
            View view = findViewById(id.profile_relativeLayout);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        ProfileSetupActivity_.this.doClickCover();
                    }

                }
                );
            }
        }
        {
            View view = findViewById(id.profile_et_country);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        ProfileSetupActivity_.this.doClickCountry();
                    }

                }
                );
            }
        }
        {
            View view = findViewById(id.profile_tv_birthday);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        ProfileSetupActivity_.this.doClickBirthday();
                    }

                }
                );
            }
        }
        {
            View view = findViewById(id.profile_ibright);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        ProfileSetupActivity_.this.doClickProfileMale();
                    }

                }
                );
            }
        }
        {
            View view = findViewById(id.profile_iv_icon);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        ProfileSetupActivity_.this.doClickProfileIcon();
                    }

                }
                );
            }
        }
        {
            View view = findViewById(id.profile_ibleft);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        ProfileSetupActivity_.this.doClickProfileFemale();
                    }

                }
                );
            }
        }
        ((ProfileService_) profileService).afterSetContentView_();
        ((OnlineDioClientProxy_) onlineDioClientProxy).afterSetContentView_();
        ((ProfileController_) profileController).afterSetContentView_();
        ((ApplicationAccountManager_) applicationAccountManager).afterSetContentView_();
        ((ImageLoader_) imageLoader).afterSetContentView_();
        setupData();
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        afterSetContentView_();
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        afterSetContentView_();
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        afterSetContentView_();
    }

    public static ProfileSetupActivity_.IntentBuilder_ intent(Context context) {
        return new ProfileSetupActivity_.IntentBuilder_(context);
    }

    @Override
    public void setToView() {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                try {
                    ProfileSetupActivity_.super.setToView();
                } catch (RuntimeException e) {
                    Log.e("ProfileSetupActivity_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

    @Override
    public void setImageProfile(final Bitmap bmImg) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                try {
                    ProfileSetupActivity_.super.setImageProfile(bmImg);
                } catch (RuntimeException e) {
                    Log.e("ProfileSetupActivity_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

    @Override
    public void showMessage() {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                try {
                    ProfileSetupActivity_.super.showMessage();
                } catch (RuntimeException e) {
                    Log.e("ProfileSetupActivity_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

    @Override
    public void setCoverBackground(final Drawable d) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                try {
                    ProfileSetupActivity_.super.setCoverBackground(d);
                } catch (RuntimeException e) {
                    Log.e("ProfileSetupActivity_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

    @Override
    public void loadAvatar(final String url) {
        BackgroundExecutor.execute(new Runnable() {


            @Override
            public void run() {
                try {
                    ProfileSetupActivity_.super.loadAvatar(url);
                } catch (RuntimeException e) {
                    Log.e("ProfileSetupActivity_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

    @Override
    public void syncProfile() {
        BackgroundExecutor.execute(new Runnable() {


            @Override
            public void run() {
                try {
                    ProfileSetupActivity_.super.syncProfile();
                } catch (RuntimeException e) {
                    Log.e("ProfileSetupActivity_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

    @Override
    public void updateProfile(final UiProfileModel uiProfileModel) {
        BackgroundExecutor.execute(new Runnable() {


            @Override
            public void run() {
                try {
                    ProfileSetupActivity_.super.updateProfile(uiProfileModel);
                } catch (RuntimeException e) {
                    Log.e("ProfileSetupActivity_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

    @Override
    public void loadCoverImage(final String url) {
        BackgroundExecutor.execute(new Runnable() {


            @Override
            public void run() {
                try {
                    ProfileSetupActivity_.super.loadCoverImage(url);
                } catch (RuntimeException e) {
                    Log.e("ProfileSetupActivity_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        ProfileSetupActivity_.super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case  1 :
                ProfileSetupActivity_.this.onResult(resultCode, data);
                break;
        }
    }

    public static class IntentBuilder_ {

        private Context context_;
        private final Intent intent_;

        public IntentBuilder_(Context context) {
            context_ = context;
            intent_ = new Intent(context, ProfileSetupActivity_.class);
        }

        public Intent get() {
            return intent_;
        }

        public ProfileSetupActivity_.IntentBuilder_ flags(int flags) {
            intent_.setFlags(flags);
            return this;
        }

        public void start() {
            context_.startActivity(intent_);
        }

        public void startForResult(int requestCode) {
            if (context_ instanceof Activity) {
                ((Activity) context_).startActivityForResult(intent_, requestCode);
            } else {
                context_.startActivity(intent_);
            }
        }

    }

}
//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations.
//


package com.qsoft.pilotproject.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.qsoft.pilotproject.R.layout;
import com.qsoft.pilotproject.common.CommandExecutor_;

public final class ProgramFragment_
    extends ProgramFragment
{

    private View contentView_;

    private void init_(Bundle savedInstanceState) {
        commandExecutor = CommandExecutor_.getInstance_(getActivity());
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
    }

    private void afterSetContentView_() {
        tvTitle = ((TextView) findViewById(com.qsoft.pilotproject.R.id.tvProgramTitle));
        tvLooks = ((TextView) findViewById(com.qsoft.pilotproject.R.id.tvContentLook));
        tvDisplayName = ((TextView) findViewById(com.qsoft.pilotproject.R.id.tvProgramDisplayNameFeed));
        tvLikes = ((TextView) findViewById(com.qsoft.pilotproject.R.id.tvContentLike));
        tvUpdated = ((TextView) findViewById(com.qsoft.pilotproject.R.id.tvLastUpdate));
        ibProgramBack = ((ImageButton) findViewById(com.qsoft.pilotproject.R.id.ibProgramBack));
        rgProgramTab = ((RadioGroup) findViewById(com.qsoft.pilotproject.R.id.rgProgramTab));
        tvPlayed = ((TextView) findViewById(com.qsoft.pilotproject.R.id.tvContentPlay));
        {
            View view = findViewById(com.qsoft.pilotproject.R.id.ibProgramBack);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        ProgramFragment_.this.doClickBack();
                    }

                }
                );
            }
        }
        ((CommandExecutor_) commandExecutor).afterSetContentView_();
        afterViews();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        contentView_ = super.onCreateView(inflater, container, savedInstanceState);
        if (contentView_ == null) {
            contentView_ = inflater.inflate(layout.program, container, false);
        }
        return contentView_;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        afterSetContentView_();
    }

    public View findViewById(int id) {
        if (contentView_ == null) {
            return null;
        }
        return contentView_.findViewById(id);
    }

    public static ProgramFragment_.FragmentBuilder_ builder() {
        return new ProgramFragment_.FragmentBuilder_();
    }

    public static class FragmentBuilder_ {

        private Bundle args_;

        private FragmentBuilder_() {
            args_ = new Bundle();
        }

        public ProgramFragment build() {
            ProgramFragment_ fragment_ = new ProgramFragment_();
            fragment_.setArguments(args_);
            return fragment_;
        }

    }

}

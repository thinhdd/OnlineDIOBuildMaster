//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations.
//


package com.qsoft.pilotproject.ui.fragment;

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.qsoft.pilotproject.R.layout;
import com.qsoft.pilotproject.ui.controller.MediaController_;
import com.qsoft.pilotproject.ui.fragment.player.UpdateProgressBar_;

public final class ContentPlayerFragment_
    extends ContentPlayerFragment
{

    private View contentView_;

    private void init_(Bundle savedInstanceState) {
        audioManager = ((AudioManager) getActivity().getSystemService(Context.AUDIO_SERVICE));
        mediaController = MediaController_.getInstance_(getActivity());
        updateProgressBar = UpdateProgressBar_.getInstance_(getActivity());
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
    }

    private void afterSetContentView_() {
        volumeSeekBar = ((SeekBar) findViewById(com.qsoft.pilotproject.R.id.seekBarVolume));
        tvTotalDuration = ((TextView) findViewById(com.qsoft.pilotproject.R.id.tvTotalTime));
        songSeekBar = ((SeekBar) findViewById(com.qsoft.pilotproject.R.id.seekBarPlayer));
        tvCurrentDuration = ((TextView) findViewById(com.qsoft.pilotproject.R.id.tvTimeCurrent));
        btPlay = ((ImageButton) findViewById(com.qsoft.pilotproject.R.id.ibPlayer));
        {
            View view = findViewById(com.qsoft.pilotproject.R.id.ibPlayer);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        ContentPlayerFragment_.this.doPlay();
                    }

                }
                );
            }
        }
        ((MediaController_) mediaController).afterSetContentView_();
        ((UpdateProgressBar_) updateProgressBar).afterSetContentView_();
        {
            final SeekBar view = ((SeekBar) findViewById(com.qsoft.pilotproject.R.id.seekBarVolume));
            if (view!= null) {
                view.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {


                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        ContentPlayerFragment_.this.onProgressChangeOnVolumnSeekBar(seekBar, progress, fromUser);
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }

                }
                );
            }
        }
        {
            final SeekBar view = ((SeekBar) findViewById(com.qsoft.pilotproject.R.id.seekBarPlayer));
            if (view!= null) {
                view.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {


                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        ContentPlayerFragment_.this.onStartTrackingTouchPlayer(seekBar);
                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        ContentPlayerFragment_.this.onStopTrackingTouchPlayer(seekBar);
                    }

                }
                );
            }
        }
        afterViews();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        contentView_ = super.onCreateView(inflater, container, savedInstanceState);
        if (contentView_ == null) {
            contentView_ = inflater.inflate(layout.program_content_player, container, false);
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

    public static ContentPlayerFragment_.FragmentBuilder_ builder() {
        return new ContentPlayerFragment_.FragmentBuilder_();
    }

    public static class FragmentBuilder_ {

        private Bundle args_;

        private FragmentBuilder_() {
            args_ = new Bundle();
        }

        public ContentPlayerFragment build() {
            ContentPlayerFragment_ fragment_ = new ContentPlayerFragment_();
            fragment_.setArguments(args_);
            return fragment_;
        }

    }

}

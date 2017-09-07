package jalayeri.net.videoplayer;

import android.media.Image;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.VideoView;

public class ActivityMain extends AppCompatActivity {
    ImageView btnPlay,btnPause,btnStop;
    VideoView VideoView;
    SeekBar Seekbar;
    boolean play=false;
    boolean stop=false;
    int PausePosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView=(VideoView)findViewById(R.id.videoView);
        btnPlay=(ImageView)findViewById(R.id.btnPlay);
        btnPause=(ImageView)findViewById(R.id.btnPause);
        btnStop=(ImageView)findViewById(R.id.btnStop);
        Seekbar = (SeekBar)findViewById(R.id.seekBar);
        Uri uri = Uri.parse("android.resource://"+G.Packagename+"/"+R.raw.turninghome);
        VideoView.setVideoURI(uri);
        VideoView.start();
        Seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean fromUser) {
                int duration = VideoView.getDuration();
                float  progress = i/100.0f;
                float time=duration*progress;
                VideoView.seekTo((int)time);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoView.stopPlayback();
                VideoView.seekTo(0);
                Seekbar.setProgress(0);
                stop=true;

            }
        });
        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PausePosition = VideoView.getCurrentPosition();
                VideoView.pause();
                play=true;

            }
        });
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(play){
                    VideoView.seekTo(PausePosition);
                    VideoView.start();
                    play=false;
                }
                if(stop){
                    Uri uri = Uri.parse("android.resource://"+G.Packagename+"/"+R.raw.turninghome);
                    VideoView.setVideoURI(uri);
                    VideoView.start();
                    stop=false;
                }
            }
        });
    }
}

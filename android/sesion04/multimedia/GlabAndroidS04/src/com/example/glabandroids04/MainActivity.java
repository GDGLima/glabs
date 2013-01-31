package com.example.glabandroids04;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	private MediaPlayer mediaPlayer;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		app();

	}

	private void app() {
		// TODO Auto-generated method stub
		mediaPlayer = MediaPlayer.create(this, R.raw.audio001);
		mediaPlayer.start(); // no need to call prepare(); create() does that for you
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		if(mediaPlayer!=null){mediaPlayer.pause();}
		
	}
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		if(mediaPlayer!=null){mediaPlayer.stop();}
	}
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		if(mediaPlayer!=null){mediaPlayer.start();}
		
	}

}

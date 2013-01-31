package com.example.glanandroids41;

import java.io.IOException;
import java.net.URI;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	private MediaPlayer player;
	private String url;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		app();
	}

	private void app() {
		// TODO Auto-generated method stub
		url="http://clientes.qd.pe/gdglima/glabs/media/audio001.mp3";
		
		//Uri myUri=new URI(); //URL SDCARD
		
		player=new MediaPlayer();
		player.setAudioStreamType(AudioManager.STREAM_MUSIC);
		try {
			player.setDataSource(url);
			player.prepare();
			
			player.start();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		if(player!=null)
		{
			//player.prepare();
			player.start();
		}
	}
	@Override
	protected void onPause() 
	{
		// TODO Auto-generated method stub
		super.onPause();
		if(player!=null){player.pause();}
	}
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		if(player!=null){player.stop();}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}

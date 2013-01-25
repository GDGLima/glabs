/**
 * 
 */
package com.example.pservicesexample;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

/**
 * @author emedinaa
 *
 */
public class MyService extends Service {

	MediaPlayer player;//freddy
	/**
	 * 
	 */
	public MyService() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see android.app.Service#onBind(android.content.Intent)
	 */
	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void onCreate() 
	{
		// TODO Auto-generated method stub
		super.onCreate();
		player=MediaPlayer.create(this, R.raw.audio001);
		player.setLooping(true);
		
		Log.v("console","MyService onCreate");
		
	}
	
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.v("console","MyService onDestroy");
		player.stop();
	}
	@Override
	public void onStart(Intent intent, int startId)
	{
		// TODO Auto-generated method stub
		super.onStart(intent, startId);
		Log.v("console","MyService onStart");
		player.start();
	}

}

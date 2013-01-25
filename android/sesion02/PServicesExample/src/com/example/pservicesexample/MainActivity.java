package com.example.pservicesexample;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	private Button btnPlay;
	private Button btnStop;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		app();
	}

	private void app() {
		// TODO Auto-generated method stub
		btnPlay=(Button)findViewById(R.id.btnPlay);
		btnStop=(Button)findViewById(R.id.btnStop);
		
		btnPlay.setOnClickListener(this);
		btnStop.setOnClickListener(this);
		
		//interfaz gráfica
		//crear Servicio
		//registrar Servicio
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	public void onClick(View v)
	{
		// TODO Auto-generated method stub
		switch (v.getId()) 
		{
			case R.id.btnPlay:
					//iniciar servicio
					Log.v("console", "clik Play");
					iniciarServicio();
				break;
			case R.id.btnStop:
				//detener  servicio
					Log.v("console", "clik Stop");
					detenerServicio();
			break;
			default:
				break;
		}
	}

	private void detenerServicio() {
		// TODO Auto-generated method stub
		//detener servicio
		stopService(new Intent(this, MyService.class));
		
	}

	private void iniciarServicio() {
		// TODO Auto-generated method stub
		//arrancar servicio
		startService(new Intent(this,MyService.class));
	}

}

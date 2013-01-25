package com.gdglima.projects.test;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener
{
	
	private Button btnMsg;
	private TextView txtMsg;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main); //permite cargar el layout
		//cargar elementos del layout cargado
		//asociar grafica
		btnMsg=(Button)findViewById(R.id.btnMsg);
		txtMsg=(TextView)findViewById(R.id.txtMsg);
		
		//eventos 
		btnMsg.setOnClickListener(this);
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	//oncliklistener
	@Override
	public void onClick(View v) 
	{
		// TODO Auto-generated method stub
		switch (v.getId()) {
			case R.id.btnMsg:
					showMessage();
				break;
	
			default:
				break;
		}
	}
	private void showMessage() {
		// TODO Auto-generated method stub
		Log.v("console", "click btnMsg");
		txtMsg.setText("Hola Mundo");
	}

}

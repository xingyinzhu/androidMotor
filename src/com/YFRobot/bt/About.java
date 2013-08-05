package com.YFRobot.bt;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;

public class About extends Activity {
	
	 private Button Back;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		
		Back = (Button) findViewById(R.id.about_return);
		Back.setOnClickListener(new OnClickListener() {
	            public void onClick(View v) {
	            	finish();
	            	return;
	            }
	        });
	}	
}

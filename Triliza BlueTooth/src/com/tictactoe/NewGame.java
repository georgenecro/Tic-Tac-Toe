package com.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NewGame extends Activity{

	Button localGame, foreignGame, back;
	
	@Override
	protected void onCreate(Bundle newgame) {
		super.onCreate(newgame);
		setContentView(R.layout.newgame);
		localGame = (Button) findViewById(R.id.localGame);
		foreignGame = (Button) findViewById(R.id.foreignGame);
		back = (Button) findViewById(R.id.back);
		addIndents();
	}
	
	private void addIndents() {
		localGame.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent("com.tictactoe.LOCALHOME");
				startActivity(intent);
			}
			
		});
		
		foreignGame.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent("com.tictactoe.FOREIGNHOME");
				startActivity(intent);
			}
			
		});
		
		back.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				finish();
			}

		});
	}
}

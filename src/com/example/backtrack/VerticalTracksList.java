package com.example.backtrack;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class VerticalTracksList extends Activity implements OnClickListener {
	
	protected void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vtrack_list);
        
        ImageView track1 = (ImageView) findViewById(R.id.myTrack1);
        ImageView track2 = (ImageView) findViewById(R.id.myTrack2);
        ImageView track3 = (ImageView) findViewById(R.id.myTrack3);
        
        track1.setOnClickListener(this);
        track2.setOnClickListener(this);
        track3.setOnClickListener(this);
        
        
	       
    }

	@Override
	public void onClick(View v) {
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
		
	}

}

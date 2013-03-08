package com.example.backtrack;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class MainTrackList extends Activity implements OnGestureListener{
	

	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);
        
        View profileLayout = (View) findViewById(R.id.scrollView1);
        
        profileLayout.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(final View view, final MotionEvent event) {
               if(gdt.onTouchEvent(event)){
            	   Intent intent = new Intent(getBaseContext(), VerticalTracksList.class);
    	           startActivity(intent);
            	   return true;
               }
               else 
            	   return false;
            }
         });
     
	       
    }
	 
	@SuppressWarnings("deprecation")
	private final GestureDetector gdt = new GestureDetector(new GestureListener());
	  
	  private class GestureListener extends SimpleOnGestureListener {

	     private final int SWIPE_MIN_DISTANCE = 120;
	     private final int SWIPE_THRESHOLD_VELOCITY = 200;
	 
	     @Override
	     public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
	        if(e1.getX() - e2.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
	          
	           return true;
	        } else if (e2.getX() - e1.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) >  SWIPE_THRESHOLD_VELOCITY) {
	        	 
	           return true;
	        }
	        
	        return false;
	     }
	  }

	@Override
	public boolean onDown(MotionEvent e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
			float velocityY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onLongPress(MotionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX,
			float distanceY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onShowPress(MotionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean onSingleTapUp(MotionEvent e) {
		// TODO Auto-generated method stub
		return false;
	}
	}
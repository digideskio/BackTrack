package com.example.backtrack;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.gesture.GestureOverlayView;
import android.gesture.GestureOverlayView.OnGestureListener;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity implements OnTouchListener, OnGestureListener{
	
	HorizontalScrollView trackScroll;
	@SuppressWarnings("deprecation")
	public final GestureDetector gdt = new GestureDetector(new GestureListener());
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
       
       final ImageView image1 = (ImageView) findViewById(R.id.track1);
       final ImageView image2 = (ImageView) findViewById(R.id.track2);
       final ImageView image3 = (ImageView) findViewById(R.id.track3);
       final ImageView image4 = (ImageView) findViewById(R.id.track4);
       final ImageView image5 = (ImageView) findViewById(R.id.track5);
       final ImageView image6 = (ImageView) findViewById(R.id.track6);
       final ImageView image7 = (ImageView) findViewById(R.id.track7);
       final ImageView image8 = (ImageView) findViewById(R.id.track8);
       
        
        image1.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(final View view, final MotionEvent event) {
            	TextView eventTimer = (TextView) findViewById(R.id.track_time);
        		eventTimer.setText(view.getTag().toString());
        		
            	if(!gdt.onTouchEvent(event)){
            	   image1.setBackgroundResource(R.drawable.track1_f);
            	   return true;
               }
               else{
            	   image1.setBackgroundResource(R.drawable.track1_f);
            	   return false;
               }
            }
         });
        
        image2.setOnTouchListener(new OnTouchListener() {
        	 @Override
             public boolean onTouch(final View view, final MotionEvent event) {
             	TextView eventTimer = (TextView) findViewById(R.id.track_time);
         		eventTimer.setText(view.getTag().toString());
             	
             	if(!gdt.onTouchEvent(event)){
             	   image2.setBackgroundResource(R.drawable.track2_f);
             	   return true;
                }
                else{
             	   image2.setBackgroundResource(R.drawable.track2_r);
             	   return false;
                }
             }
         });
        
        image3.setOnTouchListener(new OnTouchListener() {
        	 @Override
             public boolean onTouch(final View view, final MotionEvent event) {
             	TextView eventTimer = (TextView) findViewById(R.id.track_time);
         		eventTimer.setText(view.getTag().toString());
             	
             	if(!gdt.onTouchEvent(event)){
             	   image3.setBackgroundResource(R.drawable.track3_f);
             	   return true;
                }
                else{
             	   image3.setBackgroundResource(R.drawable.track3_r);
             	   return false;
                }
             }
         });
        
        image4.setOnTouchListener(new OnTouchListener() {
        	 @Override
             public boolean onTouch(final View view, final MotionEvent event) {
             	TextView eventTimer = (TextView) findViewById(R.id.track_time);
         		eventTimer.setText(view.getTag().toString());
         		
             	if(!gdt.onTouchEvent(event)){
             	   image4.setBackgroundResource(R.drawable.track4_f);
             	   return true;
                }
                else{
             	   image4.setBackgroundResource(R.drawable.track4_r);
             	   return false;
                }
             }
         });
        
        image5.setOnTouchListener(new OnTouchListener() {
        	 @Override
             public boolean onTouch(final View view, final MotionEvent event) {
             	TextView eventTimer = (TextView) findViewById(R.id.track_time);
         		eventTimer.setText(view.getTag().toString());
         		
             	if(!gdt.onTouchEvent(event)){
             	   image5.setBackgroundResource(R.drawable.track5_f);
             	   return true;
                }
                else{
             	   image5.setBackgroundResource(R.drawable.track5_r);
             	   return false;
                }
             }
         });
        
        image6.setOnTouchListener(new OnTouchListener() {
        	 @Override
             public boolean onTouch(final View view, final MotionEvent event) {
             	TextView eventTimer = (TextView) findViewById(R.id.track_time);
         		eventTimer.setText(view.getTag().toString());
         		
             	if(!gdt.onTouchEvent(event)){
             	   image6.setBackgroundResource(R.drawable.track6_f);
             	   return true;
                }
                else{
             	   image6.setBackgroundResource(R.drawable.track6_r);
             	   return false;
                }
             }
         });
        
        image7.setOnTouchListener(new OnTouchListener() {
        	 @Override
             public boolean onTouch(final View view, final MotionEvent event) {
             	TextView eventTimer = (TextView) findViewById(R.id.track_time);
         		eventTimer.setText(view.getTag().toString());
         		
             	if(!gdt.onTouchEvent(event)){
             	   image7.setBackgroundResource(R.drawable.track7_f);
             	   return true;
                }
                else{
             	   image7.setBackgroundResource(R.drawable.track7_f);
             	   return false;
                }
             }
         });
        
        image8.setOnTouchListener(new OnTouchListener() {
        	 @Override
             public boolean onTouch(final View view, final MotionEvent event) {
             	TextView eventTimer = (TextView) findViewById(R.id.track_time);
         		eventTimer.setText(view.getTag().toString());
         		
             	if(!gdt.onTouchEvent(event)){
             	   image8.setBackgroundResource(R.drawable.track8_f);
             	   return true;
                }
                else{
             	   image8.setBackgroundResource(R.drawable.track8_r);
             	   //image8.
             	   return false;
                }
             }
         });
        
		
		/*image1.setOnClickListener(this);
		image2.setOnClickListener(this);
		image3.setOnClickListener(this);
		image4.setOnClickListener(this);
		image5.setOnClickListener(this);
		image6.setOnClickListener(this);
		image7.setOnClickListener(this);
		image8.setOnClickListener(this);
		*/
		
		
    }
    
	  
	  private class GestureListener extends SimpleOnGestureListener {

	     private final int SWIPE_MIN_DISTANCE = 50;
	     private final int SWIPE_THRESHOLD_VELOCITY = 150;
	 
	     @Override
	     public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
	        if(e1.getX() - e2.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) 
	           return true;
	        else if (e2.getX() - e1.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) >  SWIPE_THRESHOLD_VELOCITY) 
	           return true;
	        if(e1.getY() - e2.getY() > SWIPE_MIN_DISTANCE && Math.abs(velocityY) > SWIPE_THRESHOLD_VELOCITY)
		           return true;
	        else if (e2.getY() - e1.getY() > SWIPE_MIN_DISTANCE && Math.abs(velocityY) >  SWIPE_THRESHOLD_VELOCITY)    	 
		           return true;
	        
	        return false;
	     }
	     
	     public boolean onDoubleTapEvent (MotionEvent e){
	    	 return true;
	     }
	  }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    /*public void onClick(View v) {
		TextView eventTimer = (TextView) findViewById(R.id.track_time);
		eventTimer.setText(v.getTag().toString());
    	v.setBackgroundResource(R.drawable.map);	
					
	}*/


	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onGesture(GestureOverlayView overlay, MotionEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onGestureCancelled(GestureOverlayView overlay, MotionEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onGestureEnded(GestureOverlayView overlay, MotionEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onGestureStarted(GestureOverlayView overlay, MotionEvent event) {
		// TODO Auto-generated method stub
		
	}
	
	public void resetBackgrounds(){
		ImageView image1 = (ImageView) findViewById(R.id.track1);
	    ImageView image2 = (ImageView) findViewById(R.id.track2);
	    ImageView image3 = (ImageView) findViewById(R.id.track3);
	    ImageView image4 = (ImageView) findViewById(R.id.track4);
	    ImageView image5 = (ImageView) findViewById(R.id.track5);
	    ImageView image6 = (ImageView) findViewById(R.id.track6);
	    ImageView image7 = (ImageView) findViewById(R.id.track7);
	    ImageView image8 = (ImageView) findViewById(R.id.track8);
	    
	    image1.setBackgroundResource(R.drawable.track1_f);
	    image2.setBackgroundResource(R.drawable.track2_f);
	    image3.setBackgroundResource(R.drawable.track3_f);
	    image4.setBackgroundResource(R.drawable.track4_f);
	    image5.setBackgroundResource(R.drawable.track5_f);
	    image6.setBackgroundResource(R.drawable.track6_f);
	    image7.setBackgroundResource(R.drawable.track7_f);
	    image8.setBackgroundResource(R.drawable.track8_f);
	    
	}
    
}

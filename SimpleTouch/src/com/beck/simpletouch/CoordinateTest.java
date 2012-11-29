package com.beck.simpletouch;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.TextView;

public class CoordinateTest extends Activity {
    
    TextView tv;
    /** Called when the activity is first created. */
    float x;
    float y;
    @Override
        public void onCreate(Bundle savedInstanceState) {
       
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
       
        
    }
    
    @Override
    public boolean onTouchEvent(MotionEvent e)
    {
       
        x = e.getX();
        y = e.getY();
             
             return true;
    }
    
}
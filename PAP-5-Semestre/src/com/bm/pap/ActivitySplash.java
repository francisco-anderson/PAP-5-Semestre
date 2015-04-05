package com.bm.pap;

import com.bm.pap.R;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class ActivitySplash extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    
        
        
    Thread splash_screen = new Thread(){
    	
    	public void run(){
    	try{
    		sleep(900);
    	}catch(Exception e){
    		e.printStackTrace();
    		
    	}finally{
    		startActivity(new Intent(getApplicationContext(),ActivityInicial.class));
    		
    	finish();
    	
    	}
    		
    		
    	}
    	
    };
    
    splash_screen.start();
    
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.splash, menu);
        return true;
   
    
    }
    

}

   
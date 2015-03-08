package info.Sakshi.Madad;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	

 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button voilence = (Button) findViewById(R.id.button1);
        
        voilence.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent intent= new Intent(MainActivity.this,voilence_desc.class);
				startActivity(intent);
			}

		
		});
        
        Button  corruption= (Button) findViewById(R.id.button2);
        corruption.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent= new Intent(MainActivity.this,corrupton_desc.class);
				startActivity(intent);
			}
		});
       
        Button  child_labour= (Button) findViewById(R.id.button3);
        child_labour.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent= new Intent(MainActivity.this,child_labour_desc.class);
				startActivity(intent);
			}
		});
       
        Button swaksh = (Button) findViewById(R.id.button4);
        swaksh.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent= new Intent(MainActivity.this,swaksh_desc.class);
				startActivity(intent);
			}
		});
       
       
    }


	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menu, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if(item.getItemId()==R.id.item1){
			Intent intent= new Intent(this, about.class);
			startActivity(intent);
			Log.d("optionClicked","Hello man");
		}
		if(item.getItemId()==R.id.item2){
			Toast.makeText(MainActivity.this, "This Facility will be updated soon", 5000).show();
			
		}
		if(item.getItemId()==R.id.item3){
			Intent intent = new Intent(MainActivity.this, emergency.class);
			startActivity(intent);
		}
		return super.onOptionsItemSelected(item);
	}
	
 
    
}

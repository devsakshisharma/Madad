package info.Sakshi.Madad;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class child_labour_desc extends Activity{
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
	setContentView(R.layout.child_labour_desc);
		super.onCreate(savedInstanceState);
		
		Button enter = (Button) findViewById(R.id.button1);
		enter.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(child_labour_desc.this,child_labour.class);
				startActivity(intent);
			}
		});
	}
	
	
}

package info.Sakshi.Madad;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class swaksh_desc extends Activity{
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
	setContentView(R.layout.swaksh_desc);
		super.onCreate(savedInstanceState);
		
		Button enter = (Button) findViewById(R.id.button1);
		enter.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(swaksh_desc.this,swaksh.class);
				startActivity(intent);
			}
		});
	}
	
	
}

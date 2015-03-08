package info.Sakshi.Madad;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import android.widget.Button;

public class AndroidLocation {
	public static String fullPath=null; 
	Button btnGPSLocation;
	
	Context mContext;
	AppLocation appLocation;

	protected  AndroidLocation(Context mContext) {
		this.mContext= mContext;
		appLocation = new AppLocation(mContext);

				Location gpsLocation = appLocation
						.getLocation(LocationManager.GPS_PROVIDER);

				if (gpsLocation != null) {
					double latitude = gpsLocation.getLatitude();
					double longitude = gpsLocation.getLongitude();
					Log.d("latitude",latitude+"");
					Log.d("longitude",longitude+"");
					try {
						URL url=null;
						String path= "latitude="+latitude+"&longitude="+longitude+"&image="+voilence.fileBasename+"&description="+UploadActivity.descriptionString;
						AndroidLocation.fullPath = path;
						url = new URL("http://techno-geeks.in/madad/upload.php?"+path);
					
						URLConnection conn= url.openConnection();
						
						BufferedReader reader3= new BufferedReader(new InputStreamReader(conn.getInputStream()));
						String attend=null;
						while((attend=reader3.readLine())!=null){
							
						}
					} catch (Exception e) {
						
						e.printStackTrace();
					}
					
					} 
				else {
					showSettingsAlert("GPS");
				}

			}
	


	public void showSettingsAlert(String provider) {
	AlertDialog.Builder alertDialog = new AlertDialog.Builder(
			mContext);

	alertDialog.setTitle(provider + " SETTINGS");

		alertDialog
				.setMessage(provider + " is not enabled! Want to go to settings menu?");

		alertDialog.setPositiveButton("Settings",
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						Intent intent = new Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
						mContext.startActivity(intent);
					}
				});

		alertDialog.setNegativeButton("Cancel",
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						dialog.cancel();
					}
				});

		alertDialog.show();
	}

	
}


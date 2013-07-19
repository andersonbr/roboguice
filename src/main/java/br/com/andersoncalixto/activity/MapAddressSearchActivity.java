package br.com.andersoncalixto.activity;

import roboguice.activity.RoboActivity;
import android.os.Bundle;
import android.util.Log;
import br.com.andersoncalixto.R;

public class MapAddressSearchActivity extends RoboActivity {

	private static String TAG = "roboguice";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i(TAG, "onCreate");
		setContentView(R.layout.activity_map_address_search);
	}
}

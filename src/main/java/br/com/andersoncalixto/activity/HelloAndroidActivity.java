package br.com.andersoncalixto.activity;

import roboguice.activity.RoboActivity;
import roboguice.inject.InjectView;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import br.com.andersoncalixto.R;

import com.google.inject.Inject;

public class HelloAndroidActivity extends RoboActivity {

	private static String TAG = "roboguice";
	@InjectView(R.id.button)
	private Button botao;
	@Inject
	Vibrator vibrator;

	/**
	 * Called when the activity is first created.
	 * 
	 * @param savedInstanceState
	 *            If the activity is being re-initialized after previously being
	 *            shut down then this Bundle contains the data it most recently
	 *            supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it
	 *            is null.</b>
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i(TAG, "onCreate");
		setContentView(R.layout.main);

		botao.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View view) {
				Log.i(TAG, "clique!");
//				vibrator.vibrate(2000);
				sendMessage(view);
			}

		});
	}

	/** Called when the user clicks the Send button */
	public void sendMessage(View view) {
		Intent intent = new Intent(this, MapAddressSearchActivity.class);
		startActivity(intent);
	}

}

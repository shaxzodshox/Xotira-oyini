package com.shlsoft.matches;

import android.app.Application;

import com.shlsoft.matches.utils.FontLoader;

public class GameApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		FontLoader.loadFonts(this);

	}
}

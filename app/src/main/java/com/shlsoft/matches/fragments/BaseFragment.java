package com.shlsoft.matches.fragments;

import androidx.fragment.app.Fragment;

import com.shlsoft.matches.events.EventObserver;
import com.shlsoft.matches.events.engine.FlipDownCardsEvent;
import com.shlsoft.matches.events.engine.GameWonEvent;
import com.shlsoft.matches.events.engine.HidePairCardsEvent;
import com.shlsoft.matches.events.ui.BackGameEvent;
import com.shlsoft.matches.events.ui.FlipCardEvent;
import com.shlsoft.matches.events.ui.NextGameEvent;
import com.shlsoft.matches.events.ui.ResetBackgroundEvent;
import com.shlsoft.matches.events.ui.ThemeSelectedEvent;
import com.shlsoft.matches.events.ui.DifficultySelectedEvent;
import com.shlsoft.matches.events.ui.StartEvent;

public class BaseFragment extends Fragment implements EventObserver {

	@Override
	public void onEvent(FlipCardEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(DifficultySelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(HidePairCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(FlipDownCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(StartEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(ThemeSelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(GameWonEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(BackGameEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(NextGameEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(ResetBackgroundEvent event) {
		throw new UnsupportedOperationException();
	}

}

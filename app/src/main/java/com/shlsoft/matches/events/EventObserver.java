package com.shlsoft.matches.events;

import com.shlsoft.matches.events.engine.FlipDownCardsEvent;
import com.shlsoft.matches.events.engine.GameWonEvent;
import com.shlsoft.matches.events.engine.HidePairCardsEvent;
import com.shlsoft.matches.events.ui.BackGameEvent;
import com.shlsoft.matches.events.ui.DifficultySelectedEvent;
import com.shlsoft.matches.events.ui.FlipCardEvent;
import com.shlsoft.matches.events.ui.NextGameEvent;
import com.shlsoft.matches.events.ui.ResetBackgroundEvent;
import com.shlsoft.matches.events.ui.StartEvent;
import com.shlsoft.matches.events.ui.ThemeSelectedEvent;


public interface EventObserver {

	void onEvent(FlipCardEvent event);

	void onEvent(DifficultySelectedEvent event);

	void onEvent(HidePairCardsEvent event);

	void onEvent(FlipDownCardsEvent event);

	void onEvent(StartEvent event);

	void onEvent(ThemeSelectedEvent event);

	void onEvent(GameWonEvent event);

	void onEvent(BackGameEvent event);

	void onEvent(NextGameEvent event);

	void onEvent(ResetBackgroundEvent event);

}

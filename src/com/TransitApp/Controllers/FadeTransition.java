package com.TransitApp.Controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.util.Duration;

public class FadeTransition {
	public static void applyFadeTransition(Node node, Duration duration, EventHandler<ActionEvent> event) {
		javafx.animation.FadeTransition fadeIn = new javafx.animation.FadeTransition(duration, node);
		fadeIn.setCycleCount(1);
		fadeIn.setOnFinished(event);

		javafx.animation.FadeTransition fadeOut = new javafx.animation.FadeTransition(duration, node);
		fadeOut.setCycleCount(1);
		fadeOut.play();
		fadeOut.setOnFinished((e) -> fadeIn.play());
	}
}
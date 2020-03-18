package application;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;


public class Animation extends Application {
	private double opacity =1;
	private double opacitm =1;
	private Label lbl;
	private Rectangle rect;
	@Override
	public void start(Stage stage) {
		try {
			initUI(stage);
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void initUI(Stage stage) {
		StackPane root = new StackPane();

	        lbl = new Label("JavaFX");
	        lbl.setFont(Font.font(48));
	   
	        Rectangle rect = new Rectangle(50, 50, 30, 30);
	        rect.setArcHeight(10);
	        rect.setArcWidth(10);
	        rect.setFill(Color.CADETBLUE);
	        root.getChildren().addAll(lbl,rect);

	        AnimationTimer timer = new MyTimer();
	        timer.start();

	        Scene scene = new Scene(root, 300, 250);

	        stage.setTitle("AnimationTimer");
	        stage.setScene(scene);
	        stage.show();
	}
	private class MyTimer extends AnimationTimer {
		@Override
        public void handle(long now) {

            doHandle();
        }

        private void doHandle() {

            opacity -= 0.01;
            opacitm -= 0.01;
            lbl.opacityProperty().set(opacity);
            rect.opacityProperty().set(opacitm);
            if (opacity <= 0) {

                stop();
                System.out.println("Animation stopped");
            }
        }
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

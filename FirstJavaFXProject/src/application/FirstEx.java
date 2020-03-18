package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class FirstEx extends Application {
	// variable
	static int speed = 5;
	static int foodcolor = 0;
	static int width = 20;
	static int height = 20;
	static int foodX = 0;
	static int foodY = 0;
	static int cornersize = 25;
	static boolean gameOver = false;
	static Random rand = new Random();

	public static class Corner {
		int x;
		int y;

		public Corner(int x, int y) {
			this.x = x;
			this.y = y;
		}

	}

	public void start(Stage primaryStage) {
		try {
			newFood();
			VBox root = new VBox();
			Canvas c = new Canvas(width * cornersize, height * cornersize);
			GraphicsContext gc = c.getGraphicsContext2D();
			root.getChildren().add(c);

			new AnimationTimer() {
				long lastTick = 0;

				public void handle(long now) {
					if (lastTick == 0) {
						lastTick = now;
						tick(gc);
						return;
					}

					if (now - lastTick > 1000000000 / speed) {
						lastTick = now;
						tick(gc);
					}
				}

			}.start();
			
			Scene scene = new Scene(root, width * cornersize, height * cornersize);


			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("SNAKE GAME");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// tick
	public static void tick(GraphicsContext gc) {
		if (gameOver) {
			gc.setFill(Color.RED);
			gc.setFont(new Font("", 50));
			gc.fillText("GAME OVER", 100, 250);
			return;
		}

		// fill
		// background
		gc.setFill(Color.BLACK);
		gc.fillRect(0, 0, width * cornersize, height * cornersize);
		newFood();
		// random foodcolor
		Color cc = Color.WHITE;

		switch (foodcolor) {
		case 0:
			cc = Color.ORANGE;
			break;
		case 1:
			cc = Color.RED;
			break;
		case 2:
			cc = Color.GREEN;
			break;
		case 3:
			cc = Color.BROWN;
			break;
		case 4:
			cc = Color.WHITE;
			break;
		}
		gc.setFill(cc);
		gc.fillRect(foodX * cornersize, foodY * cornersize, width, height);
	
	}

	// food
	public static void newFood() {
		start: while (true) {
			foodX = rand.nextInt(width);
			foodY = rand.nextInt(height);
			foodcolor = rand.nextInt(5);
		
			break;
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}

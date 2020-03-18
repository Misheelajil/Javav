package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.ColorInput;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.*;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
public class Hello_World extends Application {

	public static void main (String[] args) {
		
		launch(args);
	}
/*
	Button btnAdd;
	Button btnSubtract;
	Label lbl;
	int iCounter = 0;
	@Override*/
	public void start(Stage primaryStage) throws Exception {
	/*
		Group group = new Group();  
	    Arc arc = new Arc();  
	    arc.setCenterX(100);  
	    arc.setCenterY(100);  
	    arc.setRadiusX(50);  
	    arc.setRadiusY(80);  
	    arc.setStartAngle(30);  
	    arc.setLength(70);  
	    arc.setType(ArcType.ROUND);  
	    arc.setFill(Color.RED);  
	    group.getChildren().addAll(arc); 
		 
	    Scene scene = new Scene(group,200,300,Color.GRAY);  
		    primaryStage.setScene(scene);  
		    primaryStage.show();
		
			Button btn1= new Button("HELLOooooooooooooo");
			
			Button btn2= new Button("MOOODY");
			btn1.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent args) {
					System.out.println("HOWDY WODY");
				}
			});
			btn2.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent args) {
					System.out.println("HOWDY BODYYYYYYYYYY");
				}
			});xx
		    StackPane root = new StackPane();
			root.getChildren().add(btn1);
			root.getChildren().add(btn2);
			root.getChildren().add(arc);
			Scene scene2 = new Scene(root, 400, 300, Color.BLUE);
		primaryStage.setScene(scene2);
		primaryStage.setTitle("First MY HERO ACADEMY");
		primaryStage.show();
		*/
		/*
		primaryStage.setTitle("Circle Example");  
	    Group group = new Group();  
	    Circle circle = new Circle();  
	    circle.setCenterX(200);  
	    circle.setCenterY(200);  
	    circle.setRadius(100);  
	    circle.setFill(Color.BLUE);  
	    group.getChildren().addAll(circle);  
	    Scene scene = new Scene(group,400,500,Color.GRAY);  
	    primaryStage.setScene(scene);  
	    primaryStage.show();  
		*/
		/*
		Group root = new Group();  
	    primaryStage.setTitle("Pollygon Example");  
	      
	    CubicCurve C = new CubicCurve();  
	    C.setStartX(20);
	    C.setStartY(100);
	    C.setControlX1(300);
	    C.setControlY1(200);
	    C.setFill(Color.RED);
	    C.setEffect(new DropShadow());
	    C.setEndX(100);
	    C.setEndY(300);
	    root.getChildren().add(C);  
	    Scene scene = new Scene(root,300,400);  
	    primaryStage.setScene(scene);  
	    primaryStage.show();  
		*//*
		  Group root = new Group();  
		    primaryStage.setTitle("Cubic Curve Example");  
		    CubicCurve c = new CubicCurve();  
		    c.setStartX(20);  
		    c.setStartY(100);  
		    c.setControlX1(300);  
		    c.setControlX2(200);  
		    c.setControlY1(100);  
		    c.setControlY2(90);  
		    int red=200;
		    int green=30;
		    int blue=100;
		    c.setFill(Color.rgb(red, green, blue,0.35));  
		    c.setEffect(new DropShadow());  
		    c.setEndX(100);  
		    c.setEndY(300);  
		    root.getChildren().add(c);  
		    Scene scene = new Scene(root,400,400, Color.DARKTURQUOISE);  
		    primaryStage.setScene(scene);  
		    primaryStage.show(); */
		/*	VBox root = new VBox();  
	        final Scene scene = new Scene(root,300, 250);  
	        Stop[] stops = new Stop[] { new Stop(0, Color.GREEN),new Stop(0.3, Color.BLACK),new Stop(0.33, Color.ORANGE), new Stop(0.5, Color.BLUE), new Stop(1, Color.RED)};  
	        LinearGradient linear = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops);  
	          
	        Rectangle rect = new Rectangle(0, 0, 100, 100);  
	        rect.setFill(linear);  
	          
	        ColorAdjust c = new ColorAdjust(); // creating the instance of the ColorAdjust effect.   
	        c.setBrightness(0.9); // setting the brightness of the color. 
	        rect.setEffect(c);
	        root.getChildren().add(rect);  
	          
	        primaryStage.setScene(scene);  
	        primaryStage.setTitle("Animation Example");  
	        primaryStage.show();  */
		
		
		/*
		primaryStage.setTitle("Circle Example");
		Group group = new Group();
		Circle circle = new Circle();
		circle.setCenterX(200);
		circle.setCenterY(150);
		circle.setRadius(50);
		circle.setFill(Color.BLUE);
		
		group.getChildren().addAll(circle);
		 Translate translate = new Translate();  
		    //setting the properties of the translate object      
		    translate.setX(350);  
		    translate.setY(300);
		Scene scene = new Scene(group,400,500,Color.GRAY);
		primaryStage.setScene(scene);
		primaryStage.show();
		*/
	/*
		btn = new Button();
		btn.setText("Click me please!");
		btn.setOnAction(e-> buttonClick());
		BorderPane pane = new BorderPane();
		pane.setCenter(btn);
		Scene scene = new Scene(pane , 300, 250);
		
		// Finalize and show the stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("The Click Me App");
		primaryStage.show();
	*/
		
		// Create the button
	/*	btn = new Button(); 
		btn.setText("Click me please!"); 
		btn.setOnAction(e -> buttonClick()); 
		// Create the Label
		lbl = new Label(); 
		lbl.setText("You have not clicked the button."); 
		// Add the label and the button to a layout pane
		BorderPane pane = new BorderPane(); 
		pane.setTop(lbl); 
		//pane.setCenter(btn);
		pane.setBottom(lbl);
		// Add the layout pane to a scene
		Scene scene = new Scene(pane, 250, 150); 
		// Add the scene to the stage, set the title
		// and show the stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("Click Counter");
		primaryStage.show();*/
		/* btnAdd = new Button();
		btnAdd.setText("Add");
		btnAdd.setOnAction(
				new EventHandler<ActionEvent>() 
				{
					public void handle(ActionEvent e) 
		{
		iCounter++; 
		lbl.setText(Integer.toString(iCounter));
		}
				} );
				e ->
				{
					iCounter++;
					lbl.setText(Integer.toString(iCounter));
				});
		
		// Create the Subtract button
		btnSubtract = new Button();
		btnSubtract.setText("Subtract");
		btnSubtract.setOnAction(
		/*new EventHandler<ActionEvent>() 
		{
		public void handle(ActionEvent e)
		{
		iCounter--;
		lbl.setText(Integer.toString(iCounter));
		}
		} */
			/*	e ->
				{
					iCounter--;
					lbl.setText(Integer.toString(iCounter));
				});
		// Create the Label
		lbl = new Label();
		lbl.setText(Integer.toString(iCounter));
		// Add the buttons and label to an HBox pane
		HBox pane = new HBox(10);
		pane.getChildren().addAll(lbl, btnAdd, btnSubtract);
		// Add the layout pane to a scene
		Scene scene = new Scene(pane, 200, 75);
		// Add the scene to the stage, set the title
		// and show the stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("Add/Sub");
		primaryStage.show();
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}

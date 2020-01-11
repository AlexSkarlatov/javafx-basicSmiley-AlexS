package homework3;

import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.Group;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.collections.ObservableList;

public class SmileyFace extends Application {
	@Override
	public void start(Stage primaryStage){
		Pane pane = new Pane();
		
		Circle circle = new Circle();
		circle.setCenterX(250);
		circle.setCenterY(250);
		circle.setRadius(200);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.LIGHTGRAY);
		pane.getChildren().add(circle);

		Ellipse ellipse1 = new Ellipse( 150,  170, 50, 30);
		ellipse1.setStroke(Color.BLACK);
		ellipse1.setFill(Color.WHITE);
		pane.getChildren().add(ellipse1);

		Ellipse ellipse2 = new Ellipse( 150 + 180,  170 , 50, 30);
		ellipse2.setStroke(Color.BLACK);
		ellipse2.setFill(Color.WHITE);
		pane.getChildren().add(ellipse2);

		Circle leftPupil = new Circle();
		leftPupil.setCenterX(150);
		leftPupil.setCenterY(170);
		leftPupil.setRadius(15);
		pane.getChildren().add(leftPupil);

		Circle rightPupil = new Circle();
		rightPupil.setCenterX(150+180);
		rightPupil.setCenterY(170);
		rightPupil.setRadius(15);
		pane.getChildren().add(rightPupil);
		
		Polygon nose = new Polygon();
		ObservableList<Double> noseList = nose.getPoints();
		noseList.add(200.0);
		noseList.add(290.0);
		noseList.add(270.0);
		noseList.add(290.0);
		noseList.add(240.0);
		noseList.add(220.0);
		pane.getChildren().add(nose);

		Arc arc2 = new Arc(250, 325, 80, 80, -180, 180);
	    arc2.setFill(null);
	    arc2.setType(ArcType.OPEN);
	    arc2.setStroke(Color.BLACK);
	    pane.getChildren().add(arc2);

	    Scene scene = new Scene(pane, 500, 500);
		primaryStage.setTitle(" smiley face stage")  ;
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args){
		launch(args);
	}
}

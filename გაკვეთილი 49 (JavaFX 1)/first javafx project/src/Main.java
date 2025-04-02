import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PointLight;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
//        Group root = new Group();
//        Scene scene = new Scene(root);
//        Scene scene = new Scene(root, Color.CYAN);
//
//        Image icon = new Image("img.png");
//
//        stage.setScene(scene);
//        stage.setTitle("Java App");
//        stage.getIcons().add(icon);
//
//        stage.setWidth(500);
//        stage.setHeight(400);
//
//        stage.setResizable(false);
//
//        stage.setX(0);
//        stage.setY(0);
//
//        stage.setFullScreen(true);
//        stage.setFullScreenExitHint("თუ გინდა გამოსვლა დააჭირე d");
//        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("d"));
//        stage.setFullScreenExitKeyCombination(KeyCombination.keyCombination("SHIFT+d"));
//        stage.setFullScreenExitKeyCombination(
//                new KeyCodeCombination(
//                        KeyCode.A,
//                        KeyCombination.CONTROL_DOWN,
//                        KeyCombination.ALT_ANY,
//                        KeyCombination.SHIFT_ANY
//                )
//        );
//
//        stage.show();





        // v2
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.CYAN);

        Text text = new Text("Hello World!");
//        text.setText("asdfasdfsadf");
        text.setX(100);
        text.setY(100);
        text.setFont(Font.font(50));
//        text.setFill(Color.rgb(87, 2, 191));
        text.setFill(Color.valueOf("#070608"));
//        root.getChildren().add(text);


        Line line = new Line();
        line.setStartX(100);
        line.setStartY(150);
        line.setEndX(200);
        line.setEndY(300);
        line.setStrokeWidth(20);
        line.setStroke(Color.RED);
//        root.getChildren().add(line);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(200);
        rectangle.setY(120);
        rectangle.setWidth(200);
        rectangle.setHeight(100);
        rectangle.setFill(Color.YELLOW);
        rectangle.setStroke(Color.GREEN);
        rectangle.setStrokeWidth(16);
//        root.getChildren().add(rectangle);


        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                300.0, 300.0,
                250.0, 350.0,
                350.0, 350.0
        );
        triangle.setFill(Color.RED);
        triangle.setStroke(Color.GREEN);
//        root.getChildren().add(triangle);


        Circle circle = new Circle();
        circle.setCenterX(200);
        circle.setCenterY(200);
        circle.setRadius(50);
        circle.setFill(Color.CHOCOLATE);
//        root.getChildren().add(circle);

        Image img = new Image("img.png");
        ImageView imageView = new ImageView(img);
        imageView.setX(100);
        imageView.setY(100);
        imageView.setFitWidth(200);
        imageView.setFitHeight(200);
        root.getChildren().add(imageView);

        stage.setScene(scene);
        stage.show();
    }
}
package test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class SortingVisualizer extends Application {
    
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int NUM_BARS = 50; // Number of bars to sort
    private static final int BAR_WIDTH = WIDTH / NUM_BARS;
    private static final int BAR_HEIGHT_MULTIPLIER = HEIGHT / NUM_BARS;

    private Rectangle[] bars;
    private BorderPane root;
    private Pane barPane;
    private Button startButton;
    private Button resetButton;
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Sorting Visualizer");
        
        root = new BorderPane();
        
        // Create buttons
        startButton = new Button("Start Sorting");
        startButton.setOnAction(e -> startSorting());
        
        resetButton = new Button("Reset");
        resetButton.setOnAction(e -> reset());
        
        // Create pane for bars
        barPane = new Pane();
        root.setCenter(barPane);
        
        // Add buttons to the bottom of the window
        root.setBottom(new HBox(10, startButton, resetButton));
        
        // Initialize bars
        initBars();
        
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    void initBars() {
        bars = new Rectangle[NUM_BARS];
        for (int i = 0; i < NUM_BARS; i++) {
            bars[i] = new Rectangle(i * BAR_WIDTH, HEIGHT - (i * BAR_HEIGHT_MULTIPLIER), BAR_WIDTH, (i + 1) * BAR_HEIGHT_MULTIPLIER);
            barPane.getChildren().add(bars[i]);
        }
    }
    
    private void startSorting() {
        // Implement the Bubble Sort algorithm here
        // Visualize the sorting process by updating the bars' heights accordingly
    }
    
    private void reset() {
        // Reset the bars to their initial state
        barPane.getChildren().clear();
        initBars();
    }
    
    public static void main(String[] args) {
        launch(args);
    }

    public void setVisible(boolean b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setVisible'");
    }
}

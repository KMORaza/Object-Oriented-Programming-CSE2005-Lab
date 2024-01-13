package Lab13;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// 29/12/2021
// Question-2
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class FXSandwich extends Application {
    private ComboBox<String> mainIngredientComboBox;
    private ComboBox<String> breadTypeComboBox;
    private Label totalPriceLabel;
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Sublime Sandwich Shop");
        mainIngredientComboBox = new ComboBox<>(FXCollections.observableArrayList("Chicken", "Turkey", "Ham"));
        mainIngredientComboBox.setPromptText("Select Main Ingredient");
        breadTypeComboBox = new ComboBox<>(FXCollections.observableArrayList("White", "Whole Wheat", "Rye"));
        breadTypeComboBox.setPromptText("Select Bread Type");
        totalPriceLabel = new Label("Total Price: $0.00");
        mainIngredientComboBox.setOnAction(event -> updateTotalPrice());
        breadTypeComboBox.setOnAction(event -> updateTotalPrice());
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.getChildren().addAll(mainIngredientComboBox, breadTypeComboBox, totalPriceLabel);
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void updateTotalPrice() {
        double total = 0.0;
        if (mainIngredientComboBox.getValue() != null) {
            total += getIngredientPrice(mainIngredientComboBox.getValue());
        }
        if (breadTypeComboBox.getValue() != null) {
            total += getBreadTypePrice(breadTypeComboBox.getValue());
        }
        totalPriceLabel.setText("Total Price: $" + String.format("%.2f", total));
    }
    private double getIngredientPrice(String ingredient) {
        switch (ingredient) {
            case "Chicken":
                return 5.0;
            case "Egg":
                return 6.0;
            case "Fish":
                return 4.5;
            default:
                return 0.0;
        }
    }
    private double getBreadTypePrice(String breadType) {
        switch (breadType) {
            case "White":
                return 2.0;
            case "Whole Wheat":
                return 2.5;
            case "Rye":
                return 3.0;
            default:
                return 0.0;
        }
    }
}
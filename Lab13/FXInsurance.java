package Lab13;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// 29/12/2021
// Question-1
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class FXInsurance extends Application {
    private ToggleGroup insuranceGroup;
    private CheckBox dentalCheckBox;
    private CheckBox visionCheckBox;
    private TextField resultTextField;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Insurance Options");
        insuranceGroup = new ToggleGroup();
        RadioButton hmoRadioButton = new RadioButton("HMO - $200/month");
        RadioButton ppoRadioButton = new RadioButton("PPO - $600/month");
        hmoRadioButton.setToggleGroup(insuranceGroup);
        ppoRadioButton.setToggleGroup(insuranceGroup);
        dentalCheckBox = new CheckBox("Dental - $75/month");
        visionCheckBox = new CheckBox("Vision - $20/month");
        resultTextField = new TextField();
        resultTextField.setEditable(false);
        insuranceGroup.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            updateResult();
        });
        dentalCheckBox.setOnAction(event -> updateResult());
        visionCheckBox.setOnAction(event -> updateResult());
        VBox layout = new VBox(10);
        layout.getChildren().addAll(hmoRadioButton, ppoRadioButton, dentalCheckBox, visionCheckBox, resultTextField);
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void updateResult() {
        double totalCost = 0;
        RadioButton selectedRadioButton = (RadioButton) insuranceGroup.getSelectedToggle();
        if (selectedRadioButton != null) {
            totalCost += getInsuranceCost(selectedRadioButton.getText());
        }
        if (dentalCheckBox.isSelected()) {
            totalCost += getInsuranceCost(dentalCheckBox.getText());
        }
        if (visionCheckBox.isSelected()) {
            totalCost += getInsuranceCost(visionCheckBox.getText());
        }
        resultTextField.setText("Total Cost: $" + totalCost + "/month");
    }
    private double getInsuranceCost(String description) {
        String[] parts = description.split(" - \\$");
        return Double.parseDouble(parts[1].substring(0, parts[1].indexOf("/")));
    }
}

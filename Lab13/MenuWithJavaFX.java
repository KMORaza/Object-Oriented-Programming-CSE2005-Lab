package Lab13;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// 29/12/2021
// Question-3
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class MenuWithJavaFX extends Application {
    private BorderPane layout;
    private TextArea textArea;
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Menu With JavaFX");
        layout = new BorderPane();
        textArea = new TextArea();
        createMenus();
        layout.setCenter(textArea);
        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void createMenus() {
        MenuBar menuBar = new MenuBar();
        // Country Menu
        Menu countryMenu = new Menu("Country");
        countryMenu.getItems().addAll(
                new MenuItem("India"),
                new MenuItem("Russia"),
                new MenuItem("France"),
                new MenuItem("Spain"),
                new MenuItem("Italy"),
                new MenuItem("Germany"),
                new MenuItem("Japan")
        );
        // Font Menu
        Menu fontMenu = new Menu("Font");
        Menu nameMenu = new Menu("Name");
        nameMenu.getItems().addAll(
                new MenuItem("Arial"),
                new MenuItem("Times New Roman"),
                new MenuItem("Verdana"),
                new MenuItem("Courier New")
        );
        Menu typeMenu = new Menu("Type");
        typeMenu.getItems().addAll(
                new MenuItem("Bold"),
                new MenuItem("Italic")
        );
        Menu sizeMenu = new Menu("Size");
        sizeMenu.getItems().addAll(
                new MenuItem("12"),
                new MenuItem("14"),
                new MenuItem("16"),
                new MenuItem("18")
        );
        fontMenu.getItems().addAll(nameMenu, typeMenu, sizeMenu);
        // Color Menu
        Menu colorMenu = new Menu("Color");
        colorMenu.getItems().addAll(
                new MenuItem("Blue"),
                new MenuItem("Red"),
                new MenuItem("Green"),
                new MenuItem("Yellow"),
                new MenuItem("Orange"),
                new MenuItem("Purple"),
                new MenuItem("Black")
        );
        // Add menus to the menu bar
        menuBar.getMenus().addAll(countryMenu, fontMenu, colorMenu);
        // Add context menu
        ContextMenu contextMenu = new ContextMenu();
        MenuItem clearItem = new MenuItem("Clear");
        MenuItem exitItem = new MenuItem("Exit");
        clearItem.setOnAction(event -> textArea.clear());
        exitItem.setOnAction(event -> System.exit(0));
        contextMenu.getItems().addAll(clearItem, exitItem);
        textArea.setContextMenu(contextMenu);
        // Set action events for menu items
        setMenuItemActions(countryMenu);
        setMenuItemActions(nameMenu);
        setMenuItemActions(typeMenu);
        setMenuItemActions(sizeMenu);
        setMenuItemActions(colorMenu);
        layout.setTop(menuBar);
    }
    private void setMenuItemActions(Menu menu) {
        for (MenuItem item : menu.getItems()) {
            item.setOnAction(event -> {
                textArea.setStyle("-fx-font-family: " + item.getText());
                if (menu.getText().equals("Color")) {
                    textArea.setStyle("-fx-text-fill: " + item.getText().toLowerCase());
                }
            });
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}

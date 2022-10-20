package dad.BuscarYReemplazar;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarYReemplazar extends Application {
	

	public void start(Stage primaryStage) throws Exception {
		//setGridLinesVisible(true);
		int widthButton = 150;
		int checkWidth = 130;
		GridPane gridpane = new GridPane();
		gridpane.setHgap(8);
		gridpane.setVgap(5);
		gridpane.setPadding(new Insets(10, 10, 10, 10));
		VBox panel1 = new VBox();
		panel1.setPrefWidth(Double.MAX_VALUE);
		VBox panel2 = new VBox();
		panel2.setPrefWidth(Double.MAX_VALUE);
		Label buscar = new Label("Buscar: ");
		buscar.setPrefWidth(100);
		TextField buscarText = new TextField();
		buscarText.setPrefWidth(250);
		Button buscarButton = new Button("Buscar");
		buscarButton.setPrefWidth(widthButton);
		Label reemplazar = new Label("Reemplazar con: ");
		reemplazar.setPrefWidth(100);
		TextField reemplazarText = new TextField();
		reemplazarText.setPrefWidth(250);
		Button reemplazarButton = new Button("Reemplazar");
		reemplazarButton.setPrefWidth(widthButton);
		Button reemTodo = new Button("Reemplazar todo");
		reemTodo.setPrefWidth(widthButton);
		Button cerrarButton = new Button("Cerrar");
		cerrarButton.setPrefWidth(widthButton);
		Button ayudaButton = new Button("Ayuda");
		ayudaButton.setPrefWidth(widthButton);
		CheckBox check1 = new CheckBox("Mayúsculas y minúsculas");
		check1.setPrefWidth(checkWidth);
		CheckBox check2 = new CheckBox("Buscar hacia atrás");
		check2.setPrefWidth(checkWidth);
		CheckBox check3 = new CheckBox("Expresión regular");
		check3.setPrefWidth(checkWidth);
		CheckBox check4 = new CheckBox("Resaltar resultados");
		check4.setPrefWidth(checkWidth);
		
		HBox cajaBuscar = new HBox();
		cajaBuscar.setAlignment(Pos.CENTER);
		cajaBuscar.getChildren().addAll(buscar, buscarText);
		
		HBox cajaReemplazar = new HBox();
		cajaReemplazar.setAlignment(Pos.CENTER);
		cajaReemplazar.getChildren().addAll(reemplazar, reemplazarText);
		
		HBox cajaCheckbox = new HBox();
		cajaCheckbox.setAlignment(Pos.CENTER);
		cajaCheckbox.getChildren().addAll(check1, check2);
		HBox cajaCheckbox2 = new HBox();
		cajaCheckbox2.setAlignment(Pos.CENTER);
		cajaCheckbox2.getChildren().addAll(check3, check4);

		panel1.getChildren().addAll(cajaBuscar, cajaReemplazar, cajaCheckbox, cajaCheckbox2);
		panel2.getChildren().addAll(buscarButton, reemplazarButton, reemTodo, cerrarButton, ayudaButton);
		
		gridpane.add(panel1, 0, 0, 10, 1);
		gridpane.add(panel2, 11, 0, 2, 1);
		Scene scene = new Scene(gridpane, 500, 200);
		primaryStage.setTitle("AdivinApp");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);

	}
	
	
}


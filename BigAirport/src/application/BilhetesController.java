package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import application.PassageirosController.DadoPassageiro;
import application.TabelaPassageirosController.DadoPessoa;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class BilhetesController implements Initializable{

	private Stage stage;
	private Scene scene;
	private Parent root;
	private LinhaAerea a = new LinhaAerea();
	
	public void switchToMenu(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}
	
	public ObservableList<DadoBilhete> listarBilhetes() {
		ObservableList<DadoBilhete> lista = FXCollections.observableArrayList();
		ArrayList<Bilhete<String>> lista2 = a.getBilhetes();
		
		while(!lista2.isEmpty()) {
			Bilhete<String> b = lista2.removeFirst();
			DadoBilhete v1 = new DadoBilhete(b.getNumBilhete(),String.valueOf(b.getPreco()),b.getCompAerea().getNomeCompanhia());
			lista.add(v1);
		}
		
		return lista;
	}
	

	@FXML
    private TableView<DadoBilhete> TabelaBilhetes;

    @FXML
    private TableColumn<DadoBilhete, String> NumBilhete;

    @FXML
    private TableColumn<DadoBilhete, String> preco;
    
    @FXML
    private TableColumn<DadoBilhete, String> compAerea;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		a.iniciar();
        
        ObservableList<DadoBilhete> dados = listarBilhetes();

        NumBilhete.setCellValueFactory(cellData -> cellData.getValue().numProperty());
        preco.setCellValueFactory(cellData -> cellData.getValue().precoProperty());
        compAerea.setCellValueFactory(cellData -> cellData.getValue().compAereaProperty());

        TabelaBilhetes.setItems(dados);
    }
	
	 public static class DadoBilhete {
	        private final StringProperty numBilhete;
	        private final StringProperty preco;
	        private final StringProperty compAerea;

	        public DadoBilhete(String numBilhete, String preco, String compAerea) {
	            this.numBilhete = new SimpleStringProperty(numBilhete);
	            this.preco = new SimpleStringProperty("R$ " + preco);
	            this.compAerea = new SimpleStringProperty(compAerea);
	        }

	        public StringProperty numProperty() {
	            return numBilhete;
	        }

	        public StringProperty precoProperty() {
	            return preco;
	        }
	        
	        public StringProperty compAereaProperty() {
	            return compAerea;
	        }
	 }
}

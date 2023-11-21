package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

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

public class PassageirosController implements Initializable {
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
	
	public ObservableList<DadoPassageiro> listarPassageiros() {
		ObservableList<DadoPassageiro> lista = FXCollections.observableArrayList();
		ArrayList<Passageiro> lista2 = a.getPassageiros();
		
		while(!lista2.isEmpty()) {
			Passageiro p = lista2.removeFirst();
			DadoPassageiro p1 = new DadoPassageiro(p.getNome(),p.getNumPassaporte());
			lista.add(p1);
		}
		
		return lista;
	}
	
	@FXML
    private TableView<DadoPassageiro> Tabela;

    @FXML
    private TableColumn<DadoPassageiro, String> NomeC;

    @FXML
    private TableColumn<DadoPassageiro, String> PassaporteC;

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		a.iniciar();
        
        ObservableList<DadoPassageiro> dados = listarPassageiros();

        NomeC.setCellValueFactory(cellData -> cellData.getValue().nomeProperty());
        PassaporteC.setCellValueFactory(cellData -> cellData.getValue().passaporteProperty());

        Tabela.setItems(dados);
    }
	
	 public static class DadoPassageiro {
	        private final StringProperty nome;
	        private final StringProperty passaporte;

	        public DadoPassageiro(String nome, String passaporte) {
	            this.nome = new SimpleStringProperty(nome);
	            this.passaporte = new SimpleStringProperty(passaporte);
	        }

	        public StringProperty nomeProperty() {
	            return nome;
	        }

	        public StringProperty passaporteProperty() {
	            return passaporte;
	        }

	 }
	
}

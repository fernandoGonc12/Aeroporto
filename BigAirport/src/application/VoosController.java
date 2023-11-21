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

public class VoosController implements Initializable{

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
	
	public ObservableList<DadoVoo> listarVoos() {
		ObservableList<DadoVoo> lista = FXCollections.observableArrayList();
		ArrayList<Voo> lista2 = a.getVoos();
		
		while(!lista2.isEmpty()) {
			Voo v = lista2.removeFirst();
			DadoVoo v1 = new DadoVoo(v.getNumVoo(),v.getOrigem().getCodAeroporto(),v.getDataHoraOrigem().getTime().toString(),
					v.getDestino().getCodAeroporto(),v.getDataHoraDestino().getTime().toString());
			lista.add(v1);
		}
		
		return lista;
	}
	

	@FXML
    private TableView<DadoVoo> TabelaVoo;

    @FXML
    private TableColumn<DadoVoo, String> NumVoo;

    @FXML
    private TableColumn<DadoVoo, String> AO;
    
    @FXML
    private TableColumn<DadoVoo, String> DO;
    
    @FXML
    private TableColumn<DadoVoo, String> AD;
    
    @FXML
    private TableColumn<DadoVoo, String> DD;

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		a.iniciar();
        
        ObservableList<DadoVoo> dados = listarVoos();

        NumVoo.setCellValueFactory(cellData -> cellData.getValue().numProperty());
        AO.setCellValueFactory(cellData -> cellData.getValue().aOrigemProperty());
        DO.setCellValueFactory(cellData -> cellData.getValue().hOrigemProperty());
        AD.setCellValueFactory(cellData -> cellData.getValue().aDestinoProperty());
        DD.setCellValueFactory(cellData -> cellData.getValue().hDestinoProperty());

        TabelaVoo.setItems(dados);
    }
	
	 public static class DadoVoo {
	        private final StringProperty numVoo;
	        private final StringProperty aOrigem;
	        private final StringProperty hOrigem;
	        private final StringProperty aDestino;
	        private final StringProperty hDestino;

	        public DadoVoo(String numVoo, String aOrigem, String hOrigem, String aDestino, String hDestino) {
	            this.numVoo = new SimpleStringProperty(numVoo);
	            this.aOrigem = new SimpleStringProperty(aOrigem);
	            this.hOrigem = new SimpleStringProperty(hOrigem);
	            this.aDestino = new SimpleStringProperty(aDestino);
	            this.hDestino = new SimpleStringProperty(hDestino);
	        }

	        public StringProperty numProperty() {
	            return numVoo;
	        }

	        public StringProperty aOrigemProperty() {
	            return aOrigem;
	        }
	        
	        public StringProperty aDestinoProperty() {
	            return aDestino;
	        }
	        
	        public StringProperty hOrigemProperty() {
	            return hOrigem;
	        }
	        
	        public StringProperty hDestinoProperty() {
	            return hDestino;
	        }
	 }
}

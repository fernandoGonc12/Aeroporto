package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class TabelaPassageirosController implements Initializable {

    @FXML
    private TableView<DadoPessoa> Tabela;

    @FXML
    private TableColumn<DadoPessoa, String> Nome;

    @FXML
    private TableColumn<DadoPessoa, String> Passaporte;

    @FXML
    private TableColumn<DadoPessoa, String> Endereco;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Inicialize a tabela e as colunas
        ObservableList<DadoPessoa> dados = FXCollections.observableArrayList(
                new DadoPessoa("João", "ABC123", "Rua A"),
                new DadoPessoa("Maria", "DEF456", "Rua B"),
                new DadoPessoa("José", "GHI789", "Rua C")
        );

        //Nome.setCellValueFactory(cellData -> cellData.getValue().nomeProperty());
        //Passaporte.setCellValueFactory(cellData -> cellData.getValue().passaporteProperty());
        //Endereco.setCellValueFactory(cellData -> cellData.getValue().enderecoProperty());

        Tabela.setItems(dados);
    }

    public static class DadoPessoa {
        private final String nome;
        private final String passaporte;
        private final String endereco;

        public DadoPessoa(String nome, String passaporte, String endereco) {
            this.nome = nome;
            this.passaporte = passaporte;
            this.endereco = endereco;
        }

        public String getNome() {
            return nome;
        }

        public String getPassaporte() {
            return passaporte;
        }

        public String getEndereco() {
            return endereco;
        }
    }
}


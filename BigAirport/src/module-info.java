module Teste {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires javafx.base;
	requires Aeroporto;
	
	opens application to javafx.graphics, javafx.fxml;
}
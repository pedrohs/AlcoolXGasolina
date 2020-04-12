package alcoolxgasolina;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *
 * @author Pedro HS
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML    
    private Text lblResultado;
    
    @FXML
    private TextField inputGasolinaCons, inputEtanolCons, inputEtanolPreco, inputGasolinaPreco;
    private Button btnCalc;
    
    @FXML
    private void calcularRelacao(ActionEvent event) {
        float consumoGasolina = Float.parseFloat(inputGasolinaCons.getText());
        float consumoEtanol = Float.parseFloat(inputEtanolCons.getText());
        
        float relacaoCons = consumoEtanol /consumoGasolina ;
        
        float precoGasolina = Float.parseFloat(inputGasolinaPreco.getText());
        float precoEtanol = Float.parseFloat(inputEtanolPreco.getText());
        
        float relacaoPreco = precoEtanol / precoGasolina;
        
        if(relacaoCons < relacaoPreco){
            lblResultado.setText("Gasolina");
        }else{
            lblResultado.setText("Etanol");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

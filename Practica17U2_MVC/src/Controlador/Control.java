
package Controlador;
import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control implements ActionListener{
    private Vista view;
    private Modelo model;
    
    public Control(Vista view,Modelo model){
       this.view=view;
       this.model=model;
       this.view.btSumar.addActionListener(this);
       this.view.btResta.addActionListener(this);
       this.view.btMult.addActionListener(this);
       //this.view.btDividir.addActionListener(this);
    }
    
    public void iniciar(){
        view.setTitle("UD VA A SUMAR POR MEDIO DE MVC ");
        view.setLocationRelativeTo(view);
        view.txtN1.setText(String.valueOf(model.getV1()));
        view.txtN2.setText(String.valueOf(model.getV2()));
        view.txtResul.setText(String.valueOf(model.getTotal()));
        //view.txtResul.setText(String.valueOf(model.getTotal3()));
    }
    public void iniciar1(){
        view.setTitle("UD VA A RESTAR POR MEDIO DE MVC ");
        view.setLocationRelativeTo(view);
        view.txtN1.setText(String.valueOf(model.getV1()));
        view.txtN2.setText(String.valueOf(model.getV2()));
        view.txtResul1.setText(String.valueOf(model.getTotal1()));
        //view.txtResul.setText(String.valueOf(model.getTotal3()));
    }
    public void iniciar2(){
        view.setTitle("UD VA A MULTIPLICAR POR MEDIO DE MVC ");
        view.setLocationRelativeTo(view);
        view.txtN1.setText(String.valueOf(model.getV1()));
        view.txtN2.setText(String.valueOf(model.getV2()));
        view.txtResul2.setText(String.valueOf(model.getTotal2()));
        //view.txtResul.setText(String.valueOf(model.getTotal3()));
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        //absorver lo que escriba por pantalla
        model.setV1(Integer.valueOf(view.txtN1.getText()));
        
        model.setV2(Integer.valueOf(view.txtN2.getText()));
        
        //model.setV2(Integer.valueOf(view.txtN2.getX()));
        //model.setV2(view.txtN2.getX());
        model.sumar();
        
      //model.dividir();
        view.txtResul.setText(String.valueOf(model.getTotal()));
       // view.txtResul.setText(String.valueOf(model.getTotal3()));
       model.resta();
       view.txtResul1.setText(String.valueOf(model.getTotal1()));
       model.multiplicar();
       view.txtResul2.setText(String.valueOf(model.getTotal2()));
    }
    
    
    
    
}

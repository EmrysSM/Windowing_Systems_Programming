/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc4380.alewis91;

/**
 *
 * @author aaron
 */
public class Controller {

    Model m;
    
    
    public Controller() {
        m = new Model();
    }
    
    
   
    public void btnOneAction(View v)
    {
        if(v.getText().equals("0"))
        {
            v.setText("1");
        }
        else{
            v.setText(v.getText() + "1");
        }
    }
    
    public void btnTwoAction(View v)
    {
        if(v.getText().equals("0"))
        {
            v.setText("2");
        }
        else{
            v.setText(v.getText() + "2");
        }
    }
    public void btnThreeAction(View v)
    {
        if(v.getText().equals("0"))
        {
            v.setText("3");
        }
        else{
            v.setText(v.getText() + "3");
        }
    }
    public void btnFourAction(View v)
    {
        if(v.getText().equals("0"))
        {
            v.setText("4");
        }
        else{
            v.setText(v.getText() + "4");
        }
    }
    public void btnFiveAction(View v)
    {
        if(v.getText().equals("0"))
        {
            v.setText("5");
        }
        else{
            v.setText(v.getText() + "5");
        }
    }
    public void btnSixAction(View v)
    {
        if(v.getText().equals("0"))
        {
            v.setText("6");
        }
        else{
            v.setText(v.getText() + "6");
        }
    }
    public void btnSevenAction(View v)
    {
        if(v.getText().equals("0"))
        {
            v.setText("7");
        }
        else{
            v.setText(v.getText() + "7");
        }
    }
    public void btnEightAction(View v)
    {
        if(v.getText().equals("0"))
        {
            v.setText("8");
        }
        else{
            v.setText(v.getText() + "8");
        }
    }
    public void btnNineAction(View v)
    {
        if(v.getText().equals("0"))
        {
            v.setText("9");
        }
        else{
            v.setText(v.getText() + "9");
        }
    }
    public void btnZeroAction(View v)
    {
        if(v.getText().equals("0"))
        {
            return;
        }
        else{
            v.setText(v.getText() + "0");
        }
    }
    
    
    
    
    
    
    
    public void btnPlusAction(View v){
        m.setLastValue(Integer.parseInt(v.getText()));
        m.setOperation("+");
        v.setText("0");
    }
    public void btnMinusAction(View v){
        m.setLastValue(Integer.parseInt(v.getText()));
        v.setText("0");
        m.setOperation("-");
    }
    public void btnMultiplyAction(View v){
        m.setLastValue(Integer.parseInt(v.getText()));
        v.setText("0");
        m.setOperation("*");
    }
    public void btnDivideAction(View v){
        m.setLastValue(Integer.parseInt(v.getText()));
        v.setText("0");
        m.setOperation("/");
    }
    
    
    
    
    
    public void btnEqualsAction(View v){
        int n = Integer.parseInt(v.getText());
        
        switch (m.getOperation().charAt(0)){
            case '+':
                v.setText(n+m.getLastValue()+"");
                m.setLastValue(n+m.getLastValue());
                break;
            case '-':
                v.setText(m.getLastValue()-n+"");
                m.setLastValue(m.getLastValue()-n);
                break;
            case '*':
                v.setText(n*m.getLastValue()+"");
                m.setLastValue(n*m.getLastValue());
                break;
            case '/':
                v.setText(m.getLastValue()/n+""+"");
                m.setLastValue(m.getLastValue()/n);
                break;
        }
            
    }
    public void btnClearAction(View v){
        if(v.getText().equals("0"))
        {
            m.setLastValue(0);
        }
        else{
            v.setText("0");
        }
    }


    
}


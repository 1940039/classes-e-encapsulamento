package view;

import model.Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Amanda", "TI", 2500, "01/01/2019", "123456789", true);
        
        f1.mostra();
    }
}
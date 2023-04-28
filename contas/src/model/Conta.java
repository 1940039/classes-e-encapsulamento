package model;



public class Conta {
    private int idConta;
    private String dataVencimento;
    private String dataPagamento;
    private Produto pro;
    private Cliente cli;

    public Conta(int idConta, String dataVencimento, String dataPagamento, Produto pro, Cliente cli) {
        this.idConta = idConta;
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
        this.pro = pro;
        this.cli = cli;
    }

    public void visualizarConta() {
    	System.out.println("CONTAS PAGAS");
        System.out.println("IDENTIFICADOR: "+ idConta);
        System.out.println("PRODUTO: "+ pro.getDescricaoProduto());
        System.out.println("CLIENTE: " + cli.getNomeCliente() + "  CPF: " + cli.getCpf());
        System.out.println("VALOR: " + pro.getValorProduto());
        System.out.println("DATA DE VENCIMENTO: " + dataVencimento);
        System.out.println("DATA DE PAGAMENTO: " + dataPagamento);
        System.out.println("");
        System.out.print("---------------------------------------");
    }
}
package br.com.senaijandira.financas;

/**
 * Created by 17170088 on 03/04/2018.
 */

public class Receita {

    private String salario;
    private String aluguel;
    private String duplicatas;
    private String outros;
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getAluguel() {
        return aluguel;
    }

    public void setAluguel(String aluguel) {
        this.aluguel = aluguel;
    }

    public String getDuplicatas() {
        return duplicatas;
    }

    public void setDuplicatas(String duplicatas) {
        this.duplicatas = duplicatas;
    }

    public String getOutros() {
        return outros;
    }

    public void setOutros(String outros) {
        this.outros = outros;
    }
}

package Usuario;

public class Model {
    String nome, sobrenome;
    String Completo;

    public void setNomeCompleto(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public void Junta() {
        this.Completo = nome + " " + sobrenome; // Corrigido: Removido "String" para não criar variável local
    }

    public String getNomeCompleto() {
        return Completo;
    }
}


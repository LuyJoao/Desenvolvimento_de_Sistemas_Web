public class Model{
    String nome, sobrenome, completo;

    public Model(){
    }

    public void setNomeCompleto(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public void Junta(){
        String Completo = nome + " " + sobrenome;
    }

    public String getNomeCompleto(){
        return Completo;
    }

}
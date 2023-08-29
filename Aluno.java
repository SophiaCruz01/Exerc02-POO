public class Aluno {
    private String RA;
    private String nome;
    private float AC1;
    private float AC2;
    private float AG;
    private float AF;
    
    public void setRA(String ra) {
        RA = ra;
    }
    
    public String getRA() {
        return RA;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setAC1(float ac1) {
        AC1 = ac1;
    }
    
    public float getAC1() {
        return AC1;
    }
    
    public void setAC2(float ac2) {
        AC2 = ac2;
    }
    
    public float getAC2() {
        return AC2;
    }
    
    public void setAG(float ag) {
        AG = ag;
    }
    
    public float getAG() {
        return AG;
    }
    
    public void setAF(float af) {
        AF = af;
    }
    
    public float getAF() {
        return AF;
    }
    
    public float calcularMedia() {
        return (AC1 * 0.15f) + (AC2 * 0.30f) + (AG * 0.10f) + (AF * 0.45f);
    }
    
    public String verificarAprovacao() {
        if (calcularMedia() >= 5) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
    
    public String imprimir() {
        return "RA: " + RA + "\nNome: " + nome + "\nAC1: " + AC1 + "\nAC2: " + AC2 + "\nAG: " + AG
                + "\nAF: " + AF + "\nMédia: " + calcularMedia() + "\nSituação: " + verificarAprovacao();
    }
}



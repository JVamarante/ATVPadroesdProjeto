package src.composicao;

public class Cargo {
    private String nomeCargo;

    public Cargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }

    public String getNomeCargo() {
        return nomeCargo;
    }

    public void setNomeCargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "nomeCargo='" + nomeCargo + '\'' +
                '}';
    }
}

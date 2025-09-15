package sistema_iptu;

public class SecretariaFazenda {
    public static void main(String[] args) {
        Municipio brasilia = new Municipio( "brasilia", "DF", 29.50);

        Chacara chacara = new Chacara(brasilia, 3000.0, 1, true);
    
        Apartamento apt = new Apartamento(brasilia, 63, 1, true);

        System.out.println("chácara IPTU R$: " +chacara.calcularIPTU());
        System.out.println("Apt IPTU R$: "+ apt.calcularIPTU());
    }
}

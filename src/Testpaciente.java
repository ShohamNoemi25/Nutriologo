public class Testpaciente{
    public static void main(String[] args) {

        paciente persona = new paciente("shoham",19,"f");//Creamos una instancia de la clase

        persona.setEstatura(1.69);
        persona.setPeso(65);
        persona.imc();
    }
}



public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setEdad(20);
        persona.setNombre("Juan");
        persona.setTelefono("123456789");

        System.out.println(persona.getNombre() + " tiene " + persona.getEdad() + " años y su teléfono es " + persona.getTelefono());
    }

   }


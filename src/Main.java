public class Main {

    public static void main(String[] args) {
        String mensagem = "Hello, world!";
        int shift = 3;

        CifraDeCesar cifra = new CifraDeCesar(shift);

        String mensagemEncriptada = cifra.encriptar(mensagem);
        System.out.println("Encrypted mensagem: " + mensagemEncriptada);

        String decryptedMessage = cifra.descriptar(mensagemEncriptada);
        System.out.println("Decrypted mensagem: " + decryptedMessage);
    }

}

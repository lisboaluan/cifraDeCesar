public class CifraDeCesar {
    private int subst;

    public CifraDeCesar(int subst) {
        this.subst = subst;
    }

    public String encriptar(String mensagem) {
        StringBuilder mensagemEncriptada = new StringBuilder();
        for (int i = 0; i < mensagem.length(); i++) {
            char caracter = mensagem.charAt(i);
            if (Character.isLetter(caracter)) {
                char subst = (char) (caracter + this.subst);
                if (Character.isUpperCase(caracter)) {
                    if (subst > 'Z') {
                        subst = (char) ('A' + (subst - 'Z' - 1));
                    }
                } else {
                    if (subst > 'z') {
                        subst = (char) ('a' + (subst - 'z' - 1));
                    }
                }
                mensagemEncriptada.append(subst);
            } else {
                mensagemEncriptada.append(caracter);
            }
        }
        return mensagemEncriptada.toString();
    }

    public String descriptar(String mensagemEncriptada) {
        CifraDeCesar descriptar = new CifraDeCesar(26 - subst);
        return descriptar.encriptar(mensagemEncriptada);
    }

}

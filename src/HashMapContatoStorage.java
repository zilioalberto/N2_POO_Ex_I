import java.util.HashMap;

public class HashMapContatoStorage implements ContatoStorage{

    private final HashMap<String, Contato> contatos;

    public HashMapContatoStorage() {
       contatos = new HashMap<>();
    }

    @Override
    public void adicionarContato(String nome, String telefone) {
        Contato contato = new Contato(nome, telefone);
        if (contatos.containsKey(nome)) {
        System.out.println("Contato já existente: "+contato);
        } else {
            contatos.put(nome, contato);
            System.out.println("Contato adicionado: Nome: " + contato.getNome() +" Telefone: " + contato.getTelefone());
        }
    }
       @Override
    public void removerContato(String nome) {
        if (contatos.containsKey(nome)) {
            System.out.println("Contato removido: Nome: "+ nome );
            contatos.remove(nome);
            } else {
            System.out.println("Contato não encontrado: " + nome);
        }
    }


    @Override
    public void buscarContato(String nome) {
        if (contatos.containsKey(nome)) {
            String dados = String.valueOf(contatos.get(nome));

            System.out.println("Contato encontrado: " +dados);

        } else {
            System.out.println("Contato não encontrado: " + nome );

        }
    }

    @Override
    public HashMap<String, Contato> listarContato() {
        if (contatos.isEmpty()) {
            System.out.println("Lista de contatos vazia.");
            return null;
        } else {
            System.out.println("Lista de contatos:");
            for (String nome : contatos.keySet()) {
                String dados = String.valueOf(contatos.get(nome));
                System.out.println(dados);
            }
            return contatos;
        }
    }



}

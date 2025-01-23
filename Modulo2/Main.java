import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Camila Alves");
        autor.setNacionalidade("Brasileiro");
        
        Livro livro = new Livro();
        livro.setTitulo("Vivendo de TI");
        livro.setAutor(autor);
        livro.setGenero("Tecnologia");
        livro.validarDisponibilidade();
        
        Usuario usuario = new Usuario();
        usuario.setUsuario("Maria Isis");
        usuario.setIdade("09");
        usuario.setMatricula("03012016");
        
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setDataRetirada("05/05/2024");
        emprestimo.setDataDevolucao("15/05/2024");
        
        
        System.out.println(s);
        }
    }
        

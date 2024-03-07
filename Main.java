import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o nome da pessoa: ");
        String nomePessoa = scanner.nextLine();

        System.out.print("Digite a idade da pessoa: ");
        int idadePessoa = scanner.nextInt();
        scanner.nextLine();

        Pessoa pessoa = new Pessoa();
        pessoa.nome = nomePessoa;
        pessoa.idade = idadePessoa;


        System.out.print("Digite o título da música: ");
        String tituloMusica = scanner.nextLine();

        System.out.print("Digite a duração da música: ");
        float duracaoMusica = scanner.nextFloat();
        scanner.nextLine();

        Musica musica = new Musica();
        musica.titulo = tituloMusica;
        musica.duracao = duracaoMusica;
        musica.compositor = pessoa;


        System.out.print("Digite o gênero do álbum: ");
        String generoAlbum = scanner.nextLine();

        System.out.print("Digite o ano do álbum: ");
        int anoAlbum = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome do álbum: ");
        String nomeAlbum = scanner.nextLine();

        Album album = new Album();
        album.genero = generoAlbum;
        album.ano = anoAlbum;
        album.nome = nomeAlbum;
        album.artista = pessoa;
        album.musicas = new Musica[]{musica};


        album.mostraTodosOsDados();

        scanner.close();

    }
}

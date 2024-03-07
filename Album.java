public class Album {

    public String genero;
    public int ano;

    public String nome;

    public Pessoa artista;

    public Musica[] musicas;


    public void mostraTodosOsDados(){

        System.out.println("genero: " + this.genero);
        System.out.println("ano: " + this.ano);
        System.out.println("nome: " + this.nome);
        System.out.println("nome do artista: " + this.artista.nome);
        System.out.println("musica: ");
        for(Musica musica: musicas){

            System.out.print(musica.titulo);

        }

    }




}

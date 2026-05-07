public class tarefa {
    String titulo;
    boolean concluida;

    public tarefa(String titulo) {
        this.titulo = titulo;
        this.concluida = false;
    }

    public void exibir() {
        String status = concluida ? "✔ Concluída" : "✘ Pendente";
        System.out.println("- " + titulo + " [" + status + "]");
    }
}
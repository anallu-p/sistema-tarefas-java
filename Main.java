public class Main {
    public static void main(String[] args) {
        tarefa t1 = new tarefa("Estudar Java");
        tarefa t2 = new tarefa("Fazer exercícios");
        tarefa t3 = new tarefa("Revisar Git");

        t2.concluida = true;

        System.out.println("=== Minhas Tarefas ===");
        t1.exibir();
        t2.exibir();
        t3.exibir();
    }
}
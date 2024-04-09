package Desafio2;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class main {
    public static void main(String[] args) {
          ArrayList<Tarefa> tarefas = new ArrayList<>();
          JOptionPane.showMessageDialog(null, "Bem vindo a sua lista de taferas");


        
                
               
                

        int menu = Integer.parseInt(JOptionPane.showInputDialog("1. Adicionar Tarefa\n" + 
                                        "2. Visualizar Tarefas\n" + 
                                        "3. Remover Tarefa\n" +
                                        "4. Sair \n" +  "Escolha uma opção: "));
        while (menu != 4) {
            if (menu == 1) {
                Tarefa tarefa = new Tarefa();
                tarefa.setNome(JOptionPane.showInputDialog(null, "Nome da tarefa"));
                tarefa.setDescricao(JOptionPane.showInputDialog(null, "Descrição da tarefa"));

                tarefas.add(tarefa);

                menu = Integer.parseInt(JOptionPane.showInputDialog("1. Adicionar Tarefa\n" + 
                "2. Visualizar Tarefas\n" + 
                "3. Remover Tarefa\n" +
                "4. Sair \n" +  "Escolha uma opção: "));
            }
            if (menu == 2) {
                if (tarefas.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nenhuma tarefa disponível.");
                } else {
                    Object[] tarefasArray = tarefas.toArray();
                    Tarefa tarefaSelecionada = (Tarefa) JOptionPane.showInputDialog(null,
                            "Selecione uma tarefa", "Tarefas",
                            JOptionPane.INFORMATION_MESSAGE, null,
                            tarefasArray, tarefasArray[0]);
                    if (tarefaSelecionada != null) {
                        JOptionPane.showMessageDialog(null, "Nome: " + tarefaSelecionada.getNome() +
                                "\nDescrição: " + tarefaSelecionada.getDescricao());
                    }
                }
                menu = Integer.parseInt(JOptionPane.showInputDialog("1. Adicionar Tarefa\n" + 
                "2. Visualizar Tarefas\n" + 
                "3. Remover Tarefa\n" +
                "4. Sair \n" +  "Escolha uma opção: "));
            }
            if (menu == 3) {
                if (tarefas.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nenhuma tarefa disponível para remover.");
                } else {
                    String[] nomesTarefas = new String[tarefas.size()];
                    for (int i = 0; i < tarefas.size(); i++) {
                        nomesTarefas[i] = tarefas.get(i).getNome();
                    }

                    String tarefaRemover = (String) JOptionPane.showInputDialog(null,
                            "Qual tarefa você deseja remover?", "Remover Tarefa",
                            JOptionPane.QUESTION_MESSAGE, null,
                            nomesTarefas, nomesTarefas[0]);

                    if (tarefaRemover != null) {
                        for (int i = 0; i < tarefas.size(); i++) {
                            if (tarefas.get(i).getNome().equals(tarefaRemover)) {
                                tarefas.remove(i);
                                JOptionPane.showMessageDialog(null, "Tarefa removida com sucesso.");
                                break;
                            }
                        }
                    }
                }
                menu = Integer.parseInt(JOptionPane.showInputDialog("1. Adicionar Tarefa\n" + 
                "2. Visualizar Tarefas\n" + 
                "3. Remover Tarefa\n" +
                "4. Sair \n" +  "Escolha uma opção: "));
            }
        }
    }
}
    
    


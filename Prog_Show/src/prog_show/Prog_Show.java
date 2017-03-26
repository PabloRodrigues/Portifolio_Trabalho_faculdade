package prog_show;

import javax.swing.JOptionPane;

public class Prog_Show {

    public static void main(String[] args) 
    {
        String leitura;
        IShow[] shows = new Show[10];
        int tamanhoVetor = 0 ;

        int op;
        do
        {
        op = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma das opções :\n\n" //informa a lista de opções para o usuário
                + "1 – Incluir.\n"
                + "2 – Listar.\n"
                + "3 – Excluir.\n"
                + "4 – Alterar.\n"
                + "0 – Sair do Menu de Opções.\n\n",
                "Shows Especiais", JOptionPane.QUESTION_MESSAGE));
        
        switch (op) //variável para utilizar o "escolha caso" 
        {
            case 1: //opção para incluir.
                if(tamanhoVetor < 10)
                {
                IShow show = new Show();
                leitura = JOptionPane.showInputDialog(null,"Informe o nome da banda : ","Incluir show", JOptionPane.QUESTION_MESSAGE); //solicita o nome da banda
                                show.setNomeDaBanda(leitura);
                leitura = JOptionPane.showInputDialog(null,"Informe a quantidade de shows : ","Incluir show", JOptionPane.QUESTION_MESSAGE); //solicita a quantidade de shows.
                               show.setQtdShows(Integer.parseInt(leitura));
                leitura = JOptionPane.showInputDialog(null,"Informe o nome da turnê : ","Incluir show", JOptionPane.QUESTION_MESSAGE); // solicita o nome da turnê
                                show.setNomeTurne(leitura);
                leitura = JOptionPane.showInputDialog(null,"Informe o preço dos shows : ","Incluir show", JOptionPane.QUESTION_MESSAGE); //solicita o preço.
                                 show.setPreco(Double.parseDouble(leitura));              
                                 shows[tamanhoVetor] = show;
                                 tamanhoVetor++;
                }
                else
                    if(tamanhoVetor == 10) //caso o vetor esteja preenchido,informa ao usuário que o número de bandas foi excedido.
                    {
                        JOptionPane.showMessageDialog(null,"Número de bandas excedido.","Número de bandas excedido",JOptionPane.ERROR_MESSAGE);
                    }
                    
                break;
      //----------------------------------------------------//----------------------------------------------------//----------------------------------------------------//        
           
     //----------------------------------------------------//----------------------------------------------------//----------------------------------------------------//       
            case 2 : //opção de listar dados.
                 if(tamanhoVetor < 1) //caso não tenha sido realizada uma inclusão,irá informar o problema e voltará ao menu de opções.
                {
                    JOptionPane.showMessageDialog(null,"Favor realizar uma inclusão antes de solicitar a opção de listar.","Dados Inexistentes",JOptionPane.WARNING_MESSAGE);
                }
                else
                    if (tamanhoVetor >= 1) //caso já tenha sido realizada alguma inclusão,irá listar os dados na tela.
                    {
                String mensagem = "";
           
                for(int cont = 0;cont < tamanhoVetor;cont++)       
                {
                mensagem +=  (cont+1) + "º - " + shows[cont]+ "\n" ;
                     }
                 JOptionPane.showMessageDialog(null, mensagem,"Lista de shows",JOptionPane.INFORMATION_MESSAGE);
                    }
                break;
                
      //----------------------------------------------------//----------------------------------------------------//----------------------------------------------------//        
           
     //----------------------------------------------------//----------------------------------------------------//----------------------------------------------------//           
            case 3: //opção de exclusão de dados.
                 if(tamanhoVetor < 1) //caso não tenha sido realizada nenhuma inclusão,irá informar o problema e voltará ao menu de opções .
                {
                    JOptionPane.showMessageDialog(null,"Favor realizar uma inclusão antes de solicitar a opção de exclusão.","Dados Inexistentes",JOptionPane.WARNING_MESSAGE);
                }
                else
                    if (tamanhoVetor > 1) //caso já tenha sido realizada MAIS DE UMA inclusão,irá apresentar o nome das bandas para que o usuário escolha qual excluir.
                    {
                              String msg3 = "";
           
                for(int cont2 = 0;cont2 < tamanhoVetor;cont2++)       
                {
                    msg3 += (cont2+1) + "º - " + shows[cont2].getNomeDaBanda() + "\n";
                }
                          int qual2;
        leitura = JOptionPane.showInputDialog(null,"De qual show você deseja excluir as informações ?\n" + msg3,"Excluir show", JOptionPane.QUESTION_MESSAGE);
        // apresenta os shows incluídos,e solicita o usuário qual deverá ser excluído.
            qual2 = (Integer.parseInt(leitura)); 
            
            if (qual2 > 0 && qual2 < tamanhoVetor) //caso o usuário opção válida para exclusão
            {
                for( int qual3 = qual2- 1;qual3 < tamanhoVetor-1; qual3++)
                {
                    shows[qual3] = shows[qual3 + 1];
                }
                tamanhoVetor--;
            }
            else
                if (qual2 < 0 || qual2 > tamanhoVetor) //Caso o usuário digite alguma opção que não seja válida,informa o erro ao usuário.
                {
                JOptionPane.showMessageDialog(null,"Opção informada inexistente.","Operação inexistente !",JOptionPane.ERROR_MESSAGE);
                }
                    }
            else /*caso só tenha sido realizada uma inclusão,o sistema irá apresentar que só existe o show da banda "x" incluído,solicitando a confirmação do usuário .
                   Irão aparecer as opções SIM , Não e cancelar. Caso o usuário clique em Sim,o show será excluído,caso o usuário clique em NÃO ou Cancelar,o show não será
                        excluído. Independente da opção que o usuário selecionar,a tela irá voltar para o menu de opções.*/
                                               
            {
                         String msg4 = ""; 
           
                for(int cont4 = 0;cont4 < tamanhoVetor;cont4++)       
                {
                    msg4 += shows[cont4].getNomeDaBanda();
                }
                   int ler;   
        ler = JOptionPane.showConfirmDialog(null,"Só existe um show incluído que é o da banda " + msg4 + ".\n Deseja realmente exclui-lo ?","Excluir show",JOptionPane.YES_NO_CANCEL_OPTION);
        if (ler ==  JOptionPane.YES_OPTION)
         {
                                 tamanhoVetor--;
         }  
        else 
            if (ler == JOptionPane.NO_OPTION)
         {
         tamanhoVetor = 1;
         }
           
             }
        break;
                   
      //----------------------------------------------------//----------------------------------------------------//----------------------------------------------------//        
           
     //----------------------------------------------------//----------------------------------------------------//----------------------------------------------------//           
            case 4: //opção de alteração dos dados informados.
            
                if(tamanhoVetor < 1) //caso não tenha sido realizada nenhuma inclusão,irá informar o problema e voltará ao menu de opções.
                {
                    JOptionPane.showMessageDialog(null,"Favor realizar uma inclusão antes de solicitar a opção de alterar.","Dados Inexistentes",JOptionPane.WARNING_MESSAGE);
                }
                else
                    if (tamanhoVetor >= 1) /* caso já tenha sido realizada ao menos uma inclusão,o sistema irá apresentar a lista de shows,e pedirá ao usuário para que
                          informe qual show ele deseja alterar.*/
                    {
                String msg2 = "";
           
                for(int cont = 0;cont < tamanhoVetor;cont++)       
                {
                    msg2 += (cont+1) + "º - " + shows[cont].getNomeDaBanda() + "\n";
                }       
            int qual;
        leitura = JOptionPane.showInputDialog(null,"De qual show você deseja alterar as informações ?\n" + msg2,"Alterar show", JOptionPane.QUESTION_MESSAGE);
        //apresenta os shows já incluídos,e solicita qual deverá ser alterado.   
        qual = (Integer.parseInt(leitura));
            
            if
                (qual < 0 || qual > tamanhoVetor) //Caso o usuário digite algum caractere que não está nas opções,informára o erro e voltará ao menu de opções.
                {
                JOptionPane.showMessageDialog(null,"Opção informada inexistente.","Operação inexistente !",JOptionPane.ERROR_MESSAGE);
                }    
            else
                        if (qual > 0 && qual < 10) //caso informe uma opção válida
                                   {
            IShow showAlt = shows[qual - 1];
                        leitura = JOptionPane.showInputDialog(null,"Informe o novo nome da banda : ","Alterar show", JOptionPane.QUESTION_MESSAGE);
                                showAlt.setNomeDaBanda(leitura);
                leitura = JOptionPane.showInputDialog(null,"Informe a nova quantidade de show(s) : ","Alterar show", JOptionPane.QUESTION_MESSAGE);
                               showAlt.setQtdShows(Integer.parseInt(leitura));
                leitura = JOptionPane.showInputDialog(null,"Informe o novo nome da turnê : ","Alterar show", JOptionPane.QUESTION_MESSAGE);
                                showAlt.setNomeTurne(leitura);
                leitura = JOptionPane.showInputDialog(null,"Informe o novo preço do(s) show(s) : ","Alterar show", JOptionPane.QUESTION_MESSAGE);
                                 showAlt.setPreco(Double.parseDouble(leitura)); 
                                    shows[qual - 1] = showAlt;
                                    }
                                             
            }
            break;
                   
      //----------------------------------------------------//----------------------------------------------------//----------------------------------------------------//        
           case 0 : //Caso o usuário selecione a opção 0,sairá do quadro de opções.
               break;
               
                  
     //----------------------------------------------------//----------------------------------------------------//----------------------------------------------------//       
                     
             default: //Caso o usuário digite algum caractere que não está nas opções.
                              JOptionPane.showMessageDialog(null,"Opção informada inexistente.","Operação inexistente !",JOptionPane.ERROR_MESSAGE);       
                
        }
        
        }
    
        while (op != 0);
    }
}

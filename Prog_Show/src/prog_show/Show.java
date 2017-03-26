
package prog_show;


public class Show extends AShow 

{
           
    private String nomeDaBanda;
    private int qtdShows;
    private String nomeTurne;
    private double preco;  
    
   
    /*MÉTODOS SET E GET PARA BANDA */
    public void setNomeDaBanda(String nomeDaBanda)  
    {
        this.nomeDaBanda = nomeDaBanda;
    }
    public String getNomeDaBanda()
    {
        return nomeDaBanda;
        }
    
    /*FIM MÉTODOS SET E GET PARA BANDA */
    
     /*MÉTODOS SET E GET PARA QUANTIDADE DE SHOWS */
    
        public void setQtdShows(int qtdShows)
    {
        this.qtdShows = qtdShows;
    }
    public int getQtdShows()
    {
        return qtdShows;
    }
    
      /*FIM MÉTODOS SET E GET PARA QUANTIDADE DE SHOWS */
    
    /*MÉTODOS SET E GET PARA NOME DA TURNE */
    
    public void setNomeTurne(String nomeTurne)
    {
        this.nomeTurne = nomeTurne;
    }    
    public String getNomeTurne()
    {
        return nomeTurne;
    }
/*FIM MÉTODOS SET E GET PARA NOME DA TURNE */
    
        public void setPreco(double preco)
    {
        this.preco = preco;
    }
    public double getPreco()
    {
        return preco;
    }
     
    public String toString()
    
    {
return "Informações : \n" + 
        "Nome da banda :  " + nomeDaBanda + "\n" +
        "Quantidade de shows : " + qtdShows + "\n" +
        "Nome da turnê : " + nomeTurne + "\n" +
        "Preço dos shows : " + preco + "\n" ;

    }


}

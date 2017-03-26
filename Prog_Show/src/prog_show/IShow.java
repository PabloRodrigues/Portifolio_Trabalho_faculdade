
package prog_show;


public interface IShow 
        
{
     public void setNomeDaBanda (String nomeDaBanda);
    public void setQtdShows (int qtdShows);
    public void setNomeTurne (String nomeTurne);
     public void setPreco (double preco);  
     String getNomeDaBanda();
    int getQtdShows();
    String getNomeTurne();
    double getPreco();
}

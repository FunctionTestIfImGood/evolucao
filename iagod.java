import java.util.ArrayList; 

public interface GlobalVals {
  ArrayList<String> ArrayDeString = new ArrayList<String>();
  public void Adiciona(String s);
  public void Remove(String s);
  public void AlimentaNome(String nome);
  public void AdicionaEmailAoObj(String email);

class Pessoa implements GlobalVals {
  private String nome;
  private String email;

  @Override 
    public void Adiciona(String s) {
      ArrayDeString.add(s);
    }
   
  @Override 
     public void Remove(String s) {
      ArrayDeString.remove(s);
    }
    
  @override
    public void AlimentaNome(String nome){
      this.nome = nome;
    }

  @override 
    public void AdicionaEmailAoObj(String email){
      this.email = email;
    } 

   public static void Main(Strings[] args) {
    Pessoa p = new Pessoa();
    
    p.Adiciona("Joao");
    
    p.AlimentaNome(GlobalVals.ArrayDeString.indexOf(0));
    
    p.Adiciona("Maria");
   
    p.Adiciona("Jose");
    
    p.Remove("Joao");
   
    System.out.println(GlobalVars.ArrayDeString);
   
   }   
    }
  }       
}


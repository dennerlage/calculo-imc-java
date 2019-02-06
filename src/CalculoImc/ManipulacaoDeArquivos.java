package CalculoImc;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class ManipulacaoDeArquivos {
    
    private String CaminhoArquivo;
    private String nomeArquivo;
    
    public ManipulacaoDeArquivos
        ( String caminho, String nome) {
            this.CaminhoArquivo = caminho;
            this.nomeArquivo = nome;
    
    }
    

    public void gravar(String conteudo) throws IOException{
        
        FileWriter arquivoTxt = new FileWriter(this.CaminhoArquivo+"/"+this.nomeArquivo,true);
        PrintWriter gravarArq = new PrintWriter(arquivoTxt);

        gravarArq.println(conteudo);
        arquivoTxt.close();
        
        
    
    }
   public String[] ler() throws IOException{
       FileReader arquivoTxt = new FileReader(this.CaminhoArquivo+"/"+this.nomeArquivo);
        BufferedReader lerArq = new BufferedReader(arquivoTxt);
        
        String linha = lerArq.readLine();
        int contador = 0;
        while (linha != null){
            contador ++;
            linha = lerArq.readLine();
 
   }
        String[] conteudo = new String[contador];
        lerArq.reset();
        
        // popula o array
        linha = lerArq.readLine();
        contador = 0;
        while ( linha != null){
            conteudo [contador] = linha;
            contador++;
        
        }
        return conteudo;
   
  
}
    public String lerEmString() throws IOException{
        String conteudoArquivo[] = this.ler();
        String conteudo = "";
        
        for (int i = 0; i < conteudoArquivo.length; i++){
            conteudo = conteudo + conteudoArquivo[i]+"\n";
        
        }
    
   return conteudo; 
   }
}
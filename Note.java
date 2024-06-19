/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notebookdriver;

/**
 *
 * @author Ykimmel
 */
public class Note {
    @SuppressWarnings("unused")
    private int id = 0;
    private String category = "";
    private String title ="";
    private String body = "";
    private String date ="";
    
    
    
 public Note(){
     
 }   
  public Note(String c,String t,String b, String d){
      this.category = c;
       this.title = t;
        this.body = b;
         this.date = d;
  }
    
    public String getCatergory(){
        return category;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getBody(){
        return body;
    }
    
    public String getDate(){
        return date;
    }
    
    public void setCatergory(String c){
        category = c;
    }
    
    public void setTitle(String t){
        title= t;
    }
    
    public void setBody(String b){
        body = b;
    }
    
    public void setDate(String d){
        date = d;
    }
    
    
    
    
}

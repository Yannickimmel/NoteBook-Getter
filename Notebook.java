
package notebookdriver;

import java.util.ArrayList;

/**
 *
 * @author Ykimmel
 */
public class Notebook {
    private String subject = "";
    private String owner = "";
    private ArrayList<Note> notes= new ArrayList<Note>();
    private static Integer nextNoteid = 0;
    
    
    public Notebook(){
        
    }
    
    public Notebook(String s, String o){
        this.subject=s;
        this.owner=o;
    }
    
    public Notebook(String s, String o, ArrayList<Note> n){
      this.subject=s;
      this.owner=o;
      this.notes=n;
    }
    
    public String getSubject(){
        return subject;
    }
    
    public String getOwner(){
        return owner;
    }
    
    public ArrayList<Note> getNotes(){
        return notes;
    }
    
    public void setSubject(String s){
        subject = s;
    }
    
    public void setOwner(String o){
        owner = o;
    }
    
    public void setNotes(ArrayList<Note> n){
        notes=n;
    }
    
    public void addNote(Note newNote){
        notes.add(newNote);
    }
    
    public boolean deleteNote(Note newNotes){
        for(Note note  : notes){
            if(note == newNotes){
                notes.remove(note);
                        return true;
            }
            
        }
       return false;
       
    }
    
    public static void updateNextNoteid(){
        nextNoteid++;
    }
    public int getNextNoteid(){
        return nextNoteid;
    }
}

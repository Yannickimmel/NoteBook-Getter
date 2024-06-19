/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notebookdriver;
/**
 *
 * @author Ykimmel
 */
public class NotebookDriver {

    /**
     * @param args the command line arguments
     */
   
         /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Notebook myNotebook = new Notebook();
        Note myNote = new Note();
        myNote.setCatergory("ITS1213");
        myNote.setTitle("UML diagrams");
        myNote.setBody("A UML class diagram consists of one or more classes,"
                + " each with sections for the class name, attributes (data), "
                + "and operations (methods)");
        myNote.setDate("2/8/2022");
        myNotebook.addNote(myNote);
        
        for(Note aNote:myNotebook.getNotes()){
            System.out.println("Note title "+ aNote.getTitle());
            System.out.println("Note body "+ aNote.getBody());
            System.out.println("Note category "+ aNote.getCatergory());
            System.out.println("Note date "+ aNote.getDate());
        }
    }
   
}
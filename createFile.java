package Mypackage;

import java.util.ArrayList;

public class createFile { //this is to turn the file into a valid output
    //take these numbers from eddie later

    public static String[] tab = {"0", "E", "—", "5", "G", "—", "5", "B", "—", "0", "E", "—", "9", "G", "—", "5", "B", "—", "0", "E", "—", "9", "G", "—"};

    //Create array ton store the notes to be dislayed
    public static String[] notesArray = new String[24];
    public static ArrayList dispArray = new ArrayList(16);
    public static String savedFile;

    public static void main(String[] args) {

        System.out.println(EditorFrame.tabArray2 + " H "); //testing
        String[] tab = EditorFrame.tabArray2;

        for(int i = 0; i <24 ; i++){
            notesArray[i] = ".";

        }
    }

    public static ArrayList createFile(){

        for(int i = 1; i < EditorFrame.tabArray.size(); i++){


            //Append all input vales to output values
            //Prints the note E
            if((EditorFrame.tabArray.get(i) == "E") && (EditorFrame.tabArray.get(i - 1).equals("0")) ){

                notesArray[i-1] = "Elow";
                notesArray[i] = "—";
            }

            //Prints the note Low F
            if(EditorFrame.tabArray.get(i) == "E" && EditorFrame.tabArray.get(i -1).equals("1")){
                //System.out.print("Flow");
                //System.out.println(i);
                notesArray[i-1] = "Flow";
                notesArray[i] = "—";
            }
            //Prints Low F#
            if(EditorFrame.tabArray.get(i) == "E" && EditorFrame.tabArray.get(i -1).equals("2") ){
                //System.out.print("F#low");
                //System.out.println(i);
                notesArray[i-1] = "F#low";
                notesArray[i] = "—";
            }
            //Prints Low G
            if(EditorFrame.tabArray.get(i) == "E" && EditorFrame.tabArray.get(i -1) .equals("3")){
                //System.out.print("Glow");
                //System.out.println(i);
                notesArray[i-1] = "Glow";
                notesArray[i] = "—";
            }
            //Prints Low G#
            if(EditorFrame.tabArray.get(i) == "E" && EditorFrame.tabArray.get(i -1).equals("4")){
                //System.out.print("G#low");
                //System.out.println(i);
                notesArray[i-1] = "G#low";
                notesArray[i] = "—";
            }
            //Prints Low A
            if((EditorFrame.tabArray.get(i) == "E" && EditorFrame.tabArray.get(i -1).equals("5")) ||(EditorFrame.tabArray.get(i) == "A" && EditorFrame.tabArray.get(i -1).equals("0")) ){
                //System.out.print("ALow");
                //System.out.println(i);
                notesArray[i-1] = "Alow";
                notesArray[i] = "—";
            }
            //Prints Low A#
            if((EditorFrame.tabArray.get(i) == "E" && EditorFrame.tabArray.get(i -1).equals("6")) ||(EditorFrame.tabArray.get(i) == "A" && EditorFrame.tabArray.get(i -1).equals("1")) ){
                //System.out.print("A#Low");
                //System.out.println(i);
                notesArray[i-1] = "A#low";
                notesArray[i] = "—";
            }
            //Prints Low B
            if((EditorFrame.tabArray.get(i) == "E" && EditorFrame.tabArray.get(i -1).equals("7")) ||(EditorFrame.tabArray.get(i) == "A" && EditorFrame.tabArray.get(i -1).equals("2"))  ){
                //System.out.print("Blow");
                //System.out.println(i);
                notesArray[i-1] = "Blow";
                notesArray[i] = "—";
            }
            //Prints Low C
            if((EditorFrame.tabArray.get(i) == "E" && EditorFrame.tabArray.get(i -1).equals("8")) ||(EditorFrame.tabArray.get(i) == "A" && EditorFrame.tabArray.get(i -1).equals("3"))  ){
                //System.out.print("Clow");
                //System.out.println(i);
                notesArray[i-1] = "Clow";
                notesArray[i] = "—";
            }
            //Prints Low c#
            if((EditorFrame.tabArray.get(i) == "E" && EditorFrame.tabArray.get(i -1).equals("9")) ||(EditorFrame.tabArray.get(i) == "A" && EditorFrame.tabArray.get(i -1).equals("4"))  ){
                //System.out.print("C#low");
                //System.out.println(i);
                notesArray[i-1] = "C#low";
                notesArray[i] = "—";
            }

            //MOVE ON TO A STRING PRIMARY

            //Prints Low D
            if((EditorFrame.tabArray.get(i) == "A" && EditorFrame.tabArray.get(i -1).equals("5")) ||(EditorFrame.tabArray.get(i) == "D" && EditorFrame.tabArray.get(i -1).equals("0"))  ){
                //System.out.print("Dlow");
                //System.out.println(i);
                notesArray[i-1] = "Dlow";
                notesArray[i] = "—";
            }
            //Prints Low D#
            if((EditorFrame.tabArray.get(i) == "A" && EditorFrame.tabArray.get(i -1).equals("6")) ||(EditorFrame.tabArray.get(i) == "D" && EditorFrame.tabArray.get(i -1).equals("1"))  ){
                //System.out.print("D#low");
                //System.out.println(i);
                notesArray[i-1] = "D#low";
                notesArray[i] = "—";
            }
            //Prints Middle E
            if((EditorFrame.tabArray.get(i) == "A" && EditorFrame.tabArray.get(i -1).equals("7")) ||(EditorFrame.tabArray.get(i) == "D" && EditorFrame.tabArray.get(i -1).equals("2"))  ){
                //System.out.print("Emid");
                //System.out.println(i);
                notesArray[i-1] = "Emid";
                notesArray[i] = "—";
            }
            //Prints Middle F
            if((EditorFrame.tabArray.get(i) == "A" && EditorFrame.tabArray.get(i -1).equals("8")) ||(EditorFrame.tabArray.get(i) == "D" && EditorFrame.tabArray.get(i -1).equals("3"))  ){
                //System.out.print("Fmid");
                //System.out.println(i);
                notesArray[i-1] = "Fmid";
                notesArray[i] = "—";
            }
            //Prints Middle F#
            if((EditorFrame.tabArray.get(i) == "A" && EditorFrame.tabArray.get(i -1).equals("9")) ||(EditorFrame.tabArray.get(i) == "D" && EditorFrame.tabArray.get(i -1).equals("5")) ){
                //System.out.print("F#mid");
                //System.out.println(i);
                notesArray[i-1] = "F#mid";
                notesArray[i] = "—";
            }

            //D STRING PRIMARY

            //Prints Middle G
            if((EditorFrame.tabArray.get(i) == "D" && EditorFrame.tabArray.get(i -1).equals("5")) ||(EditorFrame.tabArray.get(i) == "G" && EditorFrame.tabArray.get(i -1).equals("0"))  ){
                //System.out.print("Gmid");
                //System.out.println(i);
                notesArray[i-1] = "Gmid";
                notesArray[i] = "—";
            }
            //Prints Middle G#
            if((EditorFrame.tabArray.get(i) == "D" && EditorFrame.tabArray.get(i -1).equals("6")) ||(EditorFrame.tabArray.get(i) == "G" && EditorFrame.tabArray.get(i -1).equals("1"))  ){
                //System.out.print("G#mid");
                //System.out.println(i);
                notesArray[i-1] = "G#mid";
                notesArray[i] = "—";
            }
            //Prints Middle A
            if((EditorFrame.tabArray.get(i) == "D" && EditorFrame.tabArray.get(i -1).equals("7")) ||(EditorFrame.tabArray.get(i) == "G" && EditorFrame.tabArray.get(i -1).equals("2"))  ){
                //System.out.print("Amid");
                //System.out.println(i);
                notesArray[i-1] = "Amid";
                notesArray[i] = "—";
            }
            //Prints Middle A#
            if((EditorFrame.tabArray.get(i) == "D" && EditorFrame.tabArray.get(i -1).equals("8")) ||(EditorFrame.tabArray.get(i) == "G" && EditorFrame.tabArray.get(i -1).equals("3"))  ){
                //System.out.print("A#mid");
                //System.out.println(i);
                notesArray[i-1] = "A#mid";
                notesArray[i] = "—";
            }
            //Prints middle B
            if((EditorFrame.tabArray.get(i) == "D" && EditorFrame.tabArray.get(i -1).equals("9")) ||(EditorFrame.tabArray.get(i) == "G" && EditorFrame.tabArray.get(i -1).equals("4")) || (EditorFrame.tabArray.get(i) == "B" && EditorFrame.tabArray.get(i -1).equals("0"))  ){
                //System.out.print("Bmid");
                //System.out.println(i);
                notesArray[i-1] = "Bmid";
                notesArray[i] = "—";
            }

            //G STRING PRIMARY

            //Prints Middle C
            if((EditorFrame.tabArray.get(i) == "G" && EditorFrame.tabArray.get(i -1).equals("5")) ||(EditorFrame.tabArray.get(i) == "B" && EditorFrame.tabArray.get(i -1).equals("1"))  ){
                //System.out.print("Cmid");
                //System.out.println(i);
                notesArray[i-1] = "Cmid";
                notesArray[i] = "—";
            }
            //Prints Middle C#
            if((EditorFrame.tabArray.get(i) == "G" && EditorFrame.tabArray.get(i -1).equals("6")) ||(EditorFrame.tabArray.get(i) == "B" && EditorFrame.tabArray.get(i -1).equals("2"))  ){
                //System.out.print("C#mid");
                //System.out.println(i);
                notesArray[i-1] = "C#mid";
                notesArray[i] = "—";
            }
            //Prints Middle D
            if((EditorFrame.tabArray.get(i) == "G" && EditorFrame.tabArray.get(i -1).equals("7")) ||(EditorFrame.tabArray.get(i) == "B" && EditorFrame.tabArray.get(i -1).equals("3")) ){
                //System.out.print("Dmid");
                //System.out.println(i);
                notesArray[i-1] = "Dmid";
                notesArray[i] = "—";
            }
            //Prints Middle D#
            if((EditorFrame.tabArray.get(i) == "G" && EditorFrame.tabArray.get(i -1).equals("8")) ||(EditorFrame.tabArray.get(i) == "B" && EditorFrame.tabArray.get(i -1).equals("8"))  ){
                //System.out.print("D#mid");
                //System.out.println(i);
                notesArray[i-1] = "D#mid";
                notesArray[i] = "—";
            }
            //Prints High e
            if((EditorFrame.tabArray.get(i) == "G" && EditorFrame.tabArray.get(i -1).equals("9")) ||(EditorFrame.tabArray.get(i) == "B" && EditorFrame.tabArray.get(i -1).equals("5")) ||(EditorFrame.tabArray.get(i) == "e" && EditorFrame.tabArray.get(i -1).equals("0"))  ){
                //System.out.print("ehigh");
                //System.out.println(i);
                notesArray[i-1] = "ehigh";
                notesArray[i] = "—";
            }

            //B STRING PRIMARY

            //Prints High f
            if((EditorFrame.tabArray.get(i) == "B" && EditorFrame.tabArray.get(i -1).equals("6")) ||(EditorFrame.tabArray.get(i) == "e" && EditorFrame.tabArray.get(i -1).equals("1"))  ){
                //System.out.print("fhigh");
                //System.out.println(i);
                notesArray[i-1] = "fhigh";
                notesArray[i] = "—";
            }
            //Prints High f#
            if((EditorFrame.tabArray.get(i) == "B" && EditorFrame.tabArray.get(i -1).equals("7")) ||(EditorFrame.tabArray.get(i) == "e" && EditorFrame.tabArray.get(i -1).equals("2")) ){
                //System.out.print("f#high");
                //System.out.println(i);
                notesArray[i-1] = "f#high";
                notesArray[i] = "—";
            }
            //Prints High G
            if((EditorFrame.tabArray.get(i) == "B" && EditorFrame.tabArray.get(i -1).equals("8")) ||(EditorFrame.tabArray.get(i) == "e" && EditorFrame.tabArray.get(i -1).equals("3"))  ){
                //System.out.print("ghigh");
                //System.out.println(i);
                notesArray[i-1] = "ghigh";
                notesArray[i] = "—";
            }

            //Prints High g#
            if((EditorFrame.tabArray.get(i) == "B" && EditorFrame.tabArray.get(i -1).equals("9")) ||(EditorFrame.tabArray.get(i) == "e" && EditorFrame.tabArray.get(i -1).equals("4"))  ){
                //System.out.print("g#high");
                //System.out.println(i);
                notesArray[i-1] = "g#high";
                notesArray[i] = "—";
            }

            //e STRING ONLY

            if((EditorFrame.tabArray.get(i) == "e" && EditorFrame.tabArray.get(i -1).equals("5")) ){
                //System.out.print("ahigh");
                //System.out.println(i);
                notesArray[i-1] = "ahigh";
                notesArray[i] = "—";
            }
            if((EditorFrame.tabArray.get(i) == "e" && EditorFrame.tabArray.get(i -1).equals("6")) ){
                //System.out.print("a#high");
                //System.out.println(i);
                notesArray[i-1] = "a#high";
                notesArray[i] = "—";
            }
            if((EditorFrame.tabArray.get(i) == "e" && EditorFrame.tabArray.get(i -1).equals("7")) ){
                //System.out.print("bhigh");
                //System.out.println(i);
                notesArray[i-1] = "bhigh";
                notesArray[i] = "—";
            }
            if((EditorFrame.tabArray.get(i) == "e" && EditorFrame.tabArray.get(i -1).equals("8")) ) {
                //System.out.print("chigh");
                //System.out.println(i);
                notesArray[i-1] = "chigh";
                notesArray[i] = "—";
            }
            if((EditorFrame.tabArray.get(i) == "e" && EditorFrame.tabArray.get(i -1).equals("9")) ){
                //System.out.print("c#high");
                //System.out.println(i);
                notesArray[i-1] = "c#high";
                notesArray[i] = "—";
            }

        }

        for(int i = 0; i < 24; i++) {
            //System.out.println(notesArray[i]); // for tests
            if((notesArray[i] != ".") && (notesArray[i] != "—") && (notesArray[i] != null)){
                dispArray.add(notesArray[i]);
            }
        }
        //System.out.println(dispArray + " disp");
        return dispArray;
    }

}
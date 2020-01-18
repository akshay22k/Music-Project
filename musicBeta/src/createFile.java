public class createFile { //this is to turn the file into a valid output
    //take these numbers from eddie later
    public static char[] tabArray = {'0', 'e', '-', '9', 'G', '-', '5', 'B'};

    public static void main(String[] args) {

        //System.out.println(tabArray); //testing
        for(int i = 0; i < tabArray.length; i++){
            //System.out.println(tabArray[i]); //testing

            //Prints the note E
            if(tabArray[i] == 'E' && tabArray[i-1] == '0'){
                System.out.println("Elow");
                System.out.print(i);
            }
            //Prints the note Low F
            if(tabArray[i] == 'E' && tabArray[i-1] == '1'){
                System.out.print("Flow");
                System.out.println(i);
            }
            //Prints Low F#
            if(tabArray[i] == 'E' && tabArray[i-1] == '2'){
                System.out.print("F#low");
                System.out.println(i);
            }
            //Prints Low G
            if(tabArray[i] == 'E' && tabArray[i-1] == '3'){
                System.out.print("Glow");
                System.out.println(i);
            }
            //Prints Low G#
            if(tabArray[i] == 'E' && tabArray[i-1] == '4'){
                System.out.print("G#low");
                System.out.println(i);
            }
            //Prints Low A
            if((tabArray[i] == 'E' && tabArray[i-1] == '5') ||(tabArray[i] == 'A' && tabArray[i-1] == '0') ){
                System.out.print("ALow");
                System.out.println(i);
            }
            //Prints Low A#
            if((tabArray[i] == 'E' && tabArray[i-1] == '6') ||(tabArray[i] == 'A' && tabArray[i-1] == '1') ){
                System.out.print("A#Low");
                System.out.println(i);
            }
            //Prints Low B
            if((tabArray[i] == 'E' && tabArray[i-1] == '7') ||(tabArray[i] == 'A' && tabArray[i-1] == '2') ){
                System.out.print("Blow");
                System.out.println(i);
            }
            //Prints Low C
            if((tabArray[i] == 'E' && tabArray[i-1] == '8') ||(tabArray[i] == 'A' && tabArray[i-1] == '3') ){
                System.out.print("Clow");
                System.out.println(i);
            }
            //Prints Low c#
            if((tabArray[i] == 'E' && tabArray[i-1] == '9') ||(tabArray[i] == 'A' && tabArray[i-1] == '4') ){
                System.out.print("C#low");
                System.out.println(i);
            }

            //MOVE ON TO A STRING PRIMARY

            //Prints Low D
            if((tabArray[i] == 'A' && tabArray[i-1] == '5') ||(tabArray[i] == 'D' && tabArray[i-1] == '0') ){
                System.out.print("Dlow");
                System.out.println(i);
            }
            //Prints Low D#
            if((tabArray[i] == 'A' && tabArray[i-1] == '6') ||(tabArray[i] == 'D' && tabArray[i-1] == '1') ){
                System.out.print("D#low");
                System.out.println(i);
            }
            //Prints Middle E
            if((tabArray[i] == 'A' && tabArray[i-1] == '7') ||(tabArray[i] == 'D' && tabArray[i-1] == '2') ){
                System.out.print("Emid");
                System.out.println(i);
            }
            //Prints Middle F
            if((tabArray[i] == 'A' && tabArray[i-1] == '8') ||(tabArray[i] == 'D' && tabArray[i-1] == '3') ){
                System.out.print("Fmid");
                System.out.println(i);
            }
            //Prints Middle F#
            if((tabArray[i] == 'A' && tabArray[i-1] == '9') ||(tabArray[i] == 'D' && tabArray[i-1] == '4') ){
                System.out.print("F#mid");
                System.out.println(i);
            }

            //D STRING PRIMARY

            //Prints Middle G
            if((tabArray[i] == 'D' && tabArray[i-1] == '5') ||(tabArray[i] == 'G' && tabArray[i-1] == '0') ){
                System.out.print("Gmid");
                System.out.println(i);
            }
            //Prints Middle G#
            if((tabArray[i] == 'D' && tabArray[i-1] == '6') ||(tabArray[i] == 'G' && tabArray[i-1] == '1') ){
                System.out.print("G#mid");
                System.out.println(i);
            }
            //Prints Middle A
            if((tabArray[i] == 'D' && tabArray[i-1] == '7') ||(tabArray[i] == 'G' && tabArray[i-1] == '2') ){
                System.out.print("Amid");
                System.out.println(i);
            }
            //Prints Middle A#
            if((tabArray[i] == 'D' && tabArray[i-1] == '8') ||(tabArray[i] == 'G' && tabArray[i-1] == '3') ){
                System.out.print("A#mid");
                System.out.println(i);
            }
            //Prints middle B
            if((tabArray[i] == 'D' && tabArray[i-1] == '9') ||(tabArray[i] == 'G' && tabArray[i-1] == '4') || (tabArray[i] == 'B' && tabArray[i-1] == '0') ){
                System.out.print("Bmid");
                System.out.println(i);
            }

            //G STRING PRIMARY

            //Prints Middle C
            if((tabArray[i] == 'G' && tabArray[i-1] == '5') ||(tabArray[i] == 'B' && tabArray[i-1] == '1') ){
                System.out.print("Cmid");
                System.out.println(i);
            }
            //Prints Middle C#
            if((tabArray[i] == 'G' && tabArray[i-1] == '6') ||(tabArray[i] == 'B' && tabArray[i-1] == '2') ){
                System.out.print("C#mid");
                System.out.println(i);
            }
            //Prints Middle D
            if((tabArray[i] == 'G' && tabArray[i-1] == '7') ||(tabArray[i] == 'B' && tabArray[i-1] == '3') ){
                System.out.print("Dmid");
                System.out.println(i);
            }
            //Prints Middle D#
            if((tabArray[i] == 'G' && tabArray[i-1] == '8') ||(tabArray[i] == 'B' && tabArray[i-1] == '4') ){
                System.out.print("D#mid");
                System.out.println(i);
            }
            //Prints High e
            if((tabArray[i] == 'G' && tabArray[i-1] == '9') ||(tabArray[i] == 'B' && tabArray[i-1] == '5') ||(tabArray[i] == 'e' && tabArray[i-1] == '0') ){
                System.out.print("ehigh");
                System.out.println(i);
            }

            //B STRING PRIMARY

            //Prints High f
            if((tabArray[i] == 'B' && tabArray[i-1] == '6') ||(tabArray[i] == 'e' && tabArray[i-1] == '1') ){
                System.out.print("fhigh");
                System.out.println(i);
            }
            //Prints High f#
            if((tabArray[i] == 'B' && tabArray[i-1] == '7') ||(tabArray[i] == 'e' && tabArray[i-1] == '2') ){
                System.out.print("f#high");
                System.out.println(i);
            }
            //Prints High G
            if((tabArray[i] == 'B' && tabArray[i-1] == '8') ||(tabArray[i] == 'e' && tabArray[i-1] == '3') ){
                System.out.print("ghigh");
                System.out.println(i);
            }
            //Prints High G
            if((tabArray[i] == 'B' && tabArray[i-1] == '8') ||(tabArray[i] == 'e' && tabArray[i-1] == '3') ){
                System.out.print("ghigh");
                System.out.println(i);
            }
            //Prints High g#
            if((tabArray[i] == 'B' && tabArray[i-1] == '9') ||(tabArray[i] == 'e' && tabArray[i-1] == '4') ){
                System.out.print("g#high");
                System.out.println(i);
            }

            //e STRING ONLY

            if(tabArray[i] == 'e' && tabArray[i-1] == '5'){
                System.out.print("ahigh");
                System.out.println(i);
            }
            if(tabArray[i] == 'e' && tabArray[i-1] == '6'){
                System.out.print("a#high");
                System.out.println(i);
            }
            if(tabArray[i] == 'e' && tabArray[i-1] == '7'){
                System.out.print("bhigh");
                System.out.println(i);
            }
            if(tabArray[i] == 'e' && tabArray[i-1] == '8'){
                System.out.print("chigh");
                System.out.println(i);
            }
            if(tabArray[i] == 'e' && tabArray[i-1] == '9'){
                System.out.print("c#high");
                System.out.println(i);
            }
        }
    }
}

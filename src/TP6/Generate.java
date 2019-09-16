package TP6;

public class Generate {

    private int cantcar;
    String passwords = "";

    public Generate(int chosenLength){
        this.cantcar = chosenLength;
        for (int j = 0; j<chosenLength; j++){
            switch((int) Math.floor(Math.random()*(3))) {
                case 0: this.passwords += genNumber();   break;
                case 1: this.passwords += genLowercase();   break;
                case 2: this.passwords += genUppercase();  break;
            }
        }
    }
     
    public static char genLowercase(){
        return (char) Math.floor(Math.random() * (26) + 97);
    }
    
    public static char genUppercase(){
        return (char) Math.floor(Math.random()*(26) + 65);
    }
    
    public static int genNumber(){
        return (char) Math.floor(Math.random()*(10));
    }
    
    public String getPass(){
        return  this.passwords;
    }
    
    public int getLength(){
        return this.cantcar;
    }
    
    public boolean getSafety(){
        int numbers=0 , uppercase=0 , lowercase=0;
        for (int i=0;   i<cantcar;  i++){
            if (Character.isDigit(passwords.charAt(i)))numbers+=1;
            else if (Character.isUpperCase(passwords.charAt(i)))uppercase+=1;
            else lowercase+=1;
        }
        
        if (numbers>5 && lowercase>1 && uppercase>2){
            return true;
        }
        else return false;
    }

}
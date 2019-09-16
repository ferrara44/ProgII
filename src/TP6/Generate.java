package TP6;

public class Generate{

	String passwords = "";
    private int characters;

    public Generate(int strLen){
        this.characters = strLen;
        for (int i=0 ; i<strLen ; i++){
            switch((int) Math.floor(Math.random()*(3))) {
                case 0: this.passwords += genNumber();   break;
                case 1: this.passwords += genLowercase();   break;
                case 2: this.passwords += genUppercase();  break;
            }
        }
    }
    
    //Generators and Getters
    
    public char genUppercase(){
        return (char) Math.floor(Math.random()*(26) + 65);
    }
    
    public char genLowercase(){
        return (char) Math.floor(Math.random() * (26) + 97);
    }
    
    public int genNumber(){
        return (char) Math.floor(Math.random()*(10));
    }
    
    public String getPass(){
        return  this.passwords;
    }
    
    public int getLength(){
        return this.characters;
    }
    
    public boolean getSafety(){
        int uppercase=0, lowercase=0, numbers=0;
        for (int i=0 ; i<characters ; i++){
            if (Character.isUpperCase(passwords.charAt(i)))uppercase+=1;
            else if (Character.isLowerCase(passwords.charAt(i)))lowercase+=1;
            else numbers+=1;
        }
        
        if (lowercase>1 && uppercase>2 && numbers>5){
            return true;
        }
        else return false;
    }

}
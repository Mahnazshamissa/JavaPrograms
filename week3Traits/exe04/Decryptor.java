package week3Traits.exe04;

public class Decryptor {

    public String decrypt(String encrypted){
        TextPreparation textPreparation=new TextPreparation();
        String text= textPreparation.removeRubbish(encrypted);
        text= textPreparation.bringBackVowels(text);
        text= textPreparation.matchSigns(text);
        String decrypted= textPreparation.replaceScriptWithNum(text);
        return decrypted;
    }

}

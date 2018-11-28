package week3Traits.exe04;

public class Encryptor {

    public String encrypt(String text) {
        String newText = prepareText(text);
        String encrypted = encryptText(newText);
        return encrypted;
    }
    private String prepareText(String text) {
        TextPreparation preparation=new TextPreparation();
        String newText = preparation.replaceNumWithScript(text);
        newText = preparation.replaceSymbols(newText);
        newText = preparation.replaceVowelWithNum(newText);
        return newText;
    }
    private String encryptText(String newText) {
        Encryption encryption=new Encryption();
        return encryption.addEncryption(newText);
    }
}

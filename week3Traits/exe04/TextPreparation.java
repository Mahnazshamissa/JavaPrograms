package week3Traits.exe04;

public class TextPreparation {

    String replaceNumWithScript(String text) {
        text = text.replaceAll("0", "zero");
        text = text.replaceAll("1", "one");
        text = text.replaceAll("2", "two");
        text = text.replaceAll("3", "three");
        text = text.replaceAll("4", "four");
        text = text.replaceAll("5", "five");
        text = text.replaceAll("6", "six");
        text = text.replaceAll("7", "seven");
        text = text.replaceAll("8", "eight");
        text = text.replaceAll("9", "nine");
        return text;
    }
    String replaceScriptWithNum(String text) {

        text=text.replaceAll("[zZ]ero","0");
        text=text.replaceAll("[oO]ne","1");
        text=text.replaceAll("[tT]wo","2");
        text=text.replaceAll("[tT]hree","3");
        text=text.replaceAll("[fF]our","4");
        text=text.replaceAll("[fF]ive","5");
        text=text.replaceAll("[sS]ix","6");
        text=text.replaceAll("[sS]even","7");
        text=text.replaceAll("[eE]ight","8");
        text=text.replaceAll("[nN]ine","9");
        return text;
    }
    String replaceVowelWithNum(String text) {
        text = text.replaceAll("[aA]", "4");
        text = text.replaceAll("[eE]", "3");
        text = text.replaceAll("[oO]", "8");
        text = text.replaceAll("[uU]", "9");
        text = text.replaceAll("[iI]", "1");
        return text;
    }
    String bringBackVowels(String text) {
        text = text.replaceAll("4", "a");
        text = text.replaceAll("3", "e");
        text = text.replaceAll("8", "o");
        text = text.replaceAll("9", "u");
        text = text.replaceAll("1", "i");
        text = text.replaceAll("i\\s", "I ");
        return text;
    }
    String replaceSymbols(String text) {
        text = text.replaceAll("\\+", "plus ");
        text = text.replaceAll("-", " mines ");
        text = text.replaceAll("=", " is equal to ");
        text = text.replaceAll("\\*", " multiple by ");
        text = text.replaceAll("/", " divided by ");
        return text;
    }
    String matchSigns(String text){
        text = text.replaceAll(" [pP]lus ", "\\+");
        text = text.replaceAll(" [mM]ines ", "-");
        text = text.replaceAll(" [iI]s equal to ", "=");
        text = text.replaceAll(" [mM]ultiple by ", "*");
        text = text.replaceAll(" [dD]ivided by ", "/");
        //text = text.toUpperCase("\\. \\s \\b");
        return text;
    }
    String removeRubbish(String text) {
        text=text.replaceAll("[!@?%&#]","");
        return text;
    }

}

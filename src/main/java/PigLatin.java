public void setup() 
{
  String[] lines = loadStrings("words.txt");
  System.out.println("there are " + lines.length + " lines");
  for (int i = 0 ; i < lines.length; i++) 
  {
    System.out.println(pigLatin(lines[i]));
  }
}
public void draw()
{
        //not used
}
public int findFirstVowel(String word)
//precondition: sWord is a valid String of length greater than 0.
//postcondition: returns the position of the first vowel in sWord.  If there are no vowels, returns -1
{
  for(int i = 0; i < word.length(); i++) {
        if(word.substring(i, i+1).equals("a") || word.substring(i, i+1).equals("e") || word.substring(i, i+1).equals("i") || word.substring(i, i+1).equals("o") || word.substring(i, i+1).equals("u")) {
          return i;
      }
  } 
  return -1;
}

public String pigLatin(String sWord)
//precondition: sWord is a valid String of length greater than 0
//postcondition: returns the pig latin equivalent of sWord
{
  if(sWord.length() <= 0) {
        return "ERROR!";
      }
      /*
      if(findFirstVowel(sWord) == 0 && findFirstVowel(sWord.substring(sWord.length()-1)) > -1) {
        return sWord.substring(findFirstVowel(sWord)) + sWord.substring(0, findFirstVowel(sWord)) + "way";
      }
      if(findFirstVowel(sWord) <= 0) {
        return sWord + "ay";
      }
      if((sWord.substring(0,1).equals("q"))) {
        return sWord.substring(findFirstVowel(sWord)) + sWord.substring(0, findFirstVowel(sWord)) + "uay";
      }
      return sWord.substring(findFirstVowel(sWord)) + sWord.substring(0, findFirstVowel(sWord)) + "ay";
  */
  
  String text = sWord;
  if(findFirstVowel(text) > 0) {
    text = text.substring(findFirstVowel(text)) + text.substring(0, findFirstVowel(text));
  }
  if(findFirstVowel(text.substring(text.length()-1, text.length())) >= 0) {
    text = text + "way";
  } else if (text.charAt(text.length()-1) == 'q') {
    text = text + "uay";
  } else {
    text = text + "ay";
  }
  return text;
  
}

package homework.chapter12;

public enum Language {
    EN("Английский"), RU("Русский"), HY("Армянский");

     private  String  languageName;

    Language(String languageName) {
        this.languageName = languageName;
    }

   Language() {

  }

    public String getLanguageName() {
        return languageName;
    }
}

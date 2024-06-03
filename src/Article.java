import java.util.ArrayList;

public class Article {

    private String heading;
    private String body;
    private String author;

    public String getHeading() {
        return heading;
    }

    public String getAuthor() {
        return author;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public String getLongestWord() {

        String longest = "";

        for(String x : getFormattedBody()) {
            if(x.length() > longest.length()) {
                longest = x;
            }
        }

        return longest;
    }



    public ArrayList<String> getWords() {
        String[] bodySplitted = getFormattedBody();
        ArrayList<String> listOfWords = new ArrayList<>();

        for (String x : bodySplitted) {
            if(!(listOfWords.contains(x.toLowerCase()))) {
                listOfWords.add(x.toLowerCase());
            }
        }


        return listOfWords;



    }

    public String[] getFormattedBody() {
        body = body.replaceAll(",","");
        body = body.replaceAll("\\.","");

        return body.split(" ");
    }

}

public class Main {

    public static void main(String[] args) {

        Article art = new Article();

        art.setHeading("I am a heading");
        art.setAuthor("Noah Van Wagenen");
        art.setBody("There once was a boy who loved to play on his keyboard, but then the boy liked piano better. That is ridicoulous.");


        System.out.println(art.getHeading() + "\n" + "By: "+art.getAuthor() + "\n" + art.getBody());



        System.out.println(art.getLongestWord());
        System.out.println(art.getWords().toString());

    }
}
